package fluxo;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
    	
        Scanner terminal  = new Scanner(System.in);
        
        System.out.println("Digite o primeiro par�metro");
        int parametroUm = terminal .nextInt();
        
        System.out.println("Digite o segundo par�metro");
        int parametroDois = terminal .nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

        terminal .close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo par�metro deve ser maior que o primeiro");
        }

        int contar = parametroDois - parametroUm;
        for (int i = 1; i <= contar; i++) {
            System.out.println("Imprimindo o n�mero " + i);
        }
    }
}