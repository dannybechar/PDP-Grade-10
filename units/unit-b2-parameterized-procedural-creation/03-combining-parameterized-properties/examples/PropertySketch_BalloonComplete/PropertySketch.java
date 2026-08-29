import processing.core.PApplet;

public class PropertySketch extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void draw()
    {
        background(255); drawBalloon(90, 90, 40); drawBalloon(210, 160, 70); drawBalloon(330, 100, 50);
    }

    void drawBalloon(float x, float y, float size)
    {
        fill(150); ellipse(x, y, size, size);
        fill(0); rect(x-size/20f, y+size/2f, size/10f, size*4f/3f);
    }

    public static void main(String[] args)
    {
        PApplet.main("PropertySketch");
    }
}
