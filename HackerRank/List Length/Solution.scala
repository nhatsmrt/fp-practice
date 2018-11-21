def f(arr:List[Int]):Int = arr match {
    case Nil => 0
    case x :: ys => 1 + f(ys)
}
