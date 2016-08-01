let createCounter () =
    let c = ref 0 // ref-tyyppi
    let incrementer = fun () -> c := !c + 1
    let getter = fun () -> !c
    (incrementer, getter)

[<EntryPoint>]
let main argv =
    let (increment, get) = createCounter()
    printfn "%d" (get ())
    increment ()
    printfn "%d" (get ())
    increment ()
    increment ()
    printfn "%d" (get ())
    0
