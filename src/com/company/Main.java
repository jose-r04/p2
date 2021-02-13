//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;
import java.util.Scanner;
public class Main {
    public Main() {
    }
    public static void main(String[] args) {
        int cont = 0;
        boolean acceptada = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Cree una constrasena: ");
        String contra_creada = scan.nextLine();
        while(cont < 3) {
            System.out.println("Dame una constrasena: ");
            String contra_intentada = scan.nextLine();
            if (!contra_intentada.equals(contra_creada)) {
                acceptada = true;
                cont = 3;
            } else {
                acceptada = false;
                ++cont;
            }
        }
            if (acceptada) {
            System.out.println("\nContrasena acceptada!");
        } else {
            System.out.println();
            System.out.println("Contrasena incorrecta");
        }
    }
}