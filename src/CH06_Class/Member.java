package CH06_Class;

public class Member {

	int memberNo;
	String memberId;
	String memberName;

	public Member (int memberNo, String memberId, String memberName) {
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberName = memberName;
		//this. = 자신의 객체
		//
	}
	
	/**@Override
	public String to String{
	return memberNo+"."+memberId+"("=memberName+")";
	}
	*/
}