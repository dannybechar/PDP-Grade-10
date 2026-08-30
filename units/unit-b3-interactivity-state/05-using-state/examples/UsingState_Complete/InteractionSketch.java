import processing.core.PApplet;

public class InteractionSketch extends PApplet {
    public void settings() { size(400, 400); }
    public void setup() { surface.setTitle("B3 Interactivity & State"); }
    int mode = 0;
    public void draw() {
        background(255);
        if (mode == 0) {
            fill(80);
            ellipse(200, 200, 100, 100);
        }
        else {
            fill(180);
            rect(125, 125, 150, 150);
        }
    }
    public void mousePressed() {
        if (mode == 0) { mode = 1; }
        else { mode = 0; }
    }
    public static void main(String[] args) { PApplet.main(InteractionSketch.class.getName()); }
}
