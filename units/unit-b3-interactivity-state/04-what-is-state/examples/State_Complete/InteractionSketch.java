import processing.core.PApplet;

public class InteractionSketch extends PApplet {
    public void settings() { size(400, 400); }
    public void setup() { surface.setTitle("B3 Interactivity & State"); }
    int x = 50;
    int xSpeed = 3;
    public void draw() {
        background(255);
        x = x + xSpeed;
        if (x > 350) { xSpeed = xSpeed * -1; }
        if (x < 50) { xSpeed = xSpeed * -1; }
        ellipse(x, 200, 40, 40);
    }
    public static void main(String[] args) { PApplet.main(InteractionSketch.class.getName()); }
}
