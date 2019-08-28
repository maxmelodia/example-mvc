package br.com.pucminas.examplemvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.pucminas.examplemvc.entity.Pessoa;
import br.com.pucminas.examplemvc.service.PessoaService;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
	
	@Autowired
	PessoaService pessoaService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Pessoa>> findAll(){
		cargaInicial();
		return ResponseEntity.status(HttpStatus.OK).body(pessoaService.findAll());
	}

	public void cargaInicial() {
		Pessoa p = new Pessoa();
		p.setId(null);		
		p.setNome("Maxwell");
		p.setIdade(35);
		pessoaService.save(p);
	}
}