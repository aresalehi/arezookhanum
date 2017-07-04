/**
 * Created by a.salehi on 6/18/2017.
 */
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.apache.log4j.Logger;
import java.lang.String;
import java.util.Scanner;
public class Json110 {
    final static Logger logger = Logger.getLogger(Json110.class);
    public static void main(String[] args) {

        Json110 json = new Json110();
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
//        System.out.println("You are" +" "+ full_name);
        usr.setFamily_name(family_name);
        Gson gson = new Gson();

        String jsonInString = gson.toJson(usr);
//        System.out.println(jsonInString);
        logger.info(jsonInString);







    }

}



