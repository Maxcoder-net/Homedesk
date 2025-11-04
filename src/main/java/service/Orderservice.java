package service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import model.Order;

public interface Orderservice {
	
	
	public  Order CreateOrder(Order ord) ;
	
	public List<Order> getallorders();
	
	
	public void cancelorder(long id);
	

	Order updateorder(Order ord, String status, String string);

	public Order updateorder(Order order, String stas, int id);

	Order updateorder(Order ord, String status, Integer id);


	Order getorder(Order ordr, int id);
	
		

}


