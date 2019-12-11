package com.hillel.lecture_14;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Create json converter. User object should be present in key-value pair, all field should be like Map;
 * F.E:
 * public class User {
 *
 *     private String name;
 *
 * }
 *
 * Should be present as json {"name": "bob"}
 * @see <a href="https://www.w3schools.com/whatis/whatis_json.asp">JSON</a>
 */
public class JsonConverter {


    public String convertToJsonString(List<User> users) {

//        TODO implements result
        List <String> result = new ArrayList<>();
        for(User userObj : users){
            result.add(userObj.toString());
        }

        return "\"" + result.toString().replaceAll(", ", ",")+ "\"";
    }

    public String convertToJsonString(User users) {

        //Create list of names of all field in the class
//        Field[]fields = users.getClass().getDeclaredFields();
//        List<String> fieldNames = new ArrayList<>(); // there is a list of all names of private fields
//        for (Field field : fields) {
//            fieldNames.add(field.getName());
//        }

       // System.out.println(users.toString());

//        TODO implements result


        String result;
        result = "\"" + users.toString() + "\"";

        return result;
    }


}
