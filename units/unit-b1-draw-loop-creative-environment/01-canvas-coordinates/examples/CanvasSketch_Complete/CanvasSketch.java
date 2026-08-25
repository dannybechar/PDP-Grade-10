import processing.core.PApplet;

public class CanvasSketch extends PApplet
{
    public void settings()
    {
        size(500, 300);
    }

    public void setup()
    {
        ellipse(100, 75, 50, 50);
        ellipse(400, 225, 50, 50);
    }

    public static void main(String[] args)
    {
        PApplet.main("CanvasSketch");
    }
}
