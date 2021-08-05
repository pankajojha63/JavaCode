package test;

public final class ImmutableDemo {
	final String username;
	final String pwd;

	public ImmutableDemo(String username, String pwd) {
		this.pwd = pwd;
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public String getPwd() {
		return pwd;
	}

}
