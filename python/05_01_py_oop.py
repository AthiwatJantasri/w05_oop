class Grandfather:
  def __init__ (self, name:str="Terry", age:int=85):
    self.name = name
    self.age = age
    
  def infoFamGrandfather(self):
    return f"Grandfather: {self.name}, Age:{self.age}"
    
  class Uncle:
    def __init__ (self, name:str="John",age:int=50):
      self.name = name
      self.age = age 
      
    def infoFamUncle(self):
      return f"Uncle: {self.name}, Age:{self.age}"
      
  class Father:
    def __init__(self, name:str="Joe",age:int=48):
      self.name = name
      self.age = age
      
    def infoFamFather(self):
      return f"Father: {self.name}, Age:{self.age}"
    
    class Brother:
      def __init__ (self, name:str="Toma",age:int=25):
        self.name = name
        self.age = age
      
      def infoFamBrother(self):
        return f"Brother: {self.name}, Age:{self.age}"
        
      class Niece:
        def __init__ (self, name:str="Lisa",age:int=18):
          self.name = name
          self.age = age 
        
        def infoFamNiece(self):
          return f"Niece: {self.name}, Age:{self.age}"
          
    class Me:
      def __init__ (self,name:str="Ivy",age:int=22):
        self.name = name
        self.age = age
        
      def infoFamMe(self):
        return f"Me: {self.name}, Age:{self.age}"
        
      class Dog:
        def __init__ (self,name:str="Jaidee",age:int=5):
          self.name = name
          self.age = age
          
        def infoFamDog(self):
          return f"Dog: {self.name}, Age:{self.age}"

##ของตา          
gf1 = Grandfather()
print (gf1.infoFamGrandfather())
gf2 = Grandfather("Grap",70)
print (gf2.infoFamGrandfather())

##ของลุง
uncle1 = Grandfather.Uncle()
print (uncle1.infoFamUncle())
uncle2 = Grandfather.Uncle("Hum", 55)
print (uncle2.infoFamUncle())

##ของพ่อ
father1 = Grandfather.Father()
print (father1.infoFamFather())
father2 = Grandfather.Father("Somchai",45)
print (father2.infoFamFather())

##ของพี่ชาย
brother1 = Grandfather.Father.Brother()
print (brother1.infoFamBrother())
brother2 = Grandfather.Father.Brother("Murasaki",24)
print (brother2.infoFamBrother())

##ของหลานสาว
niece1 = Grandfather.Father.Brother.Niece()
print (niece1.infoFamNiece())
niece2 = Grandfather.Father.Brother.Niece("Sara",17)
print (niece2.infoFamNiece())

##ของฉัน
me1 = Grandfather.Father.Me()
print (me1.infoFamMe())
me2 = Grandfather.Father.Me("Joongmee",21)
print (me2.infoFamMe())

##ของน้องหมา
dog1 = Grandfather.Father.Me.Dog()
print (dog1.infoFamDog())
dog2 = Grandfather.Father.Me.Dog("Jum Meng",4)
print (dog2.infoFamDog())