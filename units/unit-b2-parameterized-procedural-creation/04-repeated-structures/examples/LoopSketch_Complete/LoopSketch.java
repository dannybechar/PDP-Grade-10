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
        for (int i=0; i<6; i++) { drawShape(40+i*64,200,30+i*4); }
    }

    void drawShape(float x,float y,float size) { fill(30,45,110); ellipse(x,y,size,size); }

    public static void main(String[] args)
    {
        PApplet.main("LoopSketch");
    }
}
