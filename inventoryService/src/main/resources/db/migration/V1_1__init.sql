create table inventory
(
    id                     int primary key,
    uniq_id                varchar(200) null,
    sku                    varchar(200) null,
    available              boolean
);
