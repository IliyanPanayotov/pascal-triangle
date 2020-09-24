package com.adastra.pascaltriangle;

import com.adastra.printer.Printer;

public class PascalTriangle {

    private static String EMPTY_SPACE = " ";

    private int height;

    public PascalTriangle(int height) {
        this.height = height;
    }

    public void printPascalTriangle(Printer printer) {

        StringBuilder sb = new StringBuilder();

        int emptySpaceLength = height;

        int n;

        for (int i = 0; i < height; i++) {
            printEmptySpaces(emptySpaceLength, sb);
            n = 1;

            for (int j = 0; j <= i; j++) {
                if (j == i) {
                    sb.append(n);
                } else {
                    sb.append(n).append(EMPTY_SPACE);
                    n = n * (i - j) / (j + 1);
                }
            }

            printEmptySpaces(emptySpaceLength, sb);
            emptySpaceLength--;
            sb.append("\n");
        }
        printer.print(sb.toString());
    }

    private void printEmptySpaces(int emptySpaceLength, StringBuilder sb) {
        for (int es = 0; es < emptySpaceLength - 1; es++) {
            sb.append(EMPTY_SPACE);
        }
    }
}
