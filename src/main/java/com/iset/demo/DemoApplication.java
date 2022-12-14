package com.iset.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.iset.demo.dao.OffreRepository;
import com.iset.demo.entity.Offre;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	OffreRepository offreRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception { // TODO Auto-generated method stub
		offreRepository.save(new Offre("Développeur", "Informatique", "ISET", 2, "Tunisie",
				"https://i.ytimg.com/vi/KInCaVtQFxk/hqdefault.jpg?sqp=-oaymwEcCNACELwBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBBzu18BYmFpAfq-IXqAmv7y7DM0Q"));
		offreRepository.save(new Offre("Developpeur", "informatique", "Talys", 3, "Tunisie",
				"https://i.ytimg.com/vi/KInCaVtQFxk/hqdefault.jpg?sqp=-oaymwEcCNACELwBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBBzu18BYmFpAfq-IXqAmv7y7DM0Q"));
		offreRepository.save(new Offre("Architecte", "informatique", "SIS", 2, "Allemagne",
				"https://i.ytimg.com/vi/KInCaVtQFxk/hqdefault.jpg?sqp=-oaymwEcCNACELwBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBBzu18BYmFpAfq-IXqAmv7y7DM0Q"));
	}

}
