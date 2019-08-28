package br.com.pucminas.examplemvc;

import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.pucminas.examplemvc.entity.Pessoa;

@Service
public class TestView {
     	public static void main(String[] args) {
	    	RestTemplate restTemplate = restTemplate();
	    	ResponseEntity resp = restTemplate.getForEntity("http://localhost:8080/pessoas/", Pessoa.class);
	    	System.out.println(resp.getBody());
     	}
	
	    @Bean
	    public static RestTemplate restTemplate() {
	        return new RestTemplate();
	    }	    

}
