import processing.core.PApplet;

public class VelocitySketch extends PApplet
{
    public void settings()
    {
        size(400, 300);
    }

    public void setup()
    {
        noStroke();
        fill(240, 170, 50);
        frameRate(30);
    }

    public void draw()
    {
        background(255);
    }

    public static void main(String[] args)
    {
        PApplet.main("VelocitySketch");
    }
}
