package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import model.Order;
import repository.OrderRepository;


@Service
public class Orderserviceimpl implements Orderservice {
	
	@Autowired
	private OrderRepository orderepos;

	@Override
	public Order CreateOrder(Order ord) {
		// TODO Auto-generated method stub
		return orderepos.save(ord);
	}
	
	

	@Override
	public List<Order> getallorders() {
		// TODO Auto-generated method stub
		return orderepos.findAll();
	}

	@Override
	public void cancelorder(long id) {
		// TODO Auto-generated method stub
		
		orderepos.deleteById(id);
	
	}
	




	/*
	 * @Override public Order updateorder(Order order, String stas, int id) { //
	 * TODO Auto-generated method stub order.setStatus(stas);
	 * 
	 * order.setOrderid(id); return order; }
	 */


	@Override
	public Order updateorder(Order ord, String status, int id) {
		
		Optional<Order> optinaluser = orderepos.findById(id);
		
		if(optinaluser.isPresent())
		{
			Order ordr = optinaluser.get();
			ordr.setStatus("ok");
			return orderepos.save(ordr);
			
		}
		
		// TODO Auto-generated method stub
		
	
	else {
		
		throw new RuntimeException("not"+id);
	}
	}



	@Override
	public Order updateorder(Order ord, String status, String string) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Order updateorder(Order ord, String status, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Order getorder(Order ordr, int id) {
		// TODO Auto-generated method stub
		Optional<Order> optinaluser = orderepos.findById(id);
		if(optinaluser.isPresent())
		{
			Order ordr1 = optinaluser.get();
			
		
	}
		return ordr;
		}
}
	





