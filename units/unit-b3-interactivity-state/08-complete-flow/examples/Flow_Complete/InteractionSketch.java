import processing.core.PApplet;

public class InteractionSketch extends PApplet {
    public void settings() { size(400, 400); }
    public void setup() { surface.setTitle("B3 Interactivity & State"); }
    private static final int TITLE = 0, PLAY = 1, END = 2;
    private int scene = TITLE;
    public void draw() { background(255); textAlign(CENTER, CENTER); textSize(28); if (scene == TITLE) text("Click to play", 200, 200); else if (scene == PLAY) text("Press E to end", 200, 200); else if (scene == END) text("Press R to restart", 200, 200); }
    public void mousePressed() { if (scene == TITLE) scene = PLAY; }
    public void keyPressed() { if (scene == PLAY && key == 'e') scene = END; else if (scene == END && key == 'r') scene = TITLE; }
    public static void main(String[] args) { PApplet.main(InteractionSketch.class.getName()); }
}
