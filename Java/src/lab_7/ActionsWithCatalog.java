package lab_7;
import java.util.*;

public class ActionsWithCatalog  {

    public static List<Pharmacy> CreatePharmacyCatalog(){
        List<Pharmacy> pharmacyCatalog = new ArrayList<>();
        pharmacyCatalog.add(new Pharmacy("Ибуфен", "Капсулы", "12.12.2020", "PharmacyNorway", "5,4", "12.11.2021"));
        pharmacyCatalog.add(new Pharmacy("Парацетамол", "Таблетки", "12.07.2020", "БелМедПрепараты", "2,34", "23.04.2021"));
        pharmacyCatalog.add(new Pharmacy("Цитрамон", "Таблетки", "05.08.2018", "БелМедПрепараты", "0,56", "17.09.2019"));
        pharmacyCatalog.add(new Pharmacy("Люголь", "Аэрозоль", "23.05.2013", "МедРФ", "5,67", "31.06.2015"));
        pharmacyCatalog.sort(new Pharmacy.NameComparator());
        return pharmacyCatalog;
    }

    public static List<Pharmacy> sortPharmacyCatalogByPrice(List<Pharmacy> pharmacyCatalog){
        pharmacyCatalog.sort(new Pharmacy.TypeComparator());
        return pharmacyCatalog;
    }

    public static void SearchMedicineByExpiration(List<Pharmacy> pharmacyCatalog, String expiration){
        Interface.catalog.setText(null);
        for (Pharmacy element: pharmacyCatalog) {
            if (element.getExpiration().equals(expiration)){
                Interface.catalog.append(element.toString());
            }
        }
    }
}
