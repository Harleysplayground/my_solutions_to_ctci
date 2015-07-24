#include <stdio.h>
#include <stdlib.h>


char* reverse(char* input){
	int size = sizeof(input);

	printf("the size of string abcdefg+nullterminator is %d",size);
	char* r = (char*)malloc(size*sizeof(char));
	int count = 0;

	for(int i=size-2; i>=0; i--){
		r[count] = input[i];
		count++;
	}	

	r[count] = '\0';
	return r;
}


int main(){
	char* string = "abcdefg\0";

	char* result = reverse(string);


	printf("the result string is %s",result);


}