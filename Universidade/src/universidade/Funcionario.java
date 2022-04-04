/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidade;

/**
 *
 * @author 3223612
 */
public class Funcionario extends Pessoa{
    public String cargo;
    public float salario;

    public Funcionario(String cargo, float salario, int codigo, String nome, String cpf, int idade) {
        super(codigo, nome, cpf, idade);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    
    
    
}
