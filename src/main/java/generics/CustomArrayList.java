package generics;

public class CustomArrayList<T> {

    private Object [] data = new Object[0];
    private int length = 0;

    public void add (T element){
        if (length == data.length){
            Object [] newData = new Object[data.length * 2 + 1];
            for (int i=0; i<data.length; i++){
                newData[i] = data[i];// копируем эл-ты из данного массива в нов созданный
            }
           // System.arraycopy(data, 0, newData, 0, data.length);// эта конструк-я работает быстрее и предпочтительнее

            data = newData;// в массив для хранения данных копируется нов массив который создали
        }
        data[length] = element; //  в массив соответс-й длины копируется эл-т вновь переданный
        length++; // и длина увеличивается на единицу
    }
    public T get(int index){
        if (index >= length || index < 0){
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return (T) data[index];
    }
    public int getLength(){
        return length;
    }
    public void clear(){
        data = new Object[0];
        length = 0;
    }
}
