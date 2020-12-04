package com.para.leetcode.sort;

public class HeapSort<T extends Number> extends Sort {

    @Override
    public void sort() {

//        for(int i = (this.arr.length - 1) / 2; i >= 0; i--)  {
//            adjustHeap(arr, i, arr.length);
//        }
//
//        for (int i = arr.length - 1; i > 0; i--) {
//            //将堆顶元素与末尾元素进行交换
//            int temp = arr[i];
//            arr[i] = arr[0];
//            arr[0] = temp;
//
//            //重新对堆进行调整
//            adjustHeap(arr, 0, i);
//        }
        //创建堆
    }


//    private void adjustHeap(T[] arr, int parent, int length) {
//        //将temp作为父节点
//        T temp = arr[parent];
//
//        //左孩子
//        int lChild = 2 * parent + 1;
//
//        while (lChild < length) {
//            //右孩子
//            int rChild = lChild + 1;
//
//            // 如果有右孩子结点，并且右孩子结点的值大于左孩子结点，则选取右孩子结点
//            if(rChild < length && arr[lChild] < arr[rChild]) {
//                lChild ++;
//            }
//
//            // 如果父结点的值已经大于孩子结点的值，则直接结束
//            if(temp >= arr[lChild]) {
//                break;
//            }
//
//            // 把孩子结点的值赋给父结点
//            arr[parent] = arr[lChild];
//
//            //选取孩子结点的左孩子结点,继续向下筛选
//            parent = lChild;
//            lChild = 2 * lChild + 1;
//        }
//        arr[parent] = temp;
//    }
}
