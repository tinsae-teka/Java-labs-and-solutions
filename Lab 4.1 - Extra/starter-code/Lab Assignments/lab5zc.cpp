// This is a a template program for you to submit lab assignments in lab 5
// Lab Title: Number of Sixes in a 2D array

//  Student Details
/// Name: Place your name here
/// ID: Place your ID here

#include <iostream>
#include <iomanip>

using namespace std;

// declaration of sixCount  function
int sixCount  (int a[][], int lenX, lenY)
// End of function declaration

int main()
{

	cout << "Output of sixCount function:" <<endl;
	cout << "When the input is { {1, 2, 3, 4},{5, 6, 7, 8}, {3, 2, 1, 0} } = " 
		 << sixCount({ {1, 2, 3, 4},{5, 6, 7, 8}, {3, 2,  1, 0} }, 3,4) << endl;
	cout << "When the input is { {10, 12, -11, 5},{13, 8, 9, 14}, {13, 2, 0, 15}, {48, 20, 94, 51}} = " 
		 << sixCount({ {10, 12, -11, 5},{13, 8, 9, 14}, {13, 2, 0, 15}, {48, 20, 94, 51}}, 4,4) << endl;
	cout << "When the input is {{8, 4, 3, 9, 5},{0, 9, 5, 4, 8},{9, 5, 4, 7, 6}} = " 
		 << sixCount({{8, 4, 3, 9, 5},{0, 9, 5, 4, 8},{9, 5, 4, 7, 6}} , 3,5) << endl;
	cout << "When the input is {{2, 8, 9}, {2, 6, 7}, {2, 3, 4}, {5, 6, 7}, {3, 4, 6}, {7, 6, 4}, {3, 5, 9}, {2, 8, 6}} = " 
		 << sixCount({{2, 8, 9}, {2, 6, 7}, {2, 3, 4}, {5, 6, 7}, {3, 4, 6}, {7, 6, 4}, {3, 5, 9}, {2, 8, 6}}, 8,3) << endl;
	cout << "When the input is { {342, 223, 189, 294}} = " 
		 << sixCount({ {342, 223, 189, 294}}, 1,4) << endl;
	cout << "When the input is {{1}}= " 
		 << sixCount({{1}}, 1, 1) << endl;
	cout << "When the input is {}= " 
		 << sixCount({}, 0, 0) << endl;
	return 0;
}

// Definition sixCount  function
int sixCount  (int a[][], int lenX, lenY)
{
	int returnValue = 0;

	/// Write your solution here
	
	return returnValue;
}
// End of function definition 