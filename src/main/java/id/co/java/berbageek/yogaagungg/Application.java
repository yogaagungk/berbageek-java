package id.co.java.berbageek.yogaagungg;

import id.co.java.berbageek.yogaagungg.entity.Kolam;
import id.co.java.berbageek.yogaagungg.entity.Petani;
import id.co.java.berbageek.yogaagungg.repository.KolamRepository;
import id.co.java.berbageek.yogaagungg.repository.PetaniRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    private final PetaniRepository petaniRepository;

    private final KolamRepository kolamRepository;

    public Application(PetaniRepository petaniRepository, KolamRepository kolamRepository) {
        this.petaniRepository = petaniRepository;
        this.kolamRepository = kolamRepository;
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    InitializingBean init() {
        return () -> {
            Petani petani = new Petani();
            petani.setNamaLengkap("Dadang");
            petani.setNoTelp("0892182184911");

            petaniRepository.save(petani);

            Kolam kolam = new Kolam();
            kolam.setLuas(1000L);
            kolam.setPetani(petani);

            kolamRepository.save(kolam);
        };
    }

}
