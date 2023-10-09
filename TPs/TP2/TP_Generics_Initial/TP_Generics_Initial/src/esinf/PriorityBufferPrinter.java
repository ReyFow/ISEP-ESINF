/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esinf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author DEI-ISEP
 * @param <E> Generic type of buffer element
 */
public class PriorityBufferPrinter<E extends Document> implements Iterable<E> {

    private final ArrayList<E> buffer;
    private final Integer maxSize;

    /**
     * Creates a new PriorityBufferPrinter with a maximum buffer size maxSize
     * 
     * @param maxSize maximum buffer size
     */
    public PriorityBufferPrinter(Integer maxSize) {
        buffer = new ArrayList<>(); // Diamond notation: the type can be inferred by the compiler
        this.maxSize = maxSize;
    }
    
    /** Calculates the size occupied by the docs in the buffer
     *  @return size occupied
     * */
    
    private Integer usedSize(){
        throw new UnsupportedOperationException("Not supported yet.");  
    }
 
    /**
     * Adds a document to the buffer.Documents are added using a numeric priority system, being FIFO when priorities are equal.
     * 
     * @param doc   the document to be added to the buffer
     * @return      true if the buffer has space, false otherwise
     */
    public Boolean addDocument(E doc) {
        
        if (usedSize() + doc.getSize() > maxSize) return false;
        
        int i = 0;
        while (i < buffer.size()) {
            if (buffer.get(i).compareTo(doc) > 0){
                buffer.add(i, doc);
                return true;
            }
            i++;
        }
        return buffer.add(doc);
    }
    
     /**
     * Gets the next document in the queue.
     * 
     * @return The next document in the queue
     */
    public E getDocument() {
         
        if (buffer.isEmpty()) return null;
        E doc = buffer.get(0);
        buffer.remove(0);
        return doc;
    } 

    /**
     * Deletes a document from the buffer (if it exists), given a name and an author 
     * 
     * @param name      the name of the Document
     * @param author    the author of the Document
     * @return          true if the document existed, false otherwise
     */
    public Boolean delDocument(String name, String author) {
        
        int i = 0;

        while (i < buffer.size()) {
            E doc = buffer.get(i);
            if (doc.getName().equals(name) && doc.getAuthor().equals(author)) {
                buffer.remove(i);
                return true;
            }
            i++;
        }
        return false;
    }

    /**
     * Deletes all the documents which are superior to a given size
     * 
     * @param size  the size above which documents will be deleted
     * @return      true if there is at least one Document size
     */
    public Boolean delDocumentsAbove(Integer size) {
        
        Boolean ret = false;
        
        Iterator<E> it = buffer.iterator();
        while (it.hasNext()) {
            E doc = it.next();
            if (doc.getSize() > size) {
                it.remove();
                ret = true;
            }
        }
        return ret;
    }

    @Override
    public String toString() {
        return "PriorityBufferPrinter{" + "buffer=" + buffer + ", maxSize=" + maxSize + '}';   
    }

    @Override
    public Iterator<E> iterator() {
       return buffer.iterator();   
    }

}
