package inheritance.shapes;

public class Square extends Rectangle {
    // inherits public and protected methods and fields as well as final methods (cant be overridden), but not private methods and fields, or constructors

    @Override
    public double calculatePerimeter(){
        return sides * length;
    }

    public void print(String what){
        System.out.println("I am a " + what);
    }
}
