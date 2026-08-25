import processing.core.PApplet;

public class FrameChangeSketch extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void setup()
    {
        background(30);
        noStroke();
        fill(240, 170, 50);
        frameRate(10);
    }

    public void draw()
    {
    }

    public static void main(String[] args)
    {
        PApplet.main("FrameChangeSketch");
    }
}
