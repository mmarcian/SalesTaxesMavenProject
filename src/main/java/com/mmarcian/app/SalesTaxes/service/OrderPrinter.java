package com.mmarcian.app.SalesTaxes.service;

import java.util.Iterator;

import com.mmarcian.app.SalesTaxes.domain.OrderLine;
import  com.mmarcian.app.SalesTaxes.domain.PurchaseOrder;

public class OrderPrinter {
	public static void PrintOrder (PurchaseOrder order){
		
		for (Iterator<String> iterator = order.getOrderLines().keySet().iterator(); iterator.hasNext();) {
			String productName = iterator.next();
			OrderLine orderLine = order.getOrderLines().get(productName);
			System.out.println(orderLine.getQuantity()+" "+productName+ ": "+orderLine.getAmount());	
		}
		System.out.println("Sales Taxes:"+ order.getTotalTaxesAmount());
		System.out.println("Total:"+order.getTotalAmount());
		System.out.println("--------------");
	}
}
