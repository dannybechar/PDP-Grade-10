import processing.core.PApplet;

public class ConditionSketch extends PApplet
{
    public void settings()
    {
        size(400, 400);
    }

    public void draw()
    {
        background(255);
        for (int i = 0; i < 6; i++)
        {
            float shapeSize;
            if (i < 3)
            {
                fill(60);
                shapeSize = 50;
            }
            else
            {
                fill(180);
                shapeSize = 25;
            }
            ellipse(45 + i * 62, 200, shapeSize, shapeSize);
        }
    }

    public static void main(String[] args)
    {
        PApplet.main("ConditionSketch");
    }
}
