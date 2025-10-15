package org.sambold.tg.tgmodeloBeans;

public class Usuario {
    private String email;
    private String senha;
    private int perfil;
    private String curso;

    public Usuario(String email, String senha, int perfil, String curso) {
        this.email = email;
        this.senha = senha;
        this.perfil = perfil;
        this.curso = curso;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public int getPerfil() {
        return perfil;
    }

    public String getCurso() {
        return curso;
    }
}
