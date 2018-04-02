class ListNullminatorExtension {

    /**
     Removes any and all null values or strings containing "null" or 'null'.
     @param self The list the method was called on
     @return List - The modified list
     */
    static List removeAllTheNulls(final List self){
        List target = self
        target = target - null
        target.removeAll(["null", 'null'])
        return target
    }
}
