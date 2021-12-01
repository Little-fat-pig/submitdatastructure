package com.linkedList;

/*
 *@author zhangxl
 *@Date 2021/12/1 23:13
 *@description  构建linkedlist
 */


public class CreatelinkedList {

    public static void main(String[] args) {
        ListNode listNode=new ListNode(1);
        for (int i = 0; i < 5; i++) {
            listNode.add(i);
        }
        listNode.print();
    }


}


class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data=data;
    }
///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  永不过期token   使用所有的资源库
    //https://github.com/zxl1104900131/submitdatastructure.git
    public void add(int newval){
        ListNode listNode=new ListNode(newval);
        if (this.next==null){
            this.next=listNode;
            // bbnb
        }else {
            this.next.add(newval);
        }
    }
    public void print(){
        System.out.println(this.data);
        if (this.next!=null){
            System.out.println("-->");
            this.next.print();
        }
    }
}