
package labs ;

import java.util.Arrays ;

/**
 * @author diazk2
 * @version 1.0.0 2022-01-26 Initial implementation
 */
public class DoublyLinkedList<T>
    {

    private DNode<T> head ;
    private DNode<T> tail ;
    private int size ;

    public DoublyLinkedList()
        { // creates an empty list
        head = tail = null ;
        size = 0 ;
        }

// In general, the linked-list class should hav more methods.
// Particularly, the methods delete (T item), contains (T item),
// delete (int index), add (int index, T item), getFrequencyOf (T item).
// For the purpose od testing the sorting functionality, only the methods
// that are listed here are needed. You may volunteer to add other
// methods as well.


    public int getSize()
        {
        return size ;
        }


    protected DNode<T> getHead()
        {
        return head ;
        }


    protected DNode<T> getTail()
        {
        return tail ;
        }


    public boolean isEmpty()
        {
        // Done
        return this.size == 0 ;
        }


    public void add( T item )
        {
        DNode<T> newNode = new DNode<T>( item ) ;

        if ( this.head == null )
            {
            this.head = newNode ;
            this.tail = newNode ;
            }
        else
            {
            newNode.setPrev( this.tail ) ;
            this.tail.setNext( newNode ) ;
            this.tail = newNode ;
            }
        this.size++ ;

        }


    public void add( int index,
                     T item )
        {
        DNode<T> newNode = new DNode<T>( item ) ;

        if ( this.head == null )
            {
            this.head = newNode ;
            this.tail = newNode ;
            }
        else if ( index == this.size )
            {
            newNode.setPrev( this.tail ) ;
            this.tail.setNext( newNode ) ;
            this.tail = newNode ;
            }
        else if ( index == 0 )
            {
            newNode.setNext( this.head ) ;
            this.head.setPrev( newNode ) ;
            this.head = newNode ;
            }
        else
            {
            DNode<T> currentNode = this.head ;

            for ( int i = 1 ; i < index ; i++ )
                {
                currentNode = currentNode.getNext() ;
                }

            newNode.setNext( currentNode.getNext() ) ;
            currentNode.setNext( newNode ) ;
            newNode.setPrev( currentNode ) ;
            newNode.getNext().setPrev( newNode ) ;

            }
        this.size++ ;

        }


    public Object delete( T item )
        {
        DNode<T> currentNode = this.head ;
        T data = null ;

        while ( currentNode.getData() != item )
            {
            currentNode = currentNode.getNext() ;
            }

        if ( currentNode.getData() == item )
            {
            data = currentNode.getData() ;
            currentNode.getPrev().setNext( currentNode.getNext() ) ;
            currentNode.getNext().setPrev( currentNode.getPrev() ) ;

            }
        this.size-- ;
        return data ;

        }


    public Object delete( int index )
        {
        T data = null ;

        if ( index == 0 )
            {
            data = this.head.getData() ;
            this.head = this.head.getNext() ;
            this.head.setPrev( null ) ;
            }
        else if ( index == this.size )
            {
            data = this.tail.getData() ;
            this.tail.getPrev().setNext( null ) ;
            }
        else
            {
            DNode<T> currentNode = this.head ;

            for ( int i = 1 ; i < index ; i++ )
                {
                currentNode = currentNode.getNext() ;
                }
            data = currentNode.getData() ;
            currentNode.getPrev().setNext( currentNode.getNext() ) ;
            currentNode.getNext().setPrev( currentNode.getPrev() ) ;

            }
        this.size-- ;
        return data ;

        }


    public void swapWithPreviousNode( DNode<T> node )
        {
        T tempData = null;
        
        tempData = node.getData() ;
        
        node.setData( node.getPrev().getData() );
        node.getPrev().setData( tempData );
        
        }


    public T[] toArray()
        {
        // Done
        final T[] result = (T[]) new Comparable<?>[ this.size ] ;

        DNode<T> currentNode = this.head ;
        int index = 0 ;

        while ( currentNode != null )
            {
            result[ index ] = currentNode.getData() ;

            currentNode = currentNode.getNext() ;
            index++ ;
            }

        return result ;
        }

    }
// end class DoublyLinkedList