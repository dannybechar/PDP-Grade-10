import processing.core.PApplet;

public class InteractionSketch extends PApplet {
    public void settings() { size(400, 400); }
    public void setup() { surface.setTitle("B3 Interactivity & State"); }
    int circleSize = 60;
    int shade = 120;
    public void draw() { background(255); fill(shade); ellipse(200, 200, circleSize, circleSize); }
    public void keyPressed() {
        if (key == '+') {
            if (circleSize < 300) { circleSize = circleSize + 10; }
        }
        if (key == '-') {
            if (circleSize > 20) { circleSize = circleSize - 10; }
        }
        if (key == 'l') {
            if (shade < 255) { shade = shade + 5; }
        }
        if (key == 'd') {
            if (shade > 0) { shade = shade - 5; }
        }
    }
    public static void main(String[] args) { PApplet.main(InteractionSketch.class.getName()); }
}
