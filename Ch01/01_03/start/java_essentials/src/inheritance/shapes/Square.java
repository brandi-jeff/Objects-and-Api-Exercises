package inheritance.shapes;

import inheritance.shapes.Rectangle;

public class Square extends Rectangle {

  @Override // keep the same signature but change the body of the method... use Overload to indicate
  public double calculatePerimeter(){
    return sides * length;
  }

  // to Override: keep the same method name, but change the signature of the method ie: add a parameter... no indicator needed
  public void print(String what) {
    System.out.println("I am a" + what);

  }
}
