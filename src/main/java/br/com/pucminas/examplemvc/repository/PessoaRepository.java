package br.com.pucminas.examplemvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pucminas.examplemvc.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
