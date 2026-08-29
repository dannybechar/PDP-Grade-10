import processing.core.PApplet;

public class CollectionSketch extends PApplet {
    public void settings(){size(400,400);}
    private final int COUNT=20; private int[] xs=new int[COUNT],ys=new int[COUNT],vx=new int[COUNT],vy=new int[COUNT];
    public void setup(){for(int i=0;i<COUNT;i++){xs[i]=(int)random(20,380);ys[i]=(int)random(400);vx[i]=(int)random(1,4);vy[i]=(int)random(1,4);}}
    public void draw(){background(255);for(int i=0;i<COUNT;i++){xs[i]+=vx[i];ys[i]+=vy[i];ellipse(xs[i],ys[i],12,12);}}
    public static void main(String[] args){PApplet.main(CollectionSketch.class.getName());}
}
