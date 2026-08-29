import processing.core.PApplet;

public class InteractionSketch extends PApplet {
    public void settings() { size(400, 400); }
    public void setup() { surface.setTitle("B3 Interactivity & State"); }
    private int scene = 0;
    public void draw() { background(255); text("Scene " + scene, 170, 200); }
    public static void main(String[] args) { PApplet.main(InteractionSketch.class.getName()); }
}
