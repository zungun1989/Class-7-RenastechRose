package Day22_MethodOverloadandWrapperClass;

public class RecapMethodOverload {
    public static void main(String[] args) {
        makeOrder("Double Double Burger");
        line();
        makeOrder("Cheese Burger");
        line();
        makeOrder("Double Double Burger", "Strawberry Shake");
        line();
        makeOrder("Cheese Burger", "Vanilla Shake", "French Fries");
        line();
        makeOrder("Cheese Burger", "Vanilla Shake", "French Fries", 2);
    }



    // in -n-out
    //makeOrder

    private static void makeOrder(String burger){
        System.out.println(burger+" is ready to enjoy");
    }
    private static void makeOrder (String burger, String shakes){
        System.out.println(burger+" and "+ shakes+" are ready to enjoy");
    }
    private static void makeOrder(String burger, String shakes, String fries) {
        System.out.println(burger+" and "+ shakes+" and "+fries+" are ready to enjoy");
    }
    private static void makeOrder(String burger, String shakes, String fries, int numberOfOrder) {
        for (int i = 1; i<=numberOfOrder; i++){
            System.out.println("Order number: "+i+" " +burger+" and "+ shakes+" and "+fries+" are ready to enjoy");
            line();
        }
    }
    public static void line(){

        System.out.println("----------------------------------------------------------");
    }
}
