import processing.core.PApplet;

public class InteractionSketch extends PApplet {
    public void settings() { size(400, 400); }
    public void setup() { surface.setTitle("B3 Interactivity & State"); }
    private static final int TITLE = 0, PLAY = 1, END = 2;
    private int scene = TITLE;
    public void draw() { background(255); if (scene == TITLE) text("Click to play", 150, 200); else if (scene == PLAY) text("Press E to end", 145, 200); else text("Press R to restart", 130, 200); }
    public void mousePressed() { if (scene == TITLE) scene = PLAY; }
    public static void main(String[] args) { PApplet.main(InteractionSketch.class.getName()); }
}
