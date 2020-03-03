package rocks.zipcode.assessment2.collections;

import javax.xml.bind.annotation.XmlType;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Use a map to solve
 */
public class MonthConversion {
    Map<Integer,String> calender = new HashMap<>();


    /**
     *
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */

    public void add(Integer monthNumber, String monthName) {
      this.calender.put(monthNumber,monthName);

    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        String name="";

        for (Map.Entry<Integer,String> num :calender.entrySet()){
            if (monthNumber.equals(num.getKey()))
                name=num.getValue();
        }


        return name == "" ? null : name;



    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public Integer getNumber(String monthName) {

        int num = 0;
        String nulll= null;
        try {
            for (Map.Entry<Integer, String> name : calender.entrySet()) {
                if (monthName.equals(name.getValue())) {
                    num = name.getKey();
                }
            }
            return num == 0 ? null : num;
        } catch (NullPointerException n){
            return null;

        }


//         return num;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {

        return calender.containsKey(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return calender.containsValue(monthName);
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return calender.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        calender.replace(monthNumber,monthName);

    }
}
