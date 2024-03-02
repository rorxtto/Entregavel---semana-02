package app.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.entity.Livraria;
import app.service.LivrariaService;

@RestController
@RequestMapping("/livraria")
public class LivrariaController {
	
	@Autowired
	private LivrariaService livrariaService;
	
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody Livraria livraria){
		
		try {
			String mensagem = this.livrariaService.save(livraria);
			return new ResponseEntity<String>(mensagem,HttpStatus.OK);
			
		} catch (Exception e) {
			
			return new ResponseEntity<String>("Deu algo errado ao salvar", HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/finfById/{id}")
	public ResponseEntity<Livraria> findById(@PathVariable long id){
		try {
		
			Livraria livraria = this.livrariaService.findById(id);
			return new ResponseEntity<>(livraria, HttpStatus.OK);
			
			
		} catch (Exception e) {
			
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}
	}
	

}
