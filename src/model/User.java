
package model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class User {
    private final SimpleIntegerProperty identyfikator;
    private final SimpleStringProperty imie;
    private final SimpleStringProperty nazwisko;
    private final SimpleStringProperty pesel;
    private final SimpleStringProperty miasto;
    private final SimpleStringProperty ulica;
    
 
    public User(String imie, String nazwisko, String pesel) {
        this.imie = new SimpleStringProperty(imie);
        this.nazwisko = new SimpleStringProperty(nazwisko);
        this.pesel = new SimpleStringProperty(pesel);
        miasto = new SimpleStringProperty(null);
        ulica = new SimpleStringProperty(null);
        identyfikator = new SimpleIntegerProperty(14);
    }
     
    public User(String imie, String nazwisko, String pesel, String miasto, String ulica) {
        this.imie = new SimpleStringProperty(imie);
        this.nazwisko = new SimpleStringProperty(nazwisko);
        this.pesel = new SimpleStringProperty(pesel);
        this.miasto = new SimpleStringProperty(miasto);
        this.ulica = new SimpleStringProperty(ulica);
        identyfikator = new SimpleIntegerProperty();
    }
    
     public User(int id, String imie, String nazwisko, String pesel, String miasto, String ulica) {
        this.imie = new SimpleStringProperty(imie);
        this.nazwisko = new SimpleStringProperty(nazwisko);
        this.pesel = new SimpleStringProperty(pesel);
        this.miasto = new SimpleStringProperty(miasto);
        this.ulica = new SimpleStringProperty(ulica);
        this.identyfikator = new SimpleIntegerProperty(id);
    }
    
    public int getidentyfikator(){
        return identyfikator.get();
    } 
    
    public void setidentyfikator(int liczba){
        identyfikator.set(liczba);
    }
    
    public String getImie() {
        return imie.get();
    }
    public void setImie(String imie) {
        this.imie.set(imie);
    }
        
    public String getNazwisko() {
        return nazwisko.get();
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko.set(nazwisko);
    }
    
    public String getPesel() {
        return pesel.get();
    }
    public void setPesel(String pesel) {
        this.pesel.set(pesel);
    }
    
    public String getMiasto(){
        return miasto.get();
    }
    public void setMiasto(String miasto){
        this.miasto.set(miasto);
    }
        
    public String getUlica(){
        return ulica.get();
    }
    
    public void setUlica(String ulica){
        this.ulica.set(ulica);
    }
    
    @Override
    public String toString(){
        return "ID: ["+ identyfikator + "]" + "Imię: " + imie + " Nazwisko : " + nazwisko;
    }
   
}