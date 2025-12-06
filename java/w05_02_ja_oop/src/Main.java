public class Main {
    public static void main(String[] args) {
        GrandFather grandFather = new GrandFather("Smith");
        grandFather.greetFamily();

        GrandFather.Uncle uncle = new GrandFather.Uncle("John", "Engineer");
        uncle.introduce(grandFather);
    }
}

class GrandFather {
    String familyName;
    int wealth;

    public GrandFather(String familyName) {
        this.familyName = familyName;
        this.wealth = 1000000;
    }

    public void greetFamily() {
        System.out.println("Hello, I am the GrandFather of the " + familyName + " family.");
    }

    // Nested class
    public static class Uncle {
        String name;
        String profession;

        public Uncle(String name, String profession) {
            this.name = name;
            this.profession = profession;
        }

        public void introduce(GrandFather outer) {
            System.out.println("I am " + name + ", the Uncle.");
            System.out.println("My profession is " + profession + ". Our family name is " + outer.familyName + ".");
        }
    }
}

