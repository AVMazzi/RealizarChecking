import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Principal extends JFrame{

    public Principal()
    {
        setTitle("Realizar Checking");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //setSize(300,300);
        setLocationRelativeTo(null);

        GridLayout layout = new GridLayout(2, 1);
        layout.setHgap(10);
        layout.setVgap(10);


        JPanel p = new JPanel();
        //setContentPane(p);
        p.setLayout(new GridLayout(2,1));
        p.setBorder(BorderFactory.createEmptyBorder(10, 10, 10 ,10));

        ActionListener clique = (e) -> {
            JOptionPane.showMessageDialog(null, "Checking Realizado!", "Ops!", JOptionPane.WARNING_MESSAGE);
        };
        JButton b = new JButton();
        b.setText("Check");
        b.addActionListener(clique);
        b.setPreferredSize(new Dimension(30,30));

        setContentPane(p);
        add(new JLabel("Realizar Checking"));
        add(b);


        pack();
        ///setContentPane(new BoxLayout(p, BoxLayout.Y_AXIS));
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        Principal p = new Principal();
        p.setVisible(true);
    }

}
