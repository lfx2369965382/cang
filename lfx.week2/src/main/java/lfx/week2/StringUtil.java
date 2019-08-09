package lfx.week2;

public class StringUtil {
	
	public boolean hasLength(String src){
		if(!src.equals("")&&src!=null){
			return true;
		}else{
			return false;
		}
	}
	
	
	public boolean hasTest(String src){
		if(!src.equals("")&&src!=null&&!src.equals(" ")){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isMobile(String src){
		
		String reg="^1([38]\\d|5[0-35-9]|7[3678])\\d{8}$";
		
		boolean flag = reg.matches(src);
		
		return flag;
	}
	
	public boolean isEmail(String src){
		
		String reg = "^\\w{2,8}@(qq|163).com$";
		
		boolean flag = reg.matches(src);
		
		return flag;
		
	}
	
	public String reverse(String src){
		return new StringBuffer(src).reverse().toString();
	}
	
}
