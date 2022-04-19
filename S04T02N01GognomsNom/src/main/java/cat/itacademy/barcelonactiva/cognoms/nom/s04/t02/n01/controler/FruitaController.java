
package cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.controler;



import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.model.domain.Fruita;
import cat.itacademy.barcelonactiva.cognoms.nom.s04.t02.n01.services.FruitaServiceImpl;

@RestController
@RequestMapping(path="/fruita")
public class FruitaController {
	
	@Autowired
	private FruitaServiceImpl fruitaService;
	
	@PostMapping("/fruita/add")
	public ResponseEntity<?> Create(@RequestBody Fruita fruita) {
		return ResponseEntity.status(HttpStatus.CREATED).body(fruitaService.save(fruita));
		
	}

	@GetMapping("/fruita/getOne/{id}")
	public ResponseEntity<?> read(@PathVariable(value="id")int userId){
		Optional<Fruita> ofruita=fruitaService.findById(userId);
		if(!ofruita.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(ofruita);
	}
	
	@GetMapping("/fruita/getAll")
	public List<Fruita> readAll() {
		// TODO Auto-generated method stub
		List<Fruita> fruita=StreamSupport
				.stream(fruitaService.findAll().spliterator(), false)// recorre la coleccion  secuencialmente pq tiene false
				.collect(Collectors.toList());// convierte convierte la coleccion en una lista
		return fruita;
	}

	@DeleteMapping("/fruita/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable int id) {
		// TODO Auto-generated method stub
		if(!fruitaService.findById(id).isPresent()) {
			return ResponseEntity.notFound().build();
		}
		
		fruitaService.delete(id);
		return ResponseEntity.ok().build();	
	}
	
	@PutMapping("fruita/update")
	public ResponseEntity<?>  update(@RequestBody Fruita fruita, @PathVariable(value="id")int userId){
		Optional<Fruita> ofruita=fruitaService.findById(userId);
		
		if(!ofruita.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(fruitaService.save(fruita));
		
		
	}



}
