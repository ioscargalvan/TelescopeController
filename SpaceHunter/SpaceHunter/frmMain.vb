Imports System
Imports System.IO.Ports
Imports System.Threading

Public Class frmMain

    Dim Dir1 As String
    Dim Dir2 As String
    Dim Angle1 As String
    Dim Angle2 As String
    Dim StatusAlert As Boolean
    Dim WithEvents ADRport As SerialPort = New System.IO.Ports.SerialPort("COM3", 9600, Parity.None, 8, StopBits.One)

    Public Function PixelAnalizador(Dire1 As String, Dire2 As String)
        Dim image1 As Bitmap
        Dim image2 As Bitmap
        Dim Alert As Boolean
        Dim x, y As Integer
        Try

            image1 = New Bitmap(Dire1, True)
            image2 = New Bitmap(Dire2, True)

            For x = 0 To image1.Width - 1
                For y = 0 To image1.Height - 1
                    Dim PixelColorImg1 As Color = image1.GetPixel(x, y)
                    Dim PixelColorImg2 As Color = image2.GetPixel(x, y)
                    If PixelColorImg1 <> PixelColorImg2 Then
                        Alert = True
                    End If
                Next
            Next

            picOld.Image = image1
            picNew.Image = image2
            'btnLoadNewImg.Enabled = False
        Catch ex As ArgumentException
            MessageBox.Show("There was an error." & "Check the path to the image file.")
        End Try
        Return Alert
    End Function

    Private Sub frmMain_FormClosed(sender As Object, e As FormClosedEventArgs) Handles Me.FormClosed
        If ADRport.IsOpen Then
            ADRport.Close()
        End If
    End Sub
    Private Sub frmMain_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub

    Private Sub btnLoadNewImg_Click(sender As Object, e As EventArgs) Handles btnLoadNewImg.Click
        If OpenFileDialog1.ShowDialog() = System.Windows.Forms.DialogResult.OK Then
            Dir2 = OpenFileDialog1.FileName
            StatusAlert = PixelAnalizador(Dir1, Dir2)
            If StatusAlert = False Then
                Teselcope(False)
            Else
                Teselcope(True)
            End If
        End If
    End Sub

    Private Sub btnLoadOldImg_Click(sender As Object, e As EventArgs) Handles btnLoadOldImg.Click
        If OpenFileDialog1.ShowDialog() = System.Windows.Forms.DialogResult.OK Then
            Dir1 = OpenFileDialog1.FileName
            btnLoadNewImg.Enabled = True
        End If

    End Sub
    Public Function Teselcope(status As Boolean)
        Dim Accion As Boolean
        If Not ADRport.IsOpen Then
            ADRport.Open()
        End If
        If status = True Then
            Angle1 = Angle1 - 10
            Angle2 = Angle2 - 10
            My.Computer.Audio.Play("c:\Games\Alerta.WAV", AudioPlayMode.Background)
            Dim result = MessageBox.Show("Se detecto objeto!", "Alerta", MessageBoxButtons.OK, MessageBoxIcon.Question)
            If (result = DialogResult.OK) Then
                My.Computer.Audio.Stop()
            End If
        Else
            Angle1 = Angle1 + 10
            Angle2 = Angle2 + 10
        End If
        If ADRport.IsOpen Then
            ADRport.Write("1=" & Angle1 & "@")
            Thread.Sleep(500)
            ADRport.Write("2=" & Angle2 & "@")
            Accion = True
            ADRport.DiscardOutBuffer()
        End If
        Return Accion
    End Function
End Class