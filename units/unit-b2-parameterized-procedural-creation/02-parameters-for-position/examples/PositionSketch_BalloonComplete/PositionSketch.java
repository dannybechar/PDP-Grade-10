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
        drawBalloon(90, 100); drawBalloon(200, 180); drawBalloon(310, 100);
    }

    void drawBalloon(float x, float y)
    {
        fill(150); ellipse(x, y, 60, 60);
        fill(0); rect(x - 3, y + 30, 6, 80);
    }

    public static void main(String[] args)
    {
        PApplet.main("PositionSketch");
    }
}
