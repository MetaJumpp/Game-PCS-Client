package example;

import org.lwjgl.Sys;
import org.newdawn.slick.*;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

import java.awt.*;

/**
 * Created by Marianne on 03-11-2015.
 */
public class City extends BasicGame {

    /**
     * Declaring the variables used in the City class. String cityName:
     * The name of ny given city on the game map stored as a String.
     * xPos and yPos are both integers that refer to the x and why coordinates respectively.
     * They are used to define the position of each city on the game map.
     * The integers cubeBlue, cubeYellow, cubeBlack and cubeRed are used:
     * To represent the number of cubes of each individual color present at any given city, starting with a value of 0.
     * The boolean hadResearchSt is used to return either true or false depending
     * on whether or not a research station is present at a given city.
     * The String array neighborCities defines the neighbor-cities of a any given city as a list of Strings
     * with the names of the neighbor cities.
     * The integer color is used to represent the colors: blue, yellow, back and red.
     * Button calls an instance of the button class, it is used to make the cities buttons that react to mouse click.
     */

    String cityName;
    int xPos;
    int yPos;
    int cubeYellow = 0;
    int cubeBlue = 0;
    int cubeRed = 0;
    int cubeBlack = 0;
    boolean hasResearchSt;
    String[] neighborCities;

    int color;

    private Button button;

    private boolean isMovableTo;
    private Image nonMovableCity;
    private Image cityOverview;
    private Image cityOverviewName;

    /**
     * The constructor for the city class, defining the parameters needed to create a city object
     * in the Gameboard class.
    **/
    public City(String title, String cityName, int xPos, int yPos, String[] neighborCities, int color) {
        super(title);
        this.cityName = cityName;
        this.xPos = xPos;
        this.yPos = yPos;
        this.neighborCities = neighborCities;
        this.color = color;
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        /**
         *
        **/

        if (color == 0) {
            button = new Button("cityButton", xPos, yPos, 19);

        } else if (color == 1) {

            button = new Button("cityButton", xPos, yPos, 20);
        }
        else if (color == 2) {

            button = new Button("cityButton", xPos, yPos, 21);
        }
        else {

            button = new Button("cityButton", xPos, yPos, 22);
        }

        nonMovableCity = new Image("assets/cities/notmovablecities.png");
        cityOverview = new Image("assets/guielements/cityoverview.png");
        cityOverviewName = new Image("assets/cities/"+cityName+".png");

        button.init(gc);
    }

    @Override
    public void update(GameContainer gc, int i) throws SlickException {

    }

    @Override
    public void render(GameContainer gc, Graphics g) throws SlickException {



        button.render(gc, g);
        if (!isMovableTo) {
            g.drawImage(nonMovableCity, xPos, yPos);
        }

        //displayCityOverview(gc,g);



    }

    //functions:
    //placeResearchSt ()
    public void placeResearchSt() {
        hasResearchSt = true;
    }

    //removeResearchSt ()
    public void removeResearchSt() {
        hasResearchSt = false;
    }

    //placeCubeY(color: string, amount: int)
    public void placeCube(String color, int amount) {
        if (color == "yellow") {
            this.cubeYellow += amount;
        } else if (color == "blue") {
            this.cubeBlue += amount;
        } else if (color == "red") {
            this.cubeRed += amount;
        } else if (color == "black") {
            this.cubeBlack += amount;
        }
    }

    //removeCube(color: string, amount: int)
    public void removeCube(String color, int amount) {
        if (color == "yellow") {
            cubeYellow -= amount;
        } else if (color == "blue") {
            cubeBlue -= amount;
        } else if (color == "red") {
            cubeRed -= amount;
        } else if (color == "black") {
            cubeBlack -= amount;
        }
    }

