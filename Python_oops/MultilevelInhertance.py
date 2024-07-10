
class grandParent:
    def wholePro(self):
        print("grandparent")
        
class sonFather(grandParent):
    def homepro(self):
        print("son")
        super().wholePro()
       

class  Fatherson(sonFather):
    def allprop(self):
        print("youngerSon") 
        super().homepro()
        
        
        
Fatherson().allprop()                   