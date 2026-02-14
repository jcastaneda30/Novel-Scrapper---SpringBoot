package com.novelscrapper.novelscrapper.scrapper;
import jakarta.persistence.Id;
import org.hibernate.validator.constraints.URL;
import jakarta.persistence.Entity;

@Entity
public class ScrapperModel {
    
    @Id
    private String name;
    
//    @URL(protocol = "https")
    private String baseURL;
}
