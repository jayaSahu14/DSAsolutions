package DataStructures.Trie;

public class Sdd {
	
	static class TNode{
		
		TNode[] children;
		boolean eow;
		
		public TNode() {
			children = new TNode[26];
			for(int i=0;i<26;i++) {
				children[i]=null;
			} 
			eow=false;
		}
	}
	
	static TNode root=new TNode();

	//------trie ds made
	
	
	//---------insert
	
	public static void insert(String word) {
		TNode curr=root;
		for(int i=0;i<word.length();i++) {
			int idx=word.charAt(i)-'a';
		
		if(curr.children[idx]==null) {
			curr.children[idx]=new TNode();
		}
		if(i==word.length()-1) {
			curr.children[idx].eow=true;
		}
		
		curr=curr.children[idx];
		
	}
		}
	
	
	//------search
	
	public static boolean search(String key) {
		TNode curr=root;
		for(int i=0;i<key.length();i++) {
			int idx= key.charAt(i)-'a';
			TNode node= curr.children[idx];
			
			if(node==null) return false; // if idx not found
			if(i==key.length()-1 && node.eow==false) return false; // if not eow at last letter of key
		
			curr=curr.children[idx]; //update root
		} return true;
	}
	
	//--------wordbreak
	
	public static boolean wordBreak(String key) {
		if(key.length()==0) return true;
		
		for(int i=0;i<key.length();i++) {
			String fpart=key.substring(0,i);
			String secPart=key.substring(i);
			if(search(fpart) && wordBreak(secPart)) {
				return true;
			}
		} return true;
	}
	
	//---------starts with
	
	public static boolean startsWith(String key) {
		TNode curr=root;
		for(int i=0;i<key.length();i++) {
			int idx= key.charAt(i)-'a';
			
			if(curr.children[idx]==null) return false;
			curr=curr.children[idx];
		}
		return true;
	}	
	
	//------------------------ count unique substrs
	
	/*
	 * find all suffix
	 * create a trie from all suffix
	 * count nodes of trie= nodes of unique prefix
	 */
	
	public static int countNode(TNode root) {
		if(root==null) return 0;
		int count=0;
		for(int i=0;i<26;i++) {
			if(root.children[i] != null) {
				count+=countNode(root.children[i]);
			}
		}
		return count+1;
		
	}
	
	public static void suffix(String s1) {
	for(int i=0;i<s1.length();i++){
		  String str1=s1.substring(i);
		 insert(str1);}
	}
	
	//------------------------longest word with all substr-------------
	
	public static String ans="";
	
	public static void longestWord( TNode root, StringBuilder temp) {
		if(root==null) return;
		
		for(int i=0;i<26;i++) {
			if(root.children[i] != null && root.children[i].eow==true) {
				temp.append((char)(i+'a'));
				if(temp.length() > ans.length()) {
					ans=temp.toString();
				}
				longestWord(root.children[i], temp);
				temp.deleteCharAt(temp.length()-1);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	//----main
	
	public static void main(String[] args) {
		
		String words[]= { "a", "banana", "app","appl", "apple","apply" };
		for(int i=0;i<words.length;i++) {
			insert(words[i]);
		}
		
		System.out.println(search("the"));	
		
	longestWord(root,new StringBuilder(" "));
		System.out.println("longest:  "+ ans);
		
		
		
		
		
	}

}

