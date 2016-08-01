(*
 * On OS X:
 * Compile with `fsharpc Factorial.fs`.
 * Run with `mono Factorial.exe`.
 *
 * On Windows:
 * Compile with
 * `& 'C:\Program Files (x86)\Microsoft SDKs\F#\4.0\Framework\v4.0/Fsc.exe' Factorial.fs`
 * (If fsc dir not added to path.)
 * Then just run `Factorial.exe`.
 *
 * Note:
 * - `let rec` to declare a recursive function
 *)
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

