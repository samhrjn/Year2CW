/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PCPart;

/**
 *
 * @author Sujal, Bibek, Ashwin, Saurav
 */
public class PCComponent {
    public String prodNo, comName, prodType, prodName, warrn, homeDel, quan, price;
    
                    //Accepts values for the respective string and assigns them
    public PCComponent(String prodNo, String comName, String prodType, String prodName, String warrn, String homeDel, String quan, String price){
        this.prodNo = prodNo;
        this.comName = comName;
        this.prodType = prodType;
        this.prodName= prodName;
        this.warrn= warrn;
        this.homeDel = homeDel;
        this.quan = quan;
        this.price = price;
    }
}
