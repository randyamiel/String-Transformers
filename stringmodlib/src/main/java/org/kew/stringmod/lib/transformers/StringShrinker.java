package org.kew.stringmod.lib.transformers;

/**
 * Crops/shrinks a string to a length of `shrinkTo` characters.
 */
public class StringShrinker implements Transformer {

    private Integer shrinkTo = null;

    public StringShrinker(int shrinkTo) {
        this.shrinkTo = shrinkTo;
    }

    @Override
    public String transform(String s) {
        if (s.length() > this.shrinkTo) s = s.substring(0, this.shrinkTo);
        return s;
    }

    public Integer getShrinkTo() {
        return shrinkTo;
    }

    public void setShrinkTo(Integer shrinkTo) {
        this.shrinkTo = shrinkTo;
    }
}
