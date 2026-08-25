import processing.core.PApplet;

public class FrameChangeSketch extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void setup()
    {
        noStroke();
        fill(240, 170, 50);
        frameRate(4);
    }

    public void draw()
    {
        background(30);
        float d = 80;
        d = d + 2;
        ellipse(200, 200, d, d);
    }

    public static void main(String[] args)
    {
        PApplet.main("FrameChangeSketch");
    }
}
