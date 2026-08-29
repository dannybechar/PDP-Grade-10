import processing.core.PApplet;

public class InteractionSketch extends PApplet {
    public void settings() { size(400, 400); }
    public void setup() { surface.setTitle("B3 Interactivity & State"); }
    private int x = 200;
    private int y = 200;
    public void draw() { background(255); ellipse(x, y, 40, 40); }
    public void keyPressed() {
        if (key == CODED) {
            if (keyCode == LEFT) x -= 10; else if (keyCode == RIGHT) x += 10;
            else if (keyCode == UP) y -= 10; else if (keyCode == DOWN) y += 10;
        } else if (key == 'r') { x = 200; y = 200; }
    }
    public static void main(String[] args) { PApplet.main(InteractionSketch.class.getName()); }
}
