package Day27_ClassesandInheritance;

import CustomClasses.ChickenClass;
import CustomClasses.CowClass;
import CustomClasses.OldMcdonaldAnimals;

import java.util.ArrayList;

public class Topic3_OldMcdonald {
    public static void main(String[] args) {
        CowClass MyCow = new CowClass();
        MyCow.AnimalName = "A Cow";
        MyCow.ID = 1234;
        MyCow.NumberOfLegs = 4;

        CowClass SecondCow = new CowClass();
        SecondCow.AnimalName = "Cow2";
        SecondCow.ID = 1235;
        SecondCow.NumberOfLegs = 4;


        ChickenClass MyChicken = new ChickenClass();
        MyChicken.AnimalName = "Tweety";
        MyChicken.NumberOfLegs = 2;


        MyCow.Milk();
        MyChicken.Fly();

        ArrayList<OldMcdonaldAnimals> MyAnimalList = new ArrayList<>();
        MyAnimalList.add(MyCow);
        MyAnimalList.add(SecondCow);
        MyAnimalList.add(MyChicken);

        for (int i = 0; i < MyAnimalList.size(); i++) {
            OldMcdonaldAnimals AnAnimal = MyAnimalList.get(i);
            AnAnimal.PrintNameAndLeg();
            AnAnimal.Eat();

        }
    }
}
