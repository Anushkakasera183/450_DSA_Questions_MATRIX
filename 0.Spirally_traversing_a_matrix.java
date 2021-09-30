// { Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        ArrayList<Integer> spirally=new ArrayList<Integer>();
        int top=0;
        int left=0;
        int right=c-1;
        int down=r-1;
        int dir=0;
        while (top<=down && left<=right){
            if(dir==0){
                for(int i=left; i<=right;i++){
                  spirally.add(matrix[top][i]);  
                }
                top++;
            }
            else if(dir==1){
                for(int i=top;i<=down; i++){
                    spirally.add(matrix[i][right]);
                }
                right--;
            }
            else if(dir==2){
                for(int i=right; i>=left;i--){
                    spirally.add(matrix[down][i]);
                }
                down--;
            }
            else{
                for(int i=down; i>=top; i--){
                    spirally.add(matrix[i][left]);
                }
                left++;
            }
            dir=(dir+1)%4;
        }
        return spirally;
    }
}
