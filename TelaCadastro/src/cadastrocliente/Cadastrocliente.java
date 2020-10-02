
package cadastrocliente;


public class Cadastrocliente {

    public static void main(String[] args) {
        //Instanciar os objetos
        TelaCadastro formulario = new TelaCadastro();
        
        pessoa  cliente = new pessoa (formulario.nome, formulario.cpf,  formulario.endereco, formulario.cidade, formulario.estado);
    }
    
}
