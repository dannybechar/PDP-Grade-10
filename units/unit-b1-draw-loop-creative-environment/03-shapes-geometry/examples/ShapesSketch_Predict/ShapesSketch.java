import processing.core.PApplet;

public class ShapesSketch extends PApplet
{
    public void settings()
    {
        size(300, 300);
    }

    public void setup()
    {
        background(240);
        rect(40, 40, 80, 80);
        ellipse(240, 80, 80, 80);
        line(40, 240, 280, 240);
    }

    public void draw()
    {
    }

    public static void main(String[] args)
    {
        PApplet.main("ShapesSketch");
    }
}

