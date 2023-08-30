// This is a a template program for you to submit lab assignments in lab 5
// Lab Title: Layered Array

//  Student Details
/// Name: Place your name here
/// ID: Place your ID here

#include <iostream>
#include <iomanip>

using namespace std;

// declaration of isLayered function
int isLayered(int a[], int len)
// End of function declaration

int main()
{

	cout << "Output of isLayered function:" <<endl;
	cout << "{1, 1, 2, 2, 2, 3, 3} : " << 1 == isLayered({1, 1, 2, 2, 2, 3, 3}, 7) ? "Yes": "No"<<endl;
	cout << "{3, 3, 3, 3, 3, 3, 3} : " << 1 == isLayered({3, 3, 3, 3, 3, 3, 3}, 7) ? "Yes": "No"<<endl;
	cout << "{1, 2, 2, 2, 3, 3} : " << 1 == isLayered({1, 2, 2, 2, 3, 3}, 6) ? "Yes": "No" <<endl;
	cout << "{2, 2, 2, 3, 3, 1, 1} : " << 1 == isLayered({2, 2, 2, 3, 3, 1, 1}, 7)  ? "Yes": "No" <<endl;
	cout << "{2} : " << 1 == isLayered({2}, 1)  ? "Yes": "No" <<endl;
	cout << "{} : " << 1 == isLayered({}, 0)  ? "Yes": "No" <<endl;
	
	return 0;
}

// Definition isLayered function
int isLayered(int a[ ], int len)
{
	int returnValue = 1;

	/// Write your solution here
	
	return returnValue;
}
// End of function definition 