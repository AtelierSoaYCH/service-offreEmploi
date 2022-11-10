package com.iset.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iset.demo.dao.OffreRepository;
import com.iset.demo.entity.Offre;

@RestController
public class RestOffres {
	@Autowired
	OffreRepository offreRepository;

	@GetMapping("/Offres")
	public List<Offre> getAll() {
		return offreRepository.findAll();
	}

	@GetMapping("/Offres/{id}")
	public Offre getById(@PathVariable Long id) {
		return offreRepository.findById(id).get();
	}

	@PostMapping("/offres")
	public Offre save(@RequestBody Offre offre) {
		return offreRepository.save(offre);
	}

	@DeleteMapping("/Offres/{id}")
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

	@PutMapping("/Offres/{id}")
	public ResponseEntity<Offre> update(@PathVariable Long id, @RequestBody Offre offre) {
		if (offreRepository.findById(id).isPresent()) {
			try {
				Offre offreToUpdate = offreRepository.findById(id).get();
				offreToUpdate.setIntitulé(offre.getIntitulé());
				offreToUpdate.setSpecialité(offre.getSpecialité());
				offreToUpdate.setSociété(offre.getSociété());
				offreToUpdate.setNbpostes(offre.getNbpostes());
				offreToUpdate.setPays(offre.getPays());
				offreToUpdate.setLogo(offre.getLogo());
				offreRepository.save(offreToUpdate);
				return ResponseEntity.ok(offreToUpdate);
			} catch (Exception e) {
				return ResponseEntity.status(500).body(null);
			}
		} else {
			return ResponseEntity.status(404).body(null);
		}
	}

}
