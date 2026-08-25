import processing.core.PApplet;

public class FrameChangeSketch extends PApplet
{
    float d = 20;

    public void settings()
    {
        size(400, 400);
    }

    public void setup()
    {
        noStroke();
        fill(240, 170, 50);
        frameRate(1);
    }

    public void draw()
    {
        background(30);
        d = d + 1;
        println("d = " + d);
        ellipse(200, 200, d, d);
    }

    public static void main(String[] args)
    {
        PApplet.main("FrameChangeSketch");
    }
}
