// Creates a nested class whose Invoke method calls the static
// doubleX method in the main class.
let doubleX (x: int) = 2 * x

[<EntryPoint>]
let main argv =
    printfn "%A" (List.map doubleX [1; 2; 3; 4; 5])
    0
