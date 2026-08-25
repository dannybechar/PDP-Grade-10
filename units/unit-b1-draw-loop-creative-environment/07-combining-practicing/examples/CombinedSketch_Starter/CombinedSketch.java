import processing.core.PApplet;

public class CombinedSketch extends PApplet
{
    public void settings()
    {
        size(400, 300);
    }

    public void setup()
    {
        noStroke();
        fill(240, 170, 50);
        frameRate(20);
    }

    public void draw()
    {
        background(255);
    }

    public static void main(String[] args)
    {
        PApplet.main("CombinedSketch");
    }
}
