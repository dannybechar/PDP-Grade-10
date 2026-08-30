import processing.core.PApplet;

public class InteractionSketch extends PApplet {
    public void settings() { size(400, 400); }
    public void setup() { surface.setTitle("B3 Interactivity & State"); }
    int circleSize = 140;
    final int left = 20;
    final int top = 20;
    final int buttonWidth = 100;
    final int buttonHeight = 40;
    public void draw() {
        background(255);
        fill(0);
        ellipse(200, 200, circleSize, circleSize);

        boolean inside = false;
        if (mouseX >= left) {
            if (mouseX <= left + buttonWidth) {
                if (mouseY >= top) {
                    if (mouseY <= top + buttonHeight) { inside = true; }
                }
            }
        }
        if (inside) { fill(180); }
        else { fill(220); }
        rect(left, top, buttonWidth, buttonHeight);
    }
    public void mousePressed() {
        if (mouseX >= left) {
            if (mouseX <= left + buttonWidth) {
                if (mouseY >= top) {
                    if (mouseY <= top + buttonHeight) { circleSize = 60; }
                }
            }
        }
    }
    public static void main(String[] args) { PApplet.main(InteractionSketch.class.getName()); }
}
