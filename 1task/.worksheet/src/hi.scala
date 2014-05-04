object hi {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(27); 
var myVar1 = 10;System.out.println("""myVar1  : Int = """ + $show(myVar1 ));$skip(16); 
var myvar2 = 20;System.out.println("""myvar2  : Int = """ + $show(myvar2 ));$skip(28); 
val myVal = "Hello, Scala!";System.out.println("""myVal  : String = """ + $show(myVal ));$skip(44); 
  println("Welcome to the Scala worksheet");$skip(21); val res$0 = 



(x: Int) => x + 1;System.out.println("""res0: Int => Int = """ + $show(res$0));$skip(73); 
//res2: (Int) => Int = <function1>
	 	// add
	 var res0 = myVar1 +myvar2;System.out.println("""res0  : Int = """ + $show(res0 ));$skip(17); 
	 	println(res0);$skip(39); 

	val Adder = (x: Int,y: Int) => x + y;System.out.println("""Adder  : (Int, Int) => Int = """ + $show(Adder ));$skip(12); val res$1 = 
	Adder(2,4);System.out.println("""res1: Int = """ + $show(res$1));$skip(145); 
	
	def Adder1(i1: Int)(i2: Int): Int = {
  	if((i1 + i2)>= -100){
	  		if((i1 + i2)<= 100){
	  			i1 + i2
	  		}else
	  			0
  	}else
  			0
	};System.out.println("""Adder1: (i1: Int)(i2: Int)Int""");$skip(17); val res$2 = 
		Adder1(100)(5);System.out.println("""res2: Int = """ + $show(res$2));$skip(18); val res$3 = 
		
		Adder1(4)(5);System.out.println("""res3: Int = """ + $show(res$3));$skip(18); val res$4 = 
		
		Adder1(2)(5);System.out.println("""res4: Int = """ + $show(res$4));$skip(23); val res$5 = 
			
		Adder1(-1002)(5);System.out.println("""res5: Int = """ + $show(res$5));$skip(22); 
	var y = 2;System.out.println("""y  : Int = """ + $show(y ));$skip(22);  //variable
	val X = 5;System.out.println("""X  : Int = """ + $show(X ));$skip(9);  //constant
			y = 3;$skip(44); val res$6 = 
	//		X = 3 //cant be changed
		Adder1(X)(5);System.out.println("""res6: Int = """ + $show(res$6));$skip(15); val res$7 = 
		Adder1(y)(5);System.out.println("""res7: Int = """ + $show(res$7));$skip(67); 
		
		
		// unsigned shift right
			var myList1 = new Array[Int](6);System.out.println("""myList1  : Array[Int] = """ + $show(myList1 ));$skip(19); 
	 		myList1(0) = 1;$skip(18); 
			myList1(2) = 2;$skip(18); 
			myList1(3) = 3;$skip(18); 
			myList1(4) = 4;$skip(48); 
		 for ( x <- myList1 ) {
         println( x )
      };$skip(128); 
      
		def shiftRight(X: Array[Int])(Shift: Int){
		 for (z<-myList1){
		 		myList1(z)=(myList1(z) >> Shift)
		 }
		};System.out.println("""shiftRight: (X: Array[Int])(Shift: Int)Unit""");$skip(97); 
		shiftRight(myList1)(1);$skip(49);      // 1d =  1b >> 0     2d= 10b >> 1  4d = 100b == 2 perstumia bitukus
			 for ( x <- myList1 ) {
         println( x )
         };$skip(100); 
                        
		
		
		
		//not mine
		 var myList = Array(1.9, 2.9, 3.4, 3.5);System.out.println("""myList  : Array[Double] = """ + $show(myList ));$skip(95); 
      
      // Print all the array elements
      for ( x <- myList ) {
         println( x )
      };$skip(62); 

      // Summing all elements
      var total = 0.0;System.out.println("""total  : Double = """ + $show(total ));$skip(74); ;
      for ( i <- 0 to (myList.length - 1)) {
         total += myList(i);
      };$skip(44); 
      println("Total is " + total);$skip(65); ;

      // Finding the largest element
      var max = myList(0);System.out.println("""max  : Double = """ + $show(max ));$skip(93); ;
      for ( i <- 1 to (myList.length - 1) ) {
         if (myList(i) > max) max = myList(i);
      };$skip(40); 
      println("Max is " + max);$skip(63); ;
		
	//multiplication
	 val multiply = (m: Int , n: Int) => m*n;System.out.println("""multiply  : (Int, Int) => Int = """ + $show(multiply ));$skip(15); val res$8 = 
	multiply(2,4);System.out.println("""res8: Int = """ + $show(res$8))}
	
	
			trait Car {
		  val brand: String
		}
		
		
		trait Shiny {
		  val shineRefraction: Int
		}
		
		class BMW extends Car {
		  val brand = "BMW"
		}
		
	class BMW1 extends Car with Shiny {
	  val brand = "BMW"
	  val shineRefraction = 12
	}
}
