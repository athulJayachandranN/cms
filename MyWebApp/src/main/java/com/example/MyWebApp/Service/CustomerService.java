package com.example.MyWebApp.Service;

import com.example.MyWebApp.Model.Customer;
import com.example.MyWebApp.dao.CustomerDAO;
import com.example.MyWebApp.execption.CustomerNotFoundExecption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CustomerService {

    @Autowired
    private CustomerDAO customerDAO;
//    private int customerIdCount=1;
//    private List<Customer>customerList=new CopyOnWriteArrayList<>();
    public  Customer addCustomer(Customer customer){
//        customer.setCustomerId(customerIdCount);
//        customerList.add(customer);
//        customerIdCount++;
//        return  customer;
        return customerDAO.save(customer);
    }
    public List<Customer> getCustomers(){
//        return customerList;
        return (List<Customer>) customerDAO.findAll();
    }

    public Customer getCustomer(int customerId){
        Optional<Customer> optionalCustomer=customerDAO.findById(customerId);
        if (!optionalCustomer.isPresent()){
            throw new CustomerNotFoundExecption("customer record is not available..");
        }
//        return  customerList.stream().filter(c->c.getCustomerId()==customerId)
//                .findFirst().get();
        return optionalCustomer.get();
    }
    public Customer updateCustomer(int customerId,Customer customer){
//        customerList.stream()
//                .forEach(c->{
//                    if (c.getCustomerId()==customerId){
//                        c.setCustomerFirstName(customer.getCustomerFirstName());
//                        c.setCustomerLastName(customer.getCustomerLastName());
//                        c.setCustomerEmail(customer.getCustomerEmail());
//                    }
//                });
//
//        return customerList
//                .stream()
//                .filter(c->c.getCustomerId()==customerId)
//                .findFirst()
//                .get();

        customer.setCustomerId(customerId);
        return  customerDAO.save(customer);

    }

    public void deleteCustomer(int customerId){
//        customerList.stream()
//                .forEach(c->{
//                    if (c.getCustomerId()==customerId){
//                        customerList.remove(c);
//                    }
//                });
//
        customerDAO.deleteById(customerId);

    }
}
