Public Class rmLogin

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        If TextBox1.Text = "" Or TextBox2.Text = "" Then
            MessageBox.Show("Campos requeridos")
        Else
            frmMain.Show()
            Me.Visible = False
        End If

    End Sub
End Class
