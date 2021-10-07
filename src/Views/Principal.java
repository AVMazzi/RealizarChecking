package Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Principal{

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        MontaTelas cle = new MontaTelas();

        cle.setVisible(true);
        //cle.pack();
        cle.setLocationRelativeTo(null);
        cle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
