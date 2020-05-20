import scala.io._
import scala.collection.mutable.Map

object Solution {

    var MOD = 100000007

    case class Memoize[I, O](f: I => O) extends (I => O) {
        private val cache = Map.empty[I, O]

        def apply(inp: I): O = cache.getOrElseUpdate(inp, f(inp))
    }

    val fib: Memoize[Int, Int] = Memoize {
        case 0 => 0
        case 1 => 1
        case n => ((fib(n - 1) % MOD) + (fib(n - 2) % MOD)) % MOD
    }

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        var numTests = StdIn.readInt

        for (_<- 1 to numTests)
            println(fib(StdIn.readInt))
    }
}
