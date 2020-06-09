package SaveCostumer;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        String firstname = "";
        String lastname = "";
        int customernum = 0;
        ListModel lm = new ListModel();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Costumer´s firstname: ");
        firstname = scanner.next();
        if (firstname !=null){
            System.out.println("Costumer´s lastname:");
            lastname = scanner.next();
            if (lastname !=null){
                System.out.println("Costumer´s price:");
                customernum = scanner.nextInt();
            }
        }


        Entity e = new Entity();
        e.firstname = firstname;
        e.lastname = lastname;
        e.customernum = customernum;


        lm.addElement(e);
        lm.save();

    }


}
