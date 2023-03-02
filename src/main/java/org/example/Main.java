package org.example;

import org.example.model.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
            Double somaSalarios = 0.0;
            Double mediaSalario = 0.0;

            if (qdtFuncionarios > 0) {
                Funcionario funcionario = new Funcionario();
                for (int i = 1; i <= qdtFuncionarios; i++) {
                    System.out.print("Qual o nome do " + i + "o. funcionário: ");
                    funcionario.setNome(sc.next());
                    System.out.print("Qual o cargo do " + funcionario.getNome() + "? ");
                    funcionario.setCargo(sc.next());
                    System.out.println("Qual o valor do salário do " + funcionario.getNome());
                    funcionario.setSalario(sc.nextDouble());
                    listaFuncionarios.add(funcionario);
                    somaSalarios += funcionario.getSalario();
                }
                System.out.println("Qual filtro prefere na listagem?");
                System.out.println("1 - Média de todos os salários");
                System.out.println("2 - Média dos salários de determinado cargo");
                Integer filtro = sc.nextInt();

                if(filtro == 2){
                    System.out.println("Em desenvolvimento");
                }else{
                    mediaSalario = somaSalarios / qdtFuncionarios;
                    System.out.printf("Média dos salários dos " + qdtFuncionarios + " funcionários são R$ %.2f", mediaSalario);
                }

                System.out.println("");
                System.out.println("Deseja uma nova consulta: ");
                System.out.print("1 - SIM ou 2 - NÃO ");
                Integer prossegue = sc.nextInt();
                switch (prossegue){
                    case 1 :
                           continua = true;
                        break;
                    default:
                        continua = false;
                }
            } else {
                System.out.println("Nenhum funcionário informado");
            }
        }
    }
}