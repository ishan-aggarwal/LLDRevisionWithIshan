package structural.flyweight.q1;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@IntrinsicState
@Getter
public class UserIntrinsicState {
    private String name;
    private int age;
    private String gender;
    private String email;
    private String phoneNumber;
    private Byte[] photo;
}