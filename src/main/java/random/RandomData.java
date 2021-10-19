package random;

import com.github.javafaker.Faker;
import model.UtestData;

import java.util.List;

public class RandomData {

    public static void generate(List<UtestData> data){
        Faker faker = new Faker();
        if (data.get(0).getStrEmail().contentEquals("<random email>")){
            data.get(0).setStrEmail(faker.internet().emailAddress());
        }
        if (data.get(0).getStrFirstName().contentEquals("<random name>")){
            data.get(0).setStrFirstName(faker.name().firstName());
        }
        if (data.get(0).getStrLastName().contentEquals("<random lastname>")){
            data.get(0).setStrLastName(faker.name().lastName());
        }

    }
}
