import java.util.*;

/**
 * Created by nbalkiss on 4/21/17.
 */
public class BuildDirectoryStructure {

    public DirectoryObject buildDirectoryStructureFromPaths(List<String> paths){

        DirectoryObject root = new DirectoryObject(1);
        for(String path : paths){
            String[] partials = path.split("/");
            root.addChild("/", helper(partials, root));
        }
        return root;
    }

    public DirectoryObject helper(String[] partials, DirectoryObject parent){
        String partial = partials[0];

        DirectoryObject current = parent.getChild(partial);

        if(current==null){
            current = new DirectoryObject(1);
        }

        if(partials.length==1){
            return current;
        }

        current.addChild(partial,helper(Arrays.copyOfRange(partials,1,partials.length), current));
        return current;
    }

    class DirectoryObject{
        private int size;
        private Map<String, DirectoryObject> children;

        public DirectoryObject(int size){
            this.size = size;
            this.children = new HashMap<String, DirectoryObject>();
        }

        public void addChild(String partial, DirectoryObject child){
            this.children.put(partial, child);
        }

        public DirectoryObject getChild(String partial){
            return this.children.get(partial);
        }

        public int getSize() {
            return size;
        }

        //TODO
//        public void printDirectory(){
//            Stack<DirectoryObject> stk = new Stack<DirectoryObject>();
//            stk.add(this);
//            while(!stk.isEmpty()){
//                DirectoryObject current = stk.pop();
//                for(String partial : current)
//            }
//        }
    }
}
