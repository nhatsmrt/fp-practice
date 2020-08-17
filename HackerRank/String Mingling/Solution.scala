import scala.io._

object Solution {
    private def interleave(first: Iterator[Char], second: Iterator[Char], firstEmpty: Boolean, secondEmpty: Boolean, ind: Int): LazyList[Char] =
    if (firstEmpty && secondEmpty) LazyList.empty
    else if (ind == 0) {
        if (first.hasNext)
            first.next #:: interleave(first, second, firstEmpty, secondEmpty, 1)
        else
            interleave(first, second, true, secondEmpty, 1)
    }
    else {
        if (second.hasNext)
            second.next #:: interleave(first, second, firstEmpty, secondEmpty, 0)
        else
            interleave(first, second, firstEmpty, true, 0)
    }

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        val P = StdIn.readLine
        val Q = StdIn.readLine

        println(interleave(P.iterator, Q.iterator, false, false, 0).mkString)
    }
}
