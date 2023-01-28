package main;

public class Foo {

    private String myName = "DaNiEl";
    private String name;

    public void setMyName(String myName) {
        this.myName = myName;
    }
    public String getMyName() {
        return myName;
    }

    public String getName() {
        return name;
    }

    public String toLowerCase() {
        return myName.toLowerCase();
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Foo createDefault(String theName) {
        Foo defaultFoo = new Foo();
        defaultFoo.setMyName(theName);
        return defaultFoo;
    }
}
