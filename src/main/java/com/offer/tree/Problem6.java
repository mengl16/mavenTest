package com.offer.tree;

import java.util.Arrays;

/**
 * @ClassName Problem6
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/20 17:46
 * Version 1.0
 **/
public class Problem6 {

    public static void main(String[] args) throws Exception {
        int[] preSort={1,2,4,7,3,5,6,8};
        int[] inSort={4,7,2,1,5,3,8,6};
        BinaryTreeNode root=constructCore(preSort,inSort);
        System.out.println("----------------------------pre");
        preSort(root);
        System.out.println("----------------------------in");
        inSort(root);
        System.out.println("----------------------------after");
        afterSort(root);
        System.out.println((Arrays.toString(Arrays.copyOfRange(preSort,1,2))));
    }

    private static BinaryTreeNode constructCore(int[] preSort, int[] inSort) throws Exception {
        if(preSort.length==0|| inSort.length == 0){
            return null;
        }
        if(preSort.length!=inSort.length){
            throw new Exception("长度不一样，非法参数");
        }
        BinaryTreeNode root = new BinaryTreeNode();

        for(int i =0;i<inSort.length;i++){
            if(inSort[i]==preSort[0]){
                root.setValue(preSort[0]);
                System.out.println(root.value);
                root.setLeftNode(constructCore(Arrays.copyOfRange(preSort,1,i+1),Arrays.copyOfRange(inSort,0,i)));
                root.setRightNode(constructCore(Arrays.copyOfRange(preSort,i+1,preSort.length),Arrays.copyOfRange(inSort,i+1,inSort.length)));
            }
        }

        return root;
    }

    public static void preSort(BinaryTreeNode node){
        if(node==null){
          return;
        }
        if(node!=null){
            System.out.println(node.getValue());
            if(node.getLeftNode()!=null){
                preSort(node.getLeftNode());
            }
            if(node.getRightNode()!=null){
                preSort(node.getRightNode());
            }


        }

    }

    public static void inSort(BinaryTreeNode node){
        if(node==null){
            return;
        }
        if(node!=null){
            if(node.getLeftNode()!=null){
                inSort(node.getLeftNode());
            }
            System.out.println(node.getValue());
            if(node.getRightNode()!=null){
                inSort(node.getRightNode());
            }
        }
    }

    public static void afterSort(BinaryTreeNode node){
        if(node==null){
            return;
        }
        if(node!=null){
            if(node.getLeftNode()!=null){
                afterSort(node.getLeftNode());
            }
            if(node.getRightNode()!=null){
                afterSort(node.getRightNode());
            }
            System.out.println(node.getValue());
        }
    }
}
