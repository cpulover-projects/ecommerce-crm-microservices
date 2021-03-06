package com.cpulover.customerservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.cpulover.customerservice.Customer;
import com.cpulover.customerservice.AddressResponse.Address;

import lombok.Data;

@FeignClient(name = "address-service")
public interface AddressServiceProxy {

	@GetMapping("addresses/customerId/{id}/port")
	public AddressResponse getAddressWithPortByCustomerId(@PathVariable long id);
}
