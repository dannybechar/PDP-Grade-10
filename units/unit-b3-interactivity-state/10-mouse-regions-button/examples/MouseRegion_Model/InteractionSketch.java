import processing.core.PApplet;

public class InteractionSketch extends PApplet {
    public void settings() { size(400, 400); }
    public void setup() { surface.setTitle("B3 Interactivity & State"); }
    int circleSize = 60;
    public void draw() { background(255); circleSize = mouseX; ellipse(200, 200, circleSize, circleSize); }
    public static void main(String[] args) { PApplet.main(InteractionSketch.class.getName()); }
}
