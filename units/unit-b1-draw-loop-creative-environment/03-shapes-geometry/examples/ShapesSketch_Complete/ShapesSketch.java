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
        rect(50, 50, 100, 60);
        ellipse(300, 80, 70, 70);
        line(50, 220, 350, 220);
    }

    public void draw()
    {
    }

    public static void main(String[] args)
    {
        PApplet.main("ShapesSketch");
    }
}

