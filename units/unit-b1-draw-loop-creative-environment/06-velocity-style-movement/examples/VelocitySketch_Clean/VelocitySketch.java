import processing.core.PApplet;

public class VelocitySketch extends PApplet
{
    private float x = 30;
    private float vx = 4;

    public void settings()
    {
        size(400, 300);
    }

    public void setup()
    {
        noStroke();
        fill(240, 170, 50);
        frameRate(15);
    }

    public void draw()
    {
        background(255);
        x = x + vx;
        ellipse(x, 150, 40, 40);
    }

    public static void main(String[] args)
    {
        PApplet.main("VelocitySketch");
    }
}
