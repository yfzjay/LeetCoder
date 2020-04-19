package LeetCode.Sort;

import java.util.PriorityQueue;

public class L215 {
    //解决Kth问题：排序，堆（优先队列），分治
    //1、分治
    public int findKthLargest(int[] nums, int k) {
        //因为这里是从大到小第k个
        k=nums.length-k;
        int l=0,h=nums.length-1;
        //这里用的while而不是递归，递归也可以解决
        while(l<h){
            int j=partition(nums,l,h);
            if(j==k) break;
            else if(j<k){
                l=j+1;
            }else{
                h=j-1;
            }
        }
        return nums[k];
    }
    public int partition(int[] nums,int l,int h){
        int i=l,j=h+1;
        int pivot=nums[l];
        while(true){
            while(nums[++i]<pivot&&i<h);
            while(nums[--j]>pivot&&j>l);
            if(i>=j) break;
            swap(nums,i,j);
        }
        swap(nums,l,j);
        return j;
    }
    public void swap(int[] nums,int i,int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }

    //2、堆：用java库中的优先队列
    public int findKthLargest1(int[] nums, int k) {
        //建立一个小顶堆，每次向其中添加元素，如果大于k个poll一次堆顶，最后剩下的就是最大的k个，并且
        //堆顶是最大的k个中最小的
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        for(int num:nums){
            priorityQueue.add(num);
            if(priorityQueue.size()>k){
                priorityQueue.poll();
            }
        }
        return priorityQueue.peek();
    }

    //2、堆：手写
    // 父节点
    private int parent(int n) {
        return (n - 1) / 2;
    }

    // 左孩子
    private int left(int n) {
        return 2 * n + 1;
    }

    // 右孩子
    private int right(int n) {
        return 2 * n + 2;
    }

    // 构建堆
    private void buildHeap(int n, int[] data) {
        for(int i = 1; i < n; i++) {
            int t = i;
            // 通过一个一个添加元素构建堆：上浮操作
            int tmp=data[i];
            while(t != 0 && data[parent(t)] > tmp) {
                //int temp = data[t];
                data[t] = data[parent(t)];
                //data[parent(t)] = temp;
                t = parent(t);
            }
            data[t]=tmp;
        }
    }
    //替换 下沉操作
    private void adjust(int i,int n,int[] data){
        if(data[0]>data[i]) return;
        int tmp=data[0];
        data[0]=data[i];
        data[i]=tmp;
        int t=0;
        tmp=data[0];
        while((left(t)<n&&tmp>data[left(t)])||(right(t)<n&&tmp>data[right(t)])){
            if(right(t)<n&&data[right(t)]<data[left(t)]){
                data[t]=data[right(t)];
                t=right(t);
            }else{
                data[t]=data[left(t)];
                t=left(t);
            }
        }
        data[t]=tmp;
    }
    // 寻找topN，该方法改变data，将topN排到最前面
    public void findTopN(int n, int[] data) {
        // 先构建n个数的小顶堆
        buildHeap(n, data);
        for(int num:data){
            System.out.println(num);
        }
        // n往后的数进行调整
        for(int i = n; i < data.length; i++) {
            adjust(i, n, data);
        }
        System.out.println("-----------");
        for(int num:data){
            System.out.println(num);
        }
    }
    public int findKthLargest2(int[] nums, int k) {
        //因为这里是从大到小第k个
        findTopN(k,nums);
        return nums[0];
    }

    public static void main(String[] args) {
        int[] a=new int[]{3,2,3,1,2,4,5,5,6};
        new L215().findKthLargest2(a,4);
    }
}
