import processing.core.PApplet;

public class ConditionSketch extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void draw()
    {
        background(255);
        for(int i=0;i<7;i++) { float size=(i%2==0)?50:25; fill((i%2==0)?60:180); ellipse(35+i*55,200,size,size); }
    }

    public static void main(String[] args)
    {
        PApplet.main("ConditionSketch");
    }
}
