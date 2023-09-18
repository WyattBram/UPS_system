public abstract class Envelope extends Mail {
    private  double thickness;

    Envelope(){
        super();
        thickness = 0;
    }

    Envelope(String d, String r, double w, double l, double t){
        super(d,r,w,l);
        thickness = t;
    }

    public double getThickness() {
        return thickness;
    }

    @Override
    public String toString(){
        return super.toString() + getWidth() + " x " + getLength() + " x " + getThickness();


    }
}
