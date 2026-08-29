import processing.core.PApplet;

public class CombinedSketch extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void setup()
    {
        background(255); noStroke();
        for(int i=0;i<8;i++) { float value=random(0,200); drawMarker(35+i*47,random(120,280),value); }
    }

    void drawMarker(float x,float y,float value) { if(value<100) fill(50,90,180); else fill(220,120,70); ellipse(x,y,25+value/10f,25+value/10f); }

    public static void main(String[] args)
    {
        PApplet.main("CombinedSketch");
    }
}
