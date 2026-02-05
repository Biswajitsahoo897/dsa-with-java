import java.util.Stack;
public class MaxRectangularArea {
    static int maxArea(int []height){

        int maxarea=Integer.MIN_VALUE;
        int n=height.length;
        int []nsl=new int[n];
        int []nsr=new int[n];
        
        //next smaller right
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.empty() && height[st.peek()]>=height[i]){
                st.pop();
            }
            if(st.empty()) nsr[i]=n;
            else nsr[i]=st.peek();
            st.push(i);
        }

        //next smaller left
        st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.empty() && height[st.peek()]>=height[i]){
                st.pop();
            }
            if(st.empty()) nsl[i]=-1;
            else nsl[i]=st.peek();
            st.push(i);
        }

        for(int i=0;i<n;i++){
            int hei=height[i];
            int width=nsr[i]-nsl[i]-1;
            maxarea=Math.max(maxarea,hei*width);
        }
        return maxarea;
    }
    public static void main(String[] args) {
        int []height={2,1,5,6,2,3};
        System.out.print(maxArea(height));
    }
}
