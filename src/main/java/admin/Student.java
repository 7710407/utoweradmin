package admin;

import lombok.*;

import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class Student {

    private String id;
    private String firstName;
    private String lastName;

}
