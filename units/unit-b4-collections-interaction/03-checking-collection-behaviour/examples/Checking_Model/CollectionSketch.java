import processing.core.PApplet;

public class CollectionSketch extends PApplet {
    public void settings(){size(400,400);}
    private int[] sizes={18,31,27,12,29};
    public void draw(){ background(255); int largeCount=0; for(int i=0;i<sizes.length;i++){ ellipse(i*70+50,200,sizes[i],sizes[i]); if(sizes[i]>25) largeCount++; } text("Large: "+largeCount,10,20); }
    public static void main(String[] args){PApplet.main(CollectionSketch.class.getName());}
}
