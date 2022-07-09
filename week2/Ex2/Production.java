public class Production {
	protected String title;
	protected String director;
	protected String writer;

	public Production() {
		title = "";
		director = "";
		writer = "";
	}

	public Production(String title, String director, String writer) {
		this.title = title;
		this.director = director;
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void display() {
	}

}
