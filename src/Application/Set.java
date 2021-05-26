package Application;

import javax.swing.JFrame;

public class Set extends javax.swing.JFrame {

    private final JFrame frame; 
    private int Timer,Level;
    
    public Set() {
        initComponents();
        this.frame = new JFrame();
	this.frame.setVisible(true);

        Level = LevelGame.level;
        if(LevelGame.level == 0){
           
            LvHard.setVisible(false);
        }
        else {
            LvEasy.setVisible(false);
        }
            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        LvEasy = new javax.swing.JButton();
        LvHard = new javax.swing.JButton();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Setting/Sett_BBack.png"))); // NOI18N
        Back.setBorderPainted(false);
        Back.setContentAreaFilled(false);
        Back.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Back.setPreferredSize(new java.awt.Dimension(320, 120));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 840, -1, -1));

        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Setting/Sett_BSave.png"))); // NOI18N
        Save.setBorderPainted(false);
        Save.setContentAreaFilled(false);
        Save.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Save.setPreferredSize(new java.awt.Dimension(320, 120));
        Save.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SaveStateChanged(evt);
            }
        });
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        getContentPane().add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 840, -1, -1));

        LvEasy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Setting/Sett_SEasy.png"))); // NOI18N
        LvEasy.setBorderPainted(false);
        LvEasy.setContentAreaFilled(false);
        LvEasy.setMargin(new java.awt.Insets(0, 0, 0, 0));
        LvEasy.setPreferredSize(new java.awt.Dimension(320, 120));
        LvEasy.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                LvEasyStateChanged(evt);
            }
        });
        LvEasy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LvEasyActionPerformed(evt);
            }
        });
        getContentPane().add(LvEasy, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 470, -1, -1));

        LvHard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Setting/Sett_SHard.png"))); // NOI18N
        LvHard.setBorderPainted(false);
        LvHard.setContentAreaFilled(false);
        LvHard.setMargin(new java.awt.Insets(0, 0, 0, 0));
        LvHard.setPreferredSize(new java.awt.Dimension(320, 120));
        LvHard.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                LvHardStateChanged(evt);
            }
        });
        LvHard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LvHardActionPerformed(evt);
            }
        });
        getContentPane().add(LvHard, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 470, -1, -1));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Setting/Sett_BG.png"))); // NOI18N
        BG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        Play PPlay = new Play();
        this.frame.setVisible(false);
        this.frame.dispose();
        PPlay.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        Play PPlay = new Play();
        this.frame.setVisible(false);
        this.frame.dispose();
        PPlay.setVisible(true);
    }//GEN-LAST:event_SaveActionPerformed

    private void LvEasyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LvEasyActionPerformed
        LevelGame.level = 0;
        LvEasy.setVisible(false);
        LvHard.setVisible(true);
    }//GEN-LAST:event_LvEasyActionPerformed

    private void LvHardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LvHardActionPerformed

        LvEasy.setVisible(true);
        LvHard.setVisible(false);
    }//GEN-LAST:event_LvHardActionPerformed

    private void LvEasyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_LvEasyStateChanged
        Level = 1;
    }//GEN-LAST:event_LvEasyStateChanged

    private void LvHardStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_LvHardStateChanged
        Level = 0;
    }//GEN-LAST:event_LvHardStateChanged

    private void SaveStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SaveStateChanged
        LevelGame.level = Level;
    }//GEN-LAST:event_SaveStateChanged

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Set().setVisible(true);
        
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton Back;
    private static javax.swing.JButton LvEasy;
    private static javax.swing.JButton LvHard;
    private javax.swing.JButton Save;
    // End of variables declaration//GEN-END:variables
}
