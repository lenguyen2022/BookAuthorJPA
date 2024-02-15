package ca.lenguyen.bookauthorjpa.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    InventoryService inventoryService;

}
