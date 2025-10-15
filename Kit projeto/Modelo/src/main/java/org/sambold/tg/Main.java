package org.sambold.tg;

import java.util.Scanner;

import org.sambold.tg.modeloDAO.UsuarioDAO;
import org.sambold.tg.tgmodeloBeans.Usuario;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu email:");
        String email = scan.nextLine();

        System.out.println("Digite sua senha:");
        String senha = scan.nextLine();

        System.out.println("Digite seu curso:");
        String curso = scan.nextLine();
        
        int perfil = 1;  
        

         // Você pode pedir input se quiser

        Usuario usuario1 = new Usuario(email, senha, perfil, curso);

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



