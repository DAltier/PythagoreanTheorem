import java.lang.Math;

public class PythagoreanTheorem {

  public static double calculateHypotenuse(int legA, int legB) {
    return Math.sqrt(legA*legA + legB*legB);
  }

  public static void main(String[] args) {
    int a = 4;
    int b = 6;
    double c = calculateHypotenuse(a, b);
    System.out.println("The Hypotenuse of a triangle with the sides " + a + " and " + b + " is: " + String.format("%.2f", c));
  }
}