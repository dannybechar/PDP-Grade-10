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
        for(int i=0;i<6;i++) { if(i<3) fill(30,45,110); else fill(120,145,210); ellipse(45+i*62,200,38,38); }
    }

    public static void main(String[] args)
    {
        PApplet.main("ConditionSketch");
    }
}
