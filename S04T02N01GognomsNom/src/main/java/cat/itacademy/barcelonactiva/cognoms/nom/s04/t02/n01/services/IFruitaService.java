package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.services;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.domain.Fruita;

public interface IFruitaService {
	
	public Iterable<Fruita> findAll();
	public Optional<Fruita> findById(int id);
	public Fruita save(Fruita fruita);
	public void delete(int id);

}
