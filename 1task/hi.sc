object hi {
var myVar1 = 10                                   //> myVar1  : Int = 10
var myvar2 = 20                                   //> myvar2  : Int = 20
val myVal = "Hello, Scala!"                       //> myVal  : String = Hello, Scala!
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet



(x: Int) => x + 1                                 //> res0: Int => Int = <function1>
//res2: (Int) => Int = <function1>
	 	// add
	 var res0 = myVar1 +myvar2                //> res0  : Int = 30
	 	println(res0)                     //> 30

	val Adder = (x: Int,y: Int) => x + y      //> Adder  : (Int, Int) => Int = <function2>
	Adder(2,4)                                //> res1: Int = 6
	
	def Adder1(i1: Int)(i2: Int): Int = {
  	if((i1 + i2)>= -100){
	  		if((i1 + i2)<= 100){
	  			i1 + i2
	  		}else
	  			0
  	}else
  			0
	}                                         //> Adder1: (i1: Int)(i2: Int)Int
		Adder1(100)(5)                    //> res2: Int = 0
		
		Adder1(4)(5)                      //> res3: Int = 9
		
		Adder1(2)(5)                      //> res4: Int = 7
			
		Adder1(-1002)(5)                  //> res5: Int = 0
	var y = 2 //variable                      //> y  : Int = 2
	val X = 5 //constant                      //> X  : Int = 5
			y = 3
	//		X = 3 //cant be changed
		Adder1(X)(5)                      //> res6: Int = 10
		Adder1(y)(5)                      //> res7: Int = 8
		
		
		// unsigned shift right
			var myList1 = new Array[Int](6)
                                                  //> myList1  : Array[Int] = Array(0, 0, 0, 0, 0, 0)
	 		myList1(0) = 1
			myList1(2) = 2
			myList1(3) = 3
			myList1(4) = 4
		 for ( x <- myList1 ) {
         println( x )                             //> 1
                                                  //| 0
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 0
      }
      
		def shiftRight(X: Array[Int])(Shift: Int){
		 for (z<-myList1){
		 		myList1(z)=(myList1(z) >> Shift)
		 }
		}                                 //> shiftRight: (X: Array[Int])(Shift: Int)Unit
		shiftRight(myList1)(1)     // 1d =  1b >> 0     2d= 10b >> 1  4d = 100b == 2 perstumia bitukus
			 for ( x <- myList1 ) {
         println( x )                             //> 0
                                                  //| 0
                                                  //| 1
                                                  //| 1
                                                  //| 2
                                                  //| 0
         }
                        
		
		
		
		//not mine
		 var myList = Array(1.9, 2.9, 3.4, 3.5)
                                                  //> myList  : Array[Double] = Array(1.9, 2.9, 3.4, 3.5)
      
      // Print all the array elements
      for ( x <- myList ) {
         println( x )                             //> 1.9
                                                  //| 2.9
                                                  //| 3.4
                                                  //| 3.5
      }

      // Summing all elements
      var total = 0.0;                            //> total  : Double = 0.0
      for ( i <- 0 to (myList.length - 1)) {
         total += myList(i);
      }
      println("Total is " + total);               //> Total is 11.7

      // Finding the largest element
      var max = myList(0);                        //> max  : Double = 1.9
      for ( i <- 1 to (myList.length - 1) ) {
         if (myList(i) > max) max = myList(i);
      }
      println("Max is " + max);                   //> Max is 3.5
		
	//multiplication
	 val multiply = (m: Int , n: Int) => m*n  //> multiply  : (Int, Int) => Int = <function2>
	multiply(2,4)                             //> res8: Int = 8
	
	
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