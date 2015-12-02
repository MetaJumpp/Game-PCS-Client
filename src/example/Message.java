package example;


import java.io.Serializable;
import java.util.ArrayList;

public class Message implements Serializable{

    ArrayList<String> player1 = new ArrayList<String>();
    ArrayList<String> player2 = new ArrayList<String>();
    ArrayList<String> player3 = new ArrayList<String>();
    ArrayList<String> player4 = new ArrayList<String>();

    String[][] cities = new String[6][48];

    ArrayList<String> playerDeck = new ArrayList<String>();
    ArrayList<String> playerDiscard = new ArrayList<String>();
    ArrayList<String> infectionDeck = new ArrayList<String>();
    ArrayList<String> infectionDiscard = new ArrayList<String>();

    int blueCubesLeft;
    int redCubesLeft;
    int yellowCubesLeft;
    int blackCubesLeft;

    int outbreakMarker;
    int infectionMarker;

    boolean gameWon;
    boolean gameLost;


    Message()
    {
    init(); //TEST SKAL SLETTES!!!!
    }

    //------------------------Getters----------------------------------------------

    public ArrayList<String> getPlayer1() {
        return player1;
    }

    public ArrayList<String> getPlayer2() {
        return player2;
    }

    public ArrayList<String> getPlayer3() {
        return player3;
    }

    public ArrayList<String> getPlayer4() {
        return player4;
    }

    public String[][] getCities() {
        return cities;
    }

    public ArrayList<String> getPlayerDeck() {
        return playerDeck;
    }

    public ArrayList<String> getPlayerDiscard() {
        return playerDiscard;
    }

    public ArrayList<String> getInfectionDeck() {
        return infectionDeck;
    }

    public ArrayList<String> getInfectionDiscard() {
        return infectionDiscard;
    }

    public int getBlueCubesLeft() {
        return blueCubesLeft;
    }

    public int getRedCubesLeft() {
        return redCubesLeft;
    }

    public int getYellowCubesLeft() {
        return yellowCubesLeft;
    }

    public int getBlackCubesLeft() {
        return blackCubesLeft;
    }

    public int getOutbreakMarker() {
        return outbreakMarker;
    }

    public int getInfectionMarker() {
        return infectionMarker;
    }

    public boolean isGameWon() {
        return gameWon;
    }

    public boolean isGameLost() {
        return gameLost;
    }


    //TEST SKAL FOR GUDS SKYLD SLETTES
    public void init() {
        player1.add(0,"0");
        player1.add(1,"false");
        player1.add(2,"chicago");
        player1.add(3,"essen");
        player1.add(4,"london");
        player1.add(5,"riyadh");
        player1.add(6,"milan");
        player1.add(7,"paris");


        player2.add(0,"1");
        player2.add(1,"riyadh");
        player2.add(2,"riyadh");
        player2.add(3,"riyadh");


        player3.add(0,"1");
        player3.add(1,"kolkata");

        player4.add(0,"1");
        player4.add(1,"lima");

        for (int i = 0; i < cities[0].length; i++) {
            cities[0][i] = "stpetersburg";
            cities[1][i] = "true";
            cities[2][i] = "3";
            cities[3][i] = "1";
            cities[4][i] = "1";
            cities[5][i] = "0";
        }

        outbreakMarker = 0;
        infectionMarker = 0;

    }
}