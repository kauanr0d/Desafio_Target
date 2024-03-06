/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package d.desafiotarget.questoes;

/**
 *
 * @author kauan
 */
public class Questao5 {

    public static void main(String[] args) {
        String s = "Olá";
        String invertida = inverteString(s);
        System.out.println(invertida);
    }

    public static String inverteString(String s) {
        char[] c = s.toCharArray();
        char[] invertido = new char[c.length];

        for (int i = 0; i < c.length; i++) {
            int k = c.length - 1 - i;
            invertido[k] = c[i];
        }
        return new String(invertido);

    }

} 
