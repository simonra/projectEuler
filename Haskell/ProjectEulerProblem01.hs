--Module declaration (not neccessary in this case):
--module Main where

import Data.List;
import System.IO;

--You have to use 999 to not include the edge case 1000 (which is a multiple of 5)
multiplesOf3 = [n*3|n<-[0..floor(999/3)]];
multiplesOf5 = [n*5|n<-[0..floor(999/5)]];
multiplesOf3and5 = multiplesOf3 `union` multiplesOf5;
sumOfMultiplesOf3and5below1000 = sum multiplesOf3and5;

main = do{
    print sumOfMultiplesOf3and5below1000;
}
