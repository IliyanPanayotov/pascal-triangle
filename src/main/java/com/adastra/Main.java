package com.adastra;

import com.adastra.printer.ConsolePrinter;
import com.adastra.pascaltriangle.PascalTriangle;

public class Main {
    public static void main(String[] args) {

        PascalTriangle printPascalTriangle = new PascalTriangle(5);

        printPascalTriangle.printPascalTriangle(new ConsolePrinter());
    }
}
