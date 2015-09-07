/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.cracken.code.domain.model.products;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 *
 * @author edcracken
 */
@Document(indexName = "product", type = "product", shards = 1, replicas = 0, refreshInterval = "-1")
public class Product {

    @Id
    private String code;
    private String name;
    private String fullName;
    private Integer dosage;
    private String activeComponent;

    public Product(String code, String name, String fullName, Integer dosage, String activeComponent) {
        this.code = code;
        this.name = name;
        this.fullName = fullName;
        this.dosage = dosage;
        this.activeComponent = activeComponent;
    }

    public Product() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getDosage() {
        return dosage;
    }

    public void setDosage(Integer dosage) {
        this.dosage = dosage;
    }

    public String getActiveComponent() {
        return activeComponent;
    }

    public void setActiveComponent(String activeComponent) {
        this.activeComponent = activeComponent;
    }

}
