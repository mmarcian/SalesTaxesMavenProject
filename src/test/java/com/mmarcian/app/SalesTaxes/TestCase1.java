package com.mmarcian.app.SalesTaxes;


import java.math.BigDecimal;

import com.mmarcian.app.SalesTaxes.domain.Product;
import com.mmarcian.app.SalesTaxes.domain.ProductType;

public class TestCase1 extends TestCommon {


    public TestCase1(String name) {
		super(name);
	}

	public void testCase1() throws Exception {

		Product book = new Product("book", new BigDecimal("12.49"), ProductType.BOOK, false);
		order.addProduct(book, 1);
		
		Product musicCd = new Product ("music cd", new BigDecimal("14.99"),ProductType.MUSIC,false);
		order.addProduct(musicCd, 1);
		
		Product chocolateBar = new Product ("chocolate bar",new BigDecimal("0.85"),ProductType.FOOD,false);
		order.addProduct(chocolateBar, 1);
		assertTrue( order.getTotalAmount().equals(new BigDecimal("29.83")));
		assertTrue( order.getTotalTaxesAmount().equals(new BigDecimal("1.50")));
    }
}