package com.Action;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年6月19日 上午11:09:29
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public class UpperAction implements Action{
	
		private String message;
		
	
		public String getMessage() {
			return message;
		}


		public void setMessage(String message) {
			this.message = message;
		}

		@Override
		public String execute(String str) {
			
			return (getMessage()+str).toUpperCase();
			
		}

}
