package lab20;

/**
 * Create interface.
 * @param <S>
 */

public interface Storable <S> {

     S read();
     void write (S data);
     Type getType();

}
