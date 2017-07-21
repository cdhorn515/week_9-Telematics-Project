import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by cdhorn on 7/21/17.
 */
public class TelematicsService {


    //method with parameter vehicleInfo of type VehicleInfo
    public static void report(VehicleInfo vehicleInfo) {
        try {
            File file = new File(vehicleInfo.getVIN() + ".json");

            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(vehicleInfo);

            FileWriter fileWriter = new FileWriter(file);

            fileWriter.write(json);
            fileWriter.close();

            File fFile = new File(".");
            for (File f: file.listFiles()) {
                if (f.getName().endsWith(".json")) {
                    ObjectMapper toJavaMapper = new ObjectMapper();
                    VehicleInfo vi = mapper.readValue(json, VehicleInfo.class);
                }
            }
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
