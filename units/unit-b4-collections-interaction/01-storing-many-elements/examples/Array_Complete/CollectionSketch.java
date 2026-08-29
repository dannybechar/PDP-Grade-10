import processing.core.PApplet;

public class CollectionSketch extends PApplet {
    public void settings(){size(400,400);}
    private int[] shades = new int[16];
    public void setup(){ for(int i=0;i<shades.length;i++) shades[i]=(int)random(30,230); }
    public void draw(){ background(255); for(int i=0;i<shades.length;i++){ fill(shades[i]); ellipse(i*24+20,200,20,20); } }
    public static void main(String[] args){PApplet.main(CollectionSketch.class.getName());}
}
