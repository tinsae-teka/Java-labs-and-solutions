// This is a a template program for you to submit lab assignments in lab 5
// Lab Title: Centered Array

//  Student Details
/// Name: Place your name here
/// ID: Place your ID here

#include <iostream>
#include <iomanip>

using namespace std;

// declaration of isCentered function
int isCentered(int a[], int len)
// End of function declaration

int main()
{

	cout << "Output of isCentered function:" <<endl;
	cout << "{1, 2, 3, 4, 5} : " << 1 == isCentered({1, 2, 3, 4, 5}, 5) ? "Yes": "No"<<endl;
	cout << "{3, 2, 1, 4, 5} : " << 1 == isCentered({3, 2, 1, 4, 5}, 5) ? "Yes": "No" <<endl;
	cout << "{3, 2, 1, 4, 1} : " << 1 == isCentered({3, 2, 1, 4, 1}, 5)  ? "Yes": "No" <<endl;
	cout << "{3, 2, 1, 1, 4, 6} : " << 1 == isCentered({3, 2, 1, 1, 4, 6}, 6)  ? "Yes": "No" <<endl;
	cout << "{} : " << 1 == isCentered({}, 0)  ? "Yes": "No" <<endl;
	cout << "{1} : " << 1 == isCentered({1}, 1)  ? "Yes": "No" <<endl;
	
	return 0;
}

// Definition isCentered function
int isCentered(int a[ ], int len)
{
	int returnValue = 1;

	/// Write your solution here
	
	return returnValue;
}
// End of function definition 