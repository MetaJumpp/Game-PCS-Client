package example;

import java.util.ArrayList;

/**
 *
 * Created by TMA on 03-12-2015.
 */

public class MessageParser {

    Message instanceOfMessage;

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

    int researchStationsLeft;

    int outbreakMarker;
    int infectionMarker;

    boolean redCure;
    boolean blueCure;
    boolean yellowCure;
    boolean blackCure;

    boolean gameWon;
    boolean gameLost;


    MessageParser(Message instanceOfMessage)
    {
        this.instanceOfMessage = instanceOfMessage;
        initialInit();
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


    public int getOutbreakMarker() {
        return outbreakMarker;
    }

    public int getInfectionMarker() {
        return infectionMarker;
    }

    public boolean isRedCure() {return redCure;}

    public boolean isBlueCure() {return blueCure;}

    public boolean isYellowCure() {return yellowCure;}

    public boolean isBlackCure() {return blackCure;}

    public boolean isGameWon() {
        return gameWon;
    }

    public boolean isGameLost() {
        return gameLost;
    }

    public void initialInit() {

        player1.add("0");
        player1.add("true");
        player1.add("atlanta");
        player1.add("atlanta");


        player2.add("1");
        player2.add("true");
        player2.add("atlanta");
        player1.add("atlanta");


        player3.add("2");
        player3.add("true");
        player3.add("atlanta");
        player3.add("atlanta");


        player4.add("3");
        player4.add("true");
        player4.add("atlanta");
        player4.add("atlanta");


        for (int i = 0; i < cities[0].length; i++) {
            cities[0][i] = "atlanta";
            cities[1][i] = "false";
            cities[2][i] = "0";
            cities[3][i] = "0";
            cities[4][i] = "0";
            cities[5][i] = "0";
        }

    }

    public void updateValues() {

        try {
            if (instanceOfMessage.getPlayer1() != null && !instanceOfMessage.getPlayer1().isEmpty()) {
                player1 = instanceOfMessage.getPlayer1();
            }
            if (instanceOfMessage.getPlayer2() != null && !instanceOfMessage.getPlayer2().isEmpty()) {
                player2 = instanceOfMessage.getPlayer1();
            }
            if (instanceOfMessage.getPlayer3() != null && !instanceOfMessage.getPlayer3().isEmpty()) {
                player3 = instanceOfMessage.getPlayer1();
            }
            if (instanceOfMessage.getPlayer4() != null && !instanceOfMessage.getPlayer3().isEmpty()) {
                player1 = instanceOfMessage.getPlayer1();
            }
            if (instanceOfMessage.getCities() != null && !instanceOfMessage.getPlayer1().isEmpty()) {
                cities = getCities();
            }
            if (instanceOfMessage.getCities() != null && instanceOfMessage.getCities().length>0)
            outbreakMarker = instanceOfMessage.outbreakMarker;
            infectionMarker = instanceOfMessage.infectionMarker;
        } catch (NullPointerException nox) {
            nox.printStackTrace();
        }
    }


}
