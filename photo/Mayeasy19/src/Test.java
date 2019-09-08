
public class Test {
	public static void main(String[] args) throws Exception 
    { 
		try {
	    	throw new Exception("hi");
	    }
	    finally {
	    	System.out.println("g");
	    }
    } 
}
 