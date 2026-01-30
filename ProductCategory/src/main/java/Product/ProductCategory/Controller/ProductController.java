package Product.ProductCategory.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Product.ProductCategory.DTO.ProductDto;
import Product.ProductCategory.Entity.Product;

@RestController
@RequestMapping("/productController")
public class ProductController {

    List<Product> list = new ArrayList<Product>();

    @PostMapping("/add-product")
    public Product addProduct(@RequestBody Product product) {

        if (product != null) {
            list.add(product);

            System.out.println("Size of DB: " + list.size());

            System.out.println(
                product.getName()
                + " added under Category : "
                + product.getCategory().getCategoryName()
            );
        }

        return product;
    }

    @GetMapping("/get-all")
    public List<ProductDto> getAll() {

        return list.stream().map((p) -> {
            ProductDto dto = new ProductDto();
            dto.setPid(p.getPid());
            dto.setName(p.getName());
            dto.setCategoryName(p.getCategory().getCategoryName());
            return dto;
        }).collect(Collectors.toList());
    }
}
