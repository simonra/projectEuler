use std::iter;
use std::iter::AdditiveIterator;


fn main(){
	let multiples_of_3_and_5 =
        iter::range_inclusive(1u32, 999)
            .filter(|&n| (n % 3 == 0 || n % 5 == 0))
            .sum();
    println!("{}", multiples_of_3_and_5);
}
