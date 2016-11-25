# SalesTaxesProject <br />
Quick explaination about the logic <br />
The implementation strongly relies on the domain, every action here is implemented within domain classes. <br />
The purchase order is processed in this way: <br />
-first of all we call tax instances that we are going to need for a specific order. Things are done in a way that every tax can implement his own rules (not all rekated to the same fields in a taxed product) <br />
-we create a PurchaseOrder: this is done by calling the constructor passing as argument the tax instances. <br />
-we add product(s) to the order line. Every time a product is passed, taxes are calculated and stored runtime. Each modification also updates the order total amount and the order total taxes <br />
-an order line can be updated several time if the same product is added more than once <br />
-once the adding of product is done, the order is printed by a dedicated service <br />
