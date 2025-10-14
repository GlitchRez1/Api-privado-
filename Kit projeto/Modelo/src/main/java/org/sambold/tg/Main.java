package org.sambold.tg;

import java.util.Scanner;
import org.sambold.tg.tgmodeloBeans.Usuario;
import org.sambold.tg.modeloDAO.UsuarioDAO;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu email:");
        String email = scan.nextLine();

        System.out.println("Digite sua senha:");
        String senha = scan.nextLine();

        System.out.println("Qual o seu Perfil? (PROFESSOR ou ALUNO)");
        String perfil = scan.nextLine();

        boolean isAtivo = true; // Você pode pedir input se quiser

        Usuario usuario1 = new Usuario(email, senha, perfil, isAtivo);

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        boolean sucesso = usuarioDAO.inserirUsuario(usuario1);

        if (sucesso) {
            System.out.println("Usuário inserido com sucesso!");
        } else {
            System.out.println("Erro ao inserir usuário.");
        }

        scan.close();
    }
}


/* Anotações:
 * Tenho que fazer o scan para que o Usuário consiga colocar as informações via input
 *  Tenho que criar as classes Aluno e Usuário e seus construtores para que eu consigo chamar ao Usuário
 *  Tenho que adaptar a algumas coisas para o novo banco de Dados do Matheus
 *  Mexer com os arquivos DAO depois
 */
