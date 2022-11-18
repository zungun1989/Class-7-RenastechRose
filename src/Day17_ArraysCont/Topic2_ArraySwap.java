package Day17_ArraysCont;

public class Topic2_ArraySwap {
    public static void main(String[] args) {

        String [] names = {"Zeliha", "Fahrettin", "Eloise"};

        // swap the "Eloise" with "Fahrettin" and later swap "Zeliha" with "Fahrettin"

        //names [2] = names [1]; // now names as follows {"Zeliha", "Fahrettin", "Fahrettin"}

        String dummy = names[2]; // dummy holds Eloise

        names[2] = names[1]; ///{"Zeliha", "Fahrettin", "Fahrettin"}
        names[1] =dummy; // {"Zeliha", "Eloise", "Fahrettin"}

        dummy = names[0]; // now dummy holds Zeliha
        names[0] = names[2]; // {"Fahrettin, "Eloise", "Fahrettin"}
        names [2] = dummy; //{"Fahrettin", "Eloise", "Ziya"}

        System.out.println("{"+names[0]+", "+names[1]+", "+names[2]+"}");


    }
}
