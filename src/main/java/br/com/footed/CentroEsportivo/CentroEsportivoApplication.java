package br.com.footed.CentroEsportivo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CentroEsportivoApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(CentroEsportivoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {}
}