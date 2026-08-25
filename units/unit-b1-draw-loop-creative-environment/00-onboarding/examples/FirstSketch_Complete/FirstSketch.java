import processing.core.PApplet;

public class FirstSketch extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void setup()
    {
        background(30);
    }

    public void draw()
    {
        background(30);
        noStroke();
        fill(255, 180, 0);
        circle(mouseX, mouseY, 120);
    }

    public static void main(String[] args)
    {
        PApplet.main("FirstSketch");
    }
}

