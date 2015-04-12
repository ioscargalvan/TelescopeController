<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class frmMain
    Inherits System.Windows.Forms.Form

    'Form reemplaza a Dispose para limpiar la lista de componentes.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Requerido por el Diseñador de Windows Forms
    Private components As System.ComponentModel.IContainer

    'NOTA: el Diseñador de Windows Forms necesita el siguiente procedimiento
    'Se puede modificar usando el Diseñador de Windows Forms.  
    'No lo modifique con el editor de código.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.picOld = New System.Windows.Forms.PictureBox()
        Me.picNew = New System.Windows.Forms.PictureBox()
        Me.btnLoadOldImg = New System.Windows.Forms.Button()
        Me.btnLoadNewImg = New System.Windows.Forms.Button()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.OpenFileDialog1 = New System.Windows.Forms.OpenFileDialog()
        CType(Me.picOld, System.ComponentModel.ISupportInitialize).BeginInit()
        CType(Me.picNew, System.ComponentModel.ISupportInitialize).BeginInit()
        Me.SuspendLayout()
        '
        'picOld
        '
        Me.picOld.Location = New System.Drawing.Point(12, 32)
        Me.picOld.Name = "picOld"
        Me.picOld.Size = New System.Drawing.Size(371, 252)
        Me.picOld.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.picOld.TabIndex = 0
        Me.picOld.TabStop = False
        '
        'picNew
        '
        Me.picNew.Location = New System.Drawing.Point(389, 32)
        Me.picNew.Name = "picNew"
        Me.picNew.Size = New System.Drawing.Size(371, 252)
        Me.picNew.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage
        Me.picNew.TabIndex = 1
        Me.picNew.TabStop = False
        '
        'btnLoadOldImg
        '
        Me.btnLoadOldImg.Font = New System.Drawing.Font("Microsoft Sans Serif", 14.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnLoadOldImg.Location = New System.Drawing.Point(12, 290)
        Me.btnLoadOldImg.Name = "btnLoadOldImg"
        Me.btnLoadOldImg.Size = New System.Drawing.Size(371, 39)
        Me.btnLoadOldImg.TabIndex = 2
        Me.btnLoadOldImg.Text = "Load Image"
        Me.btnLoadOldImg.UseVisualStyleBackColor = True
        '
        'btnLoadNewImg
        '
        Me.btnLoadNewImg.Enabled = False
        Me.btnLoadNewImg.Font = New System.Drawing.Font("Microsoft Sans Serif", 14.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnLoadNewImg.Location = New System.Drawing.Point(389, 290)
        Me.btnLoadNewImg.Name = "btnLoadNewImg"
        Me.btnLoadNewImg.Size = New System.Drawing.Size(371, 39)
        Me.btnLoadNewImg.TabIndex = 3
        Me.btnLoadNewImg.Text = "Load Image"
        Me.btnLoadNewImg.UseVisualStyleBackColor = True
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Font = New System.Drawing.Font("Microsoft Sans Serif", 14.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label1.Location = New System.Drawing.Point(8, 5)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(97, 24)
        Me.Label1.TabIndex = 4
        Me.Label1.Text = "Old Image"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Font = New System.Drawing.Font("Microsoft Sans Serif", 14.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label2.Location = New System.Drawing.Point(385, 5)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(106, 24)
        Me.Label2.TabIndex = 5
        Me.Label2.Text = "New Image"
        '
        'OpenFileDialog1
        '
        Me.OpenFileDialog1.FileName = "OpenFileDialog1"
        '
        'frmMain
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(774, 353)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.btnLoadNewImg)
        Me.Controls.Add(Me.btnLoadOldImg)
        Me.Controls.Add(Me.picNew)
        Me.Controls.Add(Me.picOld)
        Me.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedToolWindow
        Me.Name = "frmMain"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "Main Preocess"
        CType(Me.picOld, System.ComponentModel.ISupportInitialize).EndInit()
        CType(Me.picNew, System.ComponentModel.ISupportInitialize).EndInit()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents picOld As System.Windows.Forms.PictureBox
    Friend WithEvents picNew As System.Windows.Forms.PictureBox
    Friend WithEvents btnLoadOldImg As System.Windows.Forms.Button
    Friend WithEvents btnLoadNewImg As System.Windows.Forms.Button
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents OpenFileDialog1 As System.Windows.Forms.OpenFileDialog
End Class
