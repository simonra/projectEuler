

fn main(){
    let mut sum = 0u32;
    let mut lastFib = 0u32;
    let mut curentFib = 1u32;
    let mut nextFib = 2u32;
    loop {
        if curentFib >= 4000000 {
            println!("The sum is: {}", sum);
            break;
        }

        if curentFib % 2 == 0 {
            sum += curentFib;
        }

        lastFib = curentFib;
        curentFib = nextFib;
        nextFib = lastFib + curentFib;
    }
}
