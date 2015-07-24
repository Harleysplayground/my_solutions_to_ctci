/* Crack 1.2 reverse a string w/ null terminator in c++ */

#include <iostream>
using namespace std;

void swap(char & a, char & b){
	char temp = a;
	a = b;
	b = temp;
}


void reverse(string & str){
	for(int i = 0; i <= (str.length()-1)/2; i++)
		swap(str[i], str[str.length() -1-i]);
}


int main(int argc, char * argv[])
{
  
	string str = "abcdefg\0";
	reverse(str);
    cout << str << endl;

}
