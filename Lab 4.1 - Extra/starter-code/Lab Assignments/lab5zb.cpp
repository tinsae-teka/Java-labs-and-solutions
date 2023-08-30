// This is a a template program for you to submit lab assignments in lab 5
// Lab Title: Biggest Entry  in 2D array

//  Student Details
/// Name: Place your name here
/// ID: Place your ID here

#include <iostream>
#include <iomanip>

using namespace std;

// declaration of biggestEntry  function
int biggestEntry  (int a[][], int lenX, lenY)
// End of function declaration

int main()
{

	cout << "Output of biggestEntry  function:" <<endl;
	cout << "When the input is { {1, 2, 3, 4},{5, 6, 7, 8}, {3, 2, 1, 0} } = " 
		 << biggestEntry({ {1, 2, 3, 4},{5, 6, 7, 8}, {3, 2,  1, 0} }, 3,4) << endl;
	cout << "When the input is { {10, 12, -11, 5},{13, 8, 9, 14}, {13, 2, 0, 15}, {48, 20, 94, 51}} = " 
		 << biggestEntry({ {10, 12, -11, 5},{13, 8, 9, 14}, {13, 2, 0, 15}, {48, 20, 94, 51}}, 4,4) << endl;
	cout << "When the input is {{8, 4, 3, 9, 5},{0, 9, 5, 4, 8},{9, 5, 4, 7, 6}} = " 
		 << biggestEntry({{8, 4, 3, 9, 5},{0, 9, 5, 4, 8},{9, 5, 4, 7, 6}} , 3,5) << endl;
	cout << "When the input is {{2, 8, 9}, {2, 6, 7}, {2, 3, 4}, {5, 6, 7}, {3, 4, 6}, {7, 6, 4}, {3, 5, 9}, {2, 8, 6}} = " 
		 << biggestEntry({{2, 8, 9}, {2, 6, 7}, {2, 3, 4}, {5, 6, 7}, {3, 4, 6}, {7, 6, 4}, {3, 5, 9}, {2, 8, 6}}, 8,3) << endl;
	cout << "When the input is { {342, 223, 189, 294}} = " 
		 << biggestEntry({ {342, 223, 189, 294}}, 1,4) << endl;
	cout << "When the input is {{1}}= " 
		 << biggestEntry({{1}}, 1, 1) << endl;
	cout << "When the input is {}= " 
		 << biggestEntry({}, 0, 0) << endl;
	
	return 0;
}

// Definition biggestEntry function
int biggestEntry (int a[][], int lenX, lenY)
{
	int returnValue = 0;

	/// Write your solution here
	
	return returnValue;
}
// End of function definition 