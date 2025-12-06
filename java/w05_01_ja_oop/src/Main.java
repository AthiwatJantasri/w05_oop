class Grandfather {
    String name;
    int age;

    Grandfather() {
        this.name = "Terry";
        this.age = 85;
    }

    Grandfather(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String infoFamGrandfather() {
        return "Grandfather: " + name + ", Age:" + age;
    }

    // Uncle
    static class Uncle {
        String name;
        int age;

        Uncle() {
            this.name = "John";
            this.age = 50;
        }

        Uncle(String name, int age) {
            this.name = name;
            this.age = age;
        }

        String infoFamUncle() {
            return "Uncle: " + name + ", Age:" + age;
        }
    }

    // Father
    static class Father {
        String name;
        int age;

        Father() {
            this.name = "Joe";
            this.age = 48;
        }

        Father(String name, int age) {
            this.name = name;
            this.age = age;
        }

        String infoFamFather() {
            return "Father: " + name + ", Age:" + age;
        }

        // Brother
        static class Brother {
            String name;
            int age;

            Brother() {
                this.name = "Toma";
                this.age = 25;
            }

            Brother(String name, int age) {
                this.name = name;
                this.age = age;
            }

            String infoFamBrother() {
                return "Brother: " + name + ", Age:" + age;
            }

            // Niece
            static class Niece {
                String name;
                int age;

                Niece() {
                    this.name = "Lisa";
                    this.age = 18;
                }

                Niece(String name, int age) {
                    this.name = name;
                    this.age = age;
                }

                String infoFamNiece() {
                    return "Niece: " + name + ", Age:" + age;
                }
            }
        }

        // Me
        static class Me {
            String name;
            int age;

            Me() {
                this.name = "Ivy";
                this.age = 22;
            }

            Me(String name, int age) {
                this.name = name;
                this.age = age;
            }

            String infoFamMe() {
                return "Me: " + name + ", Age:" + age;
            }

            // Dog
            static class Dog {
                String name;
                int age;

                Dog() {
                    this.name = "Jaidee";
                    this.age = 5;
                }

                Dog(String name, int age) {
                    this.name = name;
                    this.age = age;
                }

                String infoFamDog() {
                    return "Dog: " + name + ", Age:" + age;
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // Grandfather
        Grandfather gf1 = new Grandfather();
        System.out.println(gf1.infoFamGrandfather());

        Grandfather gf2 = new Grandfather("Grap", 70);
        System.out.println(gf2.infoFamGrandfather());


        // Uncle
        Grandfather.Uncle uncle1 = new Grandfather.Uncle();
        System.out.println(uncle1.infoFamUncle());

        Grandfather.Uncle uncle2 = new Grandfather.Uncle("Hum", 55);
        System.out.println(uncle2.infoFamUncle());


        // Father
        Grandfather.Father father1 = new Grandfather.Father();
        System.out.println(father1.infoFamFather());

        Grandfather.Father father2 = new Grandfather.Father("Somchai", 45);
        System.out.println(father2.infoFamFather());


        // Brother
        Grandfather.Father.Brother bro1 = new Grandfather.Father.Brother();
        System.out.println(bro1.infoFamBrother());

        Grandfather.Father.Brother bro2 = new Grandfather.Father.Brother("Murasaki", 24);
        System.out.println(bro2.infoFamBrother());


        // Niece
        Grandfather.Father.Brother.Niece niece1 = new Grandfather.Father.Brother.Niece();
        System.out.println(niece1.infoFamNiece());

        Grandfather.Father.Brother.Niece niece2 = new Grandfather.Father.Brother.Niece("Sara", 17);
        System.out.println(niece2.infoFamNiece());


        // Me
        Grandfather.Father.Me me1 = new Grandfather.Father.Me();
        System.out.println(me1.infoFamMe());

        Grandfather.Father.Me me2 = new Grandfather.Father.Me("Joongmee", 21);
        System.out.println(me2.infoFamMe());


        // Dog
        Grandfather.Father.Me.Dog dog1 = new Grandfather.Father.Me.Dog();
        System.out.println(dog1.infoFamDog());

        Grandfather.Father.Me.Dog dog2 = new Grandfather.Father.Me.Dog("Jum Meng", 4);
        System.out.println(dog2.infoFamDog());
    }
}


