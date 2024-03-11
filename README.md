This is a projects made by following the instructions below.

Create a class named Student that contains the following data members:

• a static variable to create unique numbers

• a variable to store the student’s id number (roll number)

• a variable to store the name and surname of the student

• an array to store the marks (grades) of five courses

This class should have the following member functions:

• Create a constructor with no parameters that increments the static variable by 1 and 
assigns it to the roll number. The remaining data members should be initialized to zero
or empty values.

• Input() function that will allow the user to input the names and marks of 5 courses.

• Show() function that will display the roll number, name and marks of 5 courses to 
the user.

• TotalStudents() function that should display the number of objects that have 
been created so far. This function should be static.

• TotalMarks() function that should calculate and return the total marks of a 
student.

• getHighest() function that returns the highest mark of the student.

• getLowest() function that returns the lowest mark of the student.

• getAverage() function that returns the average mark of the student.

• getPassCount() function that counts and returns the total number of courses in 
which the student has passed (a student passes the course if he/she gets a mark 
between 50 and 100; fails the course if he/she gets a mark between 0 and 49.)

In the main function, create three objects, input their values and display them. For each 
student, display the student’s total marks, highest mark, lowest mark, average mark, 
and the number of courses which he/she passed. Also display how many students have 
been registered so far (i.e. the number of objects). Every student must write his/her real 
name and surname and student id number in the first object. You may use fictional 
names and surnames in the following two objects.
