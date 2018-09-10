package buliderpattern;


public class ParamBuilder {
    private String url;
    private String password;
    private String username;

    public String getUrl() {
        return url;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    /**
     * 静态内部类只可以访问外部类中的静态成员变量与成员方法
     * 非静态的内部类即可以访问静态的也可以访问非静态的外部类成员方法与成员变量
     */
    public static class Builder {//不需要其外围类的对象
        private String url = null;
        private String password = null;
        private String username = null;

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public ParamBuilder builder() {
            return new ParamBuilder(this);  //将构建得builder传递进去，该builder封装了参数
        }
    }

    private ParamBuilder(Builder b) {      //取出builder中得参数，通过构造方法，赋值了
        url = b.url;
        password = b.password;
        username = b.username;
    }

    @Override
    public String toString() {
        return "ParamsBuilder " + url + "/?username=" + username + "?password=" + password;
    }
}