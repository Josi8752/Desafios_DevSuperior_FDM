package entities;

public abstract class Lesson {

	private String title;

	
	
	public Lesson() {
		super();
	}

	public Lesson(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public abstract Integer duration();
	
	
	@Override
	public String toString() {
		return title;
	}

	

}