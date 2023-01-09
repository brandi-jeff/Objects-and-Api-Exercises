package abstraction.shapes;

public abstract class Shape { //templates implemented by subclasses... subclasses must either implement superclass abstract methods, or declare itself as abstract

    abstract  double calculateArea();

    public void print(){
        System.out.println("I am a shape");
    }
}
