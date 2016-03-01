import utils.Tag;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * DOM Tree Node
 */
public class Node {

    public Tag htmlTag;
    public String id;
    public String content;
    public HashMap<String, String> attributes;
    public Node parent;
    public List<Node> children;

    public Node(Tag htmlTag,String id){
        this.htmlTag = htmlTag;
        this.id = id;
        attributes = new HashMap<String, String>();
        children = new ArrayList<Node>();
    }

    public void setAttributes(HashMap<String, String> attributes) {
        this.attributes = attributes;
    }

    public void addAttribute(String key, String value){
        attributes.put(key,value);
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    public void addChild(Node node){
        children.add(node);
    }

    public Tag getHtmlTag() {
        return htmlTag;
    }

    public String getId() {
        return id;
    }

    public HashMap<String, String> getAttributes() {
        return attributes;
    }

    public Node getParent() {
        return parent;
    }

    public List<Node> getChildren() {
        return children;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString(){
        return content;
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
