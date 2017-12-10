import InterfacesTypes.CloneableInterface;
public class myTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Angular + Java + API + Database =");
		System.out.println("full stack developer");
		System.out.println("asas sasas");
		System.out.println("asasas");

		Shape s1 = new Circle("Red", 2.2);
		Shape s2 = new Rectangle("Yellow", 2, 4);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		myTestClass t = new myTestClass();
        t.display();
 
        //cloneable Interface example
        CloneableInterface a = new CloneableInterface(27, "I am comming from Cloneable interface");

    		// cloning 'a' and holding
    		// new cloned object reference in b

    		// down-casting as clone() return type is Object
        CloneableInterface b = (CloneableInterface)a.clone();

    		System.out.println(b.i);
    		System.out.println(b.s);
    	
        
	}
	
}
