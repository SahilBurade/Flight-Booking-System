package com.youtube.jwt.entity;
/**
*
*
* @author Sahil Burade
*/
public class JwtRequest {
	/**
	 *
	 *
	 * @author Sahil Burade
	 */
    private String userName;
    private String userPassword;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
