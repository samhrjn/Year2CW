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
    public PCComponent binSearch(ArrayList<PCComponent> sortedList, int indexFirst, int indexLast, double searchQuery, boolean findPrice){
        if(indexFirst<=indexLast){
            int indexMid = (indexFirst + indexLast) / 2;
            
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
        else
            return null;
        }
    }
