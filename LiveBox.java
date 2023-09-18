public class LiveBox extends Box{
    private String animal;
    private int age;

    LiveBox(){
        super();
        animal = "";
        age = 0;
    }

    LiveBox(String d, String r, double w, double l, double h, int c, int a, String A){
        super(d, r, w, l, h, c);
        animal = A;
        age = a;
    }

    public String getAnimal() {
        return animal;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return super.toString() + "Animal: " + animal + "\n" + "Count: " + getCount() + "\n" + "Age (Days): " + age + "\n";
    }
}
