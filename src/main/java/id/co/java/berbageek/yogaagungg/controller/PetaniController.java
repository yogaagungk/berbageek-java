package id.co.java.berbageek.yogaagungg.controller;

import id.co.java.berbageek.yogaagungg.repository.PetaniRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * contributor yogaagungk
 * created date 17/06/19
 */
@Controller
public class PetaniController {

    private final PetaniRepository petaniRepository;

    public PetaniController(PetaniRepository petaniRepository) {
        this.petaniRepository = petaniRepository;
    }

    @GetMapping(value = "/petani")
    public String index(Model model) {
        model.addAttribute("petanies", petaniRepository.findAll());

        return "petani/index";
    }
}
