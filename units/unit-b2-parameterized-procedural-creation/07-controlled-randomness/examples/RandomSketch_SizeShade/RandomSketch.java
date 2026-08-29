import processing.core.PApplet;

public class RandomSketch extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void setup()
    {
        background(255); noStroke();
        for(int i=0;i<8;i++) { float s=random(15,55); float x=random(s/2,400-s/2); float y=random(s/2,400-s/2); fill(random(50,230)); ellipse(x,y,s,s); }
    }

    public static void main(String[] args)
    {
        PApplet.main("RandomSketch");
    }
}
