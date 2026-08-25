import processing.core.PApplet;

public class VelocitySketch extends PApplet
{
    private float y = 260;
    private float vy = -2;

    public void settings()
    {
        size(400, 300);
    }

    public void setup()
    {
        noStroke();
        fill(90, 175, 235);
        frameRate(30);
    }

    public void draw()
    {
        background(255);
        y = y + vy;
        ellipse(200, y, 40, 40);
    }

    public static void main(String[] args)
    {
        PApplet.main("VelocitySketch");
    }
}
