package model;


public class Task {
	private String Description;
	private String Responsible;
	private boolean Finished;
	
	public Task(String description,String reponsible) 
	{
		this.setDescription(description);
		this.setResponsible(reponsible);
		Finished=false;
	}
	public void isFinished() {
		this.Finished=true;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getResponsible() {
		return Responsible;
	}

	public void setResponsible(String responsible) {
		Responsible = responsible;
	}

	public void setFinished(boolean finished) {
		Finished = finished;
	}
	@Override
    public String toString() {
        return "Tarefa: " + Description + " | Responsável: " + Responsible + " | Concluída: " + Finished;
    }
}


