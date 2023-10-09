/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esinf;

import java.time.LocalDate;
import java.util.*;

/**
 *
 * @author DEI-ISEP
 */
public class Supermarket {
    Map <Invoice, Set<Product>> sup;
    
    Supermarket() {
        sup = new HashMap<>();
    }
    
    // Reads invoices from a list of String
    void getInvoices(List <String> l) throws Exception {
        Invoice i = null;
        for (String s : l){
            String[] split = s.split(",");
            if (split[0].equals("P")){
                Product p = new Product(split[1], Integer.parseInt(split[2]), Long.parseLong(split[3]));
                if (i == null) {
                    throw new Exception("No Key previously created with type I");
                }
                else {
                    sup.get(i).add(p);
                }
            }
            else if (split[0].equals("I")){
                i = new Invoice(split[1], split[2]);
                sup.put(i, new HashSet<>());
            }
            else{
                throw new Exception("Invalid type of data");
            }
        }
    }   
    
    // returns a set in which each number is the number of products in the r
    // invoice
    Map<Invoice, Integer> numberOfProductsPerInvoice() {
        Map<Invoice, Integer> map = new HashMap<>();
        for (Invoice i : sup.keySet()) {
            int count = 0;
            for (Product product : sup.get(i)) {
                count++;
            }
            map.put(i, count);
        }
        return map;
    }

    // returns a Set of invoices in which each date is >d1 and <d2
    Set<Invoice> betweenDates(LocalDate d1, LocalDate d2) {
        Set<Invoice> set = new HashSet<>();
        for(Invoice i : sup.keySet()){
            if(i.getDate().isAfter(d1) && i.getDate().isBefore(d2)){
                set.add(i);
            }
        }
        return set;
    }
    
    // returns the sum of the price of the product in all the invoices
    long totalOfProduct(String productId) {
        long value = 0;
        for(Invoice i : sup.keySet()){
            for(Product p : sup.get(i)){
                if(productId.equals(p.getIdentification()))
                    value += (p.getPrice()) * (p.getQuantity());
            }
        }
        return value;
    }

    
    // converts a map of invoices and products to a map which key is a product
    // identification and the values are a set of the invoices in which it appears
    Map<String, Set<Invoice>> convertInvoices() {
        Map<String,Set<Invoice>> map = new HashMap<>();
        for(Invoice i : sup.keySet()){
            for(Product p : sup.get(i)){
                if(!map.containsKey(p.getIdentification())){
                    map.put(p.getIdentification(),new HashSet<>());
                }
                map.get(p.getIdentification()).add(i);
            }
        }
        return map;
    }
}