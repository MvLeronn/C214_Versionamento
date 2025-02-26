package org.example;
import Jama.Matrix;

public class Main {
    public static void main(String[] args) {
        double[][] array = {{4, 7}, {3, 4}};
        Matrix A = new Matrix(array);

        Matrix D = A.inverse();  // Inversa de A
        Matrix C = A.transpose();  // Transposta de A

        System.out.println("Inversa de A:");
        D.print(5, 2);

        System.out.println("Transposta de A:");
        C.print(5, 2);

        System.out.println("Determinante: " + A.det());
    }
}