package desafios_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FolhaPagamento {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int qtd_funcionario = Integer.parseInt(st.nextToken());

        //st = new StringTokenizer(br.readLine());
        int trabalho_hora = Integer.parseInt(st.nextToken());

        //st = new StringTokenizer(br.readLine());
        double valor_hora = Double.parseDouble(st.nextToken());

        double salario = trabalho_hora * valor_hora;
        System.out.println("NUMBER = " + qtd_funcionario);
        System.out.printf("SALARY = U$ %.2f", salario);
    }
}

