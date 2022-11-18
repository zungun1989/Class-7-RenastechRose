package StudySessions;

import java.util.ArrayList;

public class Week9_2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        //arrList.add();
        //arrList.get();
        //arrList.set();
        //arrList.size();

        arrList.add(1);
        arrList.add(2);
        arrList.add(3);

        System.out.println(arrList);
        System.out.println("----------------");
        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }

        arrList.set(0,0);
        System.out.println("-----------------");
        System.out.println(arrList);

        //Class-Object
        Phone phone1 = new Phone();
        System.out.println(phone1.Make);
        System.out.println(phone1.Model);
        System.out.println("----------------------------");
        phone1.setAttribute("Iphone", "6s");
        System.out.println(phone1.Make);
        System.out.println(phone1.Model);
    }
}

class Phone{
    String Make;
    String Model;
    int batteryCapacity;

    public void setAttribute(String make, String model){
        Make = make;
        Model = model;
        System.out.println("Make: "+Make+" Model: "+model);
    }
}
