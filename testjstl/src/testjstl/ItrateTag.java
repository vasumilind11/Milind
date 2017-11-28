package testjstl;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class ItrateTag extends TagSupport{
	
	int power,number,counter=0,result=1;

	public void setPower(int power) {
		this.power = power;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public int doStartTag()
	{   System.out.print("do start body");
		return  EVAL_BODY_INCLUDE;
	}
	public int doAfterBody() {
		;
		System.out.print("do afterbody");
		if(counter<=power)
		{   
			counter++;
			result = result*number;
		    return EVAL_BODY_AGAIN;
		}
		else
		{
			return SKIP_BODY;
		}
		
		
	}
	public int doEndTag()
	{
		 System.out.print("doend"+result);
		 JspWriter out = pageContext.getOut();
		 try 
		 {
			out.print(result);
	
		}   catch (IOException e) {
	
			e.printStackTrace();
		}
		 return EVAL_PAGE;
	}

}
