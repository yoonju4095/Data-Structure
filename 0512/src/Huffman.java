
public class Huffman {
	private HuffmanEntry[] a; // a[0]�� ��� ����
	private int N; // ���� ũ��

	public Huffman(HuffmanEntry[] harray, int initialSize) { // ������
		a = harray;
		N = initialSize;
	}

	public int size() {
		return N;
	} // ���� ũ�� ����

	public void createHeap() { // �ּ��� �����
		for (int i = N / 2; i > 0; i--) {
			downheap(i);
		}
	}

	public HuffmanEntry createTree() {
		while (size() > 1) { // ���� 1���� ��常 ���� ������
			HuffmanEntry e1 = deleteMin(); // ������ �ּ� �󵵼� ���� ��� �����Ͽ� e1�� ����
			HuffmanEntry e2 = deleteMin(); // ������ �ּ� �󵵼� ���� ��� �����Ͽ� e2�� ����
			HuffmanEntry temp = new HuffmanEntry(e1.getKey() + e2.getKey(), // e1�� e2�� �󵵼��� �ջ�
					e1.getValue() + e2.getValue(), // string �̾���̱�
					e1, e2, " ");// e1,e2�� ���� ������� ����,������ �ڽ�
			insert(temp); // �� ��带 ���� ����
		}
		return deleteMin(); // 1�� ���� ���(��Ʈ ���)�� ������ �����ϸ� ����
	}

	public void preorder(HuffmanEntry node) { // ������ȸ�ϸ� ������ �ڵ带 �����, �� ���ĸ� ��忡�� �ڵ� ���
		if (node.getLeft() != null) {
			node.getLeft().setCode(node.getCode() + "0"); // �������� �������� �ڵ忡 0 �߰�
			preorder(node.getLeft());
		}
		if (node.getRight() != null) {
			node.getRight().setCode(node.getCode() + "1"); // ���������� �������� �ڵ忡 1 �߰�
			preorder(node.getRight());
		}
		if (node.getValue().length() == 1) { // ���� ��尡 ���ĸ� ����̸�, ������ �ڵ� ���
			System.out.print(node.getValue() + ":" + node.getCode() + " ");
		}
	}

	public void insert(HuffmanEntry newEntry) {
		a[++N] = newEntry; // ���ο� Ű�� �迭 ������ ���� ������ ����
		upheap(N); // ���� �ö󰡸� �� �Ӽ� ȸ����Ű�� ����
	}

	public HuffmanEntry deleteMin() {
		HuffmanEntry max = a[1]; // a[1]�� �ִ밪�� max��
		swap(1, N--); // ���� ������ �׸�� ��ȯ�ϰ� �� ũ�⸦ 1 ����
		a[N + 1] = null; // ������ �׸��� null�� ó��
		downheap(1); // �� �Ӽ��� ȸ����Ű�� ����
		return max;
	}

	private boolean greater(int i, int j) {
		return a[i].getKey() > a[j].getKey();
	}

	private void swap(int i, int j) { // a[i]�� a[j]�� ��ȯ
		HuffmanEntry temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	private void downheap(int i) { // i�� ���� ����� �ε���
		while (2 * i <= N) { // i�� ���� �ڽĳ�尡 ���� ������
			int k = 2 * i; // k�� ���� �ڽĳ���� �ε���
			if (k < N && greater(k, k + 1))
				k++; // ���ʰ� �������ڽ��� ���ڸ� �����Ͽ� k�� ������ �ε�������
			if (!greater(i, k))
				break; // ���� ��尡 �ڽ� ���ڿ� ���ų� ũ�� ������ �ߴ��ϰ�
			swap(i, k); // ���� ��尡 �ڽ� ���ں��� ������ ���� ���� �ڽ� ���ڿ� ��ȯ
			i = k; // �ڽ� ���ڰ� ���� ��尡 �Ǿ� �ٽ� �ݺ��ϱ� ����
		}
	}

	private void upheap(int j) { // j�� ���� ����� �ε���
		while (j > 1 && greater(j / 2, j)) { // �����尡 ��Ʈ�� �ƴϰ� ���ÿ� �θ� ������
			swap(j / 2, j); // �θ�� ���� ��� ��ȯ
			j = j / 2; // �θ� ���� ��尡 �Ǿ� �ٽ� �ݺ��ϱ� ����
		}
	}

	public void print() { // �� ���
		for (int i = 1; i < N + 1; i++) {
			System.out.printf("[" + a[i].getKey() + " " + a[i].getValue() + "] ");
		}
		System.out.println();
	}
}
