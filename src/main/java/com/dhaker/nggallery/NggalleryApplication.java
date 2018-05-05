package com.dhaker.nggallery;

import com.dhaker.nggallery.entities.Image;
import com.dhaker.nggallery.repositories.ImageRespository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class NggalleryApplication {

	public static void main(String[] args) {
		SpringApplication.run(NggalleryApplication.class, args);
	}


	@Bean
	ApplicationRunner init(ImageRespository repository){
        List<Image> list = Arrays.asList(
                new Image ("Primera Imagen", "Descripción Primera imagen",
                        "https://videotutoriales.com/maspa/maspa1.jpg", "https://videotutoriales.com/maspa/maspa1-1.jpg"),
                new Image ("Segunda Imagen", "Descripción Segunda imagen",
                        "https://videotutoriales.com/maspa/maspa2.jpg", "https://videotutoriales.com/maspa/maspa2-1.jpg"),
                new Image ("Tercera Imagen", "Descripción Tercera imagen",
                        "https://videotutoriales.com/maspa/maspa3.jpg", "https://videotutoriales.com/maspa/maspa3-1.jpg"),
                new Image ("Cuarta Imagen", "Descripción Cuarta imagen",
                        "https://videotutoriales.com/maspa/maspa5.jpg", "https://videotutoriales.com/maspa/maspa5-1.jpg"),
                new Image ("Quinta Imagen", "Descripción Quinta imagen",
                        "https://videotutoriales.com/maspa/maspa4.jpg", "https://videotutoriales.com/maspa/maspa4-1.jpg"),
                new Image ("Sexta Imagen", "Descripción Sexta imagen",
                        "https://videotutoriales.com/maspa/maspa6.jpg", "https://videotutoriales.com/maspa/maspa6-1.jpg"),
                new Image ("Séptima Imagen", "Descripción Séptima imagen",
                        "https://videotutoriales.com/maspa/maspa7.jpg", "https://videotutoriales.com/maspa/maspa7-1.jpg"),
                new Image ("Octava Imagen", "Descripción Octava  imagen",
                        "https://videotutoriales.com/maspa/maspa8.jpg", "https://videotutoriales.com/maspa/maspa8-1.jpg")
        );


		return args -> {
		    list.forEach(image -> repository.save(image));
			repository.findAll().forEach(System.out::println);
		};

	}
}
