package br.edu.ifpb.pweb2.caderneta3ja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifpb.pweb2.caderneta3ja.model.Nota;

public interface NotaRepository extends JpaRepository <Nota, Long> {
	// Implementação feita pelo próprio Spring Boot
	Nota findById(long id);
}
