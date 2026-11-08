class Solution {
    public List<List<Integer>> displayList(Node head) {
        List<Integer> forwardList = new ArrayList<>();
        List<Integer> backwardList = new ArrayList<>();

        if (head == null) {
            return Arrays.asList(forwardList, backwardList);
        }

        Node curr = head;
        
        while (curr != null) {
            forwardList.add(curr.data);
            if (curr.next == null) {
                break; 
            }
            curr = curr.next;
        }
        while (curr != null) {
            backwardList.add(curr.data);
            curr = curr.prev;
        }

        return Arrays.asList(forwardList, backwardList);
    }
}