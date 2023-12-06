package model;

import java.util.ArrayList;
import java.util.List;

public class Project {
	private String Name;
	private List<Task> Tasks;
	
	public Project(String name) {
		this.setName(name);
		this.setTasks(new ArrayList<>());
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<Task> getTasks() {
		return Tasks;
	}

	public void setTasks(List<Task> tasks) {
		Tasks = tasks;
	}
	public void addTaks(Task task) {
		Tasks.add(task);
		System.out.println("Tarfea adicionada com sucesso");
	}
	public void concludeTask(String description) {
		for(Task task:Tasks) {
			if(task.getDescription().equalsIgnoreCase(description)) {
				task.isFinished();
				System.out.println(task+" foi concluida");
				return;
			}
		}
		System.out.println("Tarefa não encontrada");
	}
	
}
