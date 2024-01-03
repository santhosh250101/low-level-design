# why you need?
#  -> class exploision

## Design a coffee machine

## Design a pizza with different types

## decorator is (has a + is a)

# is a relation: since decorator class extends base class.
# has a relation: since target class has instance of base class. 

# why decorator pattern is needed
# consider we have a pizza shop where we sell veg pizza,chicken pizza
# so we create base class pizza and veg pizza, chicken pizza extends pizza.

# now we also support toppings like extra cheese, mushroom,panner

# now the laymen solution is create separate classes for all combinations like
# (veg pizza + panner)
# (veg pizza + panner + mushroom)
# (veg pizza + panner + mushroom + cheese) and so on
# same combination repeats for chicken pizza as well.

# so in order to avoid creatign too many classes, we create decorator for pizza

