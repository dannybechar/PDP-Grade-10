import processing.core.PApplet;

public class CollectionSketch extends PApplet {
    public void settings(){size(400,400);}
    private final int COUNT=20;
    private int[] xs=new int[COUNT],ys=new int[COUNT],sizes=new int[COUNT],shades=new int[COUNT];
    public void setup(){ for(int i=0;i<COUNT;i++){ xs[i]=(int)random(20,380);ys[i]=(int)random(20,380);sizes[i]=(int)random(10,40);shades[i]=(int)random(30,230); } }
    public void draw(){ background(255); for(int i=0;i<COUNT;i++) drawParticle(xs[i],ys[i],sizes[i],shades[i]); }
    private void drawParticle(int x,int y,int s,int shade){ fill(shade); ellipse(x,y,s,s); }
    public static void main(String[] args){PApplet.main(CollectionSketch.class.getName());}
}
