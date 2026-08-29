import processing.core.PApplet;

public class CompareSketch extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void setup()
    {
        background(255); noStroke();
        for(int i=0;i<8;i++) { float x=35+i*47; float y=random(140,260); float size=random(15,40); fill(30,45,110); ellipse(x,y,size,size); }
    }

    public static void main(String[] args)
    {
        PApplet.main("CompareSketch");
    }
}
