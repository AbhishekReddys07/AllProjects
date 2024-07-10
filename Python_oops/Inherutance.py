
class animalCat:
    def cat(self):
        print("meow ")
        
class AnimalDog(animalCat):
    def dog(self):
        super().cat()
        print("bark") 
        
        
AnimalDog().dog() 
        
         
 