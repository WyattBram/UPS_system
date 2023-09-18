public class RegularBox extends Box{
    private String items;
    private double weight;

    RegularBox(){
        super();
        weight = 0;
        items = "";
    }

    RegularBox(String d, String r, double w, double l, double h, int c, String i, double W){
        super(d, r, w, l, h, c);
        weight = W;
        items = i;
    }

    public String getItems() {
        return items;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString(){
        return super.toString() + "Items: " + items + "\n" + "Count: " + getCount() + "\n" + "Weight: " + weight + "\n";
    }
}
