package tokensystem;


import utils.Tag;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Tokenizer {

    private List<TokenInfo> tokens;

    public Tokenizer(){
        tokens = new ArrayList<TokenInfo>();
    }

    private class TokenInfo{
        public final Pattern pattern;
        public final Tag htmlTag;
        private TokenInfo(Pattern pattern, Tag htmlTag) {
            this.pattern = pattern;
            this.htmlTag = htmlTag;
        }
    }

    public void add(String regex,Tag htmlTag){
        tokens.add(new TokenInfo(Pattern.compile(regex),htmlTag));
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
