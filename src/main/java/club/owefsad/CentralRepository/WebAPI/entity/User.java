package club.owefsad.CentralRepository.WebAPI.entity;

public class User {

    Integer id;
    String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public int getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = (int) (createTime / 1000);
    }

    public Integer getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(long loginTime) {
        this.loginTime = (int) (loginTime / 1000);
    }

    String password;
    Integer createTime;
    Integer loginTime;
}
