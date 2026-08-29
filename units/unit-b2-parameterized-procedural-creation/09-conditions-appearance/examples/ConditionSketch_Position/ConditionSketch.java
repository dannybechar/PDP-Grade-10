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
        for(int i=0;i<6;i++) { float x=45+i*62; if(x<220) fill(200); else fill(60); ellipse(x,200,38,38); }
    }

    public static void main(String[] args)
    {
        PApplet.main("ConditionSketch");
    }
}
