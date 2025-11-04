package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Order;
import repository.OrderRepository;
import service.Orderservice;

@RestController
@RequestMapping("/api")

public class Maincontroller {

    private final OrderRepository orderRepository;
	
	
	@Autowired
	private Orderservice orderepo;


    Maincontroller(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
	

	@PostMapping("/order")
	public ResponseEntity<Order> createorder(@RequestBody Order order)
	{
		
		return new ResponseEntity<Order>(orderepo.CreateOrder(order),HttpStatus.CREATED);
		
	}

	
	
	@GetMapping("/getall")
	public ResponseEntity<List<Order>> getallorder() {
				
		return new ResponseEntity<List<Order>>(orderepo.getallorders(),HttpStatus.OK);
		
				
	}
	
	
		
	@SuppressWarnings("rawtypes")
	@PutMapping("/editorder/{id}")
	public Order updateorder(@RequestBody Order order,@PathVariable("status") String stas, @PathVariable("id") int id)
	{
		
	 	//return new ResponseEntity<Order>(orderepo.updateorder(order, stas, id),HttpStatus.OK);
	 	
	 	return orderepo.updateorder(order, stas, id);
		
				
	}
	
	
	
	
	@DeleteMapping("/deletorder/{id}")
	public ResponseEntity<HttpStatus> deleteStudent(@PathVariable("id") long id){
		orderepo.cancelorder(id);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
	
	

}
