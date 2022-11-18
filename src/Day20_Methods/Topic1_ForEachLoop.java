package Day20_Methods;

public class Topic1_ForEachLoop {

    //write a code where user is given an array of strings that contains given animal's name
    // find which one of those animals has 'o' in the name
    public static void main(String[] args) {

        String[] Animals = {"Cat", "Dog", "Monkey", "Rabbit"};

        for (String animal : Animals) { // animal = "Cat" // first iteration
                                        // animal = "Dog" - second iteration
                                        // animal = "Monkey" - third iteartion
                                        // animal = "Rabbit" - fourth iteration
            System.out.println("the current animal variable value: "+animal);

            if (animal.contains("O") || animal.contains("o")){
                System.out.println("The animal "+animal+" has O or o in the name");
            }
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        }
    }
}
