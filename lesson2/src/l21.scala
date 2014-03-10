object l21 {
	println("Welcome to the Scala worksheet")
	
	
	trait NumberFormatter{
		def format(n: Number): String
	}
	
	trait DefaultNumberFormatter extends NumberFormatter{
		def format(n: Number) = n.value.toString
	}
	
	trait DummyNumberFormatter extends NumberFormatter{
		def format(n: Number) = "dummy!"
	}
	
	sealed abstract class number{
		self: NumberFormatter =>
		
		def +(n: number): number
		def value: Long
		
		override def toString(): String = format(this)
	}
	
	
	case class PosNumber(val absValue: long) extends Number with DefaultNumberFormatter{
		def +(n: number)= n match {
		case Zero => this
		case  PosNumber(v) => PosNumber(v + absValue)
		case NegNumber(v) => if( v == absValue) Zero
			else 
			if (absValue > v) PosNumber(absValue - v)
			else NegNumber(v - absValue)
		}
		def value = absValue	
	}
	case class NegNumber(val absValue: long) extends Number with DefaultNumberFormatter{
		def +(n: number)= n match {
		case Zero => this
		case NegNumber(v)=> NegNumber(v + absValue)
		case PosNumber(v) => if (v == absValue) Zero
			else
			if (v > absValue) PosNumber (v-absValue)
			else NegNumber(absValue - v)
		}
		def value = -absValue
	}
	case object Zero extends Number with DummyNumberFormatter{
		def +(n: number)= n match {
			case  Zero => Zero
			Case PosNumber(v) => PosNumber(v)
	}
	case object Zero extends Number{
		def +(n: number)= n 
		def value => 0
	}
	val pn= PosNumber(5)
	val nn = NegNumber(5)
	
	pn + nn
	
	trait A{
	}
	
	trait B extends A
	trait C extends A
	class D extends B with C{
	}
	

}