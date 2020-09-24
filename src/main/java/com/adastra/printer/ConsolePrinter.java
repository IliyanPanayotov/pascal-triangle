package com.adastra.printer;

import com.adastra.printer.Printer;

public class ConsolePrinter implements Printer {

    public void print(String toPrint) {
        System.out.println(toPrint);
    }
}
