import processing.core.PApplet;

public class SetupDrawSketch extends PApplet
{
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
        ellipse(mouseX, mouseY, 40, 40);
    }

    public static void main(String[] args)
    {
        PApplet.main("SetupDrawSketch");
    }
}
