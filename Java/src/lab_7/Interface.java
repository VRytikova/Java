package lab_7;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Interface extends JFrame {
    List<Pharmacy> pharmacyCatalog = new ArrayList<>(ActionsWithCatalog.CreatePharmacyCatalog());

    static JButton add, delete, edit, sort, search, showData;
    static JTextField searchExpiration, name, form, date, manufacturer, price, expiration,
            indexToDelete, indexToEdit, name2, form2, date2, manufacturer2, price2, expiration2;
    static JTextArea catalog;
    static JLabel lSearchExpiration, lname, lform, ldate, lmanufacturer, lprice, lexpiration,
            lindexToDelete, lindexToEdit, lname2, lform2, ldate2, lmanufacturer2, lprice2, lexpiration2, error;

    public Interface(String str) {
        super(str);

        setSize(1050, 500);
        setBackground(Color.pink);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        lSearchExpiration = new JLabel("Искомый срок годности:");
        lname = new JLabel("Наименование:");
        lform = new JLabel("Форма выпуска:");
        ldate = new JLabel("Дата выпуска:");
        lmanufacturer = new JLabel("Производитель:");
        lprice = new JLabel("Цена:");
        lexpiration = new JLabel("Срок годности:");
        lindexToDelete = new JLabel("Введите индекс элемента для удаления: ");
        lindexToEdit = new JLabel("Введите индекс элемента для редактирования: ");
        lname2 = new JLabel("Наименование:");
        lform2 = new JLabel("Форма выпуска:");
        ldate2 = new JLabel("Дата выпуска:");
        lmanufacturer2 = new JLabel("Производитель:");
        lprice2 = new JLabel("Цена:");
        lexpiration2 = new JLabel("Срок годности:");
        error = new JLabel("Error");
        error.setForeground(Color.red);

        searchExpiration = new JTextField();
        name = new JTextField();
        form = new JTextField();
        date = new JTextField();
        manufacturer = new JTextField();
        price = new JTextField();
        expiration = new JTextField();
        name2 = new JTextField();
        form2 = new JTextField();
        date2 = new JTextField();
        manufacturer2 = new JTextField();
        price2 = new JTextField();
        expiration2 = new JTextField();
        indexToDelete = new JTextField();
        indexToEdit = new JTextField();

        add = new JButton("Добавить");
        delete = new JButton("Удалить");
        edit = new JButton("Редактировать");
        sort = new JButton("Сортировать");
        search = new JButton("Найти");
        showData = new JButton(("Показать данные об элементе"));

        catalog = new JTextArea();
        catalog.setEditable(false);
        PrintTextToTextArea(pharmacyCatalog);


        setLayout(null);
        catalog.setLocation(20, 15);
        catalog.setSize(1000, 100);
        sort.setLocation(20, 125);
        sort.setSize(150, 30);
        lSearchExpiration.setLocation(190, 125);
        lSearchExpiration.setSize(150, 30);
        searchExpiration.setLocation(345, 125);
        searchExpiration.setSize(150, 30);
        search.setLocation(495, 125);
        search.setSize(70, 30);

        add.setLocation(590, 190);
        add.setSize(90, 30);
        lname.setLocation(20, 165);
        lname.setSize(90, 30);
        lform.setLocation(145, 165);
        lform.setSize(40, 30);
        ldate.setLocation(230, 165);
        ldate.setSize(50, 30);
        lmanufacturer.setLocation(310, 165);
        lmanufacturer.setSize(70, 30);
        lprice.setLocation(390, 165);
        lprice.setSize(90, 30);
        lexpiration.setLocation(490, 165);
        lexpiration.setSize(100, 30);
        name.setLocation(20, 190);
        name.setSize(90, 30);
        form.setLocation(120, 190);
        form.setSize(80, 30);
        date.setSize(80, 30);
        date.setLocation(210, 190);
        manufacturer.setLocation(310, 190);
        manufacturer.setSize(40, 30);
        price.setLocation(380, 190);
        price.setSize(80, 30);
        expiration.setSize(90, 30);
        expiration.setLocation(490, 190);

        lindexToDelete.setSize(260, 30);
        lindexToDelete.setLocation(20, 230);
        indexToDelete.setSize(30, 30);
        indexToDelete.setLocation(265, 230);
        delete.setSize(90, 30);
        delete.setLocation(305, 230);

        lindexToEdit.setLocation(20, 285);
        lindexToEdit.setSize(290, 30);
        indexToEdit.setLocation(305, 285);
        indexToEdit.setSize(30, 30);
        showData.setLocation(335, 285);
        showData.setSize(220, 30);
        edit.setLocation(590, 340);
        edit.setSize(130, 30);
        lname2.setLocation(20, 315);
        lname2.setSize(90, 30);
        lform2.setLocation(145, 315);
        lform2.setSize(40, 30);
        ldate2.setLocation(230, 315);
        ldate2.setSize(50, 30);
        lmanufacturer2.setLocation(310, 315);
        lmanufacturer2.setSize(70, 30);
        lprice2.setLocation(390, 315);
        lprice2.setSize(90, 30);
        lexpiration2.setLocation(490, 315);
        lexpiration2.setSize(100, 30);
        name2.setLocation(20, 340);
        name2.setSize(90, 30);
        form2.setLocation(120, 340);
        form2.setSize(80, 30);
        date2.setSize(80, 30);
        date2.setLocation(210, 340);
        manufacturer2.setLocation(310, 340);
        manufacturer2.setSize(40, 30);
        price2.setLocation(380, 340);
        price2.setSize(80, 30);
        expiration2.setSize(90, 30);
        expiration2.setLocation(490, 340);


        add(catalog);
        add(sort);
        add(lSearchExpiration);
        add(searchExpiration);
        add(search);
        add(add);
        add(lname);
        add(lform);
        add(ldate);
        add(lmanufacturer);
        add(lprice);
        add(lexpiration);
        add(name);
        add(form);
        add(date);
        add(manufacturer);
        add(price);
        add(expiration);
        add(lindexToDelete);
        add(indexToDelete);
        add(delete);
        add(lindexToEdit);
        add(indexToEdit);
        add(edit);
        add(lname2);
        add(lform2);
        add(ldate2);
        add(lmanufacturer2);
        add(lprice2);
        add(lexpiration2);
        add(name2);
        add(form2);
        add(date2);
        add(manufacturer2);
        add(price2);
        add(expiration2);
        add(showData);
        add(error);

        sort.addActionListener(new SortActionListener());
        search.addActionListener(new SearchActionListener());
        add.addActionListener(new AddActionListener());
        delete.addActionListener(new DeleteActionListener());
        edit.addActionListener(new EditActionListener());
        showData.addActionListener(new ShowDataActionListener());
    }

    public void PrintTextToTextArea(List<Pharmacy> pharmacyCatalog) {
        catalog.setText(null);
        for (Pharmacy element : pharmacyCatalog) {
            catalog.append(element.toString());
        }
    }


    public class SortActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == sort) {
                PrintTextToTextArea(ActionsWithCatalog.sortPharmacyCatalogByPrice(pharmacyCatalog));
            }
        }
    }

    public class SearchActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == search) {
                ActionsWithCatalog.SearchMedicineByExpiration(pharmacyCatalog, searchExpiration.getText());
            }
        }
    }

    public class AddActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == add) {
                    pharmacyCatalog.add(new Pharmacy(name.getText(), form.getText(), date.getText(), manufacturer.getText(), price.getText(), expiration.getText()));
                    pharmacyCatalog.sort(new Pharmacy.NameComparator());
                    name.setText(null);
                    form.setText(null);
                    date.setText(null);
                    manufacturer.setText(null);
                    expiration.setText(null);
                    price.setText(null);
                    PrintTextToTextArea(pharmacyCatalog);
                }

            } catch (NumberFormatException exception) {
                error.setSize(200, 30);
                error.setLocation(685, 190);
            }
        }
    }

    public class DeleteActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == delete) {
                    pharmacyCatalog.remove(Integer.parseInt(indexToDelete.getText()) - 1);
                    pharmacyCatalog.sort(new Pharmacy.NameComparator());
                    PrintTextToTextArea(pharmacyCatalog);
                }
            } catch (IndexOutOfBoundsException exception) {
                error.setSize(200, 30);
                error.setLocation(400, 230);
            } catch (NumberFormatException exception2) {
                error.setSize(200, 30);
                error.setLocation(400, 230);
            }
        }
    }

    public class ShowDataActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == showData) {
                    name2.setText(pharmacyCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).getName());
                    form2.setText(pharmacyCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).getForm());
                    date2.setText(pharmacyCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).getDate());
                    manufacturer2.setText(String.valueOf(pharmacyCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).getManufacturer()));
                    price2.setText(pharmacyCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).getPrice());
                    expiration2.setText(pharmacyCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).getExpiration());
                }

            } catch (IndexOutOfBoundsException exception) {
                error.setSize(200, 30);
                error.setLocation(560, 285);
            } catch (NumberFormatException exception2) {
                error.setSize(200, 30);
                error.setLocation(560, 285);
            }
        }
    }

    public class EditActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == edit) {

                    pharmacyCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).setName(name2.getText());
                    pharmacyCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).setForm(form2.getText());
                    pharmacyCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).setDate(date2.getText());
                    pharmacyCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).setManufacturer(manufacturer2.getText());
                    pharmacyCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).setPrice(price2.getText());
                    pharmacyCatalog.get(Integer.parseInt(indexToEdit.getText()) - 1).setExpiration(expiration2.getText());
                    pharmacyCatalog.sort(new Pharmacy.NameComparator());
                    PrintTextToTextArea(pharmacyCatalog);

                }
            } catch (NumberFormatException exception) {
                error.setSize(200, 30);
                error.setLocation(725, 340);
            }
        }
    }
}
