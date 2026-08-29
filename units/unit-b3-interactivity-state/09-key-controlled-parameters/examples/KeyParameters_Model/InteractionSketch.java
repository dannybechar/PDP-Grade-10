import processing.core.PApplet;

public class InteractionSketch extends PApplet {
    public void settings() { size(400, 400); }
    public void setup() { surface.setTitle("B3 Interactivity & State"); }
    private float size = 60;
    public void draw() { background(255); ellipse(200, 200, size, size); }
    public void keyPressed() { if (key == '+') size += 10; else if (key == '-') size -= 10; }
    public static void main(String[] args) { PApplet.main(InteractionSketch.class.getName()); }
}
