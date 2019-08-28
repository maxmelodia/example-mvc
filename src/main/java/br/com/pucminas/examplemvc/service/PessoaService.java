package br.com.pucminas.examplemvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pucminas.examplemvc.entity.Pessoa;
import br.com.pucminas.examplemvc.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	public List<Pessoa> findAll(){
		return pessoaRepository.findAll();
	}
	
	public Pessoa save(Pessoa pessoa){
		pessoa.setId(null);
		return pessoaRepository.save(pessoa);
	}
	
}
