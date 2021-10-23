package com.panacademy.aula13appspringjoin;

import javax.persistence.*;
import java.util.List;

@Entity
public class Usuario {
    @Id
    private String login;
    private String nomeCompleto;
    private String senha;

    @ManyToMany
    @JoinTable(
            name = "usuarios_roles",
            joinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "login"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "nomeRole")
    )
    private List<Role> roles;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
