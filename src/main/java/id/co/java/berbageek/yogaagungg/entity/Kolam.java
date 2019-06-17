package id.co.java.berbageek.yogaagungg.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * contributor yogaagungk
 * created date 17/06/19
 */
@Entity
public class Kolam implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long luas;

    @ManyToOne
    @JoinColumn(name = "petani_id")
    private Petani petani;

    public Kolam(Long luas, Petani petani) {
        this.luas = luas;
        this.petani = petani;
    }

    public Kolam() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLuas() {
        return luas;
    }

    public void setLuas(Long luas) {
        this.luas = luas;
    }

    public Petani getPetani() {
        return petani;
    }

    public void setPetani(Petani petani) {
        this.petani = petani;
    }
}
