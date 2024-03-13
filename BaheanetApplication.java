package br.com.alura.baheanet;

import br.com.alura.baheanet.model.DadosSerie;
import br.com.alura.baheanet.service.ConsumidorApi;
import br.com.alura.baheanet.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BaheanetApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BaheanetApplication.class, args);
	}

	public void run(String... args) throws Exception {

		ConverteDados conversor = new ConverteDados();
		ConsumidorApi  consumidor= new ConsumidorApi();
		String json =	consumidor.obterDados("https://www.omdbapi.com/?t=riverdale&apikey=262dfda1");
		DadosSerie riverdale = 	conversor.converterDados(json,DadosSerie.class);
		System.out.println(riverdale);
	}
}
