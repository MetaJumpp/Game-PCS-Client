package example;

import org.newdawn.slick.*;

/**
 * Created by TMA on 04-11-2015.
 */

public class Button extends BasicGame {

    protected int mouseX,mouseY;
    private Image img, accept, decline, medic;
    int imgX;
    int imgY;

    boolean playerReady;



    public Button(String title, int x, int y) {
        super(title);

        this.imgX = x;
        this.imgY = y;

    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        img = new Image("assets/button_players.png");
        accept = new Image("assets/accept.png");
        decline = new Image("assets/decline.png");
        medic = new Image("assets/medic.png");
        playerReady = false;
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        org.newdawn.slick.Input input = gameContainer.getInput();
        mouseX = input.getMouseX();
        mouseY = input.getMouseY();
    }

    @Override
    public void render(GameContainer gc, Graphics g) throws SlickException {

        g.drawImage(img, imgX, imgY);


        if (playerReady) {
            g.drawImage(accept, imgX+img.getWidth()-accept.getWidth(),imgY);
            g.drawImage(medic, 1000,150);
        }
        if (!playerReady) {
            g.drawImage(decline, imgX+img.getWidth()-accept.getWidth(),imgY);
        }

    }

    public boolean clickWithin(GameContainer gc) {
        org.newdawn.slick.Input input = gc.getInput();

        if (mouseX > imgX && mouseX < imgX+img.getWidth() && mouseY > imgY && mouseY < imgY+img.getHeight() && input.isMousePressed(input.MOUSE_LEFT_BUTTON)) {
            return true;
        } else {
            return false;
        }

        }

    public boolean getPlayerReady() {
        return playerReady;
    }

    public void setPlayerReady(boolean setPlayerReady) {
        this.playerReady = setPlayerReady;
    }
}
