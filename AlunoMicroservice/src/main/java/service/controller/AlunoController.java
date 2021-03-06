package service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.model.Aluno;
import service.repository.AlunoRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {

	@Autowired
	private AlunoRepository alunoRepository;

	@GetMapping
	public List<Aluno> getAlunos() {
		return alunoRepository.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Aluno> getAlunoById(@PathVariable Long id) {
		return alunoRepository.findById(id);
	}

	@PostMapping
	public Aluno createAluno(@RequestBody Aluno aluno) {
		return alunoRepository.save(aluno);

	}

	@PutMapping("/{id}")
	public Aluno updateAluno(@PathVariable("id") String id, @RequestBody Aluno aluno) {
		return alunoRepository.save(aluno);
	}

	@DeleteMapping("/{id}")
	public void deleteAluno(@PathVariable Long id) {
		alunoRepository.delete(alunoRepository.findById(id).get());
	}

}