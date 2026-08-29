import processing.core.PApplet;

public class CompareSketch extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void setup()
    {
        background(255); fill(30,45,110);
        for(int i=0;i<6;i++) { float x=random(40,360); float size=random(15,45); ellipse(x,200,size,size); }
    }

    public static void main(String[] args)
    {
        PApplet.main("CompareSketch");
    }
}
