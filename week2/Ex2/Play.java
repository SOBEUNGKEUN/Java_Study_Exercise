public class Play extends Production{
	protected int performances;
	
	public Play() {
		super(); // Production 기본 생성자 호출
		performances= 0;
	}
	
	public Play( String t, String d, String w, int p)
	{
		super(t, d, w); // Production의 생성자 호출
		performances = p;
	}
	
	public int getPerformances() {
		return performances;
	}
	
	public void setPerformances(int p)
	{
		performances = p;
	}
	
	public void display() {
		System.out.println("Title:        "+title);
		System.out.println("Director:     "+director);
		System.out.println("playwright:   "+writer);
		System.out.println("Performances: "+performances);
	}
}
