package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.Livraria;

public interface LivrariaRepository extends JpaRepository<Livraria, Long> {

}
