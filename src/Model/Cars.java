/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author rao.mah
 */
public class Cars {
    private String name;
    private boolean available;
    private String manufactured_by;
    private int manufacturing_year;
    private byte seat;
    private String serial_number;
    private String model_number;
    private boolean maintanance_certificate;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean Available() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getManufactured_by() {
        return manufactured_by;
    }

    public void setManufactured_by(String manufactured_by) {
        this.manufactured_by = manufactured_by;
    }

    public int getManufactured_year() {
        return manufacturing_year;
    }

    public void setManufactured_year(int manufacturing_year) {
        this.manufacturing_year = manufacturing_year;
    }

    public byte getSeats() {
        return seat;
    }

    public void setSeats(byte seat) {
        this.seat = seat;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public String getModel_number() {
        return model_number;
    }

    public void setModel_number(String model_number) {
        this.model_number = model_number;
    }

    public boolean getmaintanance_certificate() {
        return maintanance_certificate;
    }

    public void setmaintanance_certificate(boolean maintanance_certificate) {
        this.maintanance_certificate = maintanance_certificate;
    }

    public String getlocation() {
        return location;
    }

    public void setlocation(String location) {
        this.location = location;
    }
    @Override
    public String toString(){
    return name;
    }
   }
