package example;

import org.newdawn.slick.*;

/**
 * Created by Marianne on 25-11-2015.
 */
public class Outbreak_Marker extends BasicGame {

    MessageParser message;
    private int outBreakcount;
    private int xPos = 301;
    private int yPos = 670;
    Image ratemarker;

    public Outbreak_Marker(String title, int outBreakcount){
        super(title);
        this.outBreakcount = outBreakcount;
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

        ratemarker = new Image("assets/guielements/ratemarker.png");
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {

        outBreakcount = message.getOutbreakMarker();
        xPos=302+outBreakcount*40;
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

        graphics.drawImage(ratemarker,xPos,yPos);

    }

    public void setMessage(MessageParser message) {
        this.message = message;
    }

}
