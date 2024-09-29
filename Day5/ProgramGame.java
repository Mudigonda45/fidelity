package Day5;

import java.util.Scanner;

class Game {
    public String name;
    public int maxnumPlayers;
    Game(String name,int maxnumPlayers) {
        this.name = name;
        this.maxnumPlayers = maxnumPlayers;
    }
    public String toString(){
        return "Maximum number of players for "+name+" is "+maxnumPlayers;
    }
}
class GameWithTimeLimit extends Game {
    public int timeLimit;
    GameWithTimeLimit(String name,int maxnumPlayers, int timeLimit){
        super(name,maxnumPlayers);
        this.timeLimit=timeLimit;
    }
    public String toString(){
        return super.toString()+"\n"+"Time Limit for "+name+" is "+timeLimit+" minutes";
    }
}
public class ProgramGame{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Game: ");
        String name=sc.nextLine();
        System.out.println("Enter The Maximum Number of Players: ");
        int maxnumberofPlayers=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter The Game That has Time Limit: ");
        String timelimitgameName=sc.nextLine();
        System.out.println("Enter The Maximum Number of Players That has Time Limit: ");
        int timelimitmaxnumberofPlayers=sc.nextInt();
        System.out.println("Enter The Time Limit in Minutes: ");
        int timeLimit=sc.nextInt();
        Game game=new Game(name,maxnumberofPlayers);
        GameWithTimeLimit gameWithTimeLimit=new GameWithTimeLimit(timelimitgameName,timelimitmaxnumberofPlayers,timeLimit);
        System.out.println(game.toString());
        System.out.println(gameWithTimeLimit.toString());
    }
}