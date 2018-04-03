class ListNullminatorExtension {

    /**
     Removes all null values or strings containing "null".
     @param self The list the method was called on
     @return List - The modified list
     */
    static List removeAllTheNulls(final List self){
        return self - null - "null"
    }
}
