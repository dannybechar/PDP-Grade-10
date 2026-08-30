import processing.core.PApplet;

public class InteractionSketch extends PApplet {
    public void settings() { size(400, 400); }
    public void setup() { surface.setTitle("B3 Interactivity & State"); }
    int shapeSize = 30;
    int fillValue = 200;
    public void draw() { background(255); fill(fillValue); ellipse(mouseX, mouseY, shapeSize, shapeSize); }
    public void mousePressed() {
        if (fillValue == 80) { fillValue = 200; }
        else { fillValue = 80; }
    }
    public void keyPressed() {
        if (key == 'a') { shapeSize = shapeSize + 10; }
    }
    public static void main(String[] args) { PApplet.main(InteractionSketch.class.getName()); }
}
