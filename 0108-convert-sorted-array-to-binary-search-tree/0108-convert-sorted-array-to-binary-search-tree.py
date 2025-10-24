# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sortedArrayToBST(self, nums: List[int]) -> Optional[TreeNode]:
        def built_tree(root, start,end):
            if start>=end:
                return None
            mid = (end+start)//2
            ele = nums[mid]
            root = TreeNode(ele)
            root.left = built_tree(root.left, start,mid)
            root.right = built_tree(root.right, mid+1,end)
            return root
        return built_tree(None, 0, len(nums))
        
        