#include <iostream>
#include <string>
using namespace std;

class GrandFather {
public:
    string familyName;
    int wealth;

    GrandFather(string familyName)
        : familyName(familyName), wealth(1000000) {}

    void greetFamily() {
        cout << "Hello, I am the GrandFather of the " << familyName << " family." << endl;
    }

    class Uncle {
    public:
        string name;
        string profession;

        Uncle(string name, string profession)
            : name(name), profession(profession) {}

        void introduce(const GrandFather& outer) {
            cout << "I am " << name << ", the Uncle." << endl;
            cout << "My profession is " << profession 
                 << ". Our family name is " << outer.familyName << "." << endl;
        }
    };
};

int main() {
    GrandFather paternal("Smith");
    paternal.greetFamily();

    GrandFather::Uncle john("John", "Engineer");
    john.introduce(paternal);

    return 0;
}
