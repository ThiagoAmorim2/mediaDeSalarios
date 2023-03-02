package org.example.model;

import java.util.List;
import java.util.Objects;

public class Funcionario {
    private String nome;
    private Double salario;
    private String cargo;

    public Funcionario(String nome, Double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double mediaSalario(Double somaSalario, Integer qtdFuncionarios){
        return somaSalario / qtdFuncionarios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return cargo.equals(that.cargo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cargo);
    }
}
