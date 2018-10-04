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
    }
}
