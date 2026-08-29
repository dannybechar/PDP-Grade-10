import processing.core.PApplet;

public class InteractionSketch extends PApplet {
    public void settings() { size(400, 400); }
    public void setup() { surface.setTitle("B3 Interactivity & State"); }
    private boolean night = false;
    private boolean showMoon = true;
    public void draw() { background(night ? 30 : 235); if (night && showMoon) { fill(245, 240, 180); ellipse(310, 80, 70, 70); } }
    public void mousePressed() { night = !night; }
    public void keyPressed() { if (key == 'm') showMoon = !showMoon; }
    public static void main(String[] args) { PApplet.main(InteractionSketch.class.getName()); }
}
