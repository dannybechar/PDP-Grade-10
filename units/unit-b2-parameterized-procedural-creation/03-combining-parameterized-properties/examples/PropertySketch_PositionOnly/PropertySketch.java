import processing.core.PApplet;

public class PropertySketch extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void draw()
    {
        background(255); drawFlower(200, 200);
    }

    void drawFlower(float x, float y)
    {
        fill(80); ellipse(x, y, 30, 30);
        fill(200); ellipse(x, y-30, 20, 20); ellipse(x, y+30, 20, 20);
        ellipse(x-30, y, 20, 20); ellipse(x+30, y, 20, 20);
    }

    public static void main(String[] args)
    {
        PApplet.main("PropertySketch");
    }
}
