package Application;
import javax.swing.JFrame;
public class HowP extends javax.swing.JFrame {
    private final JFrame frame;
    public HowP() {
        initComponents();
        this.frame = new JFrame();
	this.frame.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Home = new javax.swing.JButton();
        Next = new javax.swing.JButton();
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

        Next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/How/HowP_BNext.png"))); // NOI18N
        Next.setBorderPainted(false);
        Next.setContentAreaFilled(false);
        Next.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Next.setPreferredSize(new java.awt.Dimension(320, 120));
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });
        getContentPane().add(Next, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 840, -1, -1));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/How/HowP_BG.png"))); // NOI18N
        BG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        Home PHome = new Home();    // กลับไปหน้า Home
        PHome.setVisible(true);
        this.frame.dispose();       // ปิดหน้านี้
    }//GEN-LAST:event_HomeActionPerformed

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        HowW PHowW = new HowW();    // ไปหน้า How to play หน้าต่อไป
        PHowW.setVisible(true);        
        this.frame.dispose();       // ปิดหน้านี้
    }//GEN-LAST:event_NextActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new HowP().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton Home;
    private javax.swing.JButton Next;
    // End of variables declaration//GEN-END:variables
}
