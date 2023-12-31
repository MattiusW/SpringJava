package pl.bykowski.videoapp.dao.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;

@Entity
public class VideoCassette {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String title;
    private LocalDate productionYear;

    public VideoCassette(){

    }

    public VideoCassette(Long id, String title, LocalDate productionYear){
        this.id = id;
        this.title = title;
        this.productionYear = productionYear;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public LocalDate getProductionYear(){
        return productionYear;
    }

    public void setProductionYear(LocalDate productionYear){
        this.productionYear = productionYear;
    }

}
