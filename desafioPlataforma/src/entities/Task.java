package entities;
public class Task extends Lesson {

	private String description;
	private Integer questionCount;
   
	public Task() {
		super();
	}

	public Task(String title, String description, Integer questionCount) {
		super(title);
		this.description = description;
		this.questionCount = questionCount;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuestionCount() {
		return questionCount;
	}

	@Override
	public Integer duration() {
		
		return questionCount * 5 * 60;
		}
	
	
	@Override
	public String toString() {
		return description + questionCount;
	}

}
