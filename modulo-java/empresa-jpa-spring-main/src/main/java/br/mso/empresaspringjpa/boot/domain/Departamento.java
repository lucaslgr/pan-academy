package br.mso.empresaspringjpa.boot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long> {
  // Não precisamos criar o ID pq ele já vai ser herdado
  
  @Column(name = "nome", nullable = false, unique = true, length = 60)
  private String nome;
  
  // Vc coloca mappedBy, quando a relação for bidirecional, o lado forte, é o lado da chave estrangeira (no caso aqui é cargos).
  @OneToMany(mappedBy = "departamento") // Da direita pra esquerda. Muitos cargos tem um departamento.
  private List<Cargo> cargos;
  
  public String getNome() {
    return nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public List<Cargo> getCargos() {
    return cargos;
  }
  
  public void setCargos(List<Cargo> cargos) {
    this.cargos = cargos;
  }
}
