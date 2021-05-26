package Application;
import javax.swing.JFrame;

public class Home extends javax.swing.JFrame {
    private final JFrame frame;
    public Home() {
        initComponents();
        this.frame = new JFrame();
	this.frame.setVisible(true);
        LevelGame.level = 0;            // เซ็ท Level game ให้เป็น Easy
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PlayGame = new javax.swing.JButton();
        How = new javax.swing.JButton();
        Ranking = new javax.swing.JButton();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PlayGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Home/Home_BPlay.png"))); // NOI18N
        PlayGame.setAlignmentY(0.0F);
        PlayGame.setBorderPainted(false);
        PlayGame.setContentAreaFilled(false);
        PlayGame.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PlayGame.setMargin(new java.awt.Insets(0, 0, 0, 0));
        PlayGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayGameActionPerformed(evt);
            }
        });
        getContentPane().add(PlayGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 385, 480, 160));

        How.setBackground(new java.awt.Color(255, 255, 255));
        How.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Home/Home_BHow.png"))); // NOI18N
        How.setBorderPainted(false);
        How.setContentAreaFilled(false);
        How.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        How.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HowActionPerformed(evt);
            }
        });
        getContentPane().add(How, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 565, 480, 160));

        Ranking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Home/Home_BRank.png"))); // NOI18N
        Ranking.setBorderPainted(false);
        Ranking.setContentAreaFilled(false);
        Ranking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RankingActionPerformed(evt);
            }
        });
        getContentPane().add(Ranking, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 745, 480, 160));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Home/Home_BG.png"))); // NOI18N
        BG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlayGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayGameActionPerformed
        Play PPlay = new Play();        // ไปหน้า Play page 
        PPlay.setVisible(true);         
        this.frame.setVisible(false);   // ปิดหน้านี้
         
    }//GEN-LAST:event_PlayGameActionPerformed

    private void RankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RankingActionPerformed
        Rank PRank = new Rank();         // ไปหน้า Ranking page
        this.frame.setVisible(false);
        PRank.setVisible(true);          // ปิดหน้านี้
    }//GEN-LAST:event_RankingActionPerformed

    private void HowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HowActionPerformed
        HowP PHowP = new HowP();        //  ไปหน้า How ro play page
        this.frame.setVisible(false);
        PHowP.setVisible(true);         // ปิดหน้านี้
    }//GEN-LAST:event_HowActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton How;
    private javax.swing.JButton PlayGame;
    private javax.swing.JButton Ranking;
    // End of variables declaration//GEN-END:variables
}