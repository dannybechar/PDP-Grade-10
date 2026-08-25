import processing.core.PApplet;

public class TraceSketch extends PApplet
{
    float x = 20;
    float vx = 4;
    float d = 15;
    float growth = 1;

    public void settings()
    {
        size(400, 300);
    }

    public void setup()
    {
        noStroke();
        frameRate(10);
    }

    public void draw()
    {
        int shade = 180;
        background(255);
        x = x + vx;
        d = d + growth;
        fill(shade);
        ellipse(x, 150, d, d);
    }

    public static void main(String[] args)
    {
        PApplet.main("TraceSketch");
    }
}
