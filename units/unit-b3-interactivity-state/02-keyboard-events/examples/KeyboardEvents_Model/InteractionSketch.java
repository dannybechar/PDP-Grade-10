import processing.core.PApplet;

public class InteractionSketch extends PApplet {
    public void settings() { size(400, 400); }
    public void setup() { surface.setTitle("B3 Interactivity & State"); }
    public void draw() { background(255); ellipse(200, 200, 60, 60); }
    public void keyPressed() {
        if (key == 'a') { fill(80); }
        else { fill(200); }
    }
    public static void main(String[] args) { PApplet.main(InteractionSketch.class.getName()); }
}
