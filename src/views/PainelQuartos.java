/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Zita_Office
 */
public class PainelQuartos extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaQuartos
     */
    public PainelQuartos() {
        super(null,false,false,false);
        initComponents();
        
        PainelQuartos.setLayout(new MigLayout("wrap 5"));
        PainelQuartos.setBackground(new Color(0,0,0,1));   
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("pe.jpg"));
        Image image = icon.getImage();
        HomeConteiner = new javax.swing.JPanel(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jPanel1 = new javax.swing.JPanel();
        PainelQuartos = new javax.swing.JPanel();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(895, 665));

        HomeConteiner.setPreferredSize(new java.awt.Dimension(901, 50));
        HomeConteiner.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255,70));
        jPanel1.setPreferredSize(new java.awt.Dimension(901, 50));
        jPanel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        HomeConteiner.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        PainelQuartos.setBackground(new Color(0,0,0,1));
        PainelQuartos.setPreferredSize(new java.awt.Dimension(895, 665));

        javax.swing.GroupLayout PainelQuartosLayout = new javax.swing.GroupLayout(PainelQuartos);
        PainelQuartos.setLayout(PainelQuartosLayout);
        PainelQuartosLayout.setHorizontalGroup(
            PainelQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1609, Short.MAX_VALUE)
        );
        PainelQuartosLayout.setVerticalGroup(
            PainelQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1068, Short.MAX_VALUE)
        );

        HomeConteiner.add(PainelQuartos, java.awt.BorderLayout.CENTER);

        getContentPane().add(HomeConteiner, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HomeConteiner;
    private javax.swing.JPanel PainelQuartos;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}