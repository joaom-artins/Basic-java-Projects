package application;

import model.Project;
import model.Task;

public class Main {
	public static void main(String[] args) {
		Task task1=new Task("Finalizar a modelagem do banco de dados","João");
		Task task2=new Task("Finalizar os diagramas de classe","Cesar");
		Project project=new Project("PIM");
		project.addTaks(task1);
		project.addTaks(task2);
		project.concludeTask("Finalizar os diagramas de classe");
	}
}
