public class TestDriver {
    public static void main(String[] args) {

        int[] list1 = {1,4,7,11,14,18,25,26};
        int[] list2 = {3,4,6,7,11,17,24};

        int[] listC = new int[list1.length + list2.length];

        int index1 = 0, index2 = 0, indexC = 0;
        while(index1 < list1.length && index2 < list2.length){
            if(list1[index1] < list[index2]){
                listC[indexC] = list1[index1];
                index1++;
            }else{
                listC[indexC] = list2[index2];
            }
            indexC++;
        }
        while(index1 < list1.length){
            listC[indexC++] = list1[index1++];
        }
        while(index2 < list2.length){
            listC[indexC++] = list2[index2++];
        }
    }
}
