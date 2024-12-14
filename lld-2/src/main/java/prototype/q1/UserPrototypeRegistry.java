package prototype.q1;

public interface UserPrototypeRegistry {

    void addPrototype(User user);

    User getPrototype(UserType type);

    User clone(UserType type);
}