package Day31_CollectionsFramework;

import java.util.HashSet;

public class Topic2_CollectionsIntro {
    public static void main(String[] args) {
        HashSet<String> MyMotors = new HashSet<>();
        MyMotors.add("Suzuki");
        MyMotors.add("Kawasaki");
        MyMotors.add("Honda");
        MyMotors.add("Suzuki");//2nd suzuki
        MyMotors.add("Yamaha");
        MyMotors.add("Honda");//2nd honda
        MyMotors.add("Ducati");
        MyMotors.add(null);
        System.out.println(MyMotors);

        HashSet<Integer> MyIntegers = new HashSet<>();
        MyIntegers.add(11);
        MyIntegers.add(5);
        MyIntegers.add(1);

        System.out.println(MyIntegers);

    }
}
