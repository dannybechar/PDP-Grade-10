import processing.core.PApplet;

public class ComponentSketch extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void draw()
    {
        background(255);
        fill(150);
        ellipse(200, 150, 60, 60);
        fill(0);
        rect(197, 180, 6, 80);
    }

    public static void main(String[] args)
    {
        PApplet.main("ComponentSketch");
    }
}

