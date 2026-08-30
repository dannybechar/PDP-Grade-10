import processing.core.PApplet;

public class InteractionSketch extends PApplet {
    public void settings() { size(400, 400); }
    public void setup() { surface.setTitle("B3 Interactivity & State"); }
    int mode = 0;
    public void draw() {
        background(255);
        if (mode == 0) { ellipse(200, 200, 50, 50); }
        else { rect(175, 175, 50, 50); }
    }
    public void mousePressed() {
        if (mode == 0) { mode = 1; }
        else { mode = 0; }
    }
    public static void main(String[] args) { PApplet.main(InteractionSketch.class.getName()); }
}
