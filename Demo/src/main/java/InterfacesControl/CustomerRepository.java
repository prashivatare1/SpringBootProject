package InterfacesControl;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resort.management.Demo.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {
	

}
