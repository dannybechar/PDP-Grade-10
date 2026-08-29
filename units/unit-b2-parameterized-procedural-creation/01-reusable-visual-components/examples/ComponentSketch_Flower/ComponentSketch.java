import processing.core.PApplet;

public class ComponentSketch extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void draw()
    {
        background(255);
        drawFlower();
    }

    void drawFlower()
    {
        fill(80);
        ellipse(200, 200, 30, 30);
        fill(200);
        ellipse(200, 170, 20, 20);
        ellipse(200, 230, 20, 20);
        ellipse(170, 200, 20, 20);
        ellipse(230, 200, 20, 20);
    }

    public static void main(String[] args)
    {
        PApplet.main("ComponentSketch");
    }
}

