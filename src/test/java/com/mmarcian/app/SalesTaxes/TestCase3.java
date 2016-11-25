package com.mmarcian.app.SalesTaxes;


import java.math.BigDecimal;

import com.mmarcian.app.SalesTaxes.domain.Product;
import com.mmarcian.app.SalesTaxes.domain.ProductType;

public class TestCase3 extends TestCommon {


    public TestCase3(String name) {
		super(name);
	}

	public void testCase3() throws Exception {

		Product importedPerfume = new Product ("imported bottle of perfume", new BigDecimal("27.99"),ProductType.COSMETIC,true);
		order.addProduct(importedPerfume, 1);
		
		Product localPerfume = new Product ("bottle of perfume", new BigDecimal("18.99"),ProductType.COSMETIC,false);
		order.addProduct(localPerfume, 1);
		
		Product headachePills = new Product ("packet of headache pills",new BigDecimal("9.75"),ProductType.MEDICAL,false);
		order.addProduct(headachePills, 1);
		
		Product chocolateBox = new Product ("box of imported chocolates",new BigDecimal("11.25"),ProductType.FOOD,true);
		order.addProduct(chocolateBox, 1);
		
		assertTrue( order.getTotalAmount().equals(new BigDecimal("74.68")));
		assertTrue( order.getTotalTaxesAmount().equals(new BigDecimal("6.70")));
		
    }
}