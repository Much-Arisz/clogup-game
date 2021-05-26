package Application;

import javax.swing.JFrame;

public class Play extends javax.swing.JFrame {

    private final JFrame frame;
    public int NumPlayer;
    
    public Play() {
        initComponents();
        this.frame = new JFrame();
	this.frame.setVisible(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Player1P = new javax.swing.JButton();
        Player2P = new javax.swing.JButton();
        Setting = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Player1P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Play/Play_B1P.png"))); // NOI18N
        Player1P.setAlignmentY(0.0F);
        Player1P.setBorderPainted(false);
        Player1P.setContentAreaFilled(false);
        Player1P.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Player1P.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Player1P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Player1PActionPerformed(evt);
            }
        });
        getContentPane().add(Player1P, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 385, 480, 160));

        Player2P.setBackground(new java.awt.Color(255, 255, 255));
        Player2P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Play/Play_B2P.png"))); // NOI18N
        Player2P.setBorderPainted(false);
        Player2P.setContentAreaFilled(false);
        Player2P.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Player2P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Player2PActionPerformed(evt);
            }
        });
        getContentPane().add(Player2P, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 565, 480, 160));

        Setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Play/Play_BSet.png"))); // NOI18N
        Setting.setBorderPainted(false);
        Setting.setContentAreaFilled(false);
        Setting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingActionPerformed(evt);
            }
        });
        getContentPane().add(Setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 745, 480, 160));

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Play/Play_BHome.png"))); // NOI18N
        Home.setBorderPainted(false);
        Home.setContentAreaFilled(false);
        Home.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Home.setPreferredSize(new java.awt.Dimension(320, 120));
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        getContentPane().add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(1610, 870, 260, 100));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Play/Play_BG.png"))); // NOI18N
        BG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Player1PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Player1PActionPerformed
        NumPlayer = 1;
        Na1P PNa1P = new Na1P();
        this.frame.setVisible(false);
        this.frame.dispose();
        PNa1P.setVisible(true);
    }//GEN-LAST:event_Player1PActionPerformed

    private void SettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingActionPerformed
        Set PSet = new Set();
        this.frame.setVisible(false);
        this.frame.dispose();
        PSet.setVisible(true);
    }//GEN-LAST:event_SettingActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        Home PHome = new Home();
        this.frame.setVisible(false);
        this.frame.dispose();
        PHome.setVisible(true);
    }//GEN-LAST:event_HomeActionPerformed

    private void Player2PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Player2PActionPerformed
        NumPlayer = 2;
        Na2P PNa2P = new Na2P();
        this.frame.setVisible(false);
        this.frame.dispose();this.frame.dispose();
        PNa2P.setVisible(true);
    }//GEN-LAST:event_Player2PActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Play().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton Home;
    private javax.swing.JButton Player1P;
    private static javax.swing.JButton Player2P;
    private javax.swing.JButton Setting;
    // End of variables declaration//GEN-END:variables
}
