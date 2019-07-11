package model;

/**
 * @author mcy
 * @date 2019/7/11
 */
public class UserRel {

    /**
     * 用户名
     */
    private String userName;

    /**
     * 负责人名
     */
    private String leadingName;

    public UserRel() {
    }

    public String getUserName() {
        return userName;
    }

    public String getLeadingName() {
        return leadingName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setLeadingName(String leadingName) {
        this.leadingName = leadingName;
    }
}
