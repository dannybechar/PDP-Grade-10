import processing.core.PApplet;

public class GridSketch extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void draw()
    {
        background(255); for(int col=0; col<4; col++) ellipse(50+col*90,200,40,40);
    }

    public static void main(String[] args)
    {
        PApplet.main("GridSketch");
    }
}
