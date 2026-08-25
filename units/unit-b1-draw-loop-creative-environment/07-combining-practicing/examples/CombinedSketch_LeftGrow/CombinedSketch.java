import processing.core.PApplet;

public class CombinedSketch extends PApplet
{
    float x = 100;
    float vx = -2;
    float d = 30;
    float growth = 1;

    public void settings()
    {
        size(400, 300);
    }

    public void setup()
    {
        noStroke();
        fill(130, 95, 210);
        frameRate(10);
    }

    public void draw()
    {
        background(255);
        x = x + vx;
        d = d + growth;
        ellipse(x, 150, d, d);
    }

    public static void main(String[] args)
    {
        PApplet.main("CombinedSketch");
    }
}
