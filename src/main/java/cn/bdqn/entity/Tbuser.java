package cn.bdqn.entity;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by HP on 2017/5/17.
 */
public class Tbuser {
    private int userid;
    private String username;
    private String password;
    private String userroles;
    private String nickname;
    private Date dateofbirth,registretiontime,systemtime;

    public Tbuser() {
    }

    @Override
    public String toString() {
        return "Tbuser{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userroles='" + userroles + '\'' +
                ", nickname='" + nickname + '\'' +
                ", dateofbirth=" + dateofbirth +
                ", registretiontime=" + registretiontime +
                ", systemtime=" + systemtime +
                '}';
    }

    public Tbuser(int userid, String username, String password, String userroles, String nickname, Date dateofbirth, Date registretiontime, Date systemtime) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.userroles = userroles;
        this.nickname = nickname;
        this.dateofbirth = dateofbirth;
        this.registretiontime = registretiontime;
        this.systemtime = systemtime;
    }

    public Tbuser(String username, String password, String userroles, String nickname) {
        this.username = username;
        this.password = password;
        this.userroles = userroles;
        this.nickname = nickname;
    }

    public Tbuser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Tbuser(int userid, String username, String password, String userroles, String nickname) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.userroles = userroles;
        this.nickname = nickname;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
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

    public String getUserroles() {
        return userroles;
    }

    public void setUserroles(String userroles) {
        this.userroles = userroles;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public Date getRegistretiontime() {
        return registretiontime;
    }

    public void setRegistretiontime(Timestamp registretiontime) {
        this.registretiontime = registretiontime;
    }

    public Date getSystemtime() {
        return systemtime;
    }

    public void setSystemtime(Timestamp systemtime) {
        this.systemtime = systemtime;
    }
}
