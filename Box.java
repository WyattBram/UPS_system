public abstract class Box extends Mail{
    private double height;
    private int count;

    Box(){
        super();
        height = 0;
        count = 0;
    }

    Box(String d, String r, double w, double l, double h, int c){
        super(d, r, w, l);
        height = h;
        count = c;
    }

    public double getHeight() {
        return height;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString(){
        return super.toString() + getWidth() + " x " + getLength() + " x " + getHeight() + "\n";
    }
}
