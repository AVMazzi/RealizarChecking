package Views;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.*;

public class  MontaTelas extends JFrame  {
        private JPanel cardPanel;
        private CardLayout cardLayout;

        private Checkin checkin;
        private Bilhete bilhete;

        public MontaTelas() {
            this.cardPanel = new JPanel();
            this.cardLayout = new CardLayout();
            this.cardPanel.setLayout(this.cardLayout);
            setSize(250,300);
            setContentPane(this.cardPanel);

            checkin = new Checkin();
            checkin.getCheckin().addActionListener((c) ->{
                exibe("b");
                setTitle("Bilhete");
            });
            checkin.getCheckin().setPreferredSize(new Dimension(77,77));
            //checkin.getCheckin().setIcon(new ImageIcon("checkin.png"));
            add(checkin, "a");

            bilhete = new Bilhete();
           bilhete.getBotaoBuscarBilhete().addActionListener((e) -> {
                exibe("a");
                setTitle("Check In");
           });


            add(bilhete, "b");

            exibe("a");
            setTitle("Check In");

        }
        private void exibe(String nome) {
            this.cardLayout.show(this.cardPanel, nome);
        }
    }


