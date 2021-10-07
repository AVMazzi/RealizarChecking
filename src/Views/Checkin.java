package Views;

import javax.swing.*;
import java.awt.*;

public class Checkin  extends  JPanel{
    private JButton btnCheckin;
    public Checkin(){
            setLayout(new FlowLayout());
            add(new JLabel("Fazer Checkin:"));
            btnCheckin = new JButton("Checkin");
            add(btnCheckin);
    }
    public JButton getCheckin() {
        return btnCheckin;
    }
}