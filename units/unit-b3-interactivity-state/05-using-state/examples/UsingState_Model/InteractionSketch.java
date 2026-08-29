import processing.core.PApplet;

public class InteractionSketch extends PApplet {
    public void settings() { size(400, 400); }
    public void setup() { surface.setTitle("B3 Interactivity & State"); }
    private boolean night = false;
    public void draw() { background(night ? 30 : 235); }
    public void mousePressed() { night = !night; }
    public static void main(String[] args) { PApplet.main(InteractionSketch.class.getName()); }
}
