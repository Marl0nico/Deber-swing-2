import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hobby {
    public JPanel panelHobby;
    private JButton Regreso;
    private JLabel cargaImagen;
    ImageIcon imageIcon=new ImageIcon("C://Users//MY HP//Downloads//Imagen_Hobby.jpeg");
    //JLabel getCargaImagen = new JLabel(imageIcon);
    public JLabel getCargaImagen() {
        return cargaImagen;
    }
    public Hobby() {
        Regreso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame();
                frame.setContentPane(new Biografia().panelBiografia);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(800, 600);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
