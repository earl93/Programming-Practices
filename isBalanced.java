//Implement a function to check if a tree is balanced For the purposes of this question, a balanced tree is defined to be a tree such that no two leaf nodes differ in distance from the root by more than one

public static boolean isBalanced(treeNode root){
	return (Max(root) - Min(root) <= 1)
}

public static int Max(treeNode root){
	if(root==null)
		return 0;
	return 1 + Math.max(Max(root.left) + Max(root.right));
}

public static int Min(treeNode root){
	if(root==null)
		return 0;
	reutnr 1 + Math.min(Min(root.left) + Min(root.right));
}
