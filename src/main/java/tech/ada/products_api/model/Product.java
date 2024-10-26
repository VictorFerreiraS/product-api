package tech.ada.products_api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Entity
@Table(name = "tb_product")
@Getter
@Setter
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(unique = true, nullable = false)
private String sdk;
@Column(nullable = false)
private String name;
private String description;
@Column(nullable = false, precision = 16, scale = 2)
private BigDecimal price;
private  Double wheigth;
}
