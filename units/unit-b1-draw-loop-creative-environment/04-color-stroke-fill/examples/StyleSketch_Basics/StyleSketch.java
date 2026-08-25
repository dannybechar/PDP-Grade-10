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
        fill(220);
        stroke(0);
        strokeWeight(3);
        rect(50, 50, 150, 100);
    }

    public void draw()
    {
    }

    public static void main(String[] args)
    {
        PApplet.main("StyleSketch");
    }
}
