package misc;

public class StaticMembers {
    static int CONSTANT = 9;

    int y = 4;

    static int aMethod() {
        ANormalClass aNormalClass = new ANormalClass();
        aNormalClass.setX(2);

        StaticMembers staticMembers = new StaticMembers();
        return staticMembers.y;
    }
}
