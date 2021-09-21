package main;

import core.view.Features;
import modele.humain.Student;

public class playbook {
	public static void main() {
		Student Wilnise= new Student("MEUS","Wilnise","WM99");
		
		Features.display(Wilnise.toString());
	}

}
