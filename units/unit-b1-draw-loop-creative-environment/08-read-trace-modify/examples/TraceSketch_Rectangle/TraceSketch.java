import processing.core.PApplet;

public class TraceSketch extends PApplet
{
    float y = 180;
    float vy = -3;
    float w = 60;
    float shrink = -1;

    public void settings()
    {
        size(400, 300);
    }

    public void setup()
    {
        stroke(0);
        fill(170);
        frameRate(10);
    }

    public void draw()
    {
        int strokeW = 2;
        background(230);
        y = y + vy;
        w = w + shrink;
        strokeWeight(strokeW);
        rect(50, y, w, w);
    }

    public static void main(String[] args)
    {
        PApplet.main("TraceSketch");
    }
}
