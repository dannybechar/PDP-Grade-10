import processing.core.PApplet;

public class InteractionSketch extends PApplet {
    public void settings() { size(400, 400); }
    public void setup() { surface.setTitle("B3 Interactivity & State"); }
    private static final int TITLE = 0, PLAY = 1, END = 2;
    private int scene = TITLE;
    public void draw() { background(255); text(scene == TITLE ? "TITLE" : scene == PLAY ? "PLAY" : "END", 170, 200); }
    public void mousePressed() { if (scene == TITLE) scene = PLAY; else if (scene == PLAY) scene = END; }
    public void keyPressed() { if (key == 'r') scene = TITLE; }
    public static void main(String[] args) { PApplet.main(InteractionSketch.class.getName()); }
}
