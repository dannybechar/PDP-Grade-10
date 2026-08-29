import processing.core.PApplet;

public class CollectionSketch extends PApplet {
    public void settings(){size(400,400);}
    private int[] sizes = new int[20];
    public void setup(){ for(int i=0;i<sizes.length;i++) sizes[i]=(int)random(10,40); }
    public void draw(){ background(255); for(int i=0;i<sizes.length;i++) ellipse(i*19+20,200,sizes[i],sizes[i]); }
    public static void main(String[] args){PApplet.main(CollectionSketch.class.getName());}
}
