import random

class FactorSpread:

    def __init__(self, i=3, j=4, seed=None):

        random.seed(seed)
        self.field = [[random.randint(2,99) for cols in range(j)] for rows in range(i)] # 2D array of random int
        self.broken = [[0 for cols in range(j)] for rows in range(i)] # 2D array of int matching the field to mark which ones are broken

    def spread(self, j, factor): 
        """ Will spread from the bottom, j, and delete all numbers that are evenly divisible by j. 
        * @param j The column to select. It will always start on the bottom
        * @param factor The factor which is an integer between 2 and 99
        
        >>> my_field = FactorSpread(6, 5, 1)
        >>> my_field.field = [[22,20,86,13,30],
                            [78, 73, 8, 27, 52],
                             [7,81,66,18,3],
                             [39,14,74,11,77]]
        >>> my_field.print_field()
        22 20 86 13 30
        78 73  8 27 52
         7 81 66 18  3
        39 14 74 11 77
        >>> my_field.spread(j=2, factor=2)
        >>> my_field.print_field()
        22 XX XX 13 30
        78 73 XX 27 52
         7 81 XX XX  3
        39 14 XX 11 77
        """
        pass

    def still_playing(self):
        """ Returns True if the player can still play """
        pass

    def check_rows(self, dummy):
        """ Checks the rows to see if an entire row is eliminated. If it is, then delete that row """
        pass

    def print_field(self, dummy):
        """ Prints the field 
        >>> my_field = FactorSpread(6, 5, 1)
        >>> my_field.field = [[22,20,86,13,30],
                            [78, 73, 8, 27, 52],
                             [7,81,66,18,3],
                             [39,14,74,11,77]]
        >>> my_field.print_field()
        22 20 86 13 30
        78 73  8 27 52
         7 81 66 18  3
        39 14 74 11 77"""
        pass



def main():
    my_field = FactorSpread(6, 5, 1)
    my_field.field =[[22,20,86,13,30],
                    [78, 73, 8, 27, 52],
                    [7,81,66,18,3],
                    [39,14,74,11,77]]

    while my_field.still_playing():
        my_field.print_field()
        col = input("Which column? ")
        factor = input("Which factor? ")
        my_field.spread(factor, col, "dummy") 

    print("Thank you for playing")

if __name__ == "__main__":
    main()