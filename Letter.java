public class Letter extends Envelope{
    private String letterBody;

    Letter(){
        super();
        letterBody = "";

    }

    Letter(String d, String r, double w, double l, double t, String L){
        super(d,r,w,l,t);
        letterBody = L;
    }
}
