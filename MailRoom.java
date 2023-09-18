import java.util.ArrayList;
import java.util.Scanner;
public class MailRoom {


    //Still have to add the shit to the list
    public static boolean handleLetters(Letter letter, ArrayList<Mail> deliver){
        if(letter.getDeliveryAddress() != "" &&
                letter.getReturnAddress() != "" &&
                5 <= letter.getLength() &&
                11.5 >= letter.getLength() &&
                3.5 <= letter.getWidth() &&
                6.125 >= letter.getWidth() &&
                0.007 <= letter.getThickness() &&
                0.25 >= letter.getThickness()){
            deliver.add(letter);
            return true;
        }
        else{return false;}
    }

    public static boolean handleFlat(Flat flat, ArrayList<Mail> deliver){
        if(flat.getDeliveryAddress() != "" &&
                flat.getContents().equals("DOCUMENTS") &&
                flat.getReturnAddress() != "" &&
                11.5 <= flat.getLength() &&
                15 >= flat.getLength() &&
                6.125 <= flat.getWidth() &&
                12 >= flat.getWidth() &&
                0.25 <= flat.getThickness() &&
                0.75 >= flat.getThickness())
        {
            deliver.add(flat);
            return true;

        }
        else{return false;}
    }

    public static boolean handleRegularBox(RegularBox regularBox, ArrayList<Mail> deliver){
        if(regularBox.getDeliveryAddress() != "" &&
                regularBox.getReturnAddress() != "" &&
                6 <= regularBox.getLength() &&
                27 >= regularBox.getLength() &&
                .25 <= regularBox.getWidth() &&
                17 >= regularBox.getWidth() &&
                3 <= regularBox.getHeight() &&
                17 >= regularBox.getHeight() &&
                0 <= regularBox.getWeight() &&
                70 >= regularBox.getWeight() &&
                0 <= regularBox.getCount() &&
                50 >= regularBox.getCount())
        {
            deliver.add(regularBox);
            return true;
        }
        else{return false;}
    }

    public static boolean handleLiveBox(LiveBox liveBox, ArrayList<Mail> deliver){
        if(liveBox.getDeliveryAddress() != "" &&
                liveBox.getReturnAddress() != "" &&
                6 <= liveBox.getLength() &&
                27 >= liveBox.getLength() &&
                .25 <= liveBox.getWidth() &&
                17 >= liveBox.getWidth() &&
                3 <= liveBox.getHeight() &&
                17 >= liveBox.getHeight() &&
                liveBox.getAnimal().equals("HONEYBEES") || liveBox.getAnimal().equals("CHICKEN"))
        {
            if(liveBox.getAnimal().equals("HONEYBEES") &&
                    liveBox.getCount() >= 0 &&
                    liveBox.getCount() <= 20)
            {
                deliver.add(liveBox);
               return true;
            }
            else if(liveBox.getAnimal().equals("CHICKEN") &&
                    liveBox.getCount() >= 0 &&
                    liveBox.getCount() <= 10 &&
                    liveBox.getAge() <= 1)
            {
                deliver.add(liveBox);
                return true;
            }
            else return false;
        }
        else{return false;}
    }


    public static void main(String[] args) {
        ArrayList<Mail> deliver = new ArrayList<Mail>();
        int choice;
        System.out.println("Welcome to KSUPS\n");

        do{

            System.out.println(
                    "1- Send letter\n" +
                            "2- Send flat\n"+
                            "3- Send regular box\n"+
                            "4- Send live box\n"+
                            "5- Dispatch items\n"+
                            "6- Quit");

            Scanner x = new Scanner (System.in);
            choice = x.nextInt();
            x.nextLine();


            if (choice == 1){
                System.out.println("Enter the delivery address: ");
                String d = x.nextLine();
                System.out.println("Enter the return address: ");
                String r = x.nextLine();
                System.out.println("Enter the width of your mail: ");
                double w = x.nextDouble();
                System.out.println("Enter the length of your mail: ");
                double l = x.nextDouble();
                System.out.println("Enter the thickness of your mail: ");
                double t = x.nextDouble();
                System.out.println("Enter the contents of your letter: ");
                x.nextLine();
                String c = x.nextLine();
                Letter letter = new Letter(d,r,w,l,t,c);

                if(handleLetters(letter, deliver)){
                    System.out.println("Letter accepted for delivery");
                }
                else {
                    System.out.println("Letter cannot be mailed");
                }




            }


            else if (choice == 2){
                System.out.println("Enter the delivery address: ");
                String d = x.nextLine();
                System.out.println("Enter the return address: ");
                String r = x.nextLine();
                System.out.println("Enter the width of your mail: ");
                double w = x.nextDouble();
                System.out.println("Enter the length of your mail: ");
                double l = x.nextDouble();
                System.out.println("Enter the thickness of your mail: ");
                double t = x.nextDouble();
                System.out.println("Enter the contents of your letter: ");
                x.nextLine();
                String c = x.nextLine();
                Flat flat = new Flat(d,r,w,l,t,c);

                if(handleFlat(flat, deliver)){
                    System.out.println("Flat accepted for delivery");
                }
                else {
                    System.out.println("Flat cannot be mailed");
                }

            }



            else if (choice == 3){
                System.out.println("Enter the delivery address: ");
                String d = x.nextLine();
                System.out.println("Enter the return address: ");
                String r = x.nextLine();
                System.out.println("Enter the width of your mail: ");
                double w = x.nextDouble();
                System.out.println("Enter the length of your mail: ");
                double l = x.nextDouble();
                System.out.println("Enter the height of your mail: ");
                double h = x.nextDouble();
                System.out.println("Enter how many items your box has: "); //int??
                int i = x.nextInt();
                System.out.println("Enter the weight of your box: ");
                double W = x.nextDouble();
                System.out.println("Enter the contents of your letter: ");
                x.nextLine();
                String c = x.nextLine();
                RegularBox regularBox = new RegularBox(d,r,w,l,h,i,c,W);

                if(handleRegularBox(regularBox, deliver)){
                    System.out.println("RegularBox accepted for delivery");
                }
                else {
                    System.out.println("RegularBox cannot be mailed");
                }


            }



            else if (choice == 4){
                System.out.println("Enter the delivery address: ");
                String d = x.nextLine();
                System.out.println("Enter the return address: ");
                String r = x.nextLine();
                System.out.println("Enter the width of your mail: ");
                double w = x.nextDouble();
                System.out.println("Enter the length of your mail: ");
                double l = x.nextDouble();
                System.out.println("Enter the height of your mail: ");
                double h = x.nextDouble();
                System.out.println("Enter how many items your box has: ");
                int i = x.nextInt();
                System.out.println("Enter what animal is being shipped: ");
                x.nextLine();
                String a = x.nextLine();
                System.out.println("Enter age of the oldest animal, in days: ");
                int A = x.nextInt();
                LiveBox liveBox = new LiveBox(d,r,w,l,h,i,A,a);

                if(handleLiveBox(liveBox, deliver)){
                    System.out.println("LiveBox accepted for delivery");
                }
                else {
                    System.out.println("LiveBox cannot be mailed");
                }


            }

            else if (choice == 5){
                System.out.println("DISPATCHING THE FOLLOWING ITEMS FOR DELIVERY:\n" + "==========");
                for(int i = 0; i < deliver.size(); i++){
                    System.out.println(deliver.get(i));
                    System.out.println("==========");
                }
                deliver.clear();



            }



        }while (choice != 6);

    }
}

































