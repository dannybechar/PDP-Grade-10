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

        stroke(20);
        strokeWeight(4);
        fill(190, 80, 35);
        rect(40, 40, 120, 80);

        noFill();
        ellipse(300, 80, 80, 80);

        stroke(40, 100, 210);
        strokeWeight(5);
        line(40, 220, 360, 220);

        fill(80);
        noStroke();
        ellipse(200, 220, 55, 55);
    }

    public void draw()
    {
    }

    public static void main(String[] args)
    {
        PApplet.main("StyleSketch");
    }
}
