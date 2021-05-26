package Application;

import javax.swing.JFrame;

public class Na1P extends javax.swing.JFrame {

    private final JFrame frame;
    Set Setting;

    public Na1P() {
        initComponents();
        this.frame = new JFrame();
	this.frame.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back = new javax.swing.JButton();
        Summit = new javax.swing.JButton();
        NameP1 = new javax.swing.JTextField();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Name/Name_BBack.png"))); // NOI18N
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

        Summit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Name/Name_BSum.png"))); // NOI18N
        Summit.setBorderPainted(false);
        Summit.setContentAreaFilled(false);
        Summit.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Summit.setPreferredSize(new java.awt.Dimension(320, 120));
        Summit.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SummitStateChanged(evt);
            }
        });
        Summit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SummitActionPerformed(evt);
            }
        });
        getContentPane().add(Summit, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 840, -1, -1));

        NameP1.setFont(new java.awt.Font("Trebuchet MS", 0, 44)); // NOI18N
        NameP1.setForeground(new java.awt.Color(255, 255, 255));
        NameP1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        NameP1.setText("Player");
        NameP1.setToolTipText("");
        NameP1.setBorder(null);
        NameP1.setCaretColor(new java.awt.Color(51, 51, 51));
        NameP1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        NameP1.setMargin(new java.awt.Insets(20, 20, 20, 20));
        NameP1.setOpaque(false);
        NameP1.setPreferredSize(new java.awt.Dimension(200, 80));
        getContentPane().add(NameP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 530, 305, 80));

        BG.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Name/Name_1P_BG.png"))); // NOI18N
        BG.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
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

    private void SummitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SummitActionPerformed
            Player.PlayerRed  = NameP1.getText();
            Player.PlayerBlue = "Computer";
            this.frame.setVisible(false);
            this.frame.dispose();
            LevelGame.LevelPlay();
    }//GEN-LAST:event_SummitActionPerformed

    private void SummitStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SummitStateChanged
        Player.PlayerRed = NameP1.getText();
        Player.PlayerBlue= "Computer";
    }//GEN-LAST:event_SummitStateChanged

            
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Na1P().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton Back;
    public javax.swing.JTextField NameP1;
    public javax.swing.JButton Summit;
    // End of variables declaration//GEN-END:variables
}
