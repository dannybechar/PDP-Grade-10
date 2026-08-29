import processing.core.PApplet;

public class CollectionSketch extends PApplet {
    public void settings(){size(400,400);}
    private final int MAX_COUNT=20; private int activeCount=MAX_COUNT; private int[] xs=new int[MAX_COUNT],ys=new int[MAX_COUNT],vy=new int[MAX_COUNT],life=new int[MAX_COUNT];
    public void setup(){for(int i=0;i<activeCount;i++){xs[i]=(int)random(width);ys[i]=(int)random(height);vy[i]=(int)random(1,4);life[i]=(int)random(60,150);}}
    public void draw(){background(255);for(int i=activeCount-1;i>=0;i--){ys[i]+=vy[i];life[i]--;boolean remove=false;if(life[i]<=0)remove=true;if(ys[i]>height)remove=true;if(remove){int last=activeCount-1;xs[i]=xs[last];ys[i]=ys[last];vy[i]=vy[last];life[i]=life[last];activeCount--;}else ellipse(xs[i],ys[i],12,12);}text("Active: "+activeCount,10,20);}
    public static void main(String[] args){PApplet.main(CollectionSketch.class.getName());}
}
