package camt.cbsd.lab05.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = false)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String studentId;
    String name;
    String surname;
    double gpa;
    String image;
    boolean feature;
    int penAmount;
    String description;



    public long getId() {
        return id;
    }



    public String getImage() {
        return image;
    }



    public void setImage(String image) {
        this.image = image;
    }



}
