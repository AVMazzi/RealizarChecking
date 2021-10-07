package Views;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class Checkin  extends JPanel {

    private JButton btnCheckin;

    public Checkin(){
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        setLayout(layout);

        constraints.gridx = 0 ;
        constraints.gridy = 0 ;
        constraints.gridwidth= 1;
        constraints.gridheight= 1;


        btnCheckin = new JButton();
        //btnCheckin.setPreferredSize(new Dimension(65,65));
        try {
            Image img = ImageIO.read(getClass().getResource("../Images/checkin.png"));
            btnCheckin.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        btnCheckin.setBackground(Color.BLACK);


        JLabel lblCheckin = new JLabel("Check In");
        lblCheckin.setFont(new Font("Verdana", Font.BOLD, 18));
        add(lblCheckin, constraints);
        constraints.gridx = 0;
        constraints.gridy = 1 ;
        constraints.gridwidth= 1;
        constraints.gridheight= 1;
        add(btnCheckin, constraints);
    }
    public JButton getCheckin() {
        return btnCheckin;
    }
}