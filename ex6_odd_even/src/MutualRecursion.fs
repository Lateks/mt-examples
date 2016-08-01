open System

let rec isOdd (n: int): bool =
        if n = 0 then
            false
        else
            isEven(n - 1)
    and isEven (n: int): bool =
        if n = 0 then
            true
        else
            isOdd(n - 1)

[<EntryPoint>]
let main argv =
    printfn "%b" (isOdd 10)
    printfn "%b" (isEven 10)
    printfn "%b" (isOdd 9)
    printfn "%b" (isEven 9)
    printfn "%b" (isOdd 2147483647)
    0
