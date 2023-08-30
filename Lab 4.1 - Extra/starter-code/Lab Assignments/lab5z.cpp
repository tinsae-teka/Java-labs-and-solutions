// This is a a template program for you to submit lab assignments in lab 5
// Lab Title: Range

//  Student Details
/// Name: Place your name here
/// ID: Place your ID here

#include <iostream>
#include <iomanip>

using namespace std;

// declaration of range function
int range(int a[], int len)
// End of function declaration

int main()
{

	cout << "Output of range function:" <<endl;
	cout << "When the input is {1, 2, -1, 5} = " << range({1, 2, -1, 5}, 4) << endl;
	cout << "When the input is {1, -2, 4, -1} = " << range({1, -2, 4, -1}, 4) << endl;
	cout << "When the input is {5, -3, 4, -1, 1, 2} = " << range({5, 3, 4, -1, 1, 2}, 6) << endl;
	cout << "When the input is {-5, -2, -3, -1} = " << range({-5, -2, -3, -1}, 4) << endl;
	cout << "When the input is {3, 2, 3, 1} = " << range({3, 2, 3, 1}, 4) << endl;
	cout << "When the input is {20, -40} = " << range({20, -40}, 2) << endl;
	cout << "When the input is {3} = " << range({3}, 1) << endl;
	cout << "When the input is {0} = " << range({0}, 1) << endl;
	
	return 0;
}

// Definition range function
int range(int a[], int len)
{
	int returnValue = 0;

	/// Write your solution here
	
	return returnValue;
}
// End of function definition 