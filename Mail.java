public abstract class Mail {
    private String deliveryAddress;
    private String returnAddress;
    private double width;
    private double length;
    private int id;
    private static int nextId = 0;

    Mail(){
        deliveryAddress = "";
        returnAddress = "";
        width = 0;
        length = 0;
        id = nextId;
        nextId++;
    }

    Mail(String d, String r, double w, double l){
        deliveryAddress = d;
        returnAddress = r;
        width = w;
        length = l;
        id = nextId;
        nextId++;
    }

    public String getDeliveryAddress(){
        return deliveryAddress;
    }

    public String getReturnAddress(){
        return returnAddress;
    }

    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }

    public int getId(){
        return id;
    }

    @Override
    public String toString(){
        return id + "\n" + deliveryAddress + "\n" + returnAddress + "\n";
    }


}
