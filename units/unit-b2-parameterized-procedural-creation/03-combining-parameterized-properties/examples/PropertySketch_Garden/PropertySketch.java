import processing.core.PApplet;

public class PropertySketch extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void draw()
    {
        background(255);
        drawFlower(80, 90, 30); drawFlower(200, 100, 50);
        drawFlower(320, 100, 70); drawFlower(140, 280, 45); drawFlower(280, 270, 60);
    }

    void drawFlower(float x, float y, float size)
    {
        float petalSize=size*2f/3f;
        fill(80); ellipse(x, y, size, size);
        fill(200); ellipse(x, y-size, petalSize, petalSize); ellipse(x, y+size, petalSize, petalSize);
        ellipse(x-size, y, petalSize, petalSize); ellipse(x+size, y, petalSize, petalSize);
    }

    public static void main(String[] args)
    {
        PApplet.main("PropertySketch");
    }
}
