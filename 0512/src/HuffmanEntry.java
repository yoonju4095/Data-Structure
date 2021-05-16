public class HuffmanEntry {
	private int frequency; // �� ��
	private String word; // ���ĸ� ����� ���� �Ǵ� ���γ���� �ռ��� ���ڿ�
	private HuffmanEntry left; // ���� �ڽ�
	private HuffmanEntry right; // ������ �ڽ�
	private String code; // ������ �ڵ�

	public HuffmanEntry(int newFreq, String newValue, HuffmanEntry l, HuffmanEntry r, String s) {
		frequency = newFreq;
		word = newValue;
		left = l;
		right = r;
		code = s;
	}

	public int getKey() {
		return frequency;
	}

	public String getValue() {
		return word;
	}

	public String getCode() {
		return code;
	}

	public HuffmanEntry getLeft() {
		return left;
	}

	public HuffmanEntry getRight() {
		return right;
	}

	public void setCode(String newCode) {
		code = newCode;
	}
}
