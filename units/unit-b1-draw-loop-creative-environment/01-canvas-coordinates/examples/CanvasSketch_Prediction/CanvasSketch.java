import processing.core.PApplet;

public class CanvasSketch extends PApplet
{
    public void settings()
    {
        size(300, 300);
    }

    public void setup()
    {
        ellipse(50, 50, 30, 30);
        ellipse(250, 50, 30, 30);
        ellipse(150, 250, 30, 30);
    }

    public static void main(String[] args)
    {
        PApplet.main("CanvasSketch");
    }
}
