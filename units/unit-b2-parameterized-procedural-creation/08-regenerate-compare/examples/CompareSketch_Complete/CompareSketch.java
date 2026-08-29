import processing.core.PApplet;

public class CompareSketch extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void setup()
    {
        background(245); noStroke();
        for(int i=0;i<7;i++) { float x=45+i*52; float y=random(100,300); float size=random(20,55); fill(random(60,190)); ellipse(x,y,size,size); }
    }

    public static void main(String[] args)
    {
        PApplet.main("CompareSketch");
    }
}
