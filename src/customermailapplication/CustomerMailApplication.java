/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customermailapplication;

import java.util.Scanner;

class CustomerMailApplication {

    public static void main(String[] args) {
        CustomerFactory ctm = new CustomerFactory ();
    
    Customer order1 = CustomerFactory.order("Delinquent");  // order เป็น static ต้องอ้างอิงชื่อ class ใหญ่
        order1.brew();

        Customer order2 = CustomerFactory.order("Mountain");
        order2.brew();

        Customer order3 = CustomerFactory.order("Regular");
        order3.brew();
    }

}
