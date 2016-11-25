package com.mmarcian.app.SalesTaxes;


import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import com.mmarcian.app.SalesTaxes.domain.Product;
import com.mmarcian.app.SalesTaxes.domain.ProductType;

public class TestCase5 extends TestCommon {


    public TestCase5(String name) {
		super(name);
	}

	public void testCase5() throws Exception {

		Product importedPerfume = new Product ("importedPerfume", new BigDecimal("27.99"),ProductType.COSMETIC,true);
		order.addProduct(importedPerfume, 1);
		
		Product importedPerfume2 = new Product ("importedPerfume", new BigDecimal("27.99"),ProductType.COSMETIC,true);
		order.addProduct(importedPerfume2, 1);
		assertEquals(order.getTotalAmount(),new BigDecimal("64.38"));
		assertEquals(order.getTotalTaxesAmount(),new BigDecimal("8.40"));
		
    }
}