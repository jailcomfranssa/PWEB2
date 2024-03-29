package br.edu.ifpb.pweb2.caderneta3ja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifpb.pweb2.caderneta3ja.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	// Implementação feita pelo próprio Spring Boot
	
	Usuario findById(long id);
}
