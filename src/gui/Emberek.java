/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.SwingUtilities;

/**
 *
 * @author Kelemen.K.Tamas
 */
public class Emberek extends javax.swing.JFrame {

    /**
     * Creates new form Emberek
     */
    private ArrayList<Ember> emberek;
    private List<String> beolvasLista;

    public Emberek() {
        emberek = new ArrayList<>();

        Path path = Paths.get("src/emberek.txt");
        try {
            beolvasLista = Files.readAllLines(path);
        } catch (IOException ex) {
            Logger.getLogger(Emberek.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (String line : beolvasLista) {
            String[] tordelve = line.split(";");
            if (!tordelve[0].equals("Név")) {
                if (tordelve.length == 3) {
                    emberek.add(new Ember(tordelve[0], Integer.parseInt(tordelve[1]), tordelve[2].charAt(0)));
                } else {
                    emberek.add(new Ember(tordelve[0], Integer.parseInt(tordelve[1]), tordelve[2].charAt(0), Integer.parseInt(tordelve[3])));
                }
            }
        }
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxLanyok = new javax.swing.JComboBox<>();
        jComboBoxFiuk = new javax.swing.JComboBox<>();
        jPanelOsszesito = new javax.swing.JPanel();
        jRadioButtonLany = new javax.swing.JRadioButton();
        jRadioButtonFiu = new javax.swing.JRadioButton();
        jLabelLegidosebb = new javax.swing.JLabel();
        jLabelOsszesKor = new javax.swing.JLabel();
        jLabelHatEve = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelKor = new javax.swing.JLabel();
        jLabelMiota = new javax.swing.JLabel();
        jCheckBoxMindketto = new javax.swing.JCheckBox();
        jButtonMent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Lányok:");

        jLabel2.setText("Fiúk:");

        jComboBoxLanyok.setMaximumRowCount(20);
        jComboBoxLanyok.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Válassz lányt --" }));
        jComboBoxLanyok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLanyokActionPerformed(evt);
            }
        });

