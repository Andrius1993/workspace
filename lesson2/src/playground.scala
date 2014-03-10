object playground {
   def main(args: Array[String]) {
	i:int = 4 ;
	val u: int = 43;
	
	def f(r: => int): Unit =(println(r));
	
	def f(b:boolean, r: => int): int =
	  if (b) r
	  else 0
	  
	  f(false, 5/0)
   }
}