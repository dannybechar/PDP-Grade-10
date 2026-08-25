import processing.core.PApplet;

public class CombinedSketch extends PApplet
{
    float x = 40;
    float vx = 3;
    float y = 40;
    float vy = 2;

    public void settings()
    {
        size(400, 300);
    }

    public void setup()
    {
        noStroke();
        fill(80, 170, 230);
        frameRate(20);
    }

    public void draw()
    {
        background(255);
        x = x + vx;
        y = y + vy;
        ellipse(x, y, 30, 30);
    }

    public static void main(String[] args)
    {
        PApplet.main("CombinedSketch");
    }
}
