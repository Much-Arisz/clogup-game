package Application;
import javax.swing.JFrame;
public class HowW extends javax.swing.JFrame {
    private final JFrame frame;
    public HowW() {
        initComponents();
        this.frame = new JFrame();
	this.frame.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Home = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/How/HowP_BHome.png"))); // NOI18N
        Home.setBorderPainted(false);
        Home.setContentAreaFilled(false);
        Home.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Home.setPreferredSize(new java.awt.Dimension(320, 120));
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        getContentPane().add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 840, -1, -1));

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/How/HowW_BBack.png"))); // NOI18N
        Back.setBorderPainted(false);
        Back.setContentAreaFilled(false);
        Back.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Back.setPreferredSize(new java.awt.Dimension(320, 120));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 840, -1, -1));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/How/HowW_BG.png"))); // NOI18N
        BG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        Home PHome = new Home();    // กลับไปหน้า Home
        PHome.setVisible(true);
        this.frame.dispose();       // ปิดหน้านี้
    }//GEN-LAST:event_HomeActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        HowP PHowP = new HowP();    // กลับไปหาก่อนหน้านี้
        this.frame.dispose();
        setVisible(false);
        PHowP.setVisible(true);     // ปิดหน้านี้
    }//GEN-LAST:event_BackActionPerformed
 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new HowW().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton Back;
    private javax.swing.JButton Home;
    // End of variables declaration//GEN-END:variables
}
