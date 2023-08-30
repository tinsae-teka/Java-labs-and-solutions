// This is a a template program for you to submit lab assignments in lab 5
// Lab Title: Chained Iteration

//  Student Details
/// Name: Place your name here
/// ID: Place your ID here

#include <iostream>
#include <iomanip>

using namespace std;

// declaration of isInfinite function
int isInfinite(int a[], int len)
// End of function declaration

int main()
{

	cout << "Output of isInfinite function:" <<endl;
	cout << "When the input is {1, 2, -1, 5} = " << isInfinite({1, 2, -1, 5}, 4) << endl;
	cout << "When the input is {1, 2, 4, -1} = " << isInfinite({1, 2, 4, -1}, 4) << endl;
	cout << "When the input is {5, 3, 4, -1, 1, 2} = " << isInfinite({5, 3, 4, -1, 1, 2}, 6) << endl;
	cout << "When the input is {3} = " << isInfinite({3}, 1) << endl;
	cout << "When the input is {3, 2, 3, 1} = " << isInfinite({3, 2, 3, 1}, 4) << endl;
	cout << "When the input is {0} = " << isInfinite({0}, 1) << endl;
	cout << "When the input is {-1} = " << isInfinite({-1}, 1) << endl;
	
	return 0;
}

// Definition isInfinite function
int isInfinite(int a[], int len)
{
	int returnValue = 0;

	/// Write your solution here
	
	return returnValue;
}
// End of function definition 