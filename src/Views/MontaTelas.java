package Views;

import java.awt.CardLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class  MontaTelas extends JFrame  {
        private JPanel cardPanel;
        private CardLayout cardLayout;

        private Checkin checkin;
        private Bilhete bilhete;

        public MontaTelas() {
            this.cardPanel = new JPanel();
            this.cardLayout = new CardLayout();
            this.cardPanel.setLayout(this.cardLayout);
            setContentPane(this.cardPanel);

            checkin = new Checkin();


            checkin.getCheckin().addActionListener((c) ->{
                exibe("b");
            });
            add(checkin, "a");


            bilhete = new Bilhete();
           bilhete.getBotaoBuscarBilhete().addActionListener((e) -> {
                exibe("a");
           });

            add(bilhete, "b");

            exibe("a");
        }
        private void exibe(String nome) {
            this.cardLayout.show(this.cardPanel, nome);
        }
    }


