package grid.model;

public class ChickenNoodleSoup
{
	private int chickenBrothLevel;
	
	public ChickenNoodleSoup()
	{
		chickenBrothLevel = -99;
	}
	
	public void setChickenBrothLevel(int level)
	{
		this.chickenBrothLevel = level;
	}
	
	public String toString()
	{
		return "The chicken broth level  is: " + chickenBrothLevel;
	}
}
