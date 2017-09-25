import javax.faces.bean.ManagedBean;
@ManagedBean
public class login_bean {
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String login() {
		if (username.equals("admin") && password.equals("admin")) {
			return "success";
		}
		else {
			return "failure";
			}
		}
	
}
