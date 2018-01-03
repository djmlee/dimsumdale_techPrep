public  static int[] bubbleSortArray(int[] arr){
    int temp;
    int size = arr.length;
   
    for(int i = 0; i < size; i++){
        for(int j = i+1; j < size; j++){
            if(arr[i] > arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
		}
	}
}
      
