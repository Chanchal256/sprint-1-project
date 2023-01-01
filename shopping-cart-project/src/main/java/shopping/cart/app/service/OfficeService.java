package shopping.cart.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import shopping.cart.app.model.Office;
import shopping.cart.app.response.MessageResponse;

@Component
public interface OfficeService {

	public List<Office> findAll();

	public MessageResponse save(Office office);

	public Optional<Office> getById(long id);

	public List<Office> sortedByState(Office officedetails);

	public List<Office> getByCity(String city);

	public List<Office> paging();

	public Iterable<Office> sorting(Office officedetails);

	Office update(Office office);

	public MessageResponse deleteById(long id);

}