import processing.core.PApplet;

public class RandomSketch extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void setup()
    {
        background(255); fill(30,45,110);
        for(int i=0;i<6;i++) { float x=random(40,360); float y=random(40,360); ellipse(x,y,30,30); }
    }

    public static void main(String[] args)
    {
        PApplet.main("RandomSketch");
    }
}
