class GrandFather:
    def __init__(self, family_name):
        self.family_name = family_name
        self.wealth = 1000000

    def greet_family(self):
        print(f"Hello, I am the GrandFather of the {self.family_name} family.")
    
    class Uncle:
        def __init__(self, name, profession):
            self.name = name
            self.profession = profession
        
        def introduce(self, outer_instance):
            print(f"I am {self.name}, the Uncle.")
            print(f"My profession is {self.profession}. Our family name is {outer_instance.family_name}.")

paternal_side = GrandFather("Smith")
paternal_side.greet_family()

UncleClass = GrandFather.Uncle
john = UncleClass("John", "Engineer")
john.introduce(paternal_side)