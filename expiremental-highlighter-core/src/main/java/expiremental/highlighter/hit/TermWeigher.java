package expiremental.highlighter.hit;

/**
 * Weigh a hit based on the term that it represents.
 */
public interface TermWeigher<T> {
    /**
     * Weigh a hit based on the term that it represents.
     */
    float weigh(T term);
}
