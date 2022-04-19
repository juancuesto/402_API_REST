package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.domain.Fruita;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.repo.FruitaRepository;

@Service
public class FruitaServiceImpl implements IFruitaService {
	
	@Autowired
	private FruitaRepository fruitaRepo;

	@Override
	public Iterable<Fruita> findAll() {
		// TODO Auto-generated method stub
		return fruitaRepo.findAll();
	}

	@Override
	public Optional<Fruita> findById(int id) {
		// TODO Auto-generated method stub
		return fruitaRepo.findById(id);
	}

	@Override
	public Fruita save(Fruita fruita) {
		// TODO Auto-generated method stub
		return fruitaRepo.save(fruita);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		fruitaRepo.deleteById(id);
	}
}
