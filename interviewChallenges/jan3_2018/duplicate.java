public static String duplicate(int[] numbers){
    /* Idea behind this code
        This shit works but Firecode does not want me using ArrayList or ArrayUtils.removeElement()
        If Hashset finds duplicate, add to (ArrayList)temp.
        Duplicate (ArrayList)temp to Int[] ArrayList
        Sort & return as toString
       
        What Firecode wants:
        Usage of TreeSet
    */
    String retStr = new String();
    if(numbers == null || numbers.length == 0) { return retStr; }
   
    ArrayList<Integer> temp = new ArrayList<Integer>();
    int size = numbers.length;
    HashSet <Integer> dupSet = new HashSet <Integer>();
   
    for(int i = 0; i < size; i++){ if(!dupSet.add(numbers[i])) { temp.add(numbers[i]); } }
 
    if(temp.size() > 0){
        int[] arr = new int[temp.size()];
        for(int i = 0; i < temp.size(); i++) { arr[i] = temp[i]; }
        Arrays.sort(arr);
    }
    return Arrays.toString(arr);
}

