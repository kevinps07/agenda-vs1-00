package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class PerfectFlow {

    private static Boolean flow = false;
    private static List<Integer> numbers = new ArrayList<>();
    private static final int ALLOWED_YEARS = 18;
    private static final Float ALLOWED_MAX_FLOAT = 100f;
    private static Boolean nullObject = false;

    /**
     * @param allow inserir um valor do tipo float
     * @return valor máximo permitido
     */
    public static Boolean allowedMax(Float allow){
        if (allow < ALLOWED_MAX_FLOAT){
            flow = true;
        } else {
        flow = false;
    }
        return flow;
    }

    public static Boolean verifyNullObj(Object o){
        if (o == null){
            nullObject = true;
        } else {
            nullObject = false;
        }
        return nullObject;
    }

    public static long generateUUID(){
        return UUID.randomUUID().getLeastSignificantBits();
    }

    public static UUID generateUUID(String name){
        return UUID.nameUUIDFromBytes(name.getBytes());
    }

    public static Boolean controlBiggestYears(Integer number){
        if (number > ALLOWED_YEARS){
            flow = true;
        } else {
            flow = false;
        }
        return flow;
    }

    public static void take(Integer number) {
        numbers.add(number);
    }

    public static Integer getBiggestNumber(){
        Collections.sort(numbers);
        return numbers.getLast();
    }

    public static Integer getSmallerNumber(){
        Collections.sort(numbers);
        return numbers.getFirst();
    }


    public static String getMethodName(){
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }


}
