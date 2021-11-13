package br.mso.security.repository;

import br.mso.security.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

// Essa interface é um subtipo de CrudRepository definido pelo Spring Data JPA,
// portanto, o Spring gerará a classe de implementação no tempo de execução.
// Definimos o método getUserByUsername () anotado por uma consulta JPA para ser usado pelo Spring Security
// para autenticação

public interface UserRepository extends CrudRepository<User, Long> {
  
  @Query("SELECT u FROM User u WHERE u.username = :username")
  public User getUserByUsername(@Param("username") String username);
}
