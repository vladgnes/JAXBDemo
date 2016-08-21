/**
 * Created by vlad on 21.08.2016.
 */
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Car {
    String model;
    int age;
    int id;

    @Override
    public String toString() {
        return "Customer [model = " + model + ", age = " + age + ", id= " + id + "]";
    }
    public String getModel() {
        return model;
    }

    @XmlElement
    public void setModel(String name) {
        this.model = name;
    }

    public int getAge() {
        return age;
    }

    @XmlElement
    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }
}
