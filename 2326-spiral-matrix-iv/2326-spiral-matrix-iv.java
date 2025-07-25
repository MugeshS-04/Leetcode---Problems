/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int mat[][] = new int[m][n];

        for(int i = 0; i < m; i++)
        {
            Arrays.fill(mat[i], -1);
        }

        int row = 0;
        int col = 0;

        int top = 0;
        int right = n-1;
        int down = m-1;
        int left = 0;

        ListNode temp = head;

        while(top <= down)
        {
            //left -> right
            while(col <= right)
            {
                if(temp == null)
                {
                    return mat;
                }
                else
                {
                    mat[row][col++] = temp.val;
                    temp = temp.next;
                }
            }

            col--;
            row++;

            //top -> down
            while(row <= down)
            {
                if(temp == null)
                {
                    return mat;
                }
                else
                {
                    mat[row++][col] = temp.val;
                    temp = temp.next;
                }
            }

            row--;
            col--;

            //right -> left
            while(col >= left)
            {
                if(temp == null)
                {
                    return mat;
                }
                else
                {
                    mat[row][col--] = temp.val;
                    temp = temp.next;
                }
            }

            col++;
            row--;

            top++;
            right--;
            down--;

            //down -> top
            while(row >= top)
            {
                if(temp == null)
                {
                    return mat;
                }
                else
                {
                    mat[row--][col] = temp.val;
                    temp = temp.next;
                }
            }

            row++;
            col++;

            left++;

        }

        return mat;

    }
}