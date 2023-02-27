package org.fasttrackit.dataprovider;

import org.fasttrackit.products.Product;
import org.testng.annotations.DataProvider;

public class ProductDataProvider {

    @DataProvider(name = "productsDataProvider")
    public static Object[][] createProductsProvider(){
        Product product1 = new Product("1");
        Product product2 = new Product("2");
        Product product3 = new Product("3");
        Product product4 = new Product("4");
        Product product5 = new Product("5");
        Product product6 = new Product("6");
        Product product7 = new Product("7");
        Product product8 = new Product("8");
        Product product9 = new Product("9");
        Product product0 = new Product("0");

        return new Object[][]{new Object[]
                {    product1    },
                {    product2    },
                {    product3    },
                {    product4   },
                {    product5    },
                {    product6   },
                {    product7    },
                {    product8    },
                {    product9    },
                {    product0    },
        };
    }

}
