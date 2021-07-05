package com.example.inventoryservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
@Entity
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Long id;

    @Column(name = "uniq_id")
    private String uniqId;
    @Column
    private String sku;
    @Column(name = "name_title")
    private String nameTitle;
    @Column
    private String description;
    @Column(name = "list_price")
    private Double listPrice;
    @Column(name = "sale_price")
    private Double salePrice;
    @Column
    private String category;
    @Column(name = "category_tree")
    private String categoryTree;
    @Column(name = "average_product_rating")
    private String averageProductRating;
    @Column(name = "product_url" )
    private String productUrl;
    @Column(name = "product_image_urls")
    private String productImageUrls;
    @Column
    private String brand;
    @Column(name = "total_number_reviews")
    private Integer totalNumberReviews;
    @Column
    private String reviews;

    @Column
    private Boolean available;
}
