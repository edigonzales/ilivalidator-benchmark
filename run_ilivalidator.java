///usr/bin/env jbang "$0" "$@" ; exit $?
//REPOS mavenCentral,ehi=https://jars.interlis.ch/
//DEPS ch.interlis:ilivalidator:1.14.3

import org.interlis2.validator.Validator;
import ch.ehi.basics.settings.Settings;

import static java.lang.System.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class run_ilivalidator {

    public static void main(String... args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

        long startTime = System.currentTimeMillis();
        Date startDate = new Date(startTime);
        out.println("Start Time: " + dateFormat.format(startDate));


        Settings settings = new Settings();
        settings.setValue(Validator.SETTING_ALL_OBJECTS_ACCESSIBLE, Validator.TRUE);
        settings.setValue(Validator.SETTING_ILIDIRS, ".");


        for (int i=0; i<100; i++) {
            boolean valid = Validator.runValidation(new String[] {"Nutzungsplanung_Catalogue_CH_V1_2_20210901.xml", "Nutzungsplanung_LV95_V1_2.xtf"}, settings);
        }

        long endTime = System.currentTimeMillis();
        Date endDate = new Date(endTime);
        System.out.println("End Time: " + dateFormat.format(endDate));

        long timeTaken = endTime - startTime;
        out.println("Time taken: " + timeTaken / 1000 + " seconds");
    }
}
