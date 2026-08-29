import processing.core.PApplet;

public class InteractionSketch extends PApplet {
    public void settings() { size(400, 400); }
    public void setup() { surface.setTitle("B3 Interactivity & State"); }
    private static final int TITLE = 0;
    private static final int PLAY = 1;
    private int scene = TITLE;
    public void draw() { background(255); if (scene == TITLE) text("TITLE", 170, 200); else if (scene == PLAY) text("PLAY", 175, 200); }
    public static void main(String[] args) { PApplet.main(InteractionSketch.class.getName()); }
}
