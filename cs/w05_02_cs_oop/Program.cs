using System;

class GrandFather
{
    public string FamilyName;
    public int Wealth;

    public GrandFather(string familyName)
    {
        FamilyName = familyName;
        Wealth = 1000000;
    }

    public void GreetFamily()
    {
        Console.WriteLine($"Hello, I am the GrandFather of the {FamilyName} family.");
    }

    public class Uncle
    {
        public string Name;
        public string Profession;

        public Uncle(string name, string profession)
        {
            Name = name;
            Profession = profession;
        }

        public void Introduce(GrandFather outer)
        {
            Console.WriteLine($"I am {Name}, the Uncle.");
            Console.WriteLine($"My profession is {Profession}. Our family name is {outer.FamilyName}.");
        }
    }
}

class Program
{
    static void Main()
    {
        GrandFather paternal = new GrandFather("Smith");
        paternal.GreetFamily();

        GrandFather.Uncle john = new GrandFather.Uncle("John", "Engineer");
        john.Introduce(paternal);
    }
}

