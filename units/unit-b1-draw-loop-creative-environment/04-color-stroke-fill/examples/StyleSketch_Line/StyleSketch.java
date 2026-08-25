import processing.core.PApplet;

public class StyleSketch extends PApplet
{
    public void settings()
    {
        size(400, 300);
    }

    public void setup()
    {
        background(240);
        fill(255, 0, 0);
        stroke(0);
        strokeWeight(4);
        line(50, 200, 300, 80);
    }

    public void draw()
    {
    }

    public static void main(String[] args)
    {
        PApplet.main("StyleSketch");
    }
}
