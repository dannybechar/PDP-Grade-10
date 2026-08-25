import processing.core.PApplet;

public class ShapesSketch extends PApplet
{
    public void settings()
    {
        size(400, 300);
    }

    public void setup()
    {
        background(240);
        rect(100, 100, 150, 80);
    }

    public void draw()
    {
    }

    public static void main(String[] args)
    {
        PApplet.main("ShapesSketch");
    }
}

