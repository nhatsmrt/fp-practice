def f(arr:List[Int]):List[Int] = arr match {
    case Nil => Nil
    case x::ys => f(ys) ::: List(x)
}
