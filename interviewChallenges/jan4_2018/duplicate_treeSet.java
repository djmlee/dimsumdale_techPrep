public static String duplicate(int[] numbers){
    String retString = new String(),
            temp = new String();
            
    if (numbers == null || numbers.length == 0) { return retString; } 
    
    int size = numbers.length;
    TreeSet ts = new TreeSet();
    Arrays.sort(numbers);
    retString += '[';     //Formatting Output
    
    /* TreeSets don't add duplicates.
        add() returns false on duplication found.
        if the tempString is not empty 
        (means that it's not first time doing the string insertion) insert comma for Formatting
        Append
    */
        
    for(int i = 0; i < size; i++){
        if(!ts.add(numbers[i])){
            if(!temp.isEmpty()){ retString+= ", "; }
            temp = String.valueOf(numbers[i]);
            retString+=temp;
        }
    }
    retString += ']';    //Formatting Output
    return retString;
}
