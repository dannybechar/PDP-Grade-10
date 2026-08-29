import processing.core.PApplet;

public class CollectionSketch extends PApplet {
    public void settings(){size(400,400);}
    private final int MAX_COUNT=40; private int activeCount=0; private int[] xs=new int[MAX_COUNT],ys=new int[MAX_COUNT],vy=new int[MAX_COUNT],life=new int[MAX_COUNT];
    public void draw(){background(255);for(int i=0;i<activeCount;i++)ellipse(xs[i],ys[i],12,12);}
    public void mousePressed(){if(activeCount<MAX_COUNT){xs[activeCount]=mouseX;ys[activeCount]=mouseY;vy[activeCount]=(int)random(1,4);life[activeCount]=(int)random(60,150);activeCount++;}}
    public static void main(String[] args){PApplet.main(CollectionSketch.class.getName());}
}
