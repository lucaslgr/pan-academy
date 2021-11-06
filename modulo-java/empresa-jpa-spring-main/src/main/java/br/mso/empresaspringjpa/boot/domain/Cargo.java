package br.mso.empresaspringjpa.boot.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CARGOS")
public class Cargo extends AbstractEntity<Long>{
  
  @Column(name = "nome", nullable = false, unique = true, length = 60)
  private String nome;
  
  // Sempre leia da direita pra esquerda. One: Um departamento pode ter vários many: cargos
  @ManyToOne
  @JoinColumn(name = "id_departamento_fk")
  private Departamento departamento;
  
  @OneToMany(mappedBy = "cargo") // funcionarios é forte agr
  private List<Funcionario> funcionarios;
  
  public String getNome() {
    return nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public Departamento getDepartamento() {
    return departamento;
  }
  
  public void setDepartamento(Departamento departamento) {
    this.departamento = departamento;
  }
  
  public List<Funcionario> getFuncionarios() {
    return funcionarios;
  }
  
  public void setFuncionarios(List<Funcionario> funcionarios) {
    this.funcionarios = funcionarios;
  }
}
