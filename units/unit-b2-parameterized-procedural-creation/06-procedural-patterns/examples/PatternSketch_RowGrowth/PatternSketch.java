import processing.core.PApplet;

public class PatternSketch extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void draw()
    {
        background(255); fill(30,45,110);
        for(int row=0;row<4;row++) for(int col=0;col<4;col++) ellipse(80+col*80,70+row*90,15+row*12,15+row*12);
    }

    public static void main(String[] args)
    {
        PApplet.main("PatternSketch");
    }
}
