package br.edu.ifpb.pweb2.caderneta3ja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifpb.pweb2.caderneta3ja.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
	
	Professor findById(long id);

}
