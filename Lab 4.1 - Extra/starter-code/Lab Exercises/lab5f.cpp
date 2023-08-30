// This is a a template program for you to submit lab exercises in lab 5
// Lab Title: Working with Two-Dimensional Arrays
// Description: This program will read in prices and store them into a two-dimensional array.
// 				It will print those prices in a table form.

// Student Details
/// Name: Place your name here
/// ID: Place your ID here

#include <iostream>
#include <iomanip>

using namespace std;

const MAXROWS = 10;
const MAXCOLS = 10;


// creates a new data type of a 2D array of floats

typedef float PriceType[MAXROWS][MAXCOLS]; 

// gets the prices into the array
void getPrices(PriceType, int&, int&); 


// prints data as a table
void printPrices(PriceType, int, int); 

int main()
{
	int rowsUsed; 				// holds the number of rows used
	int colsUsed; 				// holds the number of columns used
	PriceType priceTable; 		// a 2D array holding the prices
	
	// calls getPrices to fill the array
	getPrices(priceTable, rowsUsed, colsUsed); 

	// calls printPrices to display array
	printPrices(priceTable, rowsUsed, colsUsed);
	
	return 0;
}

//*******************************************************************************
// getPrices
//
// task: This procedure asks the user to input the number of rows and
// columns. It then asks the user to input (rows * columns) number of
// prices. The data is placed in the array.
// data in: none
// data out: an array filled with numbers and the number of rows
// and columns used.
//
//*******************************************************************************

void getPrices(PriceType table, int& numOfRows, int& numOfCols)
{
	cout << "Please input the number of rows from 1 to "<< MAXROWS << endl;
	cin >> numOfRows;
	cout << "Please input the number of columns from 1 to "<< MAXCOLS << endl;
	cin >> numOfCols;

	for (int row = 0; row < numOfRows; row++)
	{
		for (int col = 0; col < numOfCols; col++)
		{
			
			/// Fill in the code to read and store the next value in the array
		
		}
	}
}	

//***************************************************************************
// printPrices
//
// task: This procedure prints the table of prices
// data in: an array of floating point numbers and the number of rows
// and columns used.
// data out: none
//
//****************************************************************************

void printPrices(PriceType table, int numOfRows, int numOfCols)
{
	cout << fixed << showpoint << setprecision(2);
	
	for (int row = 0; row < numOfRows; row++)
	{
		for (int col = 0; col < numOfCols; col++)
		{
		
			/// Fill in the code to print the table
		
		}
	}
}