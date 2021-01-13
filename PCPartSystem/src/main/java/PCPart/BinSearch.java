/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PCPart;

import java.util.ArrayList;

/**
 *
 * @author Sujal, Bibek, Ashwin, Saurav
 */
public class BinSearch {
    public PCComponent binSearch(ArrayList<PCComponent> sortedList, int indexFirst, int indexLast, double searchQuery, boolean findPrice){  //Accepts arraylist to be searched,
        if(indexFirst<=indexLast){                                                                                                          //the first and the last index of the array to be searched,
            int indexMid = (indexFirst + indexLast) / 2;                                                                                    //the value to be searched,
                                                                                                                                            //and which list to be searched: true for price, false for quantity
            if(findPrice==true)             //If price is being searched
                if(Double.parseDouble(sortedList.get(indexMid).price)==searchQuery){
                    return sortedList.get(indexMid);
                }
                else if(Double.parseDouble(sortedList.get(indexMid).price) < searchQuery){
                    return binSearch(sortedList, indexMid + 1, indexLast, searchQuery, true);
                }
                else{
                    return binSearch(sortedList, indexFirst, indexMid - 1, searchQuery, true);
                }

            else                            //If quantity is being searched
                if(Double.parseDouble(sortedList.get(indexMid).quan)==searchQuery){
                    return sortedList.get(indexMid);
                }
                else if(Double.parseDouble(sortedList.get(indexMid).quan) < searchQuery){
                    return binSearch(sortedList, indexMid + 1, indexLast, searchQuery, false);
                }
                else{
                    return binSearch(sortedList, indexFirst, indexMid - 1, searchQuery, false);
                }
            }
        else                                //If no results were found
            return null;
        }
    }
