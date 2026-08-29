import processing.core.PApplet;

public class PositionSketch extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void draw()
    {
        background(255);
        drawFlower(100, 100); drawFlower(300, 100); drawFlower(200, 300);
    }

    void drawFlower(float x, float y)
    {
        fill(80); ellipse(x, y, 30, 30);
        fill(200);
        ellipse(x, y - 30, 20, 20); ellipse(x, y + 30, 20, 20);
        ellipse(x - 30, y, 20, 20); ellipse(x + 30, y, 20, 20);
    }

    public static void main(String[] args)
    {
        PApplet.main("PositionSketch");
    }
}
