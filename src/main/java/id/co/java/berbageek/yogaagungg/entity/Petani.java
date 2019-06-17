package id.co.java.berbageek.yogaagungg.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * contributor yogaagungk
 * created date 17/06/19
 */
@Entity
public class Petani implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nama_lengkap")
    private String namaLengkap;

    @Column(name = "no_tlp")
    private String noTelp;

    @OneToMany(mappedBy = "petani")
    private List<Kolam> kolams;

    public Petani(String namaLengkap, String noTelp) {
        this.namaLengkap = namaLengkap;
        this.noTelp = noTelp;
    }

    public Petani() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public List<Kolam> getKolams() {
        return kolams;
    }

    public void setKolams(List<Kolam> kolams) {
        this.kolams = kolams;
    }
}
