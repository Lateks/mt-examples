open System
open System.Numerics

let factorial (n: int): BigInteger =
    let rec factorialHelper (n: BigInteger) (acc: BigInteger) =
        if n.IsZero then
            acc
        else
            factorialHelper (n - BigInteger.One) (acc * n)
    factorialHelper (BigInteger n) BigInteger.One

[<EntryPoint>]
let main argv =
    printfn "%A" (factorial 10000)
    0

