
package prjpessoa;

import java.util.Scanner;

public class Principal {

       public static void main(String[] args) {
        
           Pessoa pessoa = new Pessoa();
           Scanner teclado = new Scanner(System.in);
           System.out.println("Digite o ID da Pessoa: ");
           int id_pessoa_do_teclado = teclado.nextInt();
           pessoa.setId_pessoa(id_pessoa_do_teclado);
           System.out.println("O que acabei de digitar é: " + pessoa.getId_pessoa());
           
           System.out.println("Digite o nome da Pessoa: ");
           String nome_do_teclado = teclado.next();
           pessoa.setNome(nome_do_teclado);
           System.out.println("O nome informado foi: " + pessoa.getNome());
           
           
           System.out.println("Digite o sobrenome da Pessoa: ");
           String sobre_nome_do_teclado = teclado.next();
           pessoa.setSobrenome(sobre_nome_do_teclado);
           System.out.println("O nome informado foi: " + "  " +pessoa.getId_pessoa() + " " +pessoa.getNome() + " "+ pessoa.getSobrenome());
           
           
           
    }
    
}
