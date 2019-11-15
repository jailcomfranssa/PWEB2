package br.edu.ifpb.pweb2.caderneta3ja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifpb.pweb2.caderneta3ja.model.Coordenador;

public interface CoodernadorRepository extends JpaRepository<Coordenador, Long> {
	Coordenador findById(long id);

}
