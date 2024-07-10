from abc import abstractmethod

class Shape:
    @abstractmethod
    def draw(self):
        pass
    
class Square:
    def draw(self):
        print("drawing suare")
        
class circle:
    def draw(self):
        print("Drwainf circle") 
        
class Rectangle:
    def draw(self):
        print("drawing rectangle")   
        

def sss(hs):
    hs.draw()
            



sss(Square())     
sss(Rectangle())  
sss(circle())            