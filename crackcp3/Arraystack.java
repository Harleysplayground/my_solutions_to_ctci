class Arraystack{
	int size = 1;
	int[] array = new int[size];
	int index_1 = 0;
	int index_2 = 1;
	int index_3 = 2;

	int[] resize(int[] array, int size){
		int[] newarray = new int[size*2];
		for(int i=0; i < size; i++) newarray[i] = array[i];
		return newarray;
	}

	void push_1(int d, int stack){
		
		while(index_1 > size*4/5)
			{array = resize(array, size);
			size = size*2;}
		array[index_1] = d;
		index_1 += 3;
	}

	int pop_1(int stack){
		index_1 -= 3;
		return array[index_1];
	}

	void push_2(int d){
		while(index_2 > size*4/5)
			{array = resize(array, size);
			size = size*2;}
		array[index_2] = d;
		index_2 += 3;
	}

	int pop_2(){
		index_2 -= 3;
		return array[index_2];
	}

	void push_3(int d){
		while(index_3 > size*4/5)
			{array = resize(array, size);
			size = size*2;}
		array[index_3] = d;
		index_3 += 3;
	}

	int pop_3(){
		index_3 -= 3;
		return array[index_3];
	}
}