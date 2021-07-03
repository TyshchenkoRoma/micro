package com.example.catalogservice.service;

import com.example.catalogservice.entity.Product;
import lombok.Getter;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Getter
@Service
public class CatalogService {

    private final Map<String, Product> data = new HashMap<>();

//    @PostConstruct
//    public void init() {
//        data.put("b6c0b6bea69c722939585baeac73c13d", new Product(
//                "b6c0b6bea69c722939585baeac73c13d",
//                "pp5006380337",
//                "Alfred Dunner® Essential Pull On Capri Pant",
//                "You'll return to our Alfred Dunner pull-on capris again and again when you want an updated, casual look and all the comfort you love.   elastic waistband approx. 19-21\" inseam slash pockets polyester washable imported",
//                41.09,
//                24.16,
//                "alfred dunner",
//                "jcpenney|women|alfred dunner",
//                "4.7 out of 5",
//                "http://www.jcpenney.com/alfred-dunner-essential-pull-on-capri-pant/prod.jump?ppId=pp5006380337&catId=cat1002110079&&_dyncharset=UTF-8&urlState=/women/shop-brands/alfred-dunner/yellow/_/N-gkmp33Z132/cat.jump",
//                "http://s7d9.scene7.com/is/image/JCPenney/DP1228201517142050M.tif?hei=380&amp;wid=380&op_usm=.4,.8,0,0&resmode=sharp2&op_usm=1.5,.8,0,0&resmode=sharp",
//                "Alfred Dunner",
//                12,
//                "{\"review\"=>[{\"review_1\"=>\"You never have to worry about the fit...Alfred Dunner clothing sizes are true to size and fits perfectly. Great value for the money.\"}, {\"review_2\"=>\"Good quality fabric. Perfect fit. Washed very well no iron.\"}, {\"review_3\"=>\"I do not normally wear pants or capris that have an elastic waist, but I decided to try these since they were on sale and I loved the color. I was very surprised at how comfortable they are and wear really well even wearing all day. I will buy this style again!\"}, {\"review_4\"=>\"I love these capris! They fit true to size and are so comfortable to wear. I am planning to order more of them.\"}, {\"review_5\"=>\"This product is very comfortable and the fabric launders very well\"}, {\"review_6\"=>\"I did not like the fabric. It is 100% polyester I thought it was different.I bought one at the store apprx two monts ago, and I thought it was just like it\"}, {\"review_7\"=>\"What a great deal. Beautiful Pants. Its more than I expected.\"}, {\"review_8\"=>\"Alfred Dunner has great pants, good fit and very comfortable\"}],}",
//                true
//        ));
    //   }
}
