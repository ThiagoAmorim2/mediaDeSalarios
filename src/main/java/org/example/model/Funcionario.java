package org.example.model;

import java.util.List;
import java.util.Objects;

public class Funcionario {
    private String nome;
    private Double salario;
    private Integer cargo;

    public Funcionario(String nome, Double salario, Integer cargo) {
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

    public Integer getCargo() {
        return cargo;
    }

    public void setCargo(Integer cargo) {
        this.cargo = cargo;
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
