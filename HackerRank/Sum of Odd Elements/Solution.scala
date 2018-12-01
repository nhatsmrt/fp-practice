def f(arr:List[Int]):Int = arr match {
    case Nil => 0
    case x :: ys => if (x % 2 != 0) x + f(ys) else f(ys)
}
