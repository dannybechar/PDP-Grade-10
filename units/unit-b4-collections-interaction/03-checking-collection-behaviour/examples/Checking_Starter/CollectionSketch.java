import processing.core.PApplet;

public class CollectionSketch extends PApplet {
    public void settings(){size(400,400);}
    private int[] sizes={18,31,27,12,29};
    public void draw(){ background(255); }
    public static void main(String[] args){PApplet.main(CollectionSketch.class.getName());}
}
