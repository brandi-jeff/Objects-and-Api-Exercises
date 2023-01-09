package polymorphism;

public class Zoo {

    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();

        Animal sasha = new Dog(); //Polymorphism Superclass type with subclass instance
        sasha.makeSound(); //overridden method is executed at runtime

        sasha = new Cat();
        sasha.makeSound();
    }
}
