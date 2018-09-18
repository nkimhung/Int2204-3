package hung;

 class student {
	 private  String name, id,group,email;
	 public String getName() {
		 return name;
		 
	 }
	 public String getId() {
		 return id;
	 }
	 public String getGroup() {
		 return group;
	 }
	 public String getEmail() {
		 return email;
	 }
	 public void setName(String Name) {
		 name=Name;
	 }
	 public void setId(String Id) {
		 id=Id;
	 }
	 public void setGroup(String Group) {
		 group=Group;
	 }
	 public void setEmail(String Email) {
		 email=Email;
	 }
	 String getInfo() {
		 return "name:"+ name +"\nid:"+ id +"\ngroup:"+ group +"\nemail:"+email;
	 }
	 public student() {
		 name="Student";
		 id="000";
		 group="K59CB";
		 email="uet@vnu.edu.vn";
	 }
	 public student(String Name,String Id,String Email) {
		 name=Name;
		 id=Id;
		 group="K59CB";
		 email=Email;
	 }
	 public student(student s) {
		 name=s.getName();
		 id=s.getId();
		 group=s.getGroup();
		 email=s.getEmail();
	 }
	 
	 

}
