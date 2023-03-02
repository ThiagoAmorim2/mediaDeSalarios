package org.example;

import org.example.model.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("*****************************************");
        System.out.println("***********MÉDIA DE SALÁRIOS*************");
        System.out.println("*****************************************");
        Scanner sc = new Scanner(System.in);
        Boolean continua = true;

        while (continua) {
            System.out.print("Indique quantos funcionários tem na sua empresa: ");

            Integer qdtFuncionarios = sc.nextInt();
            ArrayList<Funcionario> listaFuncionarios = new ArrayList();
            String cargo;
            Double somaSalariosTodos = 0.0;
            Double somaSalariosConsultor = 0.0;
            Double somaSalariosManager = 0.0;
            Double mediaSalariosTodos = 0.0;
            Double mediaSalariosConsultor = 0.0;
            Double mediaSalariosManager = 0.0;
            Integer qtdManager = 0;
            Integer qtdConsultor = 0;

            if (qdtFuncionarios > 0) {
                Funcionario funcionario = new Funcionario();
                for (int i = 1; i <= qdtFuncionarios; i++) {
                    System.out.print("Qual o nome do " + i + "o. funcionário: ");
                    funcionario.setNome(sc.next());
                    System.out.print("Qual o cargo do " + funcionario.getNome() + "? ");
                    System.out.print("1-MANAGER ou 2-CONSULTOR? ");
                    funcionario.setCargo(sc.nextInt());
                    System.out.print("Qual o valor do salário do " + funcionario.getNome() + "? ");
                    funcionario.setSalario(sc.nextDouble());
                    if (funcionario.getCargo() == 1) {
                        somaSalariosManager += funcionario.getSalario();
                        qtdManager++;
                    } else {
                        somaSalariosConsultor += funcionario.getSalario();
                        qtdConsultor++;
                    }
                    listaFuncionarios.add(funcionario);
                    somaSalariosTodos += funcionario.getSalario();
                    System.out.println("Qual filtro prefere na listagem? ");
                    System.out.println("1 - Média de todos os salários");
                    System.out.println("2 - Média dos salários de determinado cargo");
                    Integer filtro = sc.nextInt();

                    if (filtro == 2) {
                        System.out.print("Para qual o cargo deseja verificar a média salarial? (1-MANAGER ou 2-CONSULTOR): ");
                        Integer qualCargo = sc.nextInt();
                        if (qualCargo == 1) {
                            mediaSalariosManager = somaSalariosManager / qtdManager;
                            System.out.printf("A média dos salários da função de MANAGER é R$ %.2f", mediaSalariosManager);
                        } else {
                            mediaSalariosConsultor = somaSalariosConsultor / qtdConsultor;
                            System.out.printf("A média dos salários da função de CONSULTOR é R$ %.2f", mediaSalariosConsultor);
                        }
                    } else {
                        mediaSalariosTodos = somaSalariosTodos / qdtFuncionarios;
                        System.out.printf("Média dos salários dos " + qdtFuncionarios + " funcionários são R$ %.2f", mediaSalariosTodos);
                    }

                    System.out.println("");
                    System.out.println("Deseja uma nova consulta: ");
                    System.out.print("1 - SIM ou 2 - NÃO ");
                    Integer prossegue = sc.nextInt();
                    switch (prossegue) {
                        case 1:
                            continua = true;
                            break;
                        default:
                            continua = false;
                    }
                }
            } else {
                System.out.println("Nenhum funcionário informado");
            }
        }
    }
}