import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * NodeTest Test Cases
 */
public class NodeTest {

    @Test
    public void shouldTestCheckInstance(){
        Node htmlNode = new Node(Tag.HTML, null);
        htmlNode.addChild(new Node(Tag.HEAD,null));
        List<Node>  actualChildren = htmlNode.getChildren();

        List<Node> expectedChildren = new ArrayList<Node>();
        expectedChildren.add(new Node(Tag.HEAD,null));
        assertTrue(actualChildren == expectedChildren);
    }
}