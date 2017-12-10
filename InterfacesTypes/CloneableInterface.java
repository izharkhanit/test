package InterfacesTypes;

public class CloneableInterface implements Cloneable
{
	public int i;
	public String s;

	// A class constructor
	public CloneableInterface(int i,String s)
	{
		this.i = i;
		this.s = s;
	}

	// Overriding clone() method
	// by simply calling Object class
	// clone() method.
	@Override
	public Object clone()
	throws CloneNotSupportedException
	{
		return super.clone();
	}
}