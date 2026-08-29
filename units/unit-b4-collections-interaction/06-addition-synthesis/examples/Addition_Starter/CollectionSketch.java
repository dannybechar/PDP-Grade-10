import processing.core.PApplet;

public class CollectionSketch extends PApplet {
    public void settings(){size(400,400);}
    private final int MAX_COUNT=40; private int activeCount=0; private int[] xs=new int[MAX_COUNT],ys=new int[MAX_COUNT];
    public void draw(){background(255);}
    public static void main(String[] args){PApplet.main(CollectionSketch.class.getName());}
}
