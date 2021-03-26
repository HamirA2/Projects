import sys
'''
Section 1: Collect customer input
'''
#Prompt the user for rentalCode (B)udget, (D)aily, or (W)eekly rental?
#Example of using variable for an input string value.
rentalCode = input ("(B)udget, (D)aily, or (W)eekly rental?\n")

#Used a branch to determine whether the rental period is days rented or weeks rented.
#Example of using a branch.
if rentalCode == 'B' or rentalCode == 'D':
  daysRented = int(input("Number of Days Rented:\n"))
else:
  weeksRented = int(input("Number of Weeks Rented:\n"))
print (rentalCode )
if rentalCode == 'B' or rentalCode == 'D':
  print (daysRented)
else:
  print (weeksRented)

#Assigned budget_Charge, daily_Charge, and weekly_Charge to a numerical value.
#Example of assigning variables with numerical values.
budget_Charge = 40.00
daily_Charge = 60.00
weekly_Charge = 190.00

#Example of using a branch.
#Example of changing a variable baseCharge with a math operator *.
if rentalCode == 'B':
    baseCharge= daysRented * 40.00
elif rentalCode == 'D':
    baseCharge=daysRented * 60.00
elif rentalCode == 'W':
    baseCharge=weeksRented * 190.00
#Printed the baseCharge value.
print ("%.2f" % (baseCharge))
#Used a branch to modify variables with the * operator depending on the rental period.
#Example of using a conditional statement to change the value of the baseCharge variable.

#Assinged odoStart and odoEnd to an input string value.     
odoStart = input ("Starting Odometer Reading:\n")
odoEnd = input ("Ending Odometer Reading:\n")

#Assigned variable totalMiles to integer values of odoEnd minus odoStart.
#For finding the total amount of miles.
totalMiles = int(odoEnd) - int(odoStart)

#Pinted each value odoStart, odoEnd, and totalMiles.
print (odoStart)
print (odoEnd)
print (totalMiles)

#Set mileCharge to total miles *.25: the extraMiles charge
#Used to find extra cost of extraMiles
mileCharge = totalMiles *.25

#Calculated averagedailymiles to use for extra miles.
averagedailymiles = int(totalMiles)/ int(daysRented)

#Used a conditional branch statement to determine the extra cost for totalMiles. 
#Used for days rented.
if rentalCode == 'B':
    mileCharge = 0.25 * totalMiles
if rentalCode == "D":
    if averagedailymiles <= 100:
        totalMiles = 0
    elif averagedailymiles > 100:
        extraMiles = averagedailymiles - 100
    mileCharge = .25 * extraMiles

#Used for weeks rented.
if rentalCode == "W" and averagedailymiles > 900:
    mileCharge = daysRented * 100
elif rentalCode == "W" and averagedailymiles <= 900:
    mileCharge = 0
#Printed mileCharge value.
print ("%.2f" %(mileCharge))

#Found the amount due by adding the base charge with the mile charge.  
amtDue = float(baseCharge) +float(mileCharge)

#Printed the rental summary which included the string variables and their values.
print ('Rental Summary')
print ('Rental Code:' +str(rentalCode))
print ('Rental Period:' +str(daysRented))
print ('Starting Odometer:' +str(odoStart))
print ('Ending Odometer:' +str(odoEnd))
print ('Miles Driven:' +str(totalMiles))
print ('Amount Due:' +'$' +'%.2f' %(amtDue))