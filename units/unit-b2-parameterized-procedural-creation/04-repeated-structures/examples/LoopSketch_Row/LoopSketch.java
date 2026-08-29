import processing.core.PApplet;

public class LoopSketch extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void draw()
    {
        background(255);
        for (int i=0; i<4; i++) { drawShape(50+i*90,200,40); }
    }

    void drawShape(float x,float y,float size) { fill(30,45,110); ellipse(x,y,size,size); }

    public static void main(String[] args)
    {
        PApplet.main("LoopSketch");
    }
}
