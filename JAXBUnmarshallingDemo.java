/**
 * Created by vlad on 21.08.2016.
 */
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JAXBUnmarshallingDemo {
    public static void main(String [] args){
        try{
            File file = new File("file.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Car.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Car car = (Car) unmarshaller.unmarshal(file);
            System.out.println(car);

        }catch (JAXBException e){
            e.printStackTrace();
        }
    }

}
