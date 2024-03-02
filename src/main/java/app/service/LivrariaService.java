package app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Livraria;
import app.repository.LivrariaRepository;

@Service
public class LivrariaService {
	
	@Autowired
	private LivrariaRepository livrariaRepository;
	
	
	public String save (Livraria livraria) {
		
		this.livrariaRepository.save(livraria);
		
		return "Livro Salvo com sucesso";	
	}
	
	public Livraria findById (long id) {
		Optional<Livraria> livraria = this.livrariaRepository.findById(id);
		return livraria.get();
		
		
	}
}
