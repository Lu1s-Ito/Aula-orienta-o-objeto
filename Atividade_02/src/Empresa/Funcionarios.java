//pacote onde está todos os arquivos
package Empresa;

//cria a Classe funcionarios
public class Funcionarios {
    
    //cria os atributos
    String nome;
    double salario;
    
    //cria o metodo de aumento salarial
    void aumento(double valor){
        //this.salario += valor;
        this.salario = this.salario + valor;
    }
    
    //cria o metodo de aumento salarial
    double consultar_s(){
        return this.salario;
    }
    
    String consultar_n(){
        return this.nome ;
    }
}
