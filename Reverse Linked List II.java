
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) 
    {
        int size = 0;
        ListNode curr = head;

        while (curr != null)
        {
            size++;
            curr = curr.next;
        }

        int[] arr = new int[size];
        curr = head;

        for (int i = 0; i < size; i++)
        {
            arr[i] = curr.val;
            curr = curr.next;
        }

        int i = left - 1;
        int j = right - 1;

        while (i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        curr = head;

        for (int k = 0; k < size; k++)
        {
            curr.val = arr[k];
            curr = curr.next;
        }

        return head;
    }
}
