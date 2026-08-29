import processing.core.PApplet;

public class RandomSketch extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void setup()
    {
        background(245); noStroke();
        for(int i=0;i<10;i++) { float s=random(20,50); float x=random(50,350); float y=random(120,280); fill(random(40,200)); ellipse(x,y,s,s); }
    }

    public static void main(String[] args)
    {
        PApplet.main("RandomSketch");
    }
}
