import processing.core.PApplet;

public class StyleSketch extends PApplet
{
    public void settings()
    {
        size(300, 300);
    }

    public void setup()
    {
        background(255);
        fill(255);
        stroke(0);
        strokeWeight(2);
        ellipse(150, 150, 120, 120);
    }

    public void draw()
    {
    }

    public static void main(String[] args)
    {
        PApplet.main("StyleSketch");
    }
}
