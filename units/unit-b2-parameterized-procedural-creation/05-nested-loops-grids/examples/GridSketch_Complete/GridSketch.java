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
        for(int row=0; row<4; row++) for(int col=0; col<6; col++) ellipse(45+col*62,80+row*80,28,28);
    }

    public static void main(String[] args)
    {
        PApplet.main("GridSketch");
    }
}
