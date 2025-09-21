package demo;

public class UserAPI {

    @APIInfo(endpoint="/users", method="GET")
    public void listUsers() { }

    @APIInfo(endpoint="/users", method="POST")
    public void createUser() { }

    @APIInfo(endpoint="/users/{id}", method="GET")
    public void getUser() { }

    @APIInfo(endpoint="/users/{id}", method="DELETE")
    public void deleteUser() { }
}
