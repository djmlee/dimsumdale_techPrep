public static boolean areAllCharactersUnique(String str){
    boolean uniq = true;
    if(str == null || str.length() == 0)
        return uniq;
       
    int size = str.length();
    HashSet<Character> uniqHash = new HashSet<Character>();
 
    for(int i = 0; i < size; i++)
        if(!uniqHash.add(str.charAt(i))) { uniq = false; break; }
       
    return uniq;
}
