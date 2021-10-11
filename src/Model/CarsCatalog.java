/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rao.mah
 */
public class CarsCatalog {
    private ArrayList<Cars> catalog;
    private Date last_Updated;

    public Date getLast_Updated() {
        if (last_Updated == null || last_Updated.equals("")){
                Date date = new Date();  

   return last_Updated = date;
        }
        return last_Updated;
    }

    public void setLast_Updated(Date last_Updated) {
        this.last_Updated = last_Updated;
    }
    public CarsCatalog(){
        this.catalog=new ArrayList<Cars>();
    }
    public ArrayList<Cars> getCatalog() {
        return catalog;
    }

    public void setCatalog(ArrayList<Cars> catalog) {   
        this.catalog = catalog;
    }
    public Cars addNewCar() {
        Cars newCars=new Cars();
        catalog.add(newCars);
        return newCars;
    }
    public void deleteCar(Cars car){
        catalog.remove(car);
    }
}