        jComboBoxFiuk.setMaximumRowCount(20);
        jComboBoxFiuk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Válassz fiút --" }));
        jComboBoxFiuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFiukActionPerformed(evt);
            }
        });

        jPanelOsszesito.setBorder(javax.swing.BorderFactory.createTitledBorder("Összesítő"));

        buttonGroup1.add(jRadioButtonLany);
        jRadioButtonLany.setText("Lány");
        jRadioButtonLany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonLanyActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonFiu);
        jRadioButtonFiu.setText("Fiú");
        jRadioButtonFiu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFiuActionPerformed(evt);
            }
        });

        jLabelLegidosebb.setText("legidősebb:");

        jLabelOsszesKor.setText("összes kor:");

        jLabelHatEve.setText("6 éve dolgozó:");

        javax.swing.GroupLayout jPanelOsszesitoLayout = new javax.swing.GroupLayout(jPanelOsszesito);
        jPanelOsszesito.setLayout(jPanelOsszesitoLayout);
        jPanelOsszesitoLayout.setHorizontalGroup(
            jPanelOsszesitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOsszesitoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOsszesitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelOsszesitoLayout.createSequentialGroup()
                        .addComponent(jRadioButtonLany)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonFiu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelLegidosebb)
                    .addComponent(jLabelOsszesKor)
                    .addComponent(jLabelHatEve))
                .addContainerGap())
        );
        jPanelOsszesitoLayout.setVerticalGroup(
            jPanelOsszesitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOsszesitoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOsszesitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonLany)
                    .addComponent(jRadioButtonFiu))
                .addGap(29, 29, 29)
                .addComponent(jLabelLegidosebb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelOsszesKor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelHatEve)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Adatok"));

        jLabelKor.setText("kor:");

        jLabelMiota.setText("mióta dolgozik:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelKor)
                    .addComponent(jLabelMiota))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelKor)
                .addGap(18, 18, 18)
                .addComponent(jLabelMiota)
                .addGap(20, 20, 20))
        );

        jCheckBoxMindketto.setText("Mindkettő nem");

        jButtonMent.setText("Ment");
        jButtonMent.setEnabled(false);
        jButtonMent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelOsszesito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxLanyok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxFiuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBoxMindketto)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonMent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxLanyok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxFiuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxMindketto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonMent))
                    .addComponent(jPanelOsszesito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (int i = 0; i < emberek.size(); i++) {
            if (emberek.get(i).getNeme() == 'F') {
                jComboBoxFiuk.addItem(emberek.get(i).getNev());
            } else {
                jComboBoxLanyok.addItem(emberek.get(i).getNev());
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jRadioButtonLanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonLanyActionPerformed
        adatKiir('L');
    }//GEN-LAST:event_jRadioButtonLanyActionPerformed

    private void jRadioButtonFiuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFiuActionPerformed
        adatKiir('F');
    }//GEN-LAST:event_jRadioButtonFiuActionPerformed

    private void jComboBoxFiukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFiukActionPerformed
        szemelyKiir(jComboBoxFiuk);
        //jComboBoxLanyok.setSelectedIndex(0);
    }//GEN-LAST:event_jComboBoxFiukActionPerformed

    private void jComboBoxLanyokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLanyokActionPerformed
        szemelyKiir(jComboBoxLanyok);
        //jComboBoxFiuk.setSelectedIndex(0);
    }//GEN-LAST:event_jComboBoxLanyokActionPerformed

    private void jButtonMentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMentActionPerformed
        String kiir = "";
        jRadioButtonLany.setActionCommand("Lányok");
        jRadioButtonFiu.setActionCommand("Fiúk");
        kiir += buttonGroup1.getSelection().getActionCommand() + ":\n";
        kiir += jLabelLegidosebb.getText() + " éves\n";
        kiir += jLabelOsszesKor.getText() + " év\n";
        kiir += jLabelHatEve.getText() + "\n";

        if (jCheckBoxMindketto.isSelected()) {
            if (buttonGroup1.getSelection().getActionCommand().equals("Lányok")) {
                adatKiir('F');
                //jRadioButtonFiu.setSelected(true);
                kiir += "Fiúk:\n";
            } else {
                adatKiir('L');
                //jRadioButtonLany.setSelected(true);
                kiir += "Lányok:\n";
            }
            kiir += jLabelLegidosebb.getText() + " éves\n";
            kiir += jLabelOsszesKor.getText() + " év\n";
            kiir += jLabelHatEve.getText() + "\n";

            if (buttonGroup1.getSelection().getActionCommand().equals("Lányok")) {
                adatKiir('L');
            } else {
                adatKiir('F');
            }
        }
        /*try {
            BufferedWriter kiirat = new BufferedWriter(new FileWriter("adatok.txt"));
            kiirat.write(kiir);
            kiirat.close();
            } catch (IOException ex) {
            Logger.getLogger(Emberek.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        try {
            FileWriter myWriter = new FileWriter("adatok.txt");
            myWriter.write(kiir);
            myWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(Emberek.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(kiir);
        SwingUtilities.updateComponentTreeUI(this);
    }//GEN-LAST:event_jButtonMentActionPerformed

    public void szemelyKiir(JComboBox<String> honnan) {
        String nev = "";
        if (honnan.getSelectedIndex() != 0) {
            nev = honnan.getSelectedItem().toString();
        } else {
            jLabelKor.setText("kor: ");
            jLabelMiota.setText("mióta dolgozik: ");
        }
        for (int i = 0; i < emberek.size(); i++) {
            if (emberek.get(i).getNev().equals(nev)) {
                jLabelKor.setText("kor: " + emberek.get(i).getKor());
                jLabelMiota.setText("mióta dolgozik: " + emberek.get(i).getMunkaEv() + " éve");
//                System.out.println(emberek.get(i).getMunkaEv());
            }
        }
    }

    public void adatKiir(char betu) {
        jButtonMent.setEnabled(true);
        int legidosebb = 0;
        int osszes = 0;
        String hatEve = "";
        int hatEveTobb = 0;
        for (int i = 0; i < emberek.size(); i++) {
            if (emberek.get(i).getNeme() == betu) {
                osszes += emberek.get(i).getKor();
                if (emberek.get(i).getKor() > legidosebb) {
                    legidosebb = emberek.get(i).getKor();
                }
                if (emberek.get(i).getMunkaEv() > 6) {
                    if (hatEveTobb > 0) {
                        hatEve += ", ";
                    }
                    hatEve += emberek.get(i).getNev();
                    hatEveTobb++;
                }
            }
        }

        jLabelLegidosebb.setText("legidősebb: " + legidosebb);
        jLabelOsszesKor.setText("összes kor: " + osszes);
        if (hatEve.equals("")) {
            hatEve = "nincs";
        }
        jLabelHatEve.setText("6 éve dolgozó: " + hatEve);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Emberek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Emberek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Emberek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Emberek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Emberek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonMent;
    private javax.swing.JCheckBox jCheckBoxMindketto;
    private javax.swing.JComboBox<String> jComboBoxFiuk;
    private javax.swing.JComboBox<String> jComboBoxLanyok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelHatEve;
    private javax.swing.JLabel jLabelKor;
    private javax.swing.JLabel jLabelLegidosebb;
    private javax.swing.JLabel jLabelMiota;
    private javax.swing.JLabel jLabelOsszesKor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelOsszesito;
    private javax.swing.JRadioButton jRadioButtonFiu;
    private javax.swing.JRadioButton jRadioButtonLany;
    // End of variables declaration//GEN-END:variables
}