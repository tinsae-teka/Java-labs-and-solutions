// This is a a template program for you to submit lab assignments in lab 5
// Lab Title: Hollow Array

//  Student Details
/// Name: Place your name here
/// ID: Place your ID here

#include <iostream>
#include <iomanip>

using namespace std;

// declaration of isHollow function
int isHollow(int a[ ], int len)
// End of function declaration

int main()
{

	cout << "Output of is hollow function:" <<endl;
	cout << "{1,2,0,0,0,3,4} : " << 1 == isHollow({1,2,0,0,0,3,4}, 7) ? "Yes": "No"<<endl;
	cout << "{1,1,1,1,0,0,0,0,0,2,1,2,18} : " << 1 == isHollow({1,1,1,1,0,0,0,0,0,2,1,2,18} , 13) ? "Yes": "No" <<endl;
	cout << "{1,2,0,0,3,4} : " << 1 == isHollow({1,2,0,0,3,4}, 6)  ? "Yes": "No" <<endl;
	cout << "{1,2,0,0,0,3,4,5} : " << 1 == isHollow({1,2,0,0,0,3,4,5}, 8)  ? "Yes": "No" <<endl;
	cout << "{3,8,3,0,0,0,3,3} : " << 1 == isHollow({3,8,3,0,0,0,3,3}, 8)  ? "Yes": "No" <<endl;
	cout << "{1,2,0,0,0,3,4,0} : " << 1 == isHollow({1,2,0,0,0,3,4,0}, 8)  ? "Yes": "No" <<endl;
	cout << "{0,1,2,0,0,0,3,4} : " << 1 == isHollow({0,1,2,0,0,0,3,4}, 8)  ? "Yes": "No" <<endl;
	cout << "{0,0,0} : " << 1 == isHollow({0,0,0}, 3) ? "Yes": "No" <<endl;
	
	return 0;
}

// Definition isHollow function
int isHollow(int a[ ], int len)
{
	int returnValue;

	/// Write your solution here
	
	return returnValue;
}
// End of function definition 