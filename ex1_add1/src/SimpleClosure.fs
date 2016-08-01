let add (x: int) =
    printfn "Creating closure add(%d)" x // Estää kääntäjää optimoimasta sulkeumaa kokonaan pois.
    fun (y: int) -> x + y

[<EntryPoint>]
let main argv =
    printfn "%d" ((add 5) 4)
    let add10 = add 10
    printfn "%d" (add10 90)
    printfn "%d" (add10 999)
    0
