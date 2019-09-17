package linkedList;

public class Generics<AnyType> {
	  void functionT (AnyType val)
	{
		System.out.println(val);
		
		
	}
public static void main(String[] args) {
	Generics  gen = new Generics();
	gen.functionT(12);
	gen.functionT("Anshul");
}
}
