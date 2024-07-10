class Whatapp:
    def chat(self):
        print("Ichat with someone")
        
class Whatapp1:
    def Call(self):
        print("call a person")
        
        
class Subclass(Whatapp,Whatapp1):
    def Invoke(self):
        print("Invoke methos activatied and chat method from Whatapp")
        super().chat()
        print("After chating calling call method from Whatapp1")    
        super().call()    
        
        
Subclass().Invoke()