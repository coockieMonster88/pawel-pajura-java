package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    @DirtiesContext
    public void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("Pralka");
        Product product2 = new Product("Suszarka");
        Invoice invoice = new Invoice("FV1/2018");
        Item item1 = new Item(product1,new BigDecimal("1300"),1,new BigDecimal("1300"),invoice);
        Item item2 = new Item(product1,new BigDecimal("1100"),1,new BigDecimal("1100"),invoice);
        Item item3 = new Item(product2,new BigDecimal("200"),1,new BigDecimal("200"),invoice);

        product1.getItems().add(item1);
        product1.getItems().add(item2);
        product2.getItems().add(item3);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //when
        productDao.save(product1);
        productDao.save(product2);
        invoiceDao.save(invoice);
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);

        //Then
        int result = invoice.getId();
        Invoice retrievedInvoice = invoiceDao.findById(result).get(0);

        Assert.assertEquals("FV1/2018",retrievedInvoice.getNumber());
        Assert.assertEquals(3, retrievedInvoice.getItems().size());
    }

}
