class DD {
	int bun;
	String name;
	int age;

	DD() {
	}

	DD(int bun, String name, int age) {
		this.bun = bun;
		this.name = name;
		this.age = age;
	}

	void ddPrint() {
		System.out.print(bun + "\t");
		System.out.print(name + "\t");
		System.out.println(age);
	}
}

class Process {
	void ddSort(DD dd[]) {
		for (int i = 0; i < dd.length - 1; i++) {
			for (int j = i + 1; j < dd.length; j++) {
				if (dd[i].bun > dd[j].bun) {
					DD temp = dd[i];
					dd[i] = dd[j];
					dd[j] = temp;
				}
			}
		}
	}

}

public class Exam_03 {
	/*
	 * static void ddSort(DD dd[]) { for(int i=0; i<dd.length-1; i++) { for(int
	 * j=i+1; j<dd.length;j++) { if(dd[i].bun>dd[j].bun) { DD temp = dd[i]; dd[i] =
	 * dd[j]; dd[j] = temp; } } } }
	 */
	public static void main(String[] args) {
		DD dd[] = new DD[5];
		dd[0] = new DD(3, "aaa", 23);
		dd[1] = new DD(1, "bbb", 33);
		dd[2] = new DD(5, "ccc", 25);
		dd[3] = new DD(2, "ddd", 27);
		dd[4] = new DD(4, "eee", 29);

		System.out.println("번호\t이름\t나이");
		for (DD d : dd) {
			d.ddPrint();
		}
		// 정렬메소드 호출
		// ddSort(dd);
		Process pro = new Process();
		pro.ddSort(dd);
		// 정렬후 출력
		System.out.println("번호\t이름\t나이");
		for (DD d : dd) {
			d.ddPrint();
		}

	}

}
