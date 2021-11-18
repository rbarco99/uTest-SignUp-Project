package random;

import com.github.javafaker.Faker;
import model.UtestData;

import java.util.List;

public class GenerateRandom {

    public static void data(UtestData data){
        Faker faker = new Faker();
        if (data.getStrEmail().contentEquals("*random email*")){
            data.setStrEmail(faker.internet().emailAddress());
        }
        if (data.getStrFirstName().contentEquals("*random name*")){
            data.setStrFirstName(faker.name().firstName());
        }
        if (data.getStrLastName().contentEquals("*random lastname*")){
            data.setStrLastName(faker.name().lastName());
        }
        if (data.getStrPassword().contentEquals("*random password*")){
            data.setStrPassword("P4ss." + faker.lorem().characters(8, 16));
        }

    }
}
