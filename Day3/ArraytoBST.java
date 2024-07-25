
class ArraytoBST {
    public Node sortedArrayToBST(int[] nums) {
        // Code here
        if(nums==null || nums.length==0){
            return null;
            
        }
        
        return sortArrayHeight(nums,0,nums.length-1);
    }
    public Node sortArrayHeight(int nums[],int left,int right){
        if(left>right){
            return null;
        }
        
        int mid=left+(right-left)/2;
        Node node=new Node(nums[mid]);
        
        
        node.left=sortArrayHeight(nums,left,mid-1);
        
        node.right=sortArrayHeight(nums,mid+1,right);
        return node;
    }
}