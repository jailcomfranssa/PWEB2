package br.edu.ifpb.pweb2.caderneta3ja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import br.edu.ifpb.pweb2.caderneta3ja.model.Professor;
import br.edu.ifpb.pweb2.caderneta3ja.repository.ProfessorRepository;

@RestController
public class ProfessorController {
	
	@Autowired
	ProfessorRepository professorRepository;

	@RequestMapping(value = "/professor")
	public ModelAndView listarTurmasProfessor() {
		return new ModelAndView("professor/professor");
	}
	
	@GetMapping("/professor/professor")
	public List<Professor> listaAlunos(){
		return professorRepository.findAll();
	}
	
	@GetMapping("/professor/professor/{id}")
	public Professor listaPorID(@PathVariable(value = "id") long id) {
		return professorRepository.findById(id);
		
	}
	@PostMapping("/professor/professor")
	public Professor salvaProfessor(@RequestBody Professor aluno) {
		return professorRepository.save(aluno);
	}
	
	@DeleteMapping("/professor/professor")
	public void deletaProfessor(@RequestBody Professor professor) {
		professorRepository.delete(professor);
	} 
	
	@PutMapping("/professor/professor")
	public Professor atualizaAluno(@RequestBody Professor professor) {
		return professorRepository.save(professor);
	}
	

	
}
