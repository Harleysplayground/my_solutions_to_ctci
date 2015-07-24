/* Find the cutoff point of a sorted array */

#include <stdio.h>
#include <stdlib.h>
#include <assert.h>

int getcutoff(int* array, int size){

int mid = (size-1)/2;
if(size == 2 && array[0] > array[1]) return array[1];
if(size == 2 && array[1] > array[0]) return array[0];
if(array[mid] > array[size-1]) return getcutoff(&array[mid],size - mid);
if(array[mid] < array[0]) return getcutoff(&array[0],mid+1);
return array[0];

}

/*
for array 2, 1st iteration size = 8 mid = 3 34567812
2nd iteration size = 5 mid = 2 67812
3rd size = 3 mid = 1 812
4th size = 2 mid = 0 81
*/

int main(){

int array0[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
int array1[] = {3,4,5,6,7,8,9,1,2};
int array2[] = {8,2,3,4,5,6,7,8,9,10,11,12,13,14};

assert(1 == getcutoff(array0,13));
assert(1 == getcutoff(array1,9));
assert(2 == getcutoff(array2,14));
return 0;
}


