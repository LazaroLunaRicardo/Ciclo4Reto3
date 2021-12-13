package com.cuatroa.retotres.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Esta clase modela una coleccion de productos, e incluye cada uno de sus campos. Muchos de los proyectos incluyen
 * un identificador de tipo String denominado referencia (reference). Sin embargo es importante resaltar que algunos de los proyectos tienen
 * un identificador de tipo Integer como:
 * El Mercader LTDA         (G1)
 * Ocho Bits LTDA           (G2)
 * El Cacharrero            (G3)
 * Te lo Reparo LTDA        (G5)
 * Blanquita LTDA           (G20) 
 * Hogar Casa Limpia LTDA   (G21)
 * 
 * @author desaextremo
 */
@Document(collection = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Accessory {
    @Id
    private Integer id;
    private String  brand;
    private String model;
    private String procesor;
    private String os;
    private String description;
    private String memory;
    private String hardDrive;
    private Boolean availability;
    private Double price;
    private Integer quantity;
    private String photography; 
}
