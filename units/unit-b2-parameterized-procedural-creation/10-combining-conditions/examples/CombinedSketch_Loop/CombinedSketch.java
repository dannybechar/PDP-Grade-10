import processing.core.PApplet;

public class CombinedSketch extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void setup()
    {
        background(255); for(int i=0;i<6;i++) drawMarker(45+i*62,200,i*40);
    }

    void drawMarker(float x,float y,float value) { if(value<100) fill(60); else fill(200); ellipse(x,y,30,30); }

    public static void main(String[] args)
    {
        PApplet.main("CombinedSketch");
    }
}
