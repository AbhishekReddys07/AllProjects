from abc import ABC,abstractmethod


class abs():
    
 @abstractmethod
 def add(self): 
    pass
@abstractmethod
def  sub(self):
     pass
 
class Adding(abs):
    def add(self , a: int,b:int)->int:
       return a+b
    def sub(self,a,b):
        return a-b
       
       
       
# class Sub(Adding):
#     def sub(self,m:int,n:int):
#         print("Adding value",super().add(m,n))
#         return m-n
    
    
subans = Adding()


print(subans.add(1,20))
print(subans.sub(5,1))

        