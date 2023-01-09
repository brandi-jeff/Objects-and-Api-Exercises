package polymorphism;

public class Zoo {

    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();

        Animal sasha = new Dog(); //Object typecasting... sasha is of Type Animal so only has access to methods in Animal, even though instantiated as a Dog
        sasha.makeSound();

        sasha = new Cat(); // new instance of Cat, but still of type Animal
        sasha.makeSound(); // only has access to Animal methods
        ((Cat)sasha).scratch(); //Can cast the Cat type temporarily to sasha so now has access to Cat methods.. Only works on classes with IS-A relationship
    }
}
