#!/bin/bash

pushd source/problems
for f in *.d; 
do
	outputfile="../../executables/"$f".elf"
	echo $outputfile
	dmd $f -of$outputfile
done
popd

mv executables/*.o otherCrap
