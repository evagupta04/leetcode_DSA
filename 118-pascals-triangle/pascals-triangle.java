class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
         if(numRows <= 0) {
            return output;
        }
        //add first element i.e always be 1
        output.add(List.of(1));
        //numRows-1, because we have already added 1 as first row
        for(int i=0; i<numRows-1; i++) {
            //create dummyRows, where each row is prefixed and suffixed with zero
            List<Integer> dummyRows = new ArrayList<>();
            dummyRows.add(0);
            dummyRows.addAll(output.get(output.size()-1));
            dummyRows.add(0);
            
            //using dummyRow, we will make actual row(by adding 2 prev row's element) 
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<dummyRows.size()-1; j++) {
                row.add(dummyRows.get(j)+dummyRows.get(j+1));
            }
            output.add(row);
        }
        return output;
    }
}