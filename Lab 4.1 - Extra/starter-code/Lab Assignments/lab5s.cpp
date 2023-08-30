// This is a a template program for you to submit lab assignments in lab 5
// Lab Title: Dual Array

//  Student Details
/// Name: Place your name here
/// ID: Place your ID here

#include <iostream>
#include <iomanip>

using namespace std;

// declaration of isDual function
int isDual(int a[], int len)
// End of function declaration

int main()
{

	cout << "Output of isDual function:" <<endl;
	cout << "{1, 2, 3, 0} : " << 1 == isDual({1, 2, 3, 0}, 4) ? "Yes": "No"<<endl;
	cout << "{1, 2, 2, 1, 3, 0} : " << 1 == isDual({1, 2, 2, 1, 3, 0}, 6) ? "Yes": "No"<<endl;
	cout << "{1, 1, 2, 2} : " << 1 == isDual({1, 1, 2, 2}, 4) ? "Yes": "No" <<endl;
	cout << "{1, 2, 1} : " << 1 == isDual({1, 2, 1}, 3)  ? "Yes": "No" <<endl;
	cout << "{} : " << 1 == isDual({}, 0)  ? "Yes": "No" <<endl;
	
	return 0;
}

// Definition isDual function
int isDual(int a[ ], int len)
{
	int returnValue = 1;

	/// Write your solution here
	
	return returnValue;
}
// End of function definition 