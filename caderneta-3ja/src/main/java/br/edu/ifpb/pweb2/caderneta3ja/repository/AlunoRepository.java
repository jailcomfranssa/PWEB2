package br.edu.ifpb.pweb2.caderneta3ja.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import br.edu.ifpb.pweb2.caderneta3ja.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
	Aluno findById(long id);

}
