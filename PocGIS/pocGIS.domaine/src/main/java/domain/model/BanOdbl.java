package domain.model;

import org.hibernate.annotations.Type;
import org.springframework.data.geo.Point;

import javax.persistence.*;

/**
 * Created by bbonheur on 26/10/2015.
 */
public class BanOdbl {


    @Id
    @Column(name = "gid")
    protected Integer gid;

    @Column(name = "id")
    protected String id;

    @Column(name = "nom_voie")
    protected String nom_voie;

    @Column(name = "id_fantoir")
    protected String id_fantoir;

    @Column(name = "numero")
    protected String  numero;

    @Column(name = "rep")
    protected String rep;

    @Column(name = "code_insee")
    protected String code_insee;

    @Column(name = "code_post")
    protected String code_post;

    @Column(name = "alias")
    protected String alias;

    @Column(name = "nom_ld")
    protected String nom_ld;

    @Column(name = "commune")
    protected String commune;

    @Column(name = "fant_voie")
    protected String fant_voie;

    @Column(name = "fant_ld")
    protected String fant_ld;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "lat", column = @Column(name = "x")),
            @AttributeOverride(name = "long", column = @Column(name = "y"))
    })
    @Type(type = "org.hibernate.spatial.GeometryType")
    protected Point point;


    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom_voie() {
        return nom_voie;
    }

    public void setNom_voie(String nom_voie) {
        this.nom_voie = nom_voie;
    }

    public String getId_fantoir() {
        return id_fantoir;
    }

    public void setId_fantoir(String id_fantoir) {
        this.id_fantoir = id_fantoir;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRep() {
        return rep;
    }

    public void setRep(String rep) {
        this.rep = rep;
    }

    public String getCode_insee() {
        return code_insee;
    }

    public void setCode_insee(String code_insee) {
        this.code_insee = code_insee;
    }

    public String getCode_post() {
        return code_post;
    }

    public void setCode_post(String code_post) {
        this.code_post = code_post;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getNom_ld() {
        return nom_ld;
    }

    public void setNom_ld(String nom_ld) {
        this.nom_ld = nom_ld;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getFant_voie() {
        return fant_voie;
    }

    public void setFant_voie(String fant_voie) {
        this.fant_voie = fant_voie;
    }

    public String getFant_ld() {
        return fant_ld;
    }

    public void setFant_ld(String fant_ld) {
        this.fant_ld = fant_ld;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}
