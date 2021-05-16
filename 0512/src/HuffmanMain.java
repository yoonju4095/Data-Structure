public class HuffmanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HuffmanEntry[] a; // a[0]�� ��� ����
		a = new HuffmanEntry[7];
		a[1] = new HuffmanEntry(60, "a", null, null, null);
		a[2] = new HuffmanEntry(20, "b", null, null, null);
		a[3] = new HuffmanEntry(30, "c", null, null, null);
		a[4] = new HuffmanEntry(35, "d", null, null, null);
		a[5] = new HuffmanEntry(40, "e", null, null, null);
		a[6] = new HuffmanEntry(90, "f", null, null, null);
		Huffman h = new Huffman(a, 6);
		System.out.println("�ּ��� ����� ��");
		h.print();
		h.createHeap();
		System.out.println("�ּ���:");
		h.print();
		System.out.println("������ �ڵ�");
		HuffmanEntry root = h.createTree();
		h.preorder(root);
		System.out.println();
	}

}
