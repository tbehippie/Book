package book.check.domain;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class WithBook {
	private Long w_no;
	private String w_title;
	private String w_memo;
	private String w_area;
	private String w_pwd;
	private Date w_date;
	private Boolean w_yn = false;
	
	public WithBook() {}
	
	public WithBook(String w_title, String w_memo, String w_pwd, String w_area) {
		this.w_title = w_title;
		this.w_memo = w_memo;
		this.w_pwd = w_pwd;
		this.w_area = w_area;
	}
}
