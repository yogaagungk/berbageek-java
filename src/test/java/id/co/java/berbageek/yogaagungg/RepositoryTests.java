package id.co.java.berbageek.yogaagungg;

import id.co.java.berbageek.yogaagungg.repository.KolamRepository;
import id.co.java.berbageek.yogaagungg.repository.PetaniRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * contributor yogaagungk
 * created date 17/06/19
 */
@SpringBootTest(classes = ApplicationTests.class)
public class RepositoryTests {

    @Autowired
    private KolamRepository kolamRepository;

    @Autowired
    private PetaniRepository petaniRepository;
}
