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
        for(int row=0;row<5;row++) for(int col=0;col<5;col++) { float s=12+row*7+col*3; ellipse(55+col*72,55+row*72,s,s); }
    }

    public static void main(String[] args)
    {
        PApplet.main("PatternSketch");
    }
}
