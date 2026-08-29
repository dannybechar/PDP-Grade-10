import processing.core.PApplet;

public class InteractionSketch extends PApplet {
    public void settings() { size(400, 400); }
    public void setup() { surface.setTitle("B3 Interactivity & State"); }
    public void draw() { background(255); ellipse(mouseX, mouseY, 30, 30); }
    public static void main(String[] args) { PApplet.main(InteractionSketch.class.getName()); }
}
