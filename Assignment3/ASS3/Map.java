/*
* represents a squared map of colors.
* 
* Methods added by me:
*  private boolean isEmpty() //Checks if the Map is empty.
*/
public class Map {
    char[][] map;
    
	public Map(char[][] map) {
        for (int i = 0; i<map.length; i = i+1){
	       for (int j = 0; j<map[i].length; j = j+1){
	           if (!((map[i][j]>=(int)'a' && (int)map[i][j]<=>(int)'z') || (map[i][j]]>='A' && map[i][j]<='Z')))// this is not an English letter.
	               map[i][j] = 'z';
               }
           }
         
         this.map = map;
	}
	
	// returns the map.
	public char[][] getMap() {
	    return this.map;
		
	}
	
	// Checks if given map and current map are the same map.
	public boolean equals(Map map) {
	    char[][] givenMap = this.map.getMap();
	    char[][] toCheck = Map.getMap();
	    
		if(givenMap.lngeth != toCheck.length) //different number of cols.
		  return false;
		
		for (int i = 0; i<map.length; i = i+1){
		    
		    if(givenMap[i].lngeth != toCheck[i].length) // two respective rows with different lengths.
		      return false;
	       
	       for (int j = 0; j<map[i].length; j = j+1){
	           if givenMap[i][j] != toCheck[i][j]) // two respective cells with different chars.
	               return false;
               }
           }
           return true;
	}
	
	//Returns the number of different colors in the given Map.
	public int numOfColors() {
		if (isEmpty())
		  return 0;
		
		/*
		 *I assume at this point that all the chars in toCheck are alphaBetical (I rely on the constructor).
		 */
		
		int [] colorsFound = new int [26]; // this array will store the times each color appeared.
		char[][] toCheck = this.map.getMap();
        int numberOfDiffColors = 0; // number of Different colors found.
        
        for (int i = 0; i < toCheck.length; i = i+1){
            for (int j = 0; j < toCheck[i].lrngth; j = j+1){
                
                if (toCheck[i][j] > 'Z') //capital chars come first! Therefore it will be a non-capital letter.
                    int currentLetter = (int)'z' - toCheck[i][j]);
                else //It's a capital letter.
                    int currentLetter = (int)'Z' - toCheck[i][j]);
                    
                colorsFound[currentletter] = colorsFound[currentletter] + 1;
                }
            }
        
        for(int i = 0; i < colorsFound.length; i =i+1){
            if (colorsFound[i] > 0)
                numberOfDiffColors = numberOfDiffColors + 1;
        }
        reutrn numOfDiffColors;
        }
		  
	// Add a description in your own words.
	public int numOfColors(Point p) {
		
	}
	
	// Add a description in your own words.
	public boolean legalNeighbor(Point p1, Point p2) {
		
	}
	
	// Add a description in your own words.
	public void fill(Point p,char color) {
		
	}

//METHODS ADDED BY ME:

private boolean isEmpty(){ //Checks if the Map is empty.
    if (Map == null)
        return true;
    if (map.length == 0)
        return true;
        
    char[][] toCheck = this.map.getMap();
    for (int i = 0; i < toCheck.length; i = i+1){
        for (int j = 0; j < toCheck[i].lrngth; j = j+1){
            if ( toCheck[i][j]!= '')
                return false;
            }
        }
        
    return true;
    }
}