package Application;


import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class Rank extends javax.swing.JFrame {

    private final JFrame frame;

    public Rank() {
        initComponents();
        this.frame = new JFrame();
	this.frame.setVisible(true);
        
        Table.getTableHeader().setFont(new Font("Trebuchet MS", Font.BOLD, 24));
        Table.getTableHeader().setOpaque(false);
        Table.getTableHeader().setBackground(new Color(102,0,255));
        Table.getTableHeader().setForeground(new Color(255,255,255));
        Table.setRowHeight(40);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Check = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N

        Table.setBackground(new java.awt.Color(204, 204, 255));
        Table.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Table.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        Table.setForeground(new java.awt.Color(102, 0, 102));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Player's Name", "Score (Round)", "Level"
            }
        ));
        Table.setGridColor(new java.awt.Color(255, 255, 255));
        Table.setOpaque(false);
        Table.setRequestFocusEnabled(false);
        Table.setRowHeight(45);
        Table.setRowMargin(2);
        Table.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Table.setSelectionForeground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(Table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 440, 680, 320));

        Check.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Rank/Rank_BCheck.png"))); // NOI18N
        Check.setBorderPainted(false);
        Check.setContentAreaFilled(false);
        Check.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Check.setPreferredSize(new java.awt.Dimension(320, 120));
        Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckActionPerformed(evt);
            }
        });
        getContentPane().add(Check, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 840, -1, -1));

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Rank/Rank_BHome.png"))); // NOI18N
        Home.setBorderPainted(false);
        Home.setContentAreaFilled(false);
        Home.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Home.setPreferredSize(new java.awt.Dimension(320, 120));
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        getContentPane().add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 840, -1, -1));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Rank/Rank_BG.png"))); // NOI18N
        BG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        Home PHome = new Home();
        this.frame.dispose();
        PHome.setVisible(true);
    }//GEN-LAST:event_HomeActionPerformed

    private void CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckActionPerformed
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        Ranking.SetRanking();
        for (int i = 0; i <= Ranking.Score.size(); i++) {
            model.addRow(new Object[0]);   
            model.setValueAt("   "+Ranking.Player.get(i), i, 0); 
            model.setValueAt("   "+Ranking.Score.get(i), i, 1); 
            model.setValueAt("   "+Ranking.Levels.get(i), i, 2);  
        }
    }//GEN-LAST:event_CheckActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Rank().setVisible(true);
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton Check;
    private javax.swing.JButton Home;
    private javax.swing.JTable Table;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
