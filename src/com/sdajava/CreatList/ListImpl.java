package com.sdajava.CreatList;


public class ListImpl {
        private Node begin;
        private Node end;

        public ListImpl() {
            this.begin = null;
            this.end = null;
        }

        public void addElement (String value) {
            Node node = new Node(value, null, null);  // tworzenie nowego wezla ktory ma pzekazywac info ile pzed nim ile za nim
            if (checkIsEmpty()) {            // jezeli lista jest pusta to ustawiamy na begin i koniec wpisany element
                begin = node;
                end = node;
            }
            else {
                Node pm = begin;

                while (pm != null){
                    pm.getNext();

                    if (pm == begin){
                        node.setNext(pm);
                        pm.setPrev(node);
                        begin = node;
                        break;
                    } else {
                        node.setNext(pm);
                        pm.setPrev(pm.getPrev());
                        pm.getPrev().setPrev(node);
                        pm.setPrev(node);
                        break;
                    }
                }
                if (pm == null){
                    end.setNext(node);
                    node.setPrev(end);
                    end = node;

                }
            }

        }

        public boolean checkIsEmpty() {
            return (begin == null);
        }

        public void showList() {
            Node list = end;
            while (list != null){
                System.out.println(list.getValue());
                list = list.getPrev();
            }

        }
        public int size() {
            Node list = begin;
            int counter = 0;
            while (list != null){
                counter++;
                list = list.getNext();
            }
            return counter;
        }
    }

