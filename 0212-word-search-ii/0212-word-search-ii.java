class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();

        HashSet<String> myset = new HashSet<>();

        boolean[][] check = new boolean[board.length][board[0].length];

        Trie obj = new Trie();

        for(String word : words)
        {
            obj.insert(word);
        }

        for(int i = 0; i < board.length; i++)
        {
            for(int j = 0; j < board[0].length; j++)
            {
                if(obj.startsWith(board[i][j]+""))
                {
                    search(board, i, j, myset, check, new StringBuilder(), obj);
                }
            }
        }

        for(String word : myset)
        {
            result.add(word);
        }

        return result;
    }

    void search(char[][] board, int row, int col, HashSet<String> myset, boolean[][] check, StringBuilder sb, Trie obj)
    {
        if(row < 0 || col < 0 || 
           row > board.length-1 || col > board[0].length-1 || 
           check[row][col] == true)
        {
            return;
        }

        sb.append(board[row][col]);

        if (!obj.startsWith(sb.toString())) {
            sb.deleteCharAt(sb.length() - 1);
            return;
        }

        if(obj.isword(sb.toString()))
        {
            myset.add(sb.toString());
        }
        check[row][col] = true;

        search(board, row-1, col, myset, check, sb, obj);
        search(board, row+1, col, myset, check, sb, obj);
        search(board, row, col-1, myset, check, sb, obj);
        search(board, row, col+1, myset, check, sb, obj);

        check[row][col] = false;
        sb.deleteCharAt(sb.length() - 1);

        return;
    }
}

class TrieNode {
    TrieNode children[];
    boolean isEnd;

    TrieNode()
    {
        children = new TrieNode[26];
        isEnd = false;
    }
    
}

class Trie {
    TrieNode root;

    Trie()
    {
        root = new TrieNode();
    }

    void insert(String word)
    {
        TrieNode node = root;

        for(char ch : word.toCharArray())
        {
            int index = ch - 'a';

            if(node.children[index] == null)
            {
                node.children[index] = new TrieNode();
            }

            node = node.children[index];
        }

        node.isEnd = true;
    }

    boolean startsWith(String word)
    {
        TrieNode node = root;

        for(char ch : word.toCharArray())
        {
            int index = ch - 'a';
            if(node.children[index] == null)
            {
                return false;
            }
            node = node.children[index];
        }

        return true;
    }

    boolean isword(String word)
    {
        TrieNode node = root;

        for(char ch : word.toCharArray())
        {
            int index = ch - 'a';

            if(node.children[index] == null)
            {
                return false;
            }

            node = node.children[index];
        }

        return node.isEnd;
    }
}


