import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Biografia {
    private JTextArea textoBiografia;
    public JPanel panelBiografia;
    private JButton botonHobby;
    private JScrollPane scroll;

    public Biografia() {
        botonHobby.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame();
                frame.setContentPane(new Hobby().panelHobby);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(1200, 800);
                frame.pack();
                frame.setVisible(true);
                ((JFrame) SwingUtilities.getWindowAncestor(botonHobby)).dispose();
            }
        });
    }
}
