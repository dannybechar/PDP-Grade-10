import processing.core.PApplet;

public class CombinedSketch extends PApplet
{
    float x = 30;
    float vx = 2;
    float d = 20;
    float growth = 1;

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
        x = x + vx;
        d = d + growth;
        ellipse(x, 150, d, d);
    }

    public static void main(String[] args)
    {
        PApplet.main("CombinedSketch");
    }
}
