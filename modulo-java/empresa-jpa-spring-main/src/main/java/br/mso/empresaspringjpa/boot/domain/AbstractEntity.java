package br.mso.empresaspringjpa.boot.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

// É pra que as filhas possam passar o seu tipo próprio de id
@MappedSuperclass // Estou dizendo que é uma superclasse, herança
public abstract class AbstractEntity<ID extends Serializable> implements Serializable {
  // ABSTRACT quer dizer que vc só poderá usar os recursos dessa classe por herança, e não por instância
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) // Isso já é auto_increment
  private ID id;
  
  public ID getId() {
    return id;
  }
  
  public void setId(ID id) {
    this.id = id;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    
    AbstractEntity<?> other = (AbstractEntity<?>) obj;
    if (id == null) {
      if (other.id != null) {
        return false;
      }
    } else if (!id.equals(other.id)) {
      return false;
    }
    return true;
  }
  
  public String toString() {
    return "id = " + id;
  }
}
