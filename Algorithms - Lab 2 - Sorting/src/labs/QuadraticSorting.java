
package labs ;

import java.io.File ;
import java.io.FileNotFoundException ;
import java.io.FileWriter ;
import java.io.IOException ;
import java.util.Arrays ;
import java.util.Scanner ;

/**
 * @author Kevin Diaz & Thomas Webb
 * @version 1.0.0 2022-01-26 Initial implementation
 */
public class QuadraticSorting
    {

    public static <T extends Comparable<? super T>> void insertionSort( T[] list )
        {
        // Done
        for ( int j = 1 ; j < list.length ; j++ )
            {
            T key = list[ j ] ;
            int i = j - 1 ;

            while ( i >= 0 && list[ i ].compareTo( key ) > 0 )
                {
                list[ i + 1 ] = list[ i ] ;
                i = i - 1 ;
                list[ i + 1 ] = key ;
                }

            }
        }


    public static <T extends Comparable<? super T>> void selectionSort( T[] list )
        {
        // Done
        for ( int j = 0 ; j < list.length ; j++ )
            {
            int minimum = j ;

            for ( int i = j + 1 ; i < list.length ; i++ )
                {
                if ( list[ i ].compareTo( list[ minimum ] ) < 0 )
                    {
                    minimum = i ;
                    }
                }

            if ( minimum != j )
                {
                T tempData = list[ j ] ;
                list[ j ] = list[ minimum ] ;
                list[ minimum ] = tempData ;
                }

            }
        }


    public static <T extends Comparable<? super T>>
                                    void
                                    insertionSort( DoublyLinkedList<T> list )
        {
        // Done
        DNode<T> currentNode = new DNode<T>( null ) ;
        DNode<T> traversalNode = new DNode<T>( null ) ;
        currentNode = list.getHead().getNext() ;
        traversalNode = currentNode ;

        while ( traversalNode != null )
            {
            while ( currentNode.getPrev() != null &&
                    currentNode.getPrev()
                               .getData()
                               .compareTo( currentNode.getData() ) > 0 )
                {
                list.swapWithPreviousNode( currentNode ) ;
                currentNode = currentNode.getPrev() ;

                }
            traversalNode = traversalNode.getNext() ;
            currentNode = traversalNode ;

            }
        }


    public static void main( String[] args ) throws IOException
        {
        ///////////////////////////////////////////////
        File file = new File( "InnocentsAbroad.txt" ) ;
        Scanner scan = new Scanner( file ) ;
        StringBuilder text = new StringBuilder() ;

        while ( scan.hasNextLine() )
            {
            text.append( scan.nextLine() + "\n" ) ;
            }
        String[] words = text.toString().split( "\\s+" ) ;
        
        long startTime = System.currentTimeMillis();
        insertionSort( words ) ;
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        
        System.out.println( "Sorting InnocentsAbroad.txt using insertionSort. . ." ) ;

        FileWriter writer = new FileWriter( "InsertionSorted(InnocentsAbroad).txt" ) ;
        writer.write( Arrays.toString( words ) ) ;
        writer.close() ;
        System.out.println( "Completed." ) ;
        System.out.println( "Stored in 'InsertionSorted(InnocentsAbroad).txt'" ) ;
        System.out.println( "'InsertionSorted(InnocentsAbroad).txt' could be found in System Explorer within this Java Project " ) ;
        System.out.println("Runtime (insertionSort): " + duration + " milliseconds");
        ///////////////////////////////////////////////

        System.out.println() ;

        ///////////////////////////////////////////////
        File file2 = new File( "Vocabulary List.txt" ) ;
        Scanner scan2 = new Scanner( file2 ) ;
        StringBuilder text2 = new StringBuilder() ;

        while ( scan2.hasNextLine() )
            {
            text2.append( scan2.nextLine() + "\n" ) ;
            }
        String[] words2 = text2.toString().split( "\\s+" ) ;
        
        long startTime2 = System.currentTimeMillis();
        insertionSort( words2 ) ;
        long endTime2 = System.currentTimeMillis();
        long duration2 = endTime2 - startTime2;
        
        System.out.println( "Sorting Vocabulary List using insertionSort. . ." ) ;

        FileWriter writer2 = new FileWriter( "InsertionSorted(Vocabulary List).txt" ) ;
        writer2.write( Arrays.toString( words2 ) ) ;
        writer2.close() ;
        System.out.println( "Completed." ) ;
        System.out.println( "Stored in 'InsertionSorted(Vocabulary List).txt'" ) ;
        System.out.println( "'InsertionSorted(Vocabulary List).txt' could be found in System Explorer within this Java Project " ) ;
        System.out.println("Runtime (insertionSort): " + duration2 + " milliseconds");
        ///////////////////////////////////////////////

        System.out.println() ;

        ///////////////////////////////////////////////
        File file3 = new File( "Vocabulary List.txt" ) ;
        Scanner scan3 = new Scanner( file3 ) ;
        StringBuilder text3 = new StringBuilder() ;

        while ( scan3.hasNextLine() )
            {
            text3.append( scan3.nextLine() + "\n" ) ;
            }
        String[] words3 = text3.toString().split( "\\s+" ) ;
        
        long startTime3 = System.currentTimeMillis();
        selectionSort( words3 ) ;
        long endTime3 = System.currentTimeMillis();
        long duration3 = endTime3 - startTime3;
        
        System.out.println( "Sorting Vocabulary List using selectionSort. . ." ) ;

        FileWriter writer3 = new FileWriter( "SelectionSorted(Vocabulary List).txt" ) ;
        writer3.write( Arrays.toString( words3 ) ) ;
        writer3.close() ;
        System.out.println( "Completed." ) ;
        System.out.println( "Stored in 'SelectionSorted(Vocabulary List).txt'" ) ;
        System.out.println( "'SelectionSorted(Vocabulary List).txt' could be found in System Explorer within this Java Project " ) ;
        System.out.println("Runtime (selectionSort): " + duration3 + " milliseconds");
        ///////////////////////////////////////////////
        
        System.out.println() ;

        ///////////////////////////////////////////////
        File file4 = new File( "InnocentsAbroad.txt" ) ;
        Scanner scan4 = new Scanner( file4 ) ;
        StringBuilder text4 = new StringBuilder() ;

        while ( scan4.hasNextLine() )
            {
            text4.append( scan4.nextLine() + "\n" ) ;
            }
        String[] words4 = text4.toString().split( "\\s+" ) ;
        
        long startTime4 = System.currentTimeMillis();
        selectionSort( words4 ) ;
        long endTime4 = System.currentTimeMillis();
        long duration4 = endTime4 - startTime4;
        
        System.out.println( "Sorting InnocentsAbroad using selectionSort. . ." ) ;

        FileWriter writer4 = new FileWriter( "SelectionSorted(InnocentsAbroad).txt" ) ;
        writer4.write( Arrays.toString( words4 ) ) ;
        writer4.close() ;
        System.out.println( "Completed." ) ;
        System.out.println( "Stored in 'SelectionSorted(InnocentsAbroad).txt'" ) ;
        System.out.println( "'SelectionSorted(InnocentsAbroad).txt' could be found in System Explorer within this Java Project " ) ;
        System.out.println("Runtime (selectionSort): " + duration4 + " milliseconds");
        ///////////////////////////////////////////////

        System.out.println() ;

        ///////////////////////////////////////////////
        System.out.println( "Testing Method insertionSort for Generic Array" ) ;
        System.out.println( "-------------------------------" ) ;
        Integer[] arrayNumbers = { 5, 4, 3, 2, 1 } ;
        System.out.println( "Unsorted: " + Arrays.toString( arrayNumbers ) ) ;
        insertionSort( arrayNumbers ) ;
        System.out.println( "Sorted: " + Arrays.toString( arrayNumbers ) ) ;
        System.out.println() ;

        String[] arrayNames = { "Ariella", "Skye", "Keeva", "Bertram", "Giorgio" } ;
        System.out.println( "Unsorted: " + Arrays.toString( arrayNames ) ) ;
        insertionSort( arrayNames ) ;
        System.out.println( "Sorted: " + Arrays.toString( arrayNames ) ) ;
        ///////////////////////////////////////////////

        System.out.println() ;

        ///////////////////////////////////////////////
        System.out.println( "Testing Method selectionSort for Generic Array" ) ;
        System.out.println( "-------------------------------" ) ;
        Integer[] arrayNumbers3 = { 10, 8, 9, 3, 5 } ;
        System.out.println( "Unsorted: " + Arrays.toString( arrayNumbers3 ) ) ;
        selectionSort( arrayNumbers3 ) ;
        System.out.println( "Sorted: " + Arrays.toString( arrayNumbers3 ) ) ;
        System.out.println() ;

        String[] arrayNames3 = { "Clive", "Maxime", "Akash", "Seren", "Presley" } ;
        System.out.println( "Unsorted: " + Arrays.toString( arrayNames3 ) ) ;
        selectionSort( arrayNames3 ) ;
        System.out.println( "Sorted: " + Arrays.toString( arrayNames3 ) ) ;
        ///////////////////////////////////////////////

        System.out.println() ;

        ///////////////////////////////////////////////
        System.out.println( "Testing Method insertionSort for DoublyLinkedList Class" ) ;
        System.out.println( "-------------------------------" ) ;
        DoublyLinkedList<Integer> arrayNumbers2 = new DoublyLinkedList<Integer>() ;
        arrayNumbers2.add( 5 ) ;
        arrayNumbers2.add( 4 ) ;
        arrayNumbers2.add( 3 ) ;
        arrayNumbers2.add( 2 ) ;
        arrayNumbers2.add( 1 ) ;

        System.out.println( "Unsorted: " +
                            Arrays.toString( arrayNumbers2.toArray() ) ) ;
        insertionSort( arrayNumbers2 ) ;
        System.out.println( "Sorted: " +
                            Arrays.toString( arrayNumbers2.toArray() ) ) ;
        ///////////////////////////////////////////////

        System.out.println() ;

        ///////////////////////////////////////////////
        DoublyLinkedList<String> arrayNames2 = new DoublyLinkedList<String>() ;
        arrayNames2.add( "Abby" ) ;
        arrayNames2.add( "Dale" ) ;
        arrayNames2.add( "Zebra" ) ;
        arrayNames2.add( "Bob" ) ;
        arrayNames2.add( "Tom" ) ;

        System.out.println( "Unsorted: " +
                            Arrays.toString( arrayNames2.toArray() ) ) ;
        insertionSort( arrayNames2 ) ;
        System.out.println( "Sorted: " + Arrays.toString( arrayNames2.toArray() ) ) ;
        ///////////////////////////////////////////////

        }

    }

// end class QuadraticSorting