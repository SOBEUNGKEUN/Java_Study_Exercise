public class Film extends Production{
	protected int boxOfficeGross;
	public Film() {
		super();
		boxOfficeGross = 0;
	}
	
	public Film(String t, String d, String w, int g)
	{
		super(t, d, w); // Production의 생성자 호출
		boxOfficeGross = g;
	}
	
	public int getBoxOfficeGross()
	{
		return boxOfficeGross;
	}
	
	public void setBoxOfficeGross(int g)
	{
		boxOfficeGross = g;
	}
	
	public void display()
	{
		System.out.println("Title:        "+title);
		System.out.println("Director:     "+director);
		System.out.println("ScreenWriter: "+writer);
		System.out.println("Total gross:  $"+boxOfficeGross+"million");
	}
}
