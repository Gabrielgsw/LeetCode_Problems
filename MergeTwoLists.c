/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

//Link: https://leetcode.com/problems/merge-two-sorted-lists/?envType=problem-list-v2&envId=linked-list
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    
    if(list1 == NULL){
        return list2;
    }

    if(list2 == NULL){
        return list1;
    }

    struct ListNode* listMerged = NULL;

    if(list1->val <= list2->val){
        listMerged = list1;
        listMerged->next = mergeTwoLists(list1->next,list2);
    }

    else{
        listMerged = list2;
        listMerged->next = mergeTwoLists(list1,list2->next);
    }

    return listMerged;

}
