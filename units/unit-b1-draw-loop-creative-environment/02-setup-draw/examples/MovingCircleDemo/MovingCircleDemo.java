import processing.core.PApplet;

public class MovingCircleDemo extends PApplet
{
    float x = 0;

    public void settings()
    {
        size(500, 350);
    }

    public void setup()
    {
        noStroke();
        fill(255, 170, 0);
    }

    public void draw()
    {
        background(220);
        ellipse(x, 175, 40, 40);
        x = x + 1;
    }

    public static void main(String[] args)
    {
        PApplet.main("MovingCircleDemo");
    }
}
