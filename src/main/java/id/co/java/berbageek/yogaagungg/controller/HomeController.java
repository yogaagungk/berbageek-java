package id.co.java.berbageek.yogaagungg.controller;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * contributor yogaagungk
 * created date 17/06/19
 */
public class HomeController {

    @GetMapping(value = "/")
    public String index() {
        return "index";
    }
}
