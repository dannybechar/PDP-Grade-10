import processing.core.PApplet;

public class GridSketch extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void draw()
    {
        background(255); fill(30,45,110);
        for(int row=0; row<3; row++) for(int col=0; col<3; col++) ellipse(120+col*80,120+row*80,40,40);
    }

    public static void main(String[] args)
    {
        PApplet.main("GridSketch");
    }
}
