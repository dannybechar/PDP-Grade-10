import processing.core.PApplet;

public class InteractionSketch extends PApplet {
    public void settings() { size(400, 400); }
    public void setup() { surface.setTitle("B3 Interactivity & State"); }
    private float size = 60;
    private int shade = 120;
    public void draw() { background(255); fill(shade); ellipse(200, 200, size, size); }
    public void keyPressed() { if (key == '+') size = constrain(size + 10, 20, 180); else if (key == '-') size = constrain(size - 10, 20, 180); else if (key == 'l') shade = constrain(shade + 20, 0, 255); else if (key == 'd') shade = constrain(shade - 20, 0, 255); }
    public static void main(String[] args) { PApplet.main(InteractionSketch.class.getName()); }
}
