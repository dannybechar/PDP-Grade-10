import processing.core.PApplet;

public class CollectionSketch extends PApplet {
    public void settings(){size(400,400);}
    private final int COUNT=20; private int[] xs=new int[COUNT],sizes=new int[COUNT];
    public void setup(){ for(int i=0;i<COUNT;i++){xs[i]=(int)random(20,380);sizes[i]=(int)random(10,40);} }
    public void draw(){ background(255); int large=0,left=0; for(int i=0;i<COUNT;i++){ellipse(xs[i],200,sizes[i],sizes[i]);if(sizes[i]>25)large++;if(xs[i]<width/2)left++;} text("Large: "+large+"  Left: "+left,10,20); }
    public static void main(String[] args){PApplet.main(CollectionSketch.class.getName());}
}
