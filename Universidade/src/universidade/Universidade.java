/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidade;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/**
 *
 * @author 3223612
 */
public class Universidade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

        Funcionario funcionario1 = new Funcionario("Rh", 2500.0f, 1, "Jon", "12312312323", 35);
        funcionarios.add(funcionario1);
        Funcionario funcionario2 = new Funcionario("Professor", 2700.0f, 2, "Pan", "12312312323", 29);
        funcionarios.add(funcionario2);
        Funcionario funcionario3 = new Funcionario("Atendente", 1500.0f, 3, "Aline", "12312312323", 21);
        funcionarios.add(funcionario3);
        Funcionario funcionario4 = new Funcionario("Calcenter", 2500.0f, 4, "Jafar", "12312312323", 30);
        funcionarios.add(funcionario4);
        Funcionario funcionario5 = new Funcionario("Diretor", 7500.0f, 5, "Ben", "12312312323", 24);
        funcionarios.add(funcionario5);
        Funcionario funcionario6 = new Funcionario("Administrativo", 2100.0f, 6, "Arthur", "12312312323", 33);
        funcionarios.add(funcionario6);
        Funcionario funcionario7 = new Funcionario("Jogadora", 2500.0f, 7, "Sarah", "12312312323", 23);
        funcionarios.add(funcionario7);
        Funcionario funcionario8 = new Funcionario("Docente", 3500.0f, 8, "Thiago", "12312312323", 22);
        funcionarios.add(funcionario8);
        Funcionario funcionario9 = new Funcionario("Auxiliar", 1700.0f, 9, "Matheus", "12312312323", 36);
        funcionarios.add(funcionario9);
        Funcionario funcionario10 = new Funcionario("Engenheiro", 9500.0f, 10, "Paulo", "12312312323", 45);
        funcionarios.add(funcionario10);

        AtomicReference<Float> soma = new AtomicReference(0.0f);
        funcionarios.forEach((f) -> {
            if (f.getSalario() >= 2000.0f) {
                System.out.println("Nome: " + f.getNome() + " Salario:" + f.getSalario());
            }
            soma.getAndUpdate(value -> value + f.getSalario());
        });
        
        System.out.println("Soma " + soma);
        
        float total = (float) funcionarios.stream().mapToDouble(f -> f.getSalario()).sum();
        System.out.println(total);
    }

}
