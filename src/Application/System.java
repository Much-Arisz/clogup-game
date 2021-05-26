package Application;

import java.io.File;
import java.util.ArrayList;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


class Player{
    public String ID,Player;
    public static int Round=0;
    public static String PlayerRed;
    public static String PlayerBlue;
    Player(String p,String ID) {
        this.ID = ID;
        Player = p;
    }
}

class Ranking{
    public static ArrayList<Integer> Score = new ArrayList<>();
    public static ArrayList<String> Player = new ArrayList<>();
    public static ArrayList<String> Levels = new ArrayList<>();
    public static void SetRanking(){
        for(int i=0; i<Score.size()-1;i++){
            int index = i;  
            for (int j = i + 1; j < Score.size(); j++){  
                if (Score.get(j) < Score.get(index)){  
                    index = j;
                }  
            }  
            int smallerScore = Score.get(index);
            String smallerPlayer = Player.get(index); 
            String smallerLevels = Levels.get(index); 
            Score.set(index,Score.get(i));
            Score.set(i,smallerScore);
            Player.set(index,Player.get(i));
            Player.set(i,smallerPlayer);
            Levels.set(index,Levels.get(i));
            Levels.set(i,smallerLevels);
        }
    }
}

 class SelectionSortExample {  
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    } 
 }

class Chess{
    public String ID;
    public int Number,Point,X,Y;
    public static int[] PointersE = new int[4];
    public static int[] PointersH = new int[6];
    static int amount,number;

    Chess(String ID,int n,int p ){
        this.ID = ID;
        Number = n;
        Point = p;
        if(LevelGame.level == 0)
            PointersE[amount]= p;
        else
            PointersH[amount]= p;
        amount++;
        number = amount/2;
    }
    public void ChangePoint(){
        if(LevelGame.level == 0){
            for(int z=0; z<Pointer.LocateE.length; z++){
                if(Point == z ){
                    X = Pointer.LocateE[z][0];
                    Y = Pointer.LocateE[z][1];
                }
            }
        }
        else{
            for(int z=0; z<Pointer.LocateH.length; z++){
                if(Point == z ){
                    X = Pointer.LocateH[z][0];
                    Y = Pointer.LocateH[z][1];
                }
            }
        }
    }
    
}

class Pointer{
    private static int n;
    public int Point,X,Y;
    public static int[][] LocateE = new int[5][2];
    public static int[][] LocateH = new int[8][2];
    /*int[][] Easy = new int[5][2];
    int[][] Hard = new int[8][2]; */
    public static int amount=0;
    Pointer(int p,int x,int y){
        Point = p;
        X = x;
        Y = y;
        if(LevelGame.level == 0){
            LocateE[amount][0]= x;
            LocateE[amount][1]= y;
        }
        else{
            LocateH[amount][0]= x;
            LocateH[amount][1]= y;
        }
        
        amount++;
    }
           
    public static void SetPoint(int r1,int r2,int b1,int b2){
        Chess.PointersE[0] = r1;
        Chess.PointersE[1] = r2;
        Chess.PointersE[2] = b1;
        Chess.PointersE[3] = b2;
    }
    
    public static void SetPoint(int r1,int r2,int r3,int b1,int b2,int b3){
        Chess.PointersH[0] = r1;
        Chess.PointersH[1] = r2;
        Chess.PointersH[2] = r3;
        Chess.PointersH[3] = b1;
        Chess.PointersH[4] = b2;
        Chess.PointersH[5] = b3;
    }
    
    public boolean StatusPoint(int Points, int[] Pointerz){
        boolean ans = true;
        for(int z=0; z<Pointerz.length;z++){
            if(Pointerz[z] == Points){
                ans = false;
            }
        }
        return ans;
    }
    public static boolean StatusPoints(int Points,int[] Pointerz){
        boolean ans = true;
        for(int z=0; z<Pointerz.length;z++){
            if(Pointerz[z] == Points){
                ans = false;
            }
       
        }
        
        return ans;
    }
}

