
/**
 * DOM for the html page
 * Build the DOM, Query it for anything.
 */

//  DOM is specifically written for HTML
//  Little Static,but faster Query Service Buddy.
public class DOM {
    private Node root;
    private Node head;
    private Node body;

    public DOM(Node root){
        this.root = root;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getBody() {
        return body;
    }

    public void setBody(Node body) {
        this.body = body;
    }

//   Parse the given input Query
    public String query(String query){
        return null;
    }

    @Override
    public String toString(){
        return null;
    }

    @Override
    public int hashCode(){
        return 0;
    }

    @Override
    public boolean equals(Object obj){
        return false;
    }
}
