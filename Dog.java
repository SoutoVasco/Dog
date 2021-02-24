public class Dog {


    String Name;
    boolean Owner;
    int age;

    public Dog(String dogname, boolean hasOwner, int dogYears) {

        Name = dogname;
        Owner = hasOwner;
        age = dogYears;

    }

    public static void main(String[] args) {

        Dog Doggy = new Dog("cuca", true, 3);

        System.out.println("About my Dog: ");
        System.out.println("Her name is: " + Doggy.Name);
        System.out.println("She has 4 owners: " + Doggy.Owner);
        System.out.println("Her age is: " + Doggy.age);

    }

}
    