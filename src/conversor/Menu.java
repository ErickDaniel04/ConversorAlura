/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package conversor;

import java.awt.Color;
import static java.awt.Color.white;
import java.awt.Image;
import java.util.Objects;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Daniel
 */
public class Menu extends javax.swing.JPanel {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        content = new javax.swing.JPanel();
        moneda = new javax.swing.JLabel();
        temperatura = new javax.swing.JLabel();
        textDivisas = new javax.swing.JLabel();
        textTemp = new javax.swing.JLabel();
        textTitulo = new javax.swing.JLabel();
        separador = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setPreferredSize(new java.awt.Dimension(730, 400));
        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        moneda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/intercambiar.png"))); // NOI18N
        moneda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        moneda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                monedaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                monedaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                monedaMouseExited(evt);
            }
        });
        content.add(moneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        temperatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/termometro.png"))); // NOI18N
        temperatura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        temperatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                temperaturaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                temperaturaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                temperaturaMouseExited(evt);
            }
        });
        content.add(temperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        textDivisas.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        textDivisas.setForeground(new java.awt.Color(0, 102, 255));
        textDivisas.setText("Divisas");
        content.add(textDivisas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        textTemp.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        textTemp.setForeground(new java.awt.Color(0, 102, 255));
        textTemp.setText("Temperatura");
        content.add(textTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, -1, -1));

        textTitulo.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        textTitulo.setForeground(new java.awt.Color(0, 102, 255));
        textTitulo.setText("Conversor de Unidades");
        content.add(textTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, -1));

        separador.setEditable(false);
        separador.setBackground(new java.awt.Color(0, 102, 255));
        separador.setBorder(null);
        separador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        content.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 441, 6));

        add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 400));
    }// </editor-fold>//GEN-END:initComponents

    private void monedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monedaMouseClicked
        Moneda page = new Moneda();
        showPanel(page);
        
        setRegresar(); 
    }//GEN-LAST:event_monedaMouseClicked

    private void monedaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monedaMouseEntered
        setBorder(moneda);
    }//GEN-LAST:event_monedaMouseEntered

    private void monedaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monedaMouseExited
        quitBorder(moneda);
    }//GEN-LAST:event_monedaMouseExited

    private void temperaturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_temperaturaMouseClicked
        Temperatura page = new Temperatura();
        showPanel(page);
        
        
        setRegresar();   
    }//GEN-LAST:event_temperaturaMouseClicked

    private void temperaturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_temperaturaMouseEntered
        setBorder(temperatura);
    }//GEN-LAST:event_temperaturaMouseEntered

    private void temperaturaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_temperaturaMouseExited
        quitBorder(temperatura);
    }//GEN-LAST:event_temperaturaMouseExited

    private void showPanel(JPanel p){
        p.setSize(730,430);
        p.setLocation(0,0);
        
        content.removeAll();
        content.setLayout(null);
        content.add(p);
        content.revalidate();
        content.repaint();       
    }
    
    private void setImageLabel(JLabel label, String root, int widht, int height){
        ImageIcon image = new ImageIcon(Objects.requireNonNull(getClass().getResource(root)));
        Icon icon = new ImageIcon(image.getImage().getScaledInstance( widht, height, Image.SCALE_SMOOTH));
        label.setIcon(icon);
        this.repaint();
    }
    
    private void setRegresar(){
        Conversor.regresar.setVisible(true);
        Conversor.regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        setImageLabel(Conversor.regresar, "/img/flecha.png", 25, 25);
    }
    
    private void setBorder(JLabel labelS){
        labelS.setBorder(new LineBorder(new Color(0, 102, 255), 3));     
    }
    private void quitBorder(JLabel labelQ){
        labelQ.setBorder(new LineBorder(white, 0));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel content;
    private javax.swing.JLabel moneda;
    private javax.swing.JTextField separador;
    private javax.swing.JLabel temperatura;
    private javax.swing.JLabel textDivisas;
    private javax.swing.JLabel textTemp;
    private javax.swing.JLabel textTitulo;
    // End of variables declaration//GEN-END:variables
}
