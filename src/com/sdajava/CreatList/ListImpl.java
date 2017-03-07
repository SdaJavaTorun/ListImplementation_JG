package com.sdajava.CreatList;


public class ListImpl {
        private Node start;
        private Node stop;

        public ListImpl() {
            this.start = null;
            this.stop = null;
        }

        public void addElement (String value) {
            Node node = new Node(value, null, null);  // tworzenie nowego wezla ktory ma pzekazywac info ile pzed nim ile za nim
            if (checkIsEmpty()) {            // jezeli lista jest pusta to ustawiamy na start i koniec wpisany element
                start = node;
                stop = node;
            }
            else {
                Node pm = start;

                while (pm != null){
                    pm.getNext();

                    if (pm == start){
                        node.setNext(pm);
                        pm.setPrev(node);
                        start = node;
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
                    stop.setNext(node);
                    node.setPrev(stop);
                    stop = node;

                }
            }

        }

        public boolean checkIsEmpty() {
            return (start == null);
        }
    }

