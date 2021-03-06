import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;

/**
 * The ScoreBoard is used to display results on the screen. It can display some
 * text and several numbers
 */
public class Player1Wins extends Actor
{
    public static final float FONT_SIZE = 48.0f;
    public static final int WIDTH = 400;
    public static final int HEIGHT = 200;
    
    /**
     * Create a score board with dummy result for testing.
     */
    public Player1Wins()
    {
        this("");
    }

    public Player1Wins(String message)
    {
        makeImage( "Player 1 Wins");
    }

    /**
     * Make the score board image.
     */
    private void makeImage(String title)
    {
        GreenfootImage image = new GreenfootImage(WIDTH, HEIGHT);

        image.setColor(new Color(0, 0, 0, 160));
        image.fillRect(0, 0, WIDTH, HEIGHT);
        image.setColor(new Color(255, 255, 255, 100));
        image.fillRect(5, 5, WIDTH-10, HEIGHT-10);
        Font font = image.getFont();
        font = font.deriveFont(FONT_SIZE);
        image.setFont(font);
        image.setColor(Color.RED);
        image.drawString(title, 60, 100);
        //image.drawString(prefix, 60, 200);
        setImage(image);
    }
}