class MapChess{
    public static int MapPointE[][] = {{1,2},
                                      {0,2,4},
                                      {0,1,3,4},
                                      {2,4},
                                      {1,2,3}};
    public static int MapPointH[][] = {{1,3},        //0
                                      {0,2,3,4,6},  //1
                                      {1,4,7},      //2
                                      {0,1,5,6},    //3
                                      {1,2,6,7},    //4
                                      {3,6},        //5
                                      {1,3,4,5,7},  //6
                                      {2,4,6}}; 
    public static boolean StatusMap(int Start,int Move){
        boolean ans = false;
        if(LevelGame.level == 0){
            for(int i=0; i<MapPointE.length; i++){
                if(Start == i){
                    for(int j=0; j<MapPointE[i].length; j++){
                        if(Move == MapPointE[i][j])
                            ans = true;
                    }
                }
            }
        }
        else{
            for(int i=0; i<MapPointH.length; i++){
                if(Start == i){
                    for(int j=0; j<MapPointH[i].length; j++){
                        if(Move == MapPointH[i][j])
                            ans = true;
                    }
                }
            }
        }
        return ans;
    }

}

class GamePlay{
    public static String Turn = "Red";
    public static String Team,Winner ;
    public static int Number,PointS,PointM,X,Y;
    public static boolean EndGame;
    LevelGame L;
    public static void SelectChess(Chess C){
        if(Turn.equals(C.ID)) {
            Team = C.ID;
        Number = C.Number;
            PointS = C.Point;
        } 
        else 
            JOptionPane.showMessageDialog(null,"Not your Turn","Error !!",JOptionPane.ERROR_MESSAGE);
    }
    public static boolean SelectMove(Pointer P,int[] ChessPointer){
        
        if(P.StatusPoint(P.Point,ChessPointer)){
            if(MapChess.StatusMap(PointS,P.Point)){
                X = P.X;
                Y = P.Y;
                PointM = P.Point;
                if(Turn.equals("Blu"))
                    Player.Round++;
                String Text = Integer.toString(Player.Round);
                if(LevelGame.level == 0){
                    GameE.Current.setText(Text);
                }
                else{
                    GameH.Current.setText(Text);
                }
                return true;
            }
            else{
                JOptionPane.showMessageDialog(null,"Can't move because it's not way.","Error !!",JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Can't select because it's not empty.","Error !!",JOptionPane.ERROR_MESSAGE);
        return false;
        }
        
    }
    
    
    public static void EndGame(JLabel Button,int[] ChessPointer){
        int Lose;
        EndGame = false;
        ArrayList<Integer> Check = new ArrayList<>();
        Check.clear();
        //Check Blue Win
            for(int i=0; i<Chess.number; i++){
                for(int Point=0; Point<Pointer.amount; Point++){
                    if(ChessPointer[i]!=Point){
                        Check.add(1);
                        if(MapChess.StatusMap(ChessPointer[i],Point)){
                            if(Pointer.StatusPoints(Point,ChessPointer)){
                                 Check.add(0);
                            }
                        }
                    } 
                }
            }
            Lose=1;   
            for(int i=0; i<Check.size(); i++){            
                if(Check.get(i) == 0){
                    Lose = 0;
                }
            }
            if(Lose == 1){
                EndGame = true;
                Winner = Player.PlayerBlue;
                Button.setVisible(true);
                if(LevelGame.level == 0){
                    GameE.WinLoad.setVisible(false);
                    GameE.Winners.setText(Winner);
                }
                else{
                    GameH.WinLoad.setVisible(false);
                    GameH.Winners.setText(Winner);
                }
            }
        Check.clear();
        //Check Red Win
            for(int i=Chess.number; i<Chess.amount; i++){
                for(int Point=0; Point<Pointer.amount; Point++){
                    if(ChessPointer[i]!=Point){
                        Check.add(1);
                        if(MapChess.StatusMap(ChessPointer[i],Point)){
                            if(Pointer.StatusPoints(Point,ChessPointer)){
                                 Check.add(0);
                            }
                        }
                    } 
                }
            }
            Lose=1;    
            for(int i=0; i<Check.size(); i++){            
                if(Check.get(i) == 0){
                    Lose = 0;
                }
            }
            if(Lose == 1){
                EndGame = true;
                Winner = Player.PlayerRed;
                Button.setVisible(true);
                if(LevelGame.level == 0){
                    GameE.WinLoad.setVisible(false);
                    GameE.Winners.setText(Winner);
                }
                else{
                    GameH.WinLoad.setVisible(false);
                    GameH.Winners.setText(Winner);
                }
            }       
        }
    public static void CheckWinner(String Level,String Winner){
        Ranking.Score.add(Player.Round);
        Ranking.Player.add(Winner);  
        Ranking.Levels.add(Level);
    } 
}

class Computer{
    public static ArrayList<Integer> MovePoint1 = new ArrayList<>();
    public static ArrayList<Integer> MovePoint2 = new ArrayList<>();
    public static ArrayList<Integer> MovePoint3 = new ArrayList<>();
    public static int PointM,PointS,Number;
    public static void Play(Chess B1,Chess B2,int[] ChessPointer){
            PointM = -1;
            MovePoint1.clear();
            MovePoint2.clear();
                for(int i=0;i<Pointer.amount;i++){
                    if(MapChess.StatusMap(B1.Point, i)){
                        MovePoint1.add(i);
                    }
                    if(MapChess.StatusMap(B2.Point, i)){
                        MovePoint2.add(i);
                    }    
                }
                for(int i=0;i<MovePoint1.size();i++){
                    if(Pointer.StatusPoints(MovePoint1.get(i),ChessPointer)){
                       PointM = MovePoint1.get(i);
                       PointS = B1.Point;
                       Number = B1.Number;
                       Chess.PointersE[2] = PointM;
                       
                    }
                }
                if(PointM == -1){
                    for(int i=0;i<MovePoint2.size();i++){
                        if(Pointer.StatusPoints(MovePoint2.get(i),ChessPointer)){
                            PointM = MovePoint2.get(i);
                            PointS = B2.Point;
                            Number = B2.Number;
                            Chess.PointersE[3] = PointM;
                        }
                    }
                }
            Player.Round++;
            String Text = Integer.toString(Player.Round);
            GameE.Current.setText(Text);
            
         
        }
    
    public static void Play(Chess B1,Chess B2,Chess B3,int[] ChessPointer){
            PointM = -1;
            MovePoint1.clear();
            MovePoint2.clear();
            MovePoint3.clear();
                for(int i=0;i<Pointer.amount;i++){
                    if(MapChess.StatusMap(B1.Point, i)){
                        MovePoint1.add(i);
                    }
                    if(MapChess.StatusMap(B2.Point, i)){
                        MovePoint2.add(i);
                    }
                    if(MapChess.StatusMap(B3.Point, i)){
                        MovePoint3.add(i);
                    }   
                } 
                for(int i=0;i<MovePoint1.size();i++){
                    if(Pointer.StatusPoints(MovePoint1.get(i),ChessPointer)){
                       PointM = MovePoint1.get(i);
                       PointS = B1.Point;
                       Number = 1;
                       Chess.PointersH[3] = PointM;
                       break;
                    }
                }
                if(PointM == -1){
                    for(int i=0;i<MovePoint2.size();i++){
                        if(Pointer.StatusPoints(MovePoint2.get(i),ChessPointer)){
                            PointM = MovePoint2.get(i);
                            PointS = B2.Point;
                            Number = 2;
                            Chess.PointersH[4] = PointM;
                            break;
                        }
                    }
                }
                if(PointM == -1){
                        for(int i=0;i<MovePoint3.size();i++){
                            if(Pointer.StatusPoints(MovePoint3.get(i),ChessPointer)){
                                PointM = MovePoint3.get(i);
                                PointS = B3.Point;
                                Number = 3;
                                Chess.PointersH[5] = MovePoint3.get(i);;
                            }
                        }
                    }
            Player.Round++;
            String Text = Integer.toString(Player.Round);
            GameH.Current.setText(Text);
    }
}


class LevelGame {
    public static int level = 0;
    public static void LevelPlay(){
        if(level == 0 ){
                GameE PGameE = new GameE();
                PGameE.setVisible(true);
                PGameE.StartGameE();
            }
        else{
            GameH PGameH = new GameH();
            PGameH.setVisible(true);
            PGameH.StartGameH();
        }   
    } 
}

class Sound{
    Clip clip;
    
    public void setFile(String soundFileName){
	try{
            File file = new File(soundFileName);
            AudioInputStream sound = AudioSystem.getAudioInputStream(file);	
            clip = AudioSystem.getClip();
            clip.open(sound);
	}
	catch(Exception e){	
	}
}
    
    public void play(){		
	clip.setFramePosition(0);
	clip.start();
    }
}