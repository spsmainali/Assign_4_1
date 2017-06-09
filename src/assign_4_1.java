// the output for the following code is
//C. Prints : Parent's method2()
//	            Parent's method1()


	class Parent{ //Parent class is declared and defined 
		private void method1(){ //first function inside parent class is declared and defined 
			System.out.println ("Parent's method1()");
			}
		public void method2() {//second function inside parent class is declared and defined 
			System.out.println ("Parent's method2()");
			method1();//a method from same class Parent class is called here so we don't need any object.
			}
	}
	class assign_4_1 extends Parent {
		public void method1() {//parent class method1 is overridden here and changed to to print "Child's mehod1()""
			System.out.println ("Child's method1()");
		} 
		public static void main(String args[]) {
			Parent p = new assign_4_1();// created the object of parent type and assign Child class object 
			p.method2(); // here method2 from parent class is called and that method calls method1 of parent class which could no get overridden so this result is displayed
		 }
	}


