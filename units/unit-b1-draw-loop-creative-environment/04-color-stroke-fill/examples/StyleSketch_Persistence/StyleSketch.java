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
        stroke(30);
        strokeWeight(2);

        fill(220);
        ellipse(70, 150, 80, 80);
        rect(160, 110, 90, 80);

        fill(80);
        ellipse(320, 150, 80, 80);
    }

    public void draw()
    {
    }

    public static void main(String[] args)
    {
        PApplet.main("StyleSketch");
    }
}
