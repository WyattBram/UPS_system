public class Flat extends Envelope{
    private String contents;

    Flat(){
        super();
        contents = "";
    }

    Flat(String d, String r, double w, double l, double t, String c){
        super(d, r, w, l, t);
        contents = c;
    }

    public String getContents() {
        return contents;
    }
}
