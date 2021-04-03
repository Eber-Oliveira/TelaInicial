package view;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInicial extends JFrame {
    private JLabel lblNome;
    private JTextField txtNome;
    private JLabel lblCPF;
    private JFormattedTextField txtCPF;
    private JLabel lblTipoUsuario;
    private JComboBox cmbTipoUsuario;
    private final String TIPOUSUARIO[] = {"Administrador", "Convidado"};
    private JButton btnEnviar;


    public TelaInicial(){
        setSize(420,370);
        setTitle("Tela Inicial");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container tela = getContentPane();
        tela.setLayout(null);

        lblNome = new JLabel("Nome");
        lblCPF = new JLabel("CPF");
        try {
            txtCPF = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
        } catch (Exception e){
            e.printStackTrace();
        }
        lblTipoUsuario = new JLabel("Tipo de Usuário");

        txtNome = new JTextField();
        cmbTipoUsuario = new JComboBox(TIPOUSUARIO);
        btnEnviar = new JButton("Enviar");
        btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                trataEnventoOnClickCancelar();
            }
        });

        lblNome.setBounds(10,10,200,25);
        lblCPF.setBounds(10,50,200,25);
        lblTipoUsuario.setBounds(10,100,200,25);

        txtNome.setBounds(150,10,200,25);
        txtCPF.setBounds(150,50,200,25);
        cmbTipoUsuario.setBounds(150,100,200,25);
        btnEnviar.setBounds(150,150,100,100);

        tela.add(lblNome);
        tela.add(txtNome);
        tela.add(lblCPF);
        tela.add(txtCPF);
        tela.add(lblTipoUsuario);
        tela.add(cmbTipoUsuario);
        tela.add(btnEnviar);
    }

    private void trataEnventoOnClickCancelar() {
        JOptionPane.showMessageDialog(this, "O usuário " + txtNome.getText() + " com " + txtCPF.getValue() + " é " + cmbTipoUsuario.getSelectedItem());
    }


}
