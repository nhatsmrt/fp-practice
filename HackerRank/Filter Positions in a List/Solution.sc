
def f(arr:List[Int]):List[Int] = arr match {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    case x::y::z => y :: f(z)
    case _ => List()
}
