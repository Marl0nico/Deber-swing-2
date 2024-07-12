import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextArea Usuario;
    private JTextArea Contraseña;
    private JButton botonEntrar;
    private JTextField ingresoUsuario;
    private JPasswordField ingresoContraseña;
    public JPanel panelLogin;
    public Login() {
        botonEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario="marlon.nicolalde@epn.edu.ec";
                String contraseña="POO2024a";
                if (ingresoUsuario.getText().equals(usuario) && ingresoContraseña.getText().equals(contraseña)){
                    System.out.println("Ingreso correcto");
                    JFrame frame = new JFrame();
                    frame.setContentPane(new Biografia().panelBiografia);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setSize(800, 600);
                    frame.pack();
                    frame.setVisible(true);
                    ((JFrame) SwingUtilities.getWindowAncestor(botonEntrar)).dispose();
                } else {
                    System.out.println("Credenciales incorrectas");
                }
            }
        });
    }
}
