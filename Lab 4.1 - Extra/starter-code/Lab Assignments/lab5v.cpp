// This is a a template program for you to submit lab assignments in lab 5
// Lab Title: Distinct Integers

//  Student Details
/// Name: Place your name here
/// ID: Place your ID here

#include <iostream>
#include <iomanip>

using namespace std;

// declaration of countOfDistinct function
int countOfDistinct(int a[], int len)
// End of function declaration

int main()
{

	cout << "Output of countOfDistinct function:" <<endl;
	cout << "Number of distinct integers in {1, 2, 3, 10} = " << countOfDistinct({1, 2, 3, 10}, 4) << endl;
	cout << "Number of distinct integers in {5, 5, 5, 5} = " << countOfDistinct({5, 5, 5, 5}, 4) << endl;
	cout << "Number of distinct integers in {8, 9, 321, 9, 321, 9, 8} = " << countOfDistinct({8, 9, 321, 9, 321, 9, 8}, 7) << endl;
	cout << "Number of distinct integers in {} = " << countOfDistinct({}, 0) << endl;
	
	return 0;
}

// Definition countOfDistinct function
int countOfDistinct(int a[ ], int len)
{
	int returnValue = 0;

	/// Write your solution here
	
	return returnValue;
}
// End of function definition 