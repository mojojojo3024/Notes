public static int interpolationSearch(int[] sortedArray, int toFind)
    {
        int low = 0;
        int high = sortedArray.length - 1;
        int mid;
        while (sortedArray[low] <= toFind && sortedArray[high] >= toFind) 
        {
            if (sortedArray[high] - sortedArray[low] == 0)
                return (low + high)/2;
            
             mid = low + ((toFind - sortedArray[low]) * (high - low)) / (sortedArray[high] - sortedArray[low]);  
 
             if (sortedArray[mid] < toFind)
                 low = mid + 1;
             else if (sortedArray[mid] > toFind)
                 high = mid - 1;
             else
                 return mid;
        }
        if (sortedArray[low] == toFind)
            return low;
           
        else
            return -1; 
    }    