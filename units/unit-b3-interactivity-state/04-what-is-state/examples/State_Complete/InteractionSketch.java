import processing.core.PApplet;

public class InteractionSketch extends PApplet {
    public void settings() { size(400, 400); }
    public void setup() { surface.setTitle("B3 Interactivity & State"); }
    private float x = 20;
    private boolean moving = true;
    public void draw() { background(255); ellipse(x, 200, 40, 40); if (moving) x += 2; if (x > width + 20) x = -20; }
    public void mousePressed() { moving = !moving; }
    public static void main(String[] args) { PApplet.main(InteractionSketch.class.getName()); }
}
