package com.sangjun.java_practice;

/**
 * Created by bobsang89@gmail.com on 2018-10-03
 * Project: java-practice
 * Github : http://github.com/SangJun-GitHub
 */
public class CollectionsFramework {
    public static void main(String[] argus){
        //Collection List, Set은 공통부분이 있어 다시뽑아 Collection 인터페이스에 구현
        //Map인터페이스는 List와 Set과 다른형태로 Collection을 다루기에  상속계층에 포함되지 않음

        //List는 순서가 있고 중복을 허용
        //ArrayList, LinkedList, Stack, Vactor

        //Set은 순서가 없고 중복을 허용하지않음
        //HashSet, TreeSet

        //Map은 Key와 Value의 쌍으로 이루어진 데이터 순서는 유지하지 않고, Key는 중복 허용하지않고, Value는 중복혀용
        //HashMap, TreeMap, Hashtable, Properties

        //Collection interface
        //boolean add(Object o) - 지정된 Objectd의 객체들을 Collection에 추가
        //boolean add(Collection c) - 지정된 Collection의 객체들을 Collection에 추가
        //void clear() - Collection의 모든 데이터 삭제
        //boolean contains(Object o)  - 지정된 Object의 객체가 Collection에 있는지 확인
        //boolean contains(Collection c) - 지정된 Collection의 객체가가 Collection에 있는지 확인
        //boolean equals(Object o) - 동일한 Collection인지 비교
        //int hashCode() - Colleaction의 hash Code 반환
        //boolean isEmpty() - Collection이 비어있는지 확인
        //Iterator iterator() - Collection의 Iterator를 반환
        //boolean remove(Object o) - 지정된 객체 삭제
        //boolean removeAll(Collection c) - 지정된 Collection에 포함된 모든 객체를 삭제
        //boolean retainAll(Collection c) - 지정된 Collection에 포함된 객체만 남기고 다른객체들을 Collection에서 삭제
        //                                  Collection에 변화가 있으면 true 없으면 false
        //int size() - Collection에 저장된 객체의 개수를 반환
        //Object[] toArray() - Collection에 저장된 객체를 객체배열(Object[])로 반환
        //Object[] toArray(Object[] a) - 지정된 배열에 Collection의 객체를 저장해서 반환


        //List interface- Vector-Stack, ArrayList, LinkedList
        //중복을 허용, 저장순서가 유지
        //void add(int index, Object element) - 지정된 index에 객체를 추가
        //boolean addAll(int index, Collection c)  - 지정된 index에 Colltion에 포함된 객체를 추가
        //Object get(int index) - 지정된 위치의 객체를 반환
        //int indexOf(Object o) - 지정된 객체의 index를 반환 (정방향)
        //int lastIndexOf(Object o) - 지정된 객체의 index를 반환 (역방향)
        //ListIterator listIterator()  - List의 객체에 접근할 수있는 ListIterator반환
        //ListIterator listIterator(int index) - List의 객체에 접근할 수있는 ListIterator반환
        //Object remove(int index) - 지정된 index의 객체를 삭제하고 삭제된 객체를 반환
        //Object set(int index, Object element) - 지정된 index에 객체를 저장
        //void sort(Comparator c) - Comparator를 통하여 List 정렬
        //List subList(int formIndex, int toIndex) - fromIndex부터 toIndex까지의 객체를 반환


        //Set interface - HashSet, SortedSet-TreeSet
        //중복을 허용 안함, 저장순서 유지 안함


        //Map interface - Hashtable, HashMap-LinkedHashMap, SortedMap-TreeMap
        //Key + Value = pair (Key 중복 허용 안함, Value 중복 허용) *중복키를 저장한다면 기존의 저장된 값이 지워지고 마지막에 저장된 값이 저장됨
        //void clear() - Map의 모든 객체 삭제
        //boolean containsKey(Object key) - 지정된 key객체와 일치하는 Map의 key가 있는지 확인
        //boolean containsValue(Object value) -지정된 value객체와 일치하는 Map의 value객체가 있는지 확인
        //Set entrySet() - Map에 저장된 pair를 Map.Entry타입의 객체로 저장한 Set으로 반환
        //boolean equals(Object o) - 동일한 Map인지 비교
        //Object get(Object key) - key와 대응하는 value 반환
        //int hasCode() - hachCode 반환
        //boolean inEmpty() - Map이 비어있는지 확인
        //Set keySet() - Map에 지정된 모든 key 반환
        //Object put(Object key, Object value) - value를 key에 연결하여 저장
        //void putAll(Map t) - 모든 pair 추가
        //Object remove(Object key) - key와 일치하는 pair 삭제
        //int size() - pair 개수 반환
        //Collection values() - 모든 value 반환



    }
}
