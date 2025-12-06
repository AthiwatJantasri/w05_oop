#include <iostream>
#include <string>
using namespace std;

class Grandfather {
public:
    string name;
    int age;

    Grandfather(string name = "Terry", int age = 85)
        : name(name), age(age) {}

    string infoFamGrandfather() {
        return "Grandfather: " + name + ", Age:" + to_string(age);
    }

    // Uncle class
    class Uncle {
    public:
        string name;
        int age;

        Uncle(string name = "John", int age = 50)
            : name(name), age(age) {}

        string infoFamUncle() {
            return "Uncle: " + name + ", Age:" + to_string(age);
        }
    };

    // Father class
    class Father {
    public:
        string name;
        int age;

        Father(string name = "Joe", int age = 48)
            : name(name), age(age) {}

        string infoFamFather() {
            return "Father: " + name + ", Age:" + to_string(age);
        }

        // Brother class
        class Brother {
        public:
            string name;
            int age;

            Brother(string name = "Toma", int age = 25)
                : name(name), age(age) {}

            string infoFamBrother() {
                return "Brother: " + name + ", Age:" + to_string(age);
            }

            // Niece class
            class Niece {
            public:
                string name;
                int age;

                Niece(string name = "Lisa", int age = 18)
                    : name(name), age(age) {}

                string infoFamNiece() {
                    return "Niece: " + name + ", Age:" + to_string(age);
                }
            };
        };

        // Me class
        class Me {
        public:
            string name;
            int age;

            Me(string name = "Ivy", int age = 22)
                : name(name), age(age) {}

            string infoFamMe() {
                return "Me: " + name + ", Age:" + to_string(age);
            }

            // Dog class
            class Dog {
            public:
                string name;
                int age;

                Dog(string name = "Jaidee", int age = 5)
                    : name(name), age(age) {}

                string infoFamDog() {
                    return "Dog: " + name + ", Age:" + to_string(age);
                }
            };
        };
    };
};

int main() {
    Grandfather gf1;
    cout << gf1.infoFamGrandfather() << endl;

    Grandfather gf2("Grap", 70);
    cout << gf2.infoFamGrandfather() << endl;

    Grandfather::Uncle u1;
    cout << u1.infoFamUncle() << endl;

    Grandfather::Uncle u2("Hum", 55);
    cout << u2.infoFamUncle() << endl;

    Grandfather::Father f1;
    cout << f1.infoFamFather() << endl;

    Grandfather::Father f2("Somchai", 45);
    cout << f2.infoFamFather() << endl;

    Grandfather::Father::Brother b1;
    cout << b1.infoFamBrother() << endl;

    Grandfather::Father::Brother b2("Murasaki", 24);
    cout << b2.infoFamBrother() << endl;

    Grandfather::Father::Brother::Niece n1;
    cout << n1.infoFamNiece() << endl;

    Grandfather::Father::Brother::Niece n2("Sara", 17);
    cout << n2.infoFamNiece() << endl;

    Grandfather::Father::Me me1;
    cout << me1.infoFamMe() << endl;

    Grandfather::Father::Me me2("Joongmee", 21);
    cout << me2.infoFamMe() << endl;

    Grandfather::Father::Me::Dog d1;
    cout << d1.infoFamDog() << endl;

    Grandfather::Father::Me::Dog d2("Jum Meng", 4);
    cout << d2.infoFamDog() << endl;

    return 0;
}
