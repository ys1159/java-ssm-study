package pojo;


public class TUser {

  private Integer id;
  private String uname;
  private String pwd;
  private Integer age;
  private String sex;
  private String email;

  public TUser() {
  }

  public TUser(Integer id, String uname, String pwd, Integer age, String sex, String email) {
    this.id = id;
    this.uname = uname;
    this.pwd = pwd;
    this.age = age;
    this.sex = sex;
    this.email = email;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUname() {
    return uname;
  }

  public void setUname(String uname) {
    this.uname = uname;
  }

  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "TUser{" +
            "id=" + id +
            ", uname='" + uname + '\'' +
            ", pwd='" + pwd + '\'' +
            ", age=" + age +
            ", sex='" + sex + '\'' +
            ", email='" + email + '\'' +
            '}';
  }
}
