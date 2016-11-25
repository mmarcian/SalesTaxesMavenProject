package com.mmarcian.app.SalesTaxes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mmarcian.app.SalesTaxes.domain.BaseTax;
import com.mmarcian.app.SalesTaxes.domain.ImportTax;
import com.mmarcian.app.SalesTaxes.domain.PurchaseOrder;
import com.mmarcian.app.SalesTaxes.domain.SalesTax;
import com.mmarcian.app.SalesTaxes.service.OrderPrinter;

import junit.framework.TestCase;

public abstract class TestCommon extends TestCase{

    public TestCommon(String name) {
        super( name );
    }
    
    PurchaseOrder order;

	protected void setUp() throws Exception {
		/*
		 * the idea in a proper application would be to build the order with a factory, so you can have different kind of orders
		 * with different kind of applied taxes
		 */
		List <BaseTax> taxes =  new ArrayList<BaseTax>(
			    Arrays.asList(new SalesTax(),
			    			  new ImportTax())
			    			  );
		order= new PurchaseOrder(taxes);
	}

	protected void tearDown() throws Exception {
		OrderPrinter.PrintOrder(order);
	}

}
