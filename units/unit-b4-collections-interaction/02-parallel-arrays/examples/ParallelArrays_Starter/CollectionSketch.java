import processing.core.PApplet;

public class CollectionSketch extends PApplet {
    public void settings(){size(400,400);}
    private final int COUNT=12;
    private int[] xs=new int[COUNT], ys=new int[COUNT];
    public void draw(){ background(255); }
    public static void main(String[] args){PApplet.main(CollectionSketch.class.getName());}
}
