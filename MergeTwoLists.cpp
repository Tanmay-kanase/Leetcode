#include <iostream>
using namespace std;

struct ListNode {
    int val;
    ListNode* next;
    ListNode(int x) : val(x), next(nullptr) {}
};


ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
    ListNode* dummy = new ListNode(0);
    ListNode* current = dummy;

    while (l1 && l2) {
        if (l1->val < l2->val) {
            current->next = l1;
            l1 = l1->next;
        } else {
            current->next = l2;
            l2 = l2->next;
        }
        current = current->next;
    }

    if (l1) {
        current->next = l1;
    } else {
        current->next = l2;
    }

    return dummy->next;
}

void printList(ListNode* head) {
    ListNode* current = head;
    while (current) {
        cout << current->val << " ";
        current = current->next;
    }
    cout << endl;
}

int main() {
    ListNode* l1 = new ListNode(1);
    l1->next = new ListNode(3);
    l1->next->next = new ListNode(5);

    ListNode* l2 = new ListNode(2);
    l2->next = new ListNode(4);
    l2->next->next = new ListNode(6);

    cout << "First list: ";
    printList(l1);
    cout << "Second list: ";
    printList(l2);

    ListNode* mergedList = mergeTwoLists(l1, l2);

    cout << "Merged list: ";
    printList(mergedList);

    while (l1) {
        ListNode* temp = l1;
        l1 = l1->next;
        delete temp;
    }
    while (l2) {
        ListNode* temp = l2;
        l2 = l2->next;
        delete temp;
    }
    while (mergedList) {
        ListNode* temp = mergedList;
        mergedList = mergedList->next;
        delete temp;
    }

    return 0;
}

