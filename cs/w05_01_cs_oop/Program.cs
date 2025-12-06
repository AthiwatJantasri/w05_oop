using System;

class Program
{
    static void Main(string[] args)
    {
        // Grandfather
        var gf1 = new Grandfather();
        Console.WriteLine(gf1.InfoFamGrandfather());

        var gf2 = new Grandfather("Grap", 70);
        Console.WriteLine(gf2.InfoFamGrandfather());


        // Uncle
        var uncle1 = new Grandfather.Uncle();
        Console.WriteLine(uncle1.InfoFamUncle());

        var uncle2 = new Grandfather.Uncle("Hum", 55);
        Console.WriteLine(uncle2.InfoFamUncle());


        // Father
        var father1 = new Grandfather.Father();
        Console.WriteLine(father1.InfoFamFather());

        var father2 = new Grandfather.Father("Somchai", 45);
        Console.WriteLine(father2.InfoFamFather());


        // Brother
        var bro1 = new Grandfather.Father.Brother();
        Console.WriteLine(bro1.InfoFamBrother());

        var bro2 = new Grandfather.Father.Brother("Murasaki", 24);
        Console.WriteLine(bro2.InfoFamBrother());


        // Niece
        var niece1 = new Grandfather.Father.Brother.Niece();
        Console.WriteLine(niece1.InfoFamNiece());

        var niece2 = new Grandfather.Father.Brother.Niece("Sara", 17);
        Console.WriteLine(niece2.InfoFamNiece());


        // Me
        var me1 = new Grandfather.Father.Me();
        Console.WriteLine(me1.InfoFamMe());

        var me2 = new Grandfather.Father.Me("Joongmee", 21);
        Console.WriteLine(me2.InfoFamMe());


        // Dog
        var dog1 = new Grandfather.Father.Me.Dog();
        Console.WriteLine(dog1.InfoFamDog());

        var dog2 = new Grandfather.Father.Me.Dog("Jum Meng", 4);
        Console.WriteLine(dog2.InfoFamDog());
    }
}


class Grandfather {
    public string Name;
    public int Age;

    public Grandfather() {
        Name = "Terry";
        Age = 85;
    }

    public Grandfather(string name, int age) {
        Name = name;
        Age = age;
    }

    public string InfoFamGrandfather() =>
        $"Grandfather: {Name}, Age:{Age}";

    public class Uncle {
        public string Name;
        public int Age;

        public Uncle() {
            Name = "John";
            Age = 50;
        }

        public Uncle(string name, int age) {
            Name = name;
            Age = age;
        }

        public string InfoFamUncle() =>
            $"Uncle: {Name}, Age:{Age}";
    }

    public class Father {
        public string Name;
        public int Age;

        public Father() {
            Name = "Joe";
            Age = 48;
        }

        public Father(string name, int age) {
            Name = name;
            Age = age;
        }

        public string InfoFamFather() =>
            $"Father: {Name}, Age:{Age}";

        public class Brother {
            public string Name;
            public int Age;

            public Brother() {
                Name = "Toma";
                Age = 25;
            }

            public Brother(string name, int age) {
                Name = name;
                Age = age;
            }

            public string InfoFamBrother() =>
                $"Brother: {Name}, Age:{Age}";

            public class Niece {
                public string Name;
                public int Age;

                public Niece() {
                    Name = "Lisa";
                    Age = 18;
                }

                public Niece(string name, int age) {
                    Name = name;
                    Age = age;
                }

                public string InfoFamNiece() =>
                    $"Niece: {Name}, Age:{Age}";
            }
        }

        public class Me {
            public string Name;
            public int Age;

            public Me() {
                Name = "Ivy";
                Age = 22;
            }

            public Me(string name, int age) {
                Name = name;
                Age = age;
            }

            public string InfoFamMe() =>
                $"Me: {Name}, Age:{Age}";

            public class Dog {
                public string Name;
                public int Age;

                public Dog() {
                    Name = "Jaidee";
                    Age = 5;
                }

                public Dog(string name, int age) {
                    Name = name;
                    Age = age;
                }

                public string InfoFamDog() =>
                    $"Dog: {Name}, Age:{Age}";
            }
        }
    }
}

