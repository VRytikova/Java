package lab_7;

import java.util.Comparator;

public class Pharmacy {
    private String name;
    private String form;
    private String date;
    private String manufacturer;
    private String price;
    private String expiration;

    public Pharmacy(String name, String form, String date, String manufacturer, String price, String expiration) {
        this.name = name;
        this.form = form;
        this.date = date;
        this.manufacturer = manufacturer;
        this.price = price;
        this.expiration = expiration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    @Override
    public String toString() {
        return
                " Наименование: " + name +
                        " /Форма выпуска: " + form +
                        " /Дата выпуска: " + date +
                        " /Производитель: " + manufacturer +
                        " /Цена: " + price +
                        " /Срок годности " + expiration + ' '+"\n" ;
    }


    public static class TypeComparator implements Comparator<Pharmacy>{

        @Override
        public int compare(Pharmacy o1, Pharmacy o2) {
            return o1.price.compareTo(o2.price);
        }

    }

    public static class NameComparator implements Comparator<Pharmacy>{
        @Override
        public int compare(Pharmacy o1, Pharmacy o2) {
            return o1.expiration.compareTo(o2.expiration);
        }
    }
}