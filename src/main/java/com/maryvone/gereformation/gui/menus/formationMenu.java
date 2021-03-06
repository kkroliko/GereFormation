/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maryvone.gereformation.gui.menus;

import com.maryvone.gereformation.gui.menus.formationMenuCreate;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import com.maryvone.gereformation.gui.Home;
import com.maryvone.gereformation.gui.SearchForm.FormationList;


/**
 *
 * @author david
 */
public class formationMenu extends javax.swing.JPanel  {
    
    private Home home;
    /**
     * Creates new form formationMenu
     */
    public formationMenu(Home home) {
        this.home = home;
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

        jPanel2 = new javax.swing.JPanel();
        creerFormation = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        creerFormation1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        creerFormation3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        creerFormation.setBackground(new java.awt.Color(81, 121, 130));
        creerFormation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creerFormationMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                creerFormationMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                creerFormationMouseEntered(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/create.png"))); // NOI18N

        jLabel2.setText("CREATE");

        javax.swing.GroupLayout creerFormationLayout = new javax.swing.GroupLayout(creerFormation);
        creerFormation.setLayout(creerFormationLayout);
        creerFormationLayout.setHorizontalGroup(
            creerFormationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(creerFormationLayout.createSequentialGroup()
                .addGroup(creerFormationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(creerFormationLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1))
                    .addGroup(creerFormationLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        creerFormationLayout.setVerticalGroup(
            creerFormationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(creerFormationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        creerFormation1.setBackground(new java.awt.Color(81, 121, 130));
        creerFormation1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creerFormation1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                creerFormation1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                creerFormation1MouseEntered(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N

        jLabel4.setBackground(new java.awt.Color(81, 121, 130));
        jLabel4.setText("SEARCH");

        javax.swing.GroupLayout creerFormation1Layout = new javax.swing.GroupLayout(creerFormation1);
        creerFormation1.setLayout(creerFormation1Layout);
        creerFormation1Layout.setHorizontalGroup(
            creerFormation1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(creerFormation1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
            .addGroup(creerFormation1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        creerFormation1Layout.setVerticalGroup(
            creerFormation1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(creerFormation1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        creerFormation3.setBackground(new java.awt.Color(81, 121, 130));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N

        jLabel8.setText("DELETE");

        javax.swing.GroupLayout creerFormation3Layout = new javax.swing.GroupLayout(creerFormation3);
        creerFormation3.setLayout(creerFormation3Layout);
        creerFormation3Layout.setHorizontalGroup(
            creerFormation3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(creerFormation3Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(creerFormation3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, creerFormation3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, creerFormation3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(30, 30, 30))))
        );
        creerFormation3Layout.setVerticalGroup(
            creerFormation3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(creerFormation3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(creerFormation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179)
                .addComponent(creerFormation1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191)
                .addComponent(creerFormation3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(313, 313, 313))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(creerFormation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(creerFormation1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(creerFormation3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void creerFormationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creerFormationMouseClicked

       creerFormation.setBackground(new Color(226,240,248));
        formationMenuCreate panel = new formationMenuCreate(home);
        
       home.setResultPanel(panel);
      
    }//GEN-LAST:event_creerFormationMouseClicked

    private void creerFormation1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creerFormation1MouseClicked
        FormationList panel;
        try {
            panel = new FormationList(home);
            home.setResultPanel(panel);
        } catch (SQLException ex) {
            Logger.getLogger(formationMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_creerFormation1MouseClicked

    private void creerFormationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creerFormationMouseEntered
        creerFormation.setBackground(new Color(226,240,248)); 
    }//GEN-LAST:event_creerFormationMouseEntered

    private void creerFormationMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creerFormationMouseExited
        creerFormation.setBackground(new Color(81,121,130));
    }//GEN-LAST:event_creerFormationMouseExited

    private void creerFormation1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creerFormation1MouseEntered
        creerFormation1.setBackground(new Color(226,240,248)); 
    }//GEN-LAST:event_creerFormation1MouseEntered

    private void creerFormation1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creerFormation1MouseExited
        creerFormation1.setBackground(new Color(81,121,130));
    }//GEN-LAST:event_creerFormation1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel creerFormation;
    private javax.swing.JPanel creerFormation1;
    private javax.swing.JPanel creerFormation3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
