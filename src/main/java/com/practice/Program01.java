package com.practice;

interface i1{
	public void m1();
}

/*class Program implements i1{

	@Override
	public int m1() {
		return 100;
	}
	public static class program01{
		
		public static void main(String[] args) {
			
			Program ref = new Program();
			System.out.println(ref.m1());
		}
}
}*/
  // * BY USING THE ANONYMOUS CLASS
/*public class Program01 {
 
	 public static void main(String[] args) {
		
		  i1 ref = new i1() {
			  @Override
			  public int m1() {
				  return 100;
			  }
		  };
		  
		  i1 ref2 = new i1() {

			@Override
			public int m1() {
			
				return 200;
			}
			  
		  };
		  System.out.println(ref.m1());
		  System.out.println(ref2.m1());
	}
}*/ 
// bY USING  THE LAMBDA EXPRESSION
public class Program01{
	public static void main(String[] args) {
		/*i1 ref =()->{
			return 100;
		};
		System.out.println(ref.m1());*/
		// LAMBDA WITHOUT RETURN TYPE
		i1 ref =()->{
			System.out.println(100);
		};
		ref.m1();
		
		}
	}



