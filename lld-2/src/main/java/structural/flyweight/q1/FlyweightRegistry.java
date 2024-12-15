package structural.flyweight.q1;

public interface FlyweightRegistry {

    void addFlyweight(UserIntrinsicState flyweight);

    UserIntrinsicState getFlyweight(String email);
}