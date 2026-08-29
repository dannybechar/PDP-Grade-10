import processing.core.PApplet;

public class InteractionSketch extends PApplet {
    public void settings() { size(400, 400); }
    public void setup() { surface.setTitle("B3 Interactivity & State"); }
    private int clicks = 0;
    private final int left = 120, top = 160, buttonWidth = 160, buttonHeight = 70;
    public void draw() { background(255); boolean inside = mouseX >= left && mouseX <= left + buttonWidth && mouseY >= top && mouseY <= top + buttonHeight; fill(inside ? 180 : 220); rect(left, top, buttonWidth, buttonHeight); fill(0); text("Clicks: " + clicks, 170, 200); }
    public void mousePressed() { if (mouseX >= left && mouseX <= left + buttonWidth && mouseY >= top && mouseY <= top + buttonHeight) clicks++; }
    public static void main(String[] args) { PApplet.main(InteractionSketch.class.getName()); }
}
