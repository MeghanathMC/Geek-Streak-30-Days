
class MergeBST{
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    
    private void inOrderTraversal(Node root,List<Integer> list){
        if(root==null){
            return;
        }
        inOrderTraversal(root.left,list);
        list.add(root.data);
        inOrderTraversal(root.right,list);
    }
    
    
    
    private List<Integer> mergeSortedList(List<Integer> list1,List<Integer> list2){
        List<Integer> mergedList=new ArrayList<>();
        int i=0,j=0;
        while(i<list1.size() && j<list2.size()){
            if(list1.get(i)<=list2.get(j)){
                mergedList.add(list1.get(i));
                i++;
            }
            else{
                mergedList.add(list2.get(j));
                j++;
            }
            
        }
        
        while(i<list1.size()){
            mergedList.add(list1.get(i));
            i++;
        }
         while(j<list2.size()){
            mergedList.add(list2.get(j));
            j++;
        }
        return mergedList;
        
    }
    
    
    public List<Integer> merge(Node root1, Node root2) {
        
        List <Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        
        inOrderTraversal(root1,list1);
        inOrderTraversal(root2,list2);
        
        
        return mergeSortedList(list1,list2);
        // Write your code here
    }
}