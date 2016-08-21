/**
 * Created by vlad on 21.08.2016.
 */
/*import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JAXBMarshallingDemo {
    public static void main(String [] args){

        Car car = new Car();
        car.setId(20);
        car.setAge(2);
        car.setModel("Ford");

        try{
            File file = new File("file.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Car.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(car, file);
            jaxbMarshaller.marshal(car, System.out);

        }catch (JAXBException e){
            e.printStackTrace();
        }
    }

}
*/
