/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meuPrimeiroProjeto;

/**
 *
 * @author 202303968256
 */
public class Principal {
    public static void main(String[] args) {
       Funcionario f1 = new Funcionario();
        f1.setNome("BRUNINHO");
        f1.setSalario(10000000f);
        String nome = f1.getNome();
        float salario = f1.getSalario();
        System.out.println(nome + " recebe = " + salario);
        
    }
}
