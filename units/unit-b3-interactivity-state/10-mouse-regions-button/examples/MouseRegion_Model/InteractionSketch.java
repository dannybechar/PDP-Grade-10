import processing.core.PApplet;

public class InteractionSketch extends PApplet {
    public void settings() { size(400, 400); }
    public void setup() { surface.setTitle("B3 Interactivity & State"); }
    private float size = 40;
    public void draw() { background(255); size = map(mouseX, 0, width, 20, 140); ellipse(200, 200, size, size); }
    public static void main(String[] args) { PApplet.main(InteractionSketch.class.getName()); }
}
