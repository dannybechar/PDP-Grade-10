import processing.core.PApplet;

public class StyleSketch extends PApplet
{
    public void settings()
    {
        size(400, 300);
    }

    public void setup()
    {
        background(240);
        noStroke();

        fill(180);
        rect(50, 80, 120, 100);

        fill(180, 80, 40);
        rect(230, 80, 120, 100);
    }

    public void draw()
    {
    }

    public static void main(String[] args)
    {
        PApplet.main("StyleSketch");
    }
}
