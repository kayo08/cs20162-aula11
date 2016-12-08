/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.kayo08.aula11;

import java.util.Scanner;
/**
 *
 * @author Kayo Martins Freitas.
 */
public class Calcular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String expressao = ler.nextLine();

        try {
            System.out.println(Calculo.Expressao(expressao));
            System.exit(0);
        } catch (IllegalArgumentException ex) {
            System.err.println("Expreção é inválida");
            System.exit(1);
        }
    }

}