    public void displayCityOverview(GameContainer gc, Graphics g){

        int cubeSize = 15;
        int firstRowX = xPos -50;
        int firstRowY = yPos +84;
        int secondRowX = xPos + 20;
        int secondRowY = yPos +105;
        int stringPosX = 20;

        if (button.hoverOver(gc)) {
            g.drawImage(cityOverview, ((xPos - (cityOverview.getWidth()/2))+(button.getImageWidth()/2) -4), yPos + button.getImageHeight() + 5);
            g.setColor(Color.white);
            g.drawImage(cityOverviewName, firstRowX, yPos +65);

            if(cubeBlue == 0){
                g.setColor(Color.blue);
                g.fillRect(firstRowX, firstRowY, cubeSize, cubeSize);
            } else if (cubeBlue == 1) {
                g.setColor(Color.blue);
                g.fillRect(firstRowX, firstRowY, cubeSize, cubeSize);
                g.setColor(Color.white);
                g.drawString("x 1", firstRowX+stringPosX, firstRowY);
            } else if (cubeBlue == 2) {
                g.setColor(Color.blue);
                g.fillRect(firstRowX, firstRowY, cubeSize, cubeSize);
                g.setColor(Color.white);
                g.drawString("x 2", firstRowX+stringPosX, firstRowY);
            } else if (cubeBlue == 3) {
                g.setColor(Color.blue);
                g.fillRect(firstRowX, firstRowY, cubeSize, cubeSize);
                g.setColor(Color.white);
                g.drawString("x 3", firstRowX+stringPosX, firstRowY);
            }

            if(cubeYellow == 0){
                g.setColor(Color.yellow);
                g.fillRect(secondRowX, firstRowY, cubeSize, cubeSize);
            } else if (cubeYellow == 1) {
                g.setColor(Color.yellow);
                g.fillRect(secondRowX, firstRowY, cubeSize, cubeSize);
                g.setColor(Color.white);
                g.drawString("x 1", secondRowX+stringPosX, firstRowY);
            } else if (cubeYellow == 2) {
                g.setColor(Color.yellow);
                g.fillRect(secondRowX, firstRowY, cubeSize, cubeSize);
                g.setColor(Color.white);
                g.drawString("x 2", secondRowX+stringPosX, firstRowY);
            } else if (cubeYellow == 3) {
                g.setColor(Color.yellow);
                g.fillRect(secondRowX, firstRowY, cubeSize, cubeSize);
                g.setColor(Color.white);
                g.drawString("x 3", secondRowX+stringPosX, firstRowY);
            }

            if(cubeBlack == 0){
                g.setColor(Color.black);
                g.fillRect(firstRowX, secondRowY, cubeSize, cubeSize);
            } else if (cubeBlack == 1) {
                g.setColor(Color.black);
                g.fillRect(firstRowX, secondRowY, cubeSize, cubeSize);
                g.setColor(Color.white);
                g.drawString("x 1", firstRowX+stringPosX, secondRowY);
            } else if (cubeBlack == 2) {
                g.setColor(Color.black);
                g.fillRect(firstRowX, secondRowY, cubeSize, cubeSize);
                g.setColor(Color.white);
                g.drawString("x 2", firstRowX+stringPosX, secondRowY);
            } else if (cubeRed == 3) {
                g.setColor(Color.black);
                g.fillRect(firstRowX, secondRowY, cubeSize, cubeSize);
                g.setColor(Color.white);
                g.drawString("x 3", firstRowX+stringPosX, secondRowY);
            }

            if(cubeRed == 0){
                g.setColor(Color.red);
                g.fillRect(secondRowX, secondRowY, cubeSize, cubeSize);
            } else if (cubeRed == 1) {
                g.setColor(Color.red);
                g.fillRect(secondRowX, secondRowY, cubeSize, cubeSize);
                g.setColor(Color.white);
                g.drawString("x 1", secondRowX+stringPosX, secondRowY);
            } else if (cubeRed == 2) {
                g.setColor(Color.red);
                g.fillRect(secondRowX, secondRowY, cubeSize, cubeSize);
                g.setColor(Color.white);
                g.drawString("x 2", secondRowX+stringPosX, secondRowY);
            } else if (cubeRed == 3) {
                g.setColor(Color.red);
                g.fillRect(secondRowX, secondRowY, cubeSize, cubeSize);
                g.setColor(Color.white);
                g.drawString("x 3", secondRowX+stringPosX, secondRowY);
            }
        }

    }

    public int getCubeYellow() {
        return cubeYellow;
    }

    public void setCubeYellow(int cubeYellow) {
        this.cubeYellow = cubeYellow;
    }

    public int getCubeBlue() {
        return cubeBlue;
    }

    public void setCubeBlue(int cubeBlue) {
        this.cubeBlue = cubeBlue;
    }

    public int getCubeRed() {
        return cubeRed;
    }

    public void setCubeRed(int cubeRed) {
        this.cubeRed = cubeRed;
    }

    public int getCubeBlack() {
        return cubeBlack;
    }

    public void setCubeBlack(int cubeBlack) {
        this.cubeBlack = cubeBlack;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public boolean isHasResearchSt() {
        return hasResearchSt;
    }

    public void setHasResearchSt(boolean hasResearchSt) {
        this.hasResearchSt = hasResearchSt;
    }

    public String[] getNeighborCities() {
        return neighborCities;
    }

    public void setNeighborCities(String[] neighborCities) {
        this.neighborCities = neighborCities;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public void setMovableTo (boolean value) {
        this.isMovableTo = value;
    }

    public boolean getMovableTo () {
        return isMovableTo;
    }


}


