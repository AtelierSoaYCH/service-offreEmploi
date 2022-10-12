package com.iset.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iset.demo.dao.OffreRepository;
import com.iset.demo.entity.Offre;

@RestController
@RequestMapping("/Offres")
public class RestOffres {
	@Autowired
	OffreRepository offreRepository;

	@GetMapping
	public List<Offre> getAll() {
		return offreRepository.findAll();
	}

	@GetMapping("/{id}")
	public Offre getById(@PathVariable Long id) {
		return offreRepository.findById(id).get();
	}

	@PostMapping
	public Offre save(Offre offre) {
		return offreRepository.save(offre);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id) {
		if (offreRepository.findById(id).isPresent()) {
			try {
				offreRepository.deleteById(id);
				return ResponseEntity.ok("Offre supprimée");
			} catch (Exception e) {
				return ResponseEntity.status(500).body("Erreur lors de la suppression");
			}
		} else {
			return ResponseEntity.status(404).body("Offre introuvable");
		}
	}

}
