package org.sambold.tg.tgmodeloBeans;



public class Usuario {
    private String email;
    private String senha;
    private String perfil;
    private boolean ativo;
    
    
    public Usuario (String email, String senha, String perfil, boolean ativo) {
    this.email = email;
    this.senha = senha;
    this.perfil = perfil;
    this.ativo = ativo;

}   


    public String getEmail() {
       return email;
    }

    public String getSenha() {
       return senha;
    }

    public String getPerfil() {
      return perfil;
    }


    public boolean isAtivo() {
    return ativo;   
    } 
}
  

