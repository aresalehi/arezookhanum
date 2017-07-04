import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by a.salehi on 6/14/2017.
 */

public class Enterance {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();

        User usr = new User();
        Scanner user_input = new Scanner(System.in);
        String first_name;
        System.out.println("Enter your first name");
        first_name = user_input.next();
        usr.setFirst_name("first_name");


        String family_name;
        System.out.println("Enter your family name");
        family_name = user_input.next();
        String full_name;
        full_name = first_name + " " + family_name;
        System.out.println("You are" +" "+ full_name);
        usr.setFamily_name(family_name);
       try
       {
           String value=mapper.writeValueAsString(usr);
           System.out.println(value);
       }

       catch (IOException e){
           e.printStackTrace();
       }

    }

    }

