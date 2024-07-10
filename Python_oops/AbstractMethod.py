from abc import ABC, abstractmethod

class adstractClass(ABC):
    def __init__(self):
        pass
    @abstractmethod
    def Kong(self):
        pass
    
    
    
class car(adstractClass):
    def Kong(self, s:str)->int:
        print("Moving")
        return s if s>=1 else f"{s} this is not a number"
    
print(car().Kong(10))          
