/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author NITRO
 */
public class FormPenentuJumlahHari extends javax.swing.JFrame {

    /**
     * Creates new form FormPenentuJumlahHari
     */
    public FormPenentuJumlahHari() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TahunText = new javax.swing.JTextField();
        BulanText = new javax.swing.JTextField();
        LabelHari = new javax.swing.JLabel();
        HitungButton = new javax.swing.JButton();
        HapusButton = new javax.swing.JButton();
        SimpanButton = new javax.swing.JButton();
        KeluarButton = new javax.swing.JButton();
        JumlahHari = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Aplikasi Penentu Jumlah Hari"));

        jLabel1.setText("Tahun :");

        jLabel2.setText("Bulan  :");

        LabelHari.setText("Jumlah Hari Adalah : ");

        HitungButton.setText("Hitung");
        HitungButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungButtonActionPerformed(evt);
            }
        });

        HapusButton.setText("Hapus");
        HapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusButtonActionPerformed(evt);
            }
        });

        SimpanButton.setText("Simpan");
        SimpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanButtonActionPerformed(evt);
            }
        });

        KeluarButton.setText("Keluar");
        KeluarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarButtonActionPerformed(evt);
            }
        });

        JumlahHari.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(HitungButton)
                        .addGap(18, 18, 18)
                        .addComponent(HapusButton)
                        .addGap(18, 18, 18)
                        .addComponent(SimpanButton)
                        .addGap(18, 18, 18)
                        .addComponent(KeluarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TahunText)
                            .addComponent(BulanText, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelHari)
                        .addGap(33, 33, 33)
                        .addComponent(JumlahHari)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TahunText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(BulanText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelHari)
                    .addComponent(JumlahHari))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HitungButton)
                    .addComponent(HapusButton)
                    .addComponent(SimpanButton)
                    .addComponent(KeluarButton))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HitungButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungButtonActionPerformed
        hitungHari();
        
    }//GEN-LAST:event_HitungButtonActionPerformed

    private void HapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusButtonActionPerformed
        // TODO add your handling code here:
        TahunText.setText("");
        BulanText.setText("");
        JumlahHari.setText("0");
        TahunText.requestFocus();
    }//GEN-LAST:event_HapusButtonActionPerformed

    private void KeluarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarButtonActionPerformed
        // TODO add your handling code here:
        String tanya = "Apakah anda yakin akan Keluar dari aplikasi?";
        boolean yakin = JOptionPane.showConfirmDialog(rootPane, tanya)==
                JOptionPane.YES_OPTION;
        if(yakin){
            System.exit(0);
        }
    }//GEN-LAST:event_KeluarButtonActionPerformed

    private void SimpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanButtonActionPerformed
        // TODO add your handling code here:
        prosesSimpan();
    }//GEN-LAST:event_SimpanButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BulanText;
    private javax.swing.JButton HapusButton;
    private javax.swing.JButton HitungButton;
    private javax.swing.JLabel JumlahHari;
    private javax.swing.JButton KeluarButton;
    private javax.swing.JLabel LabelHari;
    private javax.swing.JButton SimpanButton;
    private javax.swing.JTextField TahunText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void hitungHari() {
        int tahun = Integer.valueOf(TahunText.getText());
        int bulan = Integer.valueOf(BulanText.getText());
        int hari = 0;
        switch(bulan){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                hari = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                hari = 30;
                break;
            case 2:
                hari = 28;
                if((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)){
                    hari = 29;
                }  
                break;
        }
        JumlahHari.setText(hari+"");
    }

    private void prosesSimpan() {
        try{
            BufferedWriter out = new BufferedWriter(
                    new FileWriter("Jumlahhari.txt"));
            out.write("Jumlah Hari pada tahun" + TahunText.getText()
            + " dan Bulan " + BulanText.getText()+ " adalah " + JumlahHari.getText());
            out.close();
        } catch (Exception e){
            System.out.println("Error boss, check codingannya!");
        }
    }
}