/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import controlador.ControlEventosPrincipal;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RozoJ
 */
public class SeccionReservas extends javax.swing.JPanel {

    /**
     * Creates new form SeccionNoticia
     */
    public SeccionReservas() throws IOException, ParseException {
        
        initComponents();
        setOpaque(false);
           
        ControlEventosPrincipal ce = new  ControlEventosPrincipal();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Rentarbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        Rentarbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/BT_Reservas2.0.png"))); // NOI18N
        Rentarbtn.setBorder(null);
        Rentarbtn.setBorderPainted(false);
        Rentarbtn.setContentAreaFilled(false);
        Rentarbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Rentarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentarbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(Rentarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(260, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Rentarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RentarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentarbtnActionPerformed
        pantallaReservas pr;
        pr = new pantallaReservas();
        pr.setVisible(true);
    }//GEN-LAST:event_RentarbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Rentarbtn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables


}
