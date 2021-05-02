
import java.util.Queue;
import java.util.LinkedList;

public class BinaryTree<Key extends Comparable<Key>> {
	private BTNode<Integer> root;

	public BinaryTree() {
		root = null;
	} // Ʈ�� ������

	public BTNode<Integer> getRoot() {
		return root;
	}

	public void setRoot(BTNode<Integer> newRoot) {
		root = newRoot;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void preorder(BTNode<Integer> n) { // ���� ��ȸ
		if (n != null) {
			System.out.print(n.getKey() + " "); // ��� n �湮
			preorder(n.getLeft()); // n�� ���� ���� Ʈ���� ��ȸ�ϱ� ����
			preorder(n.getRight()); // n�� ������ ���� Ʈ���� ��ȸ�ϱ� ����
		}
	}

	public void inorder(BTNode<Integer> n) { // ���� ��ȸ
		if (n != null) {
			inorder(n.getLeft()); // n�� ���� ���� Ʈ���� ��ȸ�ϱ� ����
			System.out.print(n.getKey() + " "); // ��� n �湮
			inorder(n.getRight()); // n�� ������ ���� Ʈ���� ��ȸ�ϱ� ����
		}
	}

	public void postorder(BTNode<Integer> n) { // ���� ��ȸ
		if (n != null) {
			postorder(n.getLeft()); // n�� ���� ���� Ʈ���� ��ȸ�ϱ� ����
			postorder(n.getRight()); // n�� ������ ���� Ʈ���� ��ȸ�ϱ� ����
			System.out.print(n.getKey() + " "); // ��� n �湮
		}
	}

	public int size(BTNode<Integer> n) { // n�� ��Ʈ���ϴ� (����)Ʈ���� �ִ� ��� ��
		if (n == null)
			return 0; // null�̸� 0 ����
		else
			return (1 + size(n.getLeft()) + size(n.getRight()));
	}

	public int height(BTNode<Integer> n) { // n�� ��Ʈ���ϴ� (����)Ʈ���� ����
		if (n == null)
			return 0; // null�̸� 0 ����
		else
			return (1 + Math.max(height(n.getLeft()), height(n.getRight())));
	}

	public static boolean isEqual(BTNode<Integer> n, BTNode<Integer> m) {
		// �� Ʈ���� ���ϼ� �˻�
		if (n == null || m == null) // ���߿� �ϳ��� null�̸�
			return n == m; // �Ѵ� null�̸� true, �ƴϸ� false
		if (n.getKey().compareTo(m.getKey()) != 0) // �Ѵ� null�� �ƴϸ� item ��
			return false;
		return (isEqual(n.getLeft(), m.getLeft()) &&
		// item�� ������ ����/������ �ڽ����� ��� ȣ��
				isEqual(n.getRight(), m.getRight()));
	}

	public BTNode<Integer> copy(BTNode<Integer> n) {
		BTNode<Integer> left, right;
		if (n == null)
			return null;
		else {
			left = copy(n.getLeft());
			right = copy(n.getRight());
			return new BTNode<Integer>(n.getKey(), left, right);
		}
	}

	public void levelorder(BTNode<Integer> root) { // ���� ��ȸ
		Queue<BTNode<Integer>> q = new LinkedList<BTNode<Integer>>();
		// ť �ڷᱸ�� �̿�
		BTNode<Integer> t;
		q.add(root); // ��Ʈ ��� ť�� ����
		while (!q.isEmpty()) {
			t = q.remove(); // ť���� ���� �տ� �ִ� ��� ����
			System.out.print(t.getKey() + " "); // ���ŵ� ��� ���(�湮)
			if (t.getLeft() != null) // ���ŵ� ���� �ڽ��� null�� �ƴϸ�
				q.add(t.getLeft()); // ť�� ���� �ڽ� ����
			if (t.getRight() != null) // ���ŵ� ������ �ڽ��� null�� �ƴϸ�
				q.add(t.getRight()); // ť�� ������ �ڽ� ����
		}
	}

}
