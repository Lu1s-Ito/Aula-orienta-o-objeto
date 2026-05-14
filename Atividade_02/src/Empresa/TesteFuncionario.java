//pacote onde está todos os arquivos
package Empresa;

//cria a Classe teste funcionarios
public class TesteFuncionario {

    //Executa na memoria o programa
    public static void main(String[] args) {
        
        //cria o objeto f1
        Funcionarios f1 = new Funcionarios();
        
            //Atribui valores aos atributos de f1
            f1.nome = "Luis";
            f1.salario = 2500.00;
            
        //cria o objeto f2
        Funcionarios f2 = new Funcionarios();
        
            //atribui valores aos atributos de f2
            f2.nome = "Massa";
            f2.salario = 3400.55;
            
        //imprime os dados de f1
        System.out.println("Nome do Funcionario:" + f1.nome);
        System.out.println("Salario do Funcionario:" + f1.salario);
        
        //declara o atributo para aumentar o salario
        f1.aumento(500.00);
        
        //imprime o valor do aumento salarial
        System.out.println("Aumento do salario:500.00");
        
        //imprime o novo salario
        System.out.println("Salario atual:" + f1.salario);
        System.out.println("-------------------------------");
        
        //imprime os dados de f2
        System.out.println("Nome do Funcionario:" + f2.nome);
        System.out.println("Salario do Funcionario:" + f2.salario);
        
        //declara o atributo para aumentar o salario
        f2.aumento(200.00);
        
        //imprime o valor do aumento salarial
        System.out.println("Aumento do salario:200.00");
        
        //imprime o novo salario
        System.out.println("Salario atual:" + f2.salario);
        System.out.println("-------------------------------");
        
        //Consultar os dados dos funcionario 1
        f1.consultar_n();
        f1.consultar_s();
        
        //imprime os dados do f1
        System.out.println("dados do funcionarios: " + "Nome: " 
                + f1.consultar_n() + ", "+ "Salario: " + f1.consultar_s());
        
        //Consultar os dados dos funcionario 1
        f2.consultar_n();
        f2.consultar_s();
        
        System.out.println("-------------------------------");
        
        //imprime os dados do f1
        System.out.println("dados do funcionarios: " + "Nome: " 
                + f2.consultar_n() + ", "+ "Salario: " + f2.consultar_s());
    }
    
}
