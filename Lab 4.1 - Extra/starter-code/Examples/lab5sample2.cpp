// The grade average program
// This program illustrates how one-dimensional arrays are used and how
// they are passed as arguments to functions. It contains two functions.
// The first function is called to allow the user to input a set of grades and
// store them in an array. The second function is called to find the average
// grade.

#include <iostream>

using namespace std;

const int TOTALGRADES = 50; // TOTALGRADES is the maximum size of the array

// function prototypes
typedef int GradeType[TOTALGRADES];

void getData(GradeType array, int& sizeOfArray);

// the procedure that will read values into the array
float findAverage(const GradeType array, int sizeOfArray);

// the procedure that will find the average of values
// stored in an array. The word const in front of the
// data type of the array prevents the function from
// altering the array
int main()
{
	GradeType grades; // defines an array that holds up to 50 ints

	int numberOfGrades = 0; // the number of grades read in

	float average; // the average of all grades read in

	getData(grades, numberOfGrades); // getData is called to read the grades into

	// the array and store how many grades there
	// are in numberOfGrades
	average = findAverage(grades, numberOfGrades);

	cout << endl << "The average of the " << numberOfGrades << " grades read in is " << average << "." << endl << endl;
	return 0;
}

//***********************************************************************
// getData
//
// task: This function inputs and stores data in the grades array.
// data in: none (the parameters contain no information needed by the
// getData function)
// data out: an array containing grades and the number of grades
//***********************************************************************
void getData(GradeType array, int& sizeOfArray)
{
	int pos = 0; // array index which starts at 0
	int grade; // holds each individual grade read in

	cout << "Please input a grade or type -99 to stop: " << endl;
	cin >> grade;

	while (grade != -99)
	{
		array[pos] = grade; // store grade read in to next array location
		pos ++; // increment array index
		cout << "Please input a grade or type -99 to stop: " << endl;
		cin >> grade;
	}

	sizeOfArray = pos; // upon exiting the loop, pos holds the
	// number of grades read in, which is sent
	// back to the calling function
}

//****************************************************************************
// findAverage
//
// task: This function finds and returns the average of the values
//
// data in: the array containing grades and the array size
// data returned: the average of the grades contained in that array
//****************************************************************************

float findAverage (const GradeType array, int sizeOfArray)
{
	int sum = 0; // holds the sum of all grades in the array
	for (int pos = 0; pos < sizeOfArray; pos++)
	{
		sum = sum + array[pos];
		// add grade in array position pos to sum
	}
	return float(sum)/sizeOfArray;
}
