import processing.core.PApplet;

public class CollectionSketch extends PApplet {
    public void settings(){size(400,400);}
    private final int MAX_COUNT=20; private int activeCount=MAX_COUNT; private int[] life=new int[MAX_COUNT];
    public void setup(){for(int i=0;i<activeCount;i++)life[i]=(int)random(60,150);}
    public void draw(){background(255);}
    public static void main(String[] args){PApplet.main(CollectionSketch.class.getName());}
}
