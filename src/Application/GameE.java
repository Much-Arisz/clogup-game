package Application;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public final class GameE extends javax.swing.JFrame {

    private final JFrame frame;
    
    Sound SoundMove = new Sound();
    public String EffectMove = ".//res//Sound.wav"; 
    
    Player Pl1 = new Player(Player.PlayerRed, "Red");
    Player Pl2 = new Player(Player.PlayerBlue,"Blu");
        
    Pointer P1 = new Pointer(0,536 ,309);
    Pointer P2 = new Pointer(1,1256,309);
    Pointer P3 = new Pointer(2,896 ,544);
    Pointer P4 = new Pointer(3,536 ,784);
    Pointer P5 = new Pointer(4,1256,785);
        
    Chess R1 = new Chess("Red",1,1);
    Chess R2 = new Chess("Red",2,4);
    Chess B1 = new Chess("Blu",1,0);
    Chess B2 = new Chess("Blu",2,3);
    
    public GameE() {
        initComponents();
        this.frame = new JFrame();
	this.frame.setVisible(true);
        EndGames.setVisible(false);
        Current.setText("0");
        GamePlay.Turn = "Red";
        NameRed.setText(Player.PlayerRed);
        NameBlue.setText(Player.PlayerBlue);
        R1.ChangePoint();
        R2.ChangePoint();
        B1.ChangePoint();
        B2.ChangePoint();
        Red1.setLocation(1256 , 309);
        Red2.setLocation(1256, 785);
        Blue1.setLocation(536, 309);
        Blue2.setLocation(536, 784);
        SoundMove.setFile(EffectMove);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Current = new javax.swing.JLabel();
        EndGames = new javax.swing.JLabel();
        Winners = new javax.swing.JLabel();
        TurnRed = new javax.swing.JLabel();
        TurnBlue = new javax.swing.JLabel();
        WinLoad = new javax.swing.JLabel();
        Winner = new javax.swing.JLabel();
        ReStart = new javax.swing.JButton();
        Setting = new javax.swing.JButton();
        BackMenu = new javax.swing.JButton();
        Blue1 = new javax.swing.JButton();
        Blue2 = new javax.swing.JButton();
        Red1 = new javax.swing.JButton();
        Red2 = new javax.swing.JButton();
        Point1 = new javax.swing.JLabel();
        Point2 = new javax.swing.JLabel();
        Point3 = new javax.swing.JLabel();
        Point4 = new javax.swing.JLabel();
        Point5 = new javax.swing.JLabel();
        NameRed = new javax.swing.JLabel();
        NameBlue = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Current.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        Current.setForeground(new java.awt.Color(255, 255, 255));
        Current.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Current, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 620, 70, 70));

        EndGames.setFont(new java.awt.Font("Trebuchet MS", 0, 90)); // NOI18N
        EndGames.setForeground(new java.awt.Color(204, 0, 0));
        EndGames.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EndGames.setText("EndGame !");
        EndGames.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(EndGames, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 270, -1, -1));

        Winners.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        Winners.setForeground(new java.awt.Color(255, 255, 255));
        Winners.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Winners.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Winners, new org.netbeans.lib.awtextra.AbsoluteConstraints(1538, 355, 280, 90));

        TurnRed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TurnRed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Game/Game_STurn_R.png"))); // NOI18N
        TurnRed.setToolTipText("");
        TurnRed.setAlignmentY(0.0F);
        TurnRed.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        TurnRed.setIconTextGap(0);
        getContentPane().add(TurnRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 340, 120));

        TurnBlue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TurnBlue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Game/Game_STurn_B.png"))); // NOI18N
        TurnBlue.setToolTipText("");
        TurnBlue.setAlignmentY(0.0F);
        TurnBlue.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        TurnBlue.setIconTextGap(0);
        getContentPane().add(TurnBlue, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 340, 120));

        WinLoad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WinLoad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Game/Game_LWin_1.png"))); // NOI18N
        WinLoad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(WinLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 350, 320, 120));

        Winner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Winner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Game/Game_LWin_2.png"))); // NOI18N
        Winner.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Winner, new org.netbeans.lib.awtextra.AbsoluteConstraints(1520, 350, 320, 120));

        ReStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Game/Game_BRestart.png"))); // NOI18N
        ReStart.setAlignmentY(0.0F);
        ReStart.setBorderPainted(false);
        ReStart.setContentAreaFilled(false);
        ReStart.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ReStart.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ReStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReStartActionPerformed(evt);
            }
        });
        getContentPane().add(ReStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 605, 300, 110));

        Setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Game/Game_BSetting.png"))); // NOI18N
        Setting.setAlignmentY(0.0F);
        Setting.setBorderPainted(false);
        Setting.setContentAreaFilled(false);
        Setting.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Setting.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Setting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingActionPerformed(evt);
            }
        });
        getContentPane().add(Setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 845, 300, 110));

        BackMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Game/Game_BBack.png"))); // NOI18N
        BackMenu.setAlignmentY(0.0F);
        BackMenu.setBorderPainted(false);
        BackMenu.setContentAreaFilled(false);
        BackMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BackMenu.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BackMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackMenuActionPerformed(evt);
            }
        });
        getContentPane().add(BackMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 725, 300, 110));

        Blue1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Game/Game_Es_BBlue.png"))); // NOI18N
        Blue1.setBorderPainted(false);
        Blue1.setContentAreaFilled(false);
        Blue1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Blue1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Blue1StateChanged(evt);
            }
        });
        Blue1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                Blue1ComponentMoved(evt);
            }
        });
        Blue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Blue1ActionPerformed(evt);
            }
        });
        getContentPane().add(Blue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 309, -1, -1));

        Blue2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Game/Game_Es_BBlue.png"))); // NOI18N
        Blue2.setBorderPainted(false);
        Blue2.setContentAreaFilled(false);
        Blue2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Blue2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                Blue2ComponentMoved(evt);
            }
        });
        Blue2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Blue2ActionPerformed(evt);
            }
        });
        getContentPane().add(Blue2, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 784, -1, -1));

        Red1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Game/Game_Es_BRed.png"))); // NOI18N
        Red1.setBorderPainted(false);
        Red1.setContentAreaFilled(false);
        Red1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Red1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                Red1ComponentMoved(evt);
            }
        });
        Red1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Red1ActionPerformed(evt);
            }
        });
        getContentPane().add(Red1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1257, 309, -1, -1));

        Red2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Game/Game_Es_BRed.png"))); // NOI18N
        Red2.setBorderPainted(false);
        Red2.setContentAreaFilled(false);
        Red2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Red2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                Red2ComponentMoved(evt);
            }
        });
        Red2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Red2ActionPerformed(evt);
            }
        });
        getContentPane().add(Red2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1257, 785, -1, -1));

        Point1.setPreferredSize(new java.awt.Dimension(160, 160));
        Point1.setRequestFocusEnabled(false);
        Point1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Point1MouseClicked(evt);
            }
        });
        getContentPane().add(Point1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 293, -1, -1));

        Point2.setPreferredSize(new java.awt.Dimension(160, 160));
        Point2.setRequestFocusEnabled(false);
        Point2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Point2MouseClicked(evt);
            }
        });
        getContentPane().add(Point2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 293, -1, -1));

        Point3.setPreferredSize(new java.awt.Dimension(160, 160));
        Point3.setRequestFocusEnabled(false);
        Point3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Point3MouseClicked(evt);
            }
        });
        getContentPane().add(Point3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 530, -1, -1));

        Point4.setPreferredSize(new java.awt.Dimension(160, 160));
        Point4.setRequestFocusEnabled(false);
        Point4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Point4MouseClicked(evt);
            }
        });
        getContentPane().add(Point4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 770, -1, -1));

        Point5.setPreferredSize(new java.awt.Dimension(160, 160));
        Point5.setRequestFocusEnabled(false);
        Point5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Point5MouseClicked(evt);
            }
        });
        getContentPane().add(Point5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 770, -1, -1));

        NameRed.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        NameRed.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(NameRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 755, 165, 50));

        NameBlue.setFont(new java.awt.Font("Trebuchet MS", 0, 28)); // NOI18N
        NameBlue.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(NameBlue, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 875, 165, 50));

        BG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Game/Game_BG_Es.png"))); // NOI18N
        BG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    public void StartGameE(){
        getContentPane().removeAll();
        getContentPane().revalidate();
        getContentPane().repaint();
        initComponents();
        EndGames.setVisible(false);
        Current.setText("0");
        Player.Round = 0;
        GamePlay.Turn = "Red";
        NameRed.setText(Player.PlayerRed);
        NameBlue.setText(Player.PlayerBlue);
        Pointer.SetPoint(1, 4, 0, 3);
        R1.Point = 1;
        R2.Point = 4;
        B1.Point = 0;
        B2.Point = 3;
        R1.ChangePoint();
        R2.ChangePoint();
        B1.ChangePoint();
        B2.ChangePoint();
        Red1.setLocation(1256 , 309);
        Red2.setLocation(1256, 785);
        Blue1.setLocation(536, 309);
        Blue2.setLocation(536, 784);
        SoundMove.setFile(EffectMove);
    }
    
    public void PlayerMove(JButton Red1,JButton Red2,JButton Blue1,JButton Blue2,JLabel TurnRed,JLabel TurnBlue,JLabel EndGames){
        if(GamePlay.Team.equals("Red")){
            if(GamePlay.Number == 1){
                R1.Point = GamePlay.PointM;
                Chess.PointersE[0] = GamePlay.PointM;
                Red1.setLocation(GamePlay.X, GamePlay.Y);
            }
            else {
                R2.Point = GamePlay.PointM;
                Chess.PointersE[1] = GamePlay.PointM;
                Red2.setLocation(GamePlay.X, GamePlay.Y);
            }
        }
        else{
            if(!Player.PlayerBlue.equals("Computer")){
                if(GamePlay.Number == 1){
                    B1.Point = GamePlay.PointM;
                    Chess.PointersE[2] = GamePlay.PointM;
                    Blue1.setLocation(GamePlay.X, GamePlay.Y);
                }
                else {
                    B2.Point = GamePlay.PointM;
                    Chess.PointersE[3] = GamePlay.PointM;
                    Blue2.setLocation(GamePlay.X, GamePlay.Y);
                }
            }
        }
        
        if(GamePlay.Turn.equals("Red")){
            GamePlay.Turn = "Blu";
            TurnRed.setVisible(false);
            TurnBlue.setVisible(true);
        }
        else{
            GamePlay.Turn = "Red";
            TurnRed.setVisible(true);
            TurnBlue.setVisible(false);
        }
        Pointer.SetPoint(R1.Point, R2.Point, B1.Point, B2.Point);
        GamePlay.EndGame(EndGames,Chess.PointersE);
        if(GamePlay.Turn.equals("Blu")){
            if(Player.PlayerBlue.equals("Computer")){
                Computer.Play(B1, B2,Chess.PointersE);
                if(Computer.Number ==1){
                    B1.Point = Computer.PointM;
                    B1.ChangePoint();
                    Blue1.setLocation(B1.X, B1.Y);
                    GamePlay.Turn = "Red";
                    TurnRed.setVisible(true);
                    TurnBlue.setVisible(false);
                    GamePlay.EndGame(EndGames,Chess.PointersE);
                }
                else{
                    B2.Point = Computer.PointM;
                    B2.ChangePoint();
                    Blue2.setLocation(B2.X, B2.Y);
                    GamePlay.Turn = "Red";
                    TurnRed.setVisible(true);
                    TurnBlue.setVisible(false);
                    GamePlay.EndGame(EndGames,Chess.PointersE);
                }
            } 
        } 
    }
    
    public void ComputerMove(JButton Blue1,JButton Blue2,JLabel TurnRed,JLabel TurnBlue,JLabel EndGames){
        if(GamePlay.Turn.equals("Blu")){
            if(Player.PlayerBlue.equals("Computer")){
                Computer.Play(B1, B2,Chess.PointersE);
                if(Computer.Number ==1){
                    B1.Point = Computer.PointM;
                    B1.ChangePoint();
                    Blue1.setLocation(B1.X, B1.Y);
                    GamePlay.Turn = "Red";
                    TurnRed.setVisible(true);
                    TurnBlue.setVisible(false);
                    GamePlay.EndGame(EndGames,Chess.PointersE);
                }
                else{
                    B2.Point = Computer.PointM;
                    B2.ChangePoint();
                    Blue2.setLocation(B2.X, B2.Y);
                    GamePlay.Turn = "Red";
                    TurnRed.setVisible(true);
                    TurnBlue.setVisible(false);
                    GamePlay.EndGame(EndGames,Chess.PointersE);
                }
            } 
        }
    }
    
    private void ReStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReStartActionPerformed
        int Answer = JOptionPane.showConfirmDialog(null,"Are you sure?","Restat Game",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if( Answer == 0){
            StartGameE();
        }
    }//GEN-LAST:event_ReStartActionPerformed

    private void SettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingActionPerformed
        int Answer = JOptionPane.showConfirmDialog(null,"Are you sure?","Back to Setting ",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if( Answer == 0){
            getContentPane().removeAll();
            getContentPane().revalidate();
            getContentPane().repaint();
            Set PSet = new Set();
            PSet.setVisible(true);
            Pointer.amount = 0;
            Chess.amount =0;
        }
    }//GEN-LAST:event_SettingActionPerformed

    private void BackMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackMenuActionPerformed
        int Answer = JOptionPane.showConfirmDialog(null,"Are you sure?","Back to Menu",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if( Answer == 0){
            getContentPane().removeAll();
            getContentPane().revalidate();
            getContentPane().repaint();
            Play PPlay = new Play();
            PPlay.setVisible(true);
            Pointer.amount = 0;
            Chess.amount =0;
           
        }
    }//GEN-LAST:event_BackMenuActionPerformed

    
    private void Point1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Point1MouseClicked
        if(GamePlay.SelectMove(P1,Chess.PointersE))
            PlayerMove(Red1, Red2, Blue1, Blue2, TurnRed, TurnBlue, EndGames);
        ComputerMove(Blue1, Blue2, TurnRed, TurnBlue, EndGames);
        SoundMove.play();
        if(GamePlay.EndGame)
            GamePlay.CheckWinner("Easy",GamePlay.Winner);
    }//GEN-LAST:event_Point1MouseClicked

    private void Point2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Point2MouseClicked
        if(GamePlay.SelectMove(P2,Chess.PointersE))
            PlayerMove(Red1, Red2, Blue1, Blue2, TurnRed, TurnBlue, EndGames);
        ComputerMove(Blue1, Blue2, TurnRed, TurnBlue, EndGames);
        SoundMove.play();
        if(GamePlay.EndGame)
            GamePlay.CheckWinner("Easy",GamePlay.Winner);
    }//GEN-LAST:event_Point2MouseClicked

    private void Point3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Point3MouseClicked
        if(GamePlay.SelectMove(P3,Chess.PointersE))
            PlayerMove(Red1, Red2, Blue1, Blue2, TurnRed, TurnBlue, EndGames);
        ComputerMove(Blue1, Blue2, TurnRed, TurnBlue, EndGames);
        SoundMove.play();
        if(GamePlay.EndGame)
            GamePlay.CheckWinner("Easy",GamePlay.Winner);
    }//GEN-LAST:event_Point3MouseClicked

    private void Point4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Point4MouseClicked
        if(GamePlay.SelectMove(P4,Chess.PointersE))
            PlayerMove(Red1, Red2, Blue1, Blue2, TurnRed, TurnBlue, EndGames);
        ComputerMove(Blue1, Blue2, TurnRed, TurnBlue, EndGames);
        SoundMove.play();
        if(GamePlay.EndGame)
            GamePlay.CheckWinner("Easy",GamePlay.Winner);
    }//GEN-LAST:event_Point4MouseClicked

    private void Point5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Point5MouseClicked
        if(GamePlay.SelectMove(P5,Chess.PointersE))
            PlayerMove(Red1, Red2, Blue1, Blue2, TurnRed, TurnBlue, EndGames);
        ComputerMove(Blue1, Blue2, TurnRed, TurnBlue, EndGames);  
        SoundMove.play();
        if(GamePlay.EndGame)
            GamePlay.CheckWinner("Easy",GamePlay.Winner);
    }//GEN-LAST:event_Point5MouseClicked

    private void Red1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Red1ActionPerformed
        GamePlay.SelectChess(R1);      
    }//GEN-LAST:event_Red1ActionPerformed

    private void Red2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Red2ActionPerformed
        GamePlay.SelectChess(R2);
    }//GEN-LAST:event_Red2ActionPerformed

    private void Blue2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Blue2ActionPerformed
        GamePlay.SelectChess(B2);
    }//GEN-LAST:event_Blue2ActionPerformed

    private void Red1ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Red1ComponentMoved
        R1.ChangePoint();
        Red1.setLocation(R1.X, R1.Y);
    }//GEN-LAST:event_Red1ComponentMoved

    private void Red2ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Red2ComponentMoved
        R2.ChangePoint();
        Red2.setLocation(R2.X, R2.Y);
    }//GEN-LAST:event_Red2ComponentMoved

    private void Blue2ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Blue2ComponentMoved
        B2.ChangePoint();          
        Blue2.setLocation(B2.X, B2.Y);
    }//GEN-LAST:event_Blue2ComponentMoved

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowStateChanged

    private void Blue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Blue1ActionPerformed
        GamePlay.SelectChess(B1);
    }//GEN-LAST:event_Blue1ActionPerformed

    private void Blue1ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Blue1ComponentMoved
        B1.ChangePoint();
        Blue1.setLocation(B1.X, B1.Y);
    }//GEN-LAST:event_Blue1ComponentMoved

    private void Blue1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Blue1StateChanged

    }//GEN-LAST:event_Blue1StateChanged

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new GameH().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton BackMenu;
    public javax.swing.JButton Blue1;
    public javax.swing.JButton Blue2;
    public static javax.swing.JLabel Current;
    public static javax.swing.JLabel EndGames;
    private javax.swing.JLabel NameBlue;
    private javax.swing.JLabel NameRed;
    private javax.swing.JLabel Point1;
    private javax.swing.JLabel Point2;
    private javax.swing.JLabel Point3;
    private javax.swing.JLabel Point4;
    private javax.swing.JLabel Point5;
    private javax.swing.JButton ReStart;
    public javax.swing.JButton Red1;
    public javax.swing.JButton Red2;
    private javax.swing.JButton Setting;
    private javax.swing.JLabel TurnBlue;
    private javax.swing.JLabel TurnRed;
    public static javax.swing.JLabel WinLoad;
    private javax.swing.JLabel Winner;
    public static javax.swing.JLabel Winners;
    // End of variables declaration//GEN-END:variables
}
