
def f(arr:List[Int]):List[Int] = {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    if (arr.size == 1)
        return List()
    else if (arr.size == 2)
        return arr.slice(1, 2)

    return arr.slice(1, 2) ::: f(arr.slice(2, arr.size))
}
