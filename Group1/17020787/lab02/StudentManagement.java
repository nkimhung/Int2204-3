package hung;
/**
 * 
 * @author Nguyễn Kim Hùng
 * 
 *
 */
class StudentManagement {
	public student[] hs=new student[100];
	
	public  boolean sameGroup(student s1,student s2) {
		/**
		 * sameGroup dùng để kiểm tra xem 2 student có cùng nhóm lớp không
		 * @param s1 là tham số đầu tiên thể hiện student 1
		 * @param s2 là tham số thứ 2 thể hiện student thứ 2
		 * @return trả về true khi 2 student cùng nhóm lớp ngược lại false
		 */
		return s1.getGroup().equals(s2.getGroup()); 
	}
	
	public static void main(String [] args) {
		StudentManagement a =new StudentManagement();
		student hung=new student();
		student duc=new student("bo","000","K60");
		duc.setGroup("K62CD");
		int i;
		student trang=new student(duc);
		a.hs[0]=new student();
		a.hs[1]=new student();
		a.hs[2]=new student();
		a.hs[3]=new student();
		a.hs[4]=new student();
		a.hs[5]=new student();
		a.hs[6]=new student();
		a.hs[3].setGroup("K60");
		a.hs[5].setGroup("K60");
		a.hs[3].setId("K59");
		a.hs[5].setId("K60");
		a.hs[6].setId("K59");
		a.hs[1].setId("52");
		a.hs[2].setId("52");
		
		
		System.out.println(hung.getInfo()+"\n"+duc.getInfo()+"\n"+trang.getInfo());
		if(a.sameGroup(hung,duc)) System.out.println("\ndai ca");
		else System.out.println("em \n");
		
		
		a.removeStudent("52");
		a.StudentsByGroup();
		for(i=0;a.hs[i]!=null;i++) {
			System.out.println(i+a.hs[i].getInfo());
		}
		
		
	}
	public void StudentsByGroup(){
		/**
		 * StudentByGroup dùng để sắp xếp lại danh sách student theo nhóm lớp
		 * @param n là tham số thể hiện số lượng student trong danh sách
		 */
		int i ,j;
		student temp;
		String s3;
		String s4;
		for(i=0;hs[i]!=null;i++) {
			for(j=0;hs[j+1]!=null;j++) {
				s3=hs[j].getGroup();
				s4=hs[j+1].getGroup();
				if(s3.compareTo(s4)>0) {
					temp=hs[j];
					hs[j]=hs[j+1];
					hs[j+1]=temp;
				}
			}
		}
	}
	public void removeStudent(String Id) {
		/**
		 * removeStudent dùng dể xóa những student có mã số là id
		 * param Id là tham số biểu thị mã số id cần xóa
		 */
		int i,j;
		for(i=0;hs[i]!=null;i++)
			if(hs[i].getId().equals(Id)) {
				for(j=i;hs[j+1]!=null;j++)
					hs[j]=hs[j+1];
				hs[j]=null;
				i--;
			}
	}
}

