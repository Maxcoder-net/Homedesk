package model;

import java.util.Objects;

import org.springframework.http.HttpStatusCode;

public class Order   {

	private int orderid;

	private String status;
	
	public int getOrderid() {
		return orderid;
	}

	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getOrderid());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(getOrderid(), other.getOrderid());
	}

	public void setOrderid(int id) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
