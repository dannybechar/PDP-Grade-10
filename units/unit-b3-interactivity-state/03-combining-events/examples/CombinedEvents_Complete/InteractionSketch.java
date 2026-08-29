import processing.core.PApplet;

public class InteractionSketch extends PApplet {
    public void settings() { size(400, 400); }
    public void setup() { surface.setTitle("B3 Interactivity & State"); }
    private float size = 50;
    private int shade = 100;
    public void draw() { background(255); fill(shade); ellipse(mouseX, mouseY, size, size); }
    public void mousePressed() { shade = (shade == 100) ? 220 : 100; }
    public void keyPressed() { if (key == '+') size = min(140, size + 10); else if (key == '-') size = max(20, size - 10); }
    public static void main(String[] args) { PApplet.main(InteractionSketch.class.getName()); }
}
