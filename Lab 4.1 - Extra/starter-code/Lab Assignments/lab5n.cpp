// This is a a template program for you to submit lab assignments in lab 5
// Lab Title: Odd-Heavy Array

//  Student Details
/// Name: Place your name here
/// ID: Place your ID here

#include <iostream>
#include <iomanip>

using namespace std;

// declaration of isOddHeavy function
int isOddHeavy(int a[], int len)
// End of function declaration

int main()
{

	cout << "Output of isOddHeavy function:" <<endl;
	cout << "{1} : " << 1 == isOddHeavy({1}, 1) ? "Yes": "No"<<endl;
	cout << "{2} : " << 1 == isOddHeavy({2}, 1) ? "Yes": "No" <<endl;
	cout << "{1, 1, 1, 1, 1, 1} : " << 1 == isOddHeavy({1, 1, 1, 1, 1, 1}, 6)  ? "Yes": "No" <<endl;
	cout << "{2, 4, 6, 8, 11} : " << 1 == isOddHeavy({2, 4, 6, 8, 11}, 5)  ? "Yes": "No" <<endl;
	cout << "{-2, -4, -6, -8, -11} : " << 1 == isOddHeavy({-2, -4, -6, -8, -11}, 5)  ? "Yes": "No" <<endl;
	
	return 0;
}

// Definition isOddHeavy function
int isOddHeavy(int a[ ], int len)
{
	int returnValue = 1;

	/// Write your solution here
	
	return returnValue;
}
// End of function definition 