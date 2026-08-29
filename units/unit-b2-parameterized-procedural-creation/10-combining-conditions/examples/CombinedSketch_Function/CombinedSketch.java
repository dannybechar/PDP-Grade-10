import processing.core.PApplet;

public class CombinedSketch extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void setup()
    {
        background(255); drawMarker(100,200,40); drawMarker(200,200,120); drawMarker(300,200,200);
    }

    void drawMarker(float x,float y,float value) { if(value<100) fill(60); else fill(200); ellipse(x,y,30,30); }

    public static void main(String[] args)
    {
        PApplet.main("CombinedSketch");
    }
}
