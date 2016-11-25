package com.mmarcian.app.SalesTaxes;


import java.math.BigDecimal;

import com.mmarcian.app.SalesTaxes.domain.Product;
import com.mmarcian.app.SalesTaxes.domain.ProductType;

public class TestCase4 extends TestCommon {


    public TestCase4(String name) {
		super(name);
	}

	public void testCase4() throws Exception {

		Product importedPerfume = new Product ("importedPerfume", new BigDecimal("27.99"),ProductType.COSMETIC,true);
		order.addProduct(importedPerfume, 2);
		assertEquals(order.getTotalAmount(),new BigDecimal("64.38"));
		assertEquals(order.getTotalTaxesAmount(),new BigDecimal("8.40"));
		
    }
}