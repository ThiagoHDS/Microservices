package service.repository;

import org.springframework.stereotype.Repository;

import service.model.Aluno;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}