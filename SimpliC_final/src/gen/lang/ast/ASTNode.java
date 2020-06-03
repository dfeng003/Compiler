/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.TreeSet;
/**
 * @ast node
 * @astdecl ASTNode;
 * @production ASTNode;

 */
public class ASTNode<T extends ASTNode> extends beaver.Symbol implements Cloneable {
  /**
   * @aspect DumpTree
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\DumpTree.jrag:9
   */
  private static final String DUMP_TREE_INDENT = "  ";
  /**
   * @aspect DumpTree
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\DumpTree.jrag:11
   */
  public String dumpTree() {
		ByteArrayOutputStream bytes = new ByteArrayOutputStream();
		dumpTree(new PrintStream(bytes));
		return bytes.toString();
	}
  /**
   * @aspect DumpTree
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\DumpTree.jrag:17
   */
  public void dumpTree(PrintStream out) {
		dumpTree(out, "");
		out.flush();
	}
  /**
   * @aspect DumpTree
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\DumpTree.jrag:22
   */
  public void dumpTree(PrintStream out, String indent) {
		out.print(indent + getClass().getSimpleName());
		out.println(getTokens());
		String childIndent = indent + DUMP_TREE_INDENT;
		for (ASTNode child : astChildren()) {
			if (child == null) {
				out.println(childIndent + "null");
			} else {
				child.dumpTree(out, childIndent);
			}
		}
	}
  /**
   * @aspect DumpTree
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\DumpTree.jrag:35
   */
  public String getTokens() {
		java.util.TreeSet<java.lang.reflect.Method> methods = new java.util.TreeSet<>(
				new java.util.Comparator<java.lang.reflect.Method>() {
					public int compare(java.lang.reflect.Method m1, java.lang.reflect.Method m2) {
						return m1.getName().compareTo(m2.getName());
					}
				});

		methods.addAll(java.util.Arrays.asList(getClass().getMethods()));

		String result = "";
		for (java.lang.reflect.Method method : methods) {
			ASTNodeAnnotation.Token token = method.getAnnotation(ASTNodeAnnotation.Token.class);
			if (token != null) {
				try {
					result += String.format(" %s=\"%s\"", token.name(), method.invoke(this));
				} catch (IllegalAccessException ignored) {
				} catch (InvocationTargetException ignored) {
				}
			}
		}
		return result;
	}
  /**
   * @aspect Errors
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\Errors.jrag:22
   */
  protected ErrorMessage error(String message) {
		return new ErrorMessage(message, getLine(getStart()));
	}
  /**
   * @aspect PrettyPrint
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\PrettyPrint.jrag:5
   */
  public void prettyPrint(PrintStream out) {
		prettyPrint(out, "");
		out.println();
	}
  /**
   * @aspect PrettyPrint
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\PrettyPrint.jrag:9
   */
  public void prettyPrint(PrintStream out, String ind) {
	
	  	for (ASTNode child : astChildren()) {
	  		if(child!=null){
		  		child.prettyPrint(out, ind);
		  	}
		}
	}
  /**
   * @declaredat ASTNode:1
   */
  public ASTNode() {
    super();
    init$Children();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @declaredat ASTNode:11
   */
  public void init$Children() {
  }
  /**
   * Cached child index. Child indices are assumed to never change (AST should
   * not change after construction).
   * @apilevel internal
   * @declaredat ASTNode:18
   */
  private int childIndex = -1;
  /** @apilevel low-level 
   * @declaredat ASTNode:21
   */
  public int getIndexOfChild(ASTNode node) {
    if (node == null) {
      return -1;
    }
    if (node.childIndex >= 0) {
      return node.childIndex;
    }
    for (int i = 0; children != null && i < children.length; i++) {
      if (children[i] == node) {
        node.childIndex = i;
        return i;
      }
    }
    return -1;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:38
   */
  public static final boolean generatedWithCacheCycle = true;
  /** @apilevel low-level 
   * @declaredat ASTNode:41
   */
  protected ASTNode parent;
  /** @apilevel low-level 
   * @declaredat ASTNode:44
   */
  protected ASTNode[] children;
  /** @apilevel internal 
   * @declaredat ASTNode:48
   */
  private static ASTState state = new ASTState();
  /** @apilevel internal 
   * @declaredat ASTNode:51
   */
  public final ASTState state() {
    return state;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:56
   */
  public final static ASTState resetState() {
    return state = new ASTState();
  }
  /**
   * @return an iterator that can be used to iterate over the children of this node.
   * The iterator does not allow removing children.
   * @declaredat ASTNode:65
   */
  public java.util.Iterator<T> astChildIterator() {
    return new java.util.Iterator<T>() {
      private int index = 0;

      @Override
      public boolean hasNext() {
        return index < getNumChild();
      }

      @Override
      public T next() {
        return hasNext() ? (T) getChild(index++) : null;
      }

      @Override
      public void remove() {
        throw new UnsupportedOperationException();
      }
    };
  }
  /** @return an object that can be used to iterate over the children of this node 
   * @declaredat ASTNode:87
   */
  public Iterable<T> astChildren() {
    return new Iterable<T>() {
      @Override
      public java.util.Iterator<T> iterator() {
        return astChildIterator();
      }
    };
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:97
   */
  public T getChild(int i) {
    ASTNode child = getChildNoTransform(i);
    return (T) child;
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:102
   */
  public void addChild(T node) {
    setChild(node, getNumChildNoTransform());
  }
  /**
   * Gets a child without triggering rewrites.
   * @apilevel low-level
   * @declaredat ASTNode:109
   */
  public T getChildNoTransform(int i) {
    if (children == null) {
      return null;
    }
    T child = (T) children[i];
    return child;
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:117
   */
  protected int numChildren;
  /** @apilevel low-level 
   * @declaredat ASTNode:120
   */
  protected int numChildren() {
    return numChildren;
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:125
   */
  public int getNumChild() {
    return numChildren();
  }
  /**
   * Behaves like getNumChild, but does not invoke AST transformations (rewrites).
   * @apilevel low-level
   * @declaredat ASTNode:133
   */
  public final int getNumChildNoTransform() {
    return numChildren();
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:137
   */
  public void setChild(ASTNode node, int i) {
    if (children == null) {
      children = new ASTNode[(i + 1 > 4 || !(this instanceof List)) ? i + 1 : 4];
    } else if (i >= children.length) {
      ASTNode c[] = new ASTNode[i << 1];
      System.arraycopy(children, 0, c, 0, children.length);
      children = c;
    }
    children[i] = node;
    if (i >= numChildren) {
      numChildren = i+1;
    }
    if (node != null) {
      node.setParent(this);
      node.childIndex = i;
    }
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:155
   */
  public void insertChild(ASTNode node, int i) {
    if (children == null) {
      children = new ASTNode[(i + 1 > 4 || !(this instanceof List)) ? i + 1 : 4];
      children[i] = node;
    } else {
      ASTNode c[] = new ASTNode[children.length + 1];
      System.arraycopy(children, 0, c, 0, i);
      c[i] = node;
      if (i < children.length) {
        System.arraycopy(children, i, c, i+1, children.length-i);
        for(int j = i+1; j < c.length; ++j) {
          if (c[j] != null) {
            c[j].childIndex = j;
          }
        }
      }
      children = c;
    }
    numChildren++;
    if (node != null) {
      node.setParent(this);
      node.childIndex = i;
    }
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:180
   */
  public void removeChild(int i) {
    if (children != null) {
      ASTNode child = (ASTNode) children[i];
      if (child != null) {
        child.parent = null;
        child.childIndex = -1;
      }
      // Adding a check of this instance to make sure its a List, a move of children doesn't make
      // any sense for a node unless its a list. Also, there is a problem if a child of a non-List node is removed
      // and siblings are moved one step to the right, with null at the end.
      if (this instanceof List || this instanceof Opt) {
        System.arraycopy(children, i+1, children, i, children.length-i-1);
        children[children.length-1] = null;
        numChildren--;
        // fix child indices
        for(int j = i; j < numChildren; ++j) {
          if (children[j] != null) {
            child = (ASTNode) children[j];
            child.childIndex = j;
          }
        }
      } else {
        children[i] = null;
      }
    }
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:207
   */
  public ASTNode getParent() {
    return (ASTNode) parent;
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:211
   */
  public void setParent(ASTNode node) {
    parent = node;
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:276
   */
  public void flushTreeCache() {
    flushCache();
    if (children != null) {
      for (int i = 0; i < children.length; i++) {
        if (children[i] != null) {
          ((ASTNode) children[i]).flushTreeCache();
        }
      }
    }
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:287
   */
  public void flushCache() {
    flushAttrAndCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:291
   */
  public void flushAttrAndCollectionCache() {
    flushAttrCache();
    flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:296
   */
  public void flushAttrCache() {
    boolType_reset();
    program_reset();
    intType_reset();
    unknownFun_reset();
    unknownType_reset();
    unknownVar_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:305
   */
  public void flushCollectionCache() {
  }
  /** @apilevel internal 
   * @declaredat ASTNode:308
   */
  public ASTNode<T> clone() throws CloneNotSupportedException {
    ASTNode node = (ASTNode) super.clone();
    node.flushAttrAndCollectionCache();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:314
   */
  public ASTNode<T> copy() {
    try {
      ASTNode node = (ASTNode) clone();
      node.parent = null;
      if (children != null) {
        node.children = (ASTNode[]) children.clone();
      }
      return node;
    } catch (CloneNotSupportedException e) {
      throw new Error("Error: clone not supported for " + getClass().getName());
    }
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:333
   */
  @Deprecated
  public ASTNode<T> fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:343
   */
  public ASTNode<T> treeCopyNoTransform() {
    ASTNode tree = (ASTNode) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) children[i];
        if (child != null) {
          child = child.treeCopyNoTransform();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:363
   */
  public ASTNode<T> treeCopy() {
    ASTNode tree = (ASTNode) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) getChild(i);
        if (child != null) {
          child = child.treeCopy();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /**
   * Performs a full traversal of the tree using getChild to trigger rewrites
   * @apilevel low-level
   * @declaredat ASTNode:380
   */
  public void doFullTraversal() {
    for (int i = 0; i < getNumChild(); i++) {
      getChild(i).doFullTraversal();
    }
  }
  /** @apilevel internal 
   * @declaredat ASTNode:386
   */
  protected boolean is$Equal(ASTNode n1, ASTNode n2) {
    if (n1 == null && n2 == null) return true;
    if (n1 == null || n2 == null) return false;
    return n1.is$Equal(n2);
  }
  /** @apilevel internal 
   * @declaredat ASTNode:392
   */
  protected boolean is$Equal(ASTNode node) {
    if (getClass() != node.getClass()) {
      return false;
    }
    if (numChildren != node.numChildren) {
      return false;
    }
    for (int i = 0; i < numChildren; i++) {
      if (children[i] == null && node.children[i] != null) {
        return false;
      }
      if (!((ASTNode)children[i]).is$Equal(((ASTNode)node.children[i]))) {
        return false;
      }
    }
    return true;
  }
  /**
   * @aspect <NoAspect>
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\Errors.jrag:26
   */
    /** @apilevel internal */
  protected void collect_contributors_Program_errors(Program _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    for (int i = 0; i < getNumChild(); i++) {
      getChild(i).collect_contributors_Program_errors(_root, _map);
    }
  }
  /** @apilevel internal */
  protected void contributeTo_Program_errors(Set<ErrorMessage> collection) {
  }

  /**
   * @aspect <NoAspect>
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\FunctionCalls.jrag:6
   */
    /** @apilevel internal */
  protected void collect_contributors_Func_del_functionCalls(Func_del _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    for (int i = 0; i < getNumChild(); i++) {
      getChild(i).collect_contributors_Func_del_functionCalls(_root, _map);
    }
  }
  /** @apilevel internal */
  protected void contributeTo_Func_del_functionCalls(Set<Func_del> collection) {
  }

  /**
   * @attribute inh
   * @aspect BoolType
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\BoolType.jrag:4
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="BoolType", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\BoolType.jrag:4")
  public BoolType boolType() {
    ASTState state = state();
    if (boolType_computed) {
      return boolType_value;
    }
    if (boolType_visited) {
      throw new RuntimeException("Circular definition of attribute ASTNode.boolType().");
    }
    boolType_visited = true;
    state().enterLazyAttribute();
    boolType_value = getParent().Define_boolType(this, null);
    boolType_computed = true;
    state().leaveLazyAttribute();
    boolType_visited = false;
    return boolType_value;
  }
/** @apilevel internal */
protected boolean boolType_visited = false;
  /** @apilevel internal */
  private void boolType_reset() {
    boolType_computed = false;
    
    boolType_value = null;
    boolType_visited = false;
  }
  /** @apilevel internal */
  protected boolean boolType_computed = false;

  /** @apilevel internal */
  protected BoolType boolType_value;

  /**
   * @attribute inh
   * @aspect Errors
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\Errors.jrag:28
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="Errors", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\Errors.jrag:28")
  public Program program() {
    ASTState state = state();
    if (program_computed) {
      return program_value;
    }
    if (program_visited) {
      throw new RuntimeException("Circular definition of attribute ASTNode.program().");
    }
    program_visited = true;
    state().enterLazyAttribute();
    program_value = getParent().Define_program(this, null);
    program_computed = true;
    state().leaveLazyAttribute();
    program_visited = false;
    return program_value;
  }
/** @apilevel internal */
protected boolean program_visited = false;
  /** @apilevel internal */
  private void program_reset() {
    program_computed = false;
    
    program_value = null;
    program_visited = false;
  }
  /** @apilevel internal */
  protected boolean program_computed = false;

  /** @apilevel internal */
  protected Program program_value;

  /**
   * @attribute inh
   * @aspect IntType
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\IntType.jrag:4
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="IntType", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\IntType.jrag:4")
  public IntType intType() {
    ASTState state = state();
    if (intType_computed) {
      return intType_value;
    }
    if (intType_visited) {
      throw new RuntimeException("Circular definition of attribute ASTNode.intType().");
    }
    intType_visited = true;
    state().enterLazyAttribute();
    intType_value = getParent().Define_intType(this, null);
    intType_computed = true;
    state().leaveLazyAttribute();
    intType_visited = false;
    return intType_value;
  }
/** @apilevel internal */
protected boolean intType_visited = false;
  /** @apilevel internal */
  private void intType_reset() {
    intType_computed = false;
    
    intType_value = null;
    intType_visited = false;
  }
  /** @apilevel internal */
  protected boolean intType_computed = false;

  /** @apilevel internal */
  protected IntType intType_value;

  /**
   * @attribute inh
   * @aspect UnknownFun
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\UnknownFun.jrag:4
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="UnknownFun", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\UnknownFun.jrag:4")
  public UnknownFun unknownFun() {
    ASTState state = state();
    if (unknownFun_computed) {
      return unknownFun_value;
    }
    if (unknownFun_visited) {
      throw new RuntimeException("Circular definition of attribute ASTNode.unknownFun().");
    }
    unknownFun_visited = true;
    state().enterLazyAttribute();
    unknownFun_value = getParent().Define_unknownFun(this, null);
    unknownFun_computed = true;
    state().leaveLazyAttribute();
    unknownFun_visited = false;
    return unknownFun_value;
  }
/** @apilevel internal */
protected boolean unknownFun_visited = false;
  /** @apilevel internal */
  private void unknownFun_reset() {
    unknownFun_computed = false;
    
    unknownFun_value = null;
    unknownFun_visited = false;
  }
  /** @apilevel internal */
  protected boolean unknownFun_computed = false;

  /** @apilevel internal */
  protected UnknownFun unknownFun_value;

  /**
   * @attribute inh
   * @aspect UnknownType
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\UnknownType.jrag:4
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="UnknownType", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\UnknownType.jrag:4")
  public UnknownType unknownType() {
    ASTState state = state();
    if (unknownType_computed) {
      return unknownType_value;
    }
    if (unknownType_visited) {
      throw new RuntimeException("Circular definition of attribute ASTNode.unknownType().");
    }
    unknownType_visited = true;
    state().enterLazyAttribute();
    unknownType_value = getParent().Define_unknownType(this, null);
    unknownType_computed = true;
    state().leaveLazyAttribute();
    unknownType_visited = false;
    return unknownType_value;
  }
/** @apilevel internal */
protected boolean unknownType_visited = false;
  /** @apilevel internal */
  private void unknownType_reset() {
    unknownType_computed = false;
    
    unknownType_value = null;
    unknownType_visited = false;
  }
  /** @apilevel internal */
  protected boolean unknownType_computed = false;

  /** @apilevel internal */
  protected UnknownType unknownType_value;

  /**
   * @attribute inh
   * @aspect UnknownVar
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\UnknownVar.jrag:4
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="UnknownVar", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\UnknownVar.jrag:4")
  public UnknownVar unknownVar() {
    ASTState state = state();
    if (unknownVar_computed) {
      return unknownVar_value;
    }
    if (unknownVar_visited) {
      throw new RuntimeException("Circular definition of attribute ASTNode.unknownVar().");
    }
    unknownVar_visited = true;
    state().enterLazyAttribute();
    unknownVar_value = getParent().Define_unknownVar(this, null);
    unknownVar_computed = true;
    state().leaveLazyAttribute();
    unknownVar_visited = false;
    return unknownVar_value;
  }
/** @apilevel internal */
protected boolean unknownVar_visited = false;
  /** @apilevel internal */
  private void unknownVar_reset() {
    unknownVar_computed = false;
    
    unknownVar_value = null;
    unknownVar_visited = false;
  }
  /** @apilevel internal */
  protected boolean unknownVar_computed = false;

  /** @apilevel internal */
  protected UnknownVar unknownVar_value;

  /** @apilevel internal */
  public BoolType Define_boolType(ASTNode _callerNode, ASTNode _childNode) {
    ASTNode self = this;
    ASTNode parent = getParent();
    while (parent != null && !parent.canDefine_boolType(self, _callerNode)) {
      _callerNode = self;
      self = parent;
      parent = self.getParent();
    }
    return parent.Define_boolType(self, _callerNode);
  }

  /**
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\BoolType.jrag:5
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute boolType
   */
  protected boolean canDefine_boolType(ASTNode _callerNode, ASTNode _childNode) {
    return false;
  }
  /** @apilevel internal */
  public Program Define_program(ASTNode _callerNode, ASTNode _childNode) {
    ASTNode self = this;
    ASTNode parent = getParent();
    while (parent != null && !parent.canDefine_program(self, _callerNode)) {
      _callerNode = self;
      self = parent;
      parent = self.getParent();
    }
    return parent.Define_program(self, _callerNode);
  }

  /**
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\Errors.jrag:30
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute program
   */
  protected boolean canDefine_program(ASTNode _callerNode, ASTNode _childNode) {
    return false;
  }
  /** @apilevel internal */
  public IntType Define_intType(ASTNode _callerNode, ASTNode _childNode) {
    ASTNode self = this;
    ASTNode parent = getParent();
    while (parent != null && !parent.canDefine_intType(self, _callerNode)) {
      _callerNode = self;
      self = parent;
      parent = self.getParent();
    }
    return parent.Define_intType(self, _callerNode);
  }

  /**
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\IntType.jrag:5
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute intType
   */
  protected boolean canDefine_intType(ASTNode _callerNode, ASTNode _childNode) {
    return false;
  }
  /** @apilevel internal */
  public IdVar Define_lookup(ASTNode _callerNode, ASTNode _childNode, String name) {
    ASTNode self = this;
    ASTNode parent = getParent();
    while (parent != null && !parent.canDefine_lookup(self, _callerNode, name)) {
      _callerNode = self;
      self = parent;
      parent = self.getParent();
    }
    return parent.Define_lookup(self, _callerNode, name);
  }

  /**
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:96
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute lookup
   */
  protected boolean canDefine_lookup(ASTNode _callerNode, ASTNode _childNode, String name) {
    return false;
  }
  /** @apilevel internal */
  public IdFun Define_lookupf(ASTNode _callerNode, ASTNode _childNode, String name) {
    ASTNode self = this;
    ASTNode parent = getParent();
    while (parent != null && !parent.canDefine_lookupf(self, _callerNode, name)) {
      _callerNode = self;
      self = parent;
      parent = self.getParent();
    }
    return parent.Define_lookupf(self, _callerNode, name);
  }

  /**
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:60
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute lookupf
   */
  protected boolean canDefine_lookupf(ASTNode _callerNode, ASTNode _childNode, String name) {
    return false;
  }
  /** @apilevel internal */
  public boolean Define_inExprOf(ASTNode _callerNode, ASTNode _childNode, IdVar decl) {
    ASTNode self = this;
    ASTNode parent = getParent();
    while (parent != null && !parent.canDefine_inExprOf(self, _callerNode, decl)) {
      _callerNode = self;
      self = parent;
      parent = self.getParent();
    }
    return parent.Define_inExprOf(self, _callerNode, decl);
  }

  /**
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:130
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute inExprOf
   */
  protected boolean canDefine_inExprOf(ASTNode _callerNode, ASTNode _childNode, IdVar decl) {
    return false;
  }
  /** @apilevel internal */
  public Type Define_type(ASTNode _callerNode, ASTNode _childNode) {
    ASTNode self = this;
    ASTNode parent = getParent();
    while (parent != null && !parent.canDefine_type(self, _callerNode)) {
      _callerNode = self;
      self = parent;
      parent = self.getParent();
    }
    return parent.Define_type(self, _callerNode);
  }

  /**
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\TypeAnalysis.jrag:39
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute type
   */
  protected boolean canDefine_type(ASTNode _callerNode, ASTNode _childNode) {
    return false;
  }
  /** @apilevel internal */
  public UnknownFun Define_unknownFun(ASTNode _callerNode, ASTNode _childNode) {
    ASTNode self = this;
    ASTNode parent = getParent();
    while (parent != null && !parent.canDefine_unknownFun(self, _callerNode)) {
      _callerNode = self;
      self = parent;
      parent = self.getParent();
    }
    return parent.Define_unknownFun(self, _callerNode);
  }

  /**
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\UnknownFun.jrag:6
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute unknownFun
   */
  protected boolean canDefine_unknownFun(ASTNode _callerNode, ASTNode _childNode) {
    return false;
  }
  /** @apilevel internal */
  public UnknownType Define_unknownType(ASTNode _callerNode, ASTNode _childNode) {
    ASTNode self = this;
    ASTNode parent = getParent();
    while (parent != null && !parent.canDefine_unknownType(self, _callerNode)) {
      _callerNode = self;
      self = parent;
      parent = self.getParent();
    }
    return parent.Define_unknownType(self, _callerNode);
  }

  /**
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\UnknownType.jrag:5
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute unknownType
   */
  protected boolean canDefine_unknownType(ASTNode _callerNode, ASTNode _childNode) {
    return false;
  }
  /** @apilevel internal */
  public UnknownVar Define_unknownVar(ASTNode _callerNode, ASTNode _childNode) {
    ASTNode self = this;
    ASTNode parent = getParent();
    while (parent != null && !parent.canDefine_unknownVar(self, _callerNode)) {
      _callerNode = self;
      self = parent;
      parent = self.getParent();
    }
    return parent.Define_unknownVar(self, _callerNode);
  }

  /**
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\UnknownVar.jrag:5
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute unknownVar
   */
  protected boolean canDefine_unknownVar(ASTNode _callerNode, ASTNode _childNode) {
    return false;
  }
  /** @apilevel internal */
  public Func_del Define_func_del(ASTNode _callerNode, ASTNode _childNode) {
    ASTNode self = this;
    ASTNode parent = getParent();
    while (parent != null && !parent.canDefine_func_del(self, _callerNode)) {
      _callerNode = self;
      self = parent;
      parent = self.getParent();
    }
    return parent.Define_func_del(self, _callerNode);
  }

  /**
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\FunctionCalls.jrag:7
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute func_del
   */
  protected boolean canDefine_func_del(ASTNode _callerNode, ASTNode _childNode) {
    return false;
  }
  /** @apilevel internal */
  public Func_del Define_in_func(ASTNode _callerNode, ASTNode _childNode) {
    ASTNode self = this;
    ASTNode parent = getParent();
    while (parent != null && !parent.canDefine_in_func(self, _callerNode)) {
      _callerNode = self;
      self = parent;
      parent = self.getParent();
    }
    return parent.Define_in_func(self, _callerNode);
  }

  /**
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\FunctionCalls.jrag:9
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute in_func
   */
  protected boolean canDefine_in_func(ASTNode _callerNode, ASTNode _childNode) {
    return false;
  }
  /** @apilevel internal */
  public int Define_paraNum(ASTNode _callerNode, ASTNode _childNode) {
    ASTNode self = this;
    ASTNode parent = getParent();
    while (parent != null && !parent.canDefine_paraNum(self, _callerNode)) {
      _callerNode = self;
      self = parent;
      parent = self.getParent();
    }
    return parent.Define_paraNum(self, _callerNode);
  }

  /**
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:21
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute paraNum
   */
  protected boolean canDefine_paraNum(ASTNode _callerNode, ASTNode _childNode) {
    return false;
  }
  /** @apilevel internal */
  public int Define_callParaNum(ASTNode _callerNode, ASTNode _childNode) {
    ASTNode self = this;
    ASTNode parent = getParent();
    while (parent != null && !parent.canDefine_callParaNum(self, _callerNode)) {
      _callerNode = self;
      self = parent;
      parent = self.getParent();
    }
    return parent.Define_callParaNum(self, _callerNode);
  }

  /**
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:26
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute callParaNum
   */
  protected boolean canDefine_callParaNum(ASTNode _callerNode, ASTNode _childNode) {
    return false;
  }
public ASTNode rewrittenNode() { throw new Error("rewrittenNode is undefined for ASTNode"); }
}
