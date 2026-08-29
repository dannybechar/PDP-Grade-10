import processing.core.PApplet;

public class InteractionSketch extends PApplet {
    public void settings() { size(400, 400); }
    public void setup() { surface.setTitle("B3 Interactivity & State"); }
    private int x = 200;
    public void draw() { background(255); ellipse(x, 200, 40, 40); }
    public void keyPressed() { if (key == 'a') x -= 10; if (key == 'd') x += 10; }
    public static void main(String[] args) { PApplet.main(InteractionSketch.class.getName()); }
}
