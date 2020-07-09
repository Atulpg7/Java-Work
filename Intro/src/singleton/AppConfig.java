package singleton;

public class AppConfig {
	
	private AppConfig()
	{
		
	}
	
	private static AppConfig obj=null;
	
	public static AppConfig getInstance()
	{

		return obj=new AppConfig();
		
	}
}
