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

        noFill();
        stroke(0);
        strokeWeight(3);
        rect(40, 40, 120, 100);

        fill(80);
        noStroke();
        ellipse(280, 90, 100, 100);
    }

    public void draw()
    {
    }

    public static void main(String[] args)
    {
        PApplet.main("StyleSketch");
    }
}
