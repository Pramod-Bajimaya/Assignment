package ClassAssignment;

import java.awt.Component;
import javax.swing.JOptionPane;

public class Question21aa {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Enter the days in a week: ");
		int n = Integer.parseInt(s);
		switch (n) {
			case 1 :
				JOptionPane.showInternalMessageDialog((Component) null, "Sunday");
				break;
			case 2 :
				JOptionPane.showInternalMessageDialog((Component) null, "Monday");
				break;
			case 3 :
				JOptionPane.showInternalMessageDialog((Component) null, "Tueday");
				break;
			case 4 :
				JOptionPane.showInternalMessageDialog((Component) null, "Wednsday");
				break;
			case 5 :
				JOptionPane.showInternalMessageDialog((Component) null, "Thusday");
				break;
			case 6 :
				JOptionPane.showInternalMessageDialog((Component) null, "Friday");
				break;
			case 7 :
				JOptionPane.showInternalMessageDialog((Component) null, "Saturday");
				break;
			default :
				JOptionPane.showInternalMessageDialog((Component) null, "wrong day chice: ");
		}

	}
}