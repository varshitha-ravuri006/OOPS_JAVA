package demo;

@APIDescription(description = "Organization using custom annotations to embed API docs for toolchains.")
public class DocExampleOrg {

    @APIDescription(description = "Returns a friendly greeting.")
    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}
