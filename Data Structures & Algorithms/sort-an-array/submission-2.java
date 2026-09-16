class Solution {
    public int[] sortArray(int[] nums) {
       mergeSort(nums, 0, nums.length-1);
       return nums;
    }

    static void merge(int[] arr, int start, int end, int mid){
        List<Integer> temp = new ArrayList<>();
        int i = start, j = mid+1;
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp.add(arr[i]);
                i++;
            }else{
                temp.add(arr[j]);
                j++;
            }
        }

        while(i<=mid){
            temp.add(arr[i]);
            i++;
        }

        while(j<=end){
            temp.add(arr[j]);
            j++;
        }

        for(int idx = 0; idx < temp.size(); idx++){
            arr[start+idx] = temp.get(idx);
        }
    }

    static void mergeSort(int[] arr, int start, int end){
        if(start<end){
            int mid = start + (end-start)/2;

            //left
            mergeSort(arr, start, mid);

            // right
            mergeSort(arr, mid+1, end);

            merge(arr, start, end, mid);
        }
    }
}