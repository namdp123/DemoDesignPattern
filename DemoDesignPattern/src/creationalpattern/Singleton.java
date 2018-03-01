package creationalpattern;

public class Singleton {
	private static Singleton instance;
	private Singleton(){}
	static {
		try
		{
			instance = new Singleton();
		}catch(Exception e)
		{
			throw new RuntimeException("Error Error Error");
		}
	}
	public void Demo()
	{
		System.out.println("Dang Phuong Nam");
	}
	public static Singleton getInstance() {
		return instance;
	}
	public void XuatChuoi(String s) {
		System.out.println("Chuoi vua nhap "+s);
	}
}


