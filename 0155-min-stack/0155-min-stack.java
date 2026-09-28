class Pair{
    int data,min;
    Pair(int d,int m){
        data=d;
        min=m;
    }
}
class MinStack {
      Stack<Pair> st;
      int mini=Integer.MAX_VALUE;
    public MinStack() {
        st=new Stack<>();
    }
    
    public void push(int value) {
        if(mini> value){
            mini=value;
        }
        st.push(new Pair(value,mini));
    }
    
    public void pop() {
        if(st.isEmpty()) return;
        st.pop();
        if(!st.isEmpty()){
            mini=st.peek().min;
        }else{
            mini=Integer.MAX_VALUE;;
        }
    }
    
    public int top() {
        if(st.isEmpty()) return -1;
        return st.peek().data;
    }
    
    public int getMin() {
        int m=st.peek().min;
        return m;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */