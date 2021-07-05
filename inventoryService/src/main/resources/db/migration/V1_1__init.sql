create table product
(
    id                     int primary key,
    uniq_id                varchar(200) null,
    sku                    varchar(200) null,
    name_title             varchar(200) null,
    description            varchar(200) null,
    list_price             DECIMAL      null,
    sale_price             DECIMAL      null,
    category               varchar(200) null,
    category_tree          varchar(200) null,
    average_product_rating varchar(200) null,
    product_url            varchar(200) null,
    product_image_urls     varchar(200) null,
    brand                  varchar(200) null,
    total_number_reviews   int          null,
    reviews                varchar(200) null,
    available              boolean
);
