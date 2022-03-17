public class TestaIR {

    public static void main(String[] args) {

        double salario = 3300.0;
        double IR;
        int deducao;

        if(salario >= 1900.0 && salario <= 2800.0) {
        	IR = 7.5;
        	deducao = 142;
        	System.out.println("o IR é de " + IR + "% e pode deduzir na declaração o valor de R$ " + deducao);
        } else if(salario >= 2800.01 && salario <= 3751.0) {
        	IR = 15;
        	deducao = 350;
        	System.out.println("o IR é de " + IR + "% e pode deduzir na declaração o valor de R$ " + deducao);
        } else if(salario >= 3751.01 && salario <= 4664.00) {
        	IR = 22.5;
        	deducao = 636;
        	System.out.println("o IR é de " + IR + "% e pode deduzir na declaração o valor de R$ " + deducao);
        }
    }
}