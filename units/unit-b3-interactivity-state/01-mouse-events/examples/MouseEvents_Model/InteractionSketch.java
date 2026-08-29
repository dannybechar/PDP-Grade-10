import processing.core.PApplet;

public class InteractionSketch extends PApplet {
    public void settings() { size(400, 400); }
    public void setup() { surface.setTitle("B3 Interactivity & State"); }
    private int shade = 80;
    public void draw() { background(255); fill(shade); ellipse(mouseX, mouseY, 40, 40); }
    public void mousePressed() { shade = 220; }
    public void mouseReleased() { shade = 80; }
    public static void main(String[] args) { PApplet.main(InteractionSketch.class.getName()); }
}
