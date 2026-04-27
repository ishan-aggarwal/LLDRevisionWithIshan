package structural.flyweight.q1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@ExtrinsicState
public class UserExtrinsicState {
    private Colour colour;
    private int currentGameStreak;
    private UserIntrinsicState user;
}
