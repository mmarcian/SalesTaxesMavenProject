package com.mmarcian.app.SalesTaxes;


import java.math.BigDecimal;

import com.mmarcian.app.SalesTaxes.domain.Product;
import com.mmarcian.app.SalesTaxes.domain.ProductType;

public class TestCase2 extends TestCommon {


    public TestCase2(String name) {
		super(name);
	}

	public void testCase2() throws Exception {

		Product chocolateBox = new Product ("imported box of chocolates",new BigDecimal("10"),ProductType.FOOD,true);
		order.addProduct(chocolateBox, 1);
		
		Product perfume = new Product ("imported bottle of perfume", new BigDecimal("47.50"),ProductType.COSMETIC,true);
		order.addProduct(perfume, 1);
		
		assertTrue( order.getTotalAmount().equals(new BigDecimal("65.15")));
		assertTrue( order.getTotalTaxesAmount().equals(new BigDecimal("7.65")));
		
    }
}