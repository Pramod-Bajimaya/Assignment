package ClassAssignment;

import java.awt.Component;
import javax.swing.JOptionPane;

public class Que_5 {
	public static void main(String[] args) {
		double PI = 3.141592653589793D;
		String r = JOptionPane.showInputDialog("Enter radius: ");
		double radius = Double.parseDouble(r);
		double areaOfCircle = 3.141592653589793D * radius * radius;
		System.out.println("Area of circle is: " + areaOfCircle);
		JOptionPane.showMessageDialog((Component) null, "Area of circle is: " + areaOfCircle);
		System.out.println(Math.random() * 100.0D);
	}
}