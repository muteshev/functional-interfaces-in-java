/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.muteshev.chapter2;

/**
 *
 * @author rlece
 */
public class Sect5_Ex2 {
    public static void main(String[] args)
    {
        StringProcessor spBlock = x -> {
            System.out.print(x + " ");
            return x + x;
        };

        System.out.println(spBlock.process("Hello"));
    }
}
