/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customermailapplication;

/**
 *
 * @author DELL
 */
public class CustomerFactory {

    public  static Customer order(String fType) {
        if (fType.equals("Delinquent")) {
            return new DelinquentCustomer();
        } else if (fType.equals("Mountain")) {
            return new MountainCustomer();

        } else if (fType.equals("Regular")) {
            return new RegularCustomer();
        }

        return null;

    }

}
