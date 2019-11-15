package br.edu.ifpb.pweb2.caderneta3ja.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifpb.pweb2.caderneta3ja.model.Aluno;
import br.edu.ifpb.pweb2.caderneta3ja.repository.AlunoRepository;

@RestController
public class AlunoController {
	
	@Autowired
	AlunoRepository alunoRepository;
	
	@RequestMapping( value = "/aluno")
	public ModelAndView listarDisciplinasAluno() {
		return new ModelAndView("aluno/aluno");
	}
	
	@GetMapping("/aluno/aluno")
	public List<Aluno> listaAlunos(){
		return alunoRepository.findAll();
	}
	
	@GetMapping("/aluno/aluno/{id}")
	public Aluno listaPorID(@PathVariable(value = "id") long id) {
		return alunoRepository.findById(id);
		
	}
	@PostMapping("/aluno/aluno")
	public Aluno salvaAluno(@RequestBody Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
	@DeleteMapping("/aluno/aluno")
	public void deletaAluno(@RequestBody Aluno aluno) {
		alunoRepository.delete(aluno);
	} 
	
	@PutMapping("/aluno/aluno")
	public Aluno atualizaAluno(@RequestBody Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	

	
	
}