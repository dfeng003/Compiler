/* This file was generated with JastAdd2 (http://jastadd.org) version 2.3.2 */
package lang.ast;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.TreeSet;
/**
 * @ast node
 * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\lang.ast:4
 * @astdecl Func_del : ASTNode ::= IdFun Parafactor* Stmt*;
 * @production Func_del : {@link ASTNode} ::= <span class="component">{@link IdFun}</span> <span class="component">{@link Parafactor}*</span> <span class="component">{@link Stmt}*</span>;

 */
public class Func_del extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @aspect PrettyPrint
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\PrettyPrint.jrag:37
   */
  public void prettyPrint(PrintStream out, String ind) {
		out.print("int ");
		getIdFun().prettyPrint(out, ind);
		out.print("(");
		int count = 0;
		if(getParafactors()!=null){
			for (Parafactor b : getParafactors()) {
		  		if(count == 0){
		  			count = count+1;
		  		}else{
		  			out.print(", ");
		  		}
		  		b.prettyPrint(out, ind);
			}
		}
		out.print(")");
		out.println(" {");
		if( getStmts()!=null){
			for (Stmt b : getStmts()) {
		  		b.prettyPrint(out, ind+"    ");
		  		out.println("");
			}
		}
		out.println(ind + "}");
		out.println("");
	}
  /**
   * @declaredat ASTNode:1
   */
  public Func_del() {
    super();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @declaredat ASTNode:10
   */
  public void init$Children() {
    children = new ASTNode[3];
    setChild(new List(), 1);
    setChild(new List(), 2);
  }
  /**
   * @declaredat ASTNode:15
   */
  @ASTNodeAnnotation.Constructor(
    name = {"IdFun", "Parafactor", "Stmt"},
    type = {"IdFun", "List<Parafactor>", "List<Stmt>"},
    kind = {"Child", "List", "List"}
  )
  public Func_del(IdFun p0, List<Parafactor> p1, List<Stmt> p2) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:26
   */
  protected int numChildren() {
    return 3;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:30
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    reachable_reset();
    localLookup_String_int_reset();
    type_reset();
    lookup_String_reset();
    lookupf_String_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:39
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
    Func_del_functionCalls_visited = false;
    Func_del_functionCalls_computed = false;
    
    Func_del_functionCalls_value = null;
    contributorMap_Func_del_functionCalls = null;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:48
   */
  public Func_del clone() throws CloneNotSupportedException {
    Func_del node = (Func_del) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:53
   */
  public Func_del copy() {
    try {
      Func_del node = (Func_del) clone();
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
   * @declaredat ASTNode:72
   */
  @Deprecated
  public Func_del fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:82
   */
  public Func_del treeCopyNoTransform() {
    Func_del tree = (Func_del) copy();
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
   * @declaredat ASTNode:102
   */
  public Func_del treeCopy() {
    Func_del tree = (Func_del) copy();
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
  /** @apilevel internal 
   * @declaredat ASTNode:116
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node);    
  }
  /**
   * Replaces the IdFun child.
   * @param node The new node to replace the IdFun child.
   * @apilevel high-level
   */
  public void setIdFun(IdFun node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the IdFun child.
   * @return The current node used as the IdFun child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="IdFun")
  public IdFun getIdFun() {
    return (IdFun) getChild(0);
  }
  /**
   * Retrieves the IdFun child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the IdFun child.
   * @apilevel low-level
   */
  public IdFun getIdFunNoTransform() {
    return (IdFun) getChildNoTransform(0);
  }
  /**
   * Replaces the Parafactor list.
   * @param list The new list node to be used as the Parafactor list.
   * @apilevel high-level
   */
  public void setParafactorList(List<Parafactor> list) {
    setChild(list, 1);
  }
  /**
   * Retrieves the number of children in the Parafactor list.
   * @return Number of children in the Parafactor list.
   * @apilevel high-level
   */
  public int getNumParafactor() {
    return getParafactorList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Parafactor list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Parafactor list.
   * @apilevel low-level
   */
  public int getNumParafactorNoTransform() {
    return getParafactorListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Parafactor list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Parafactor list.
   * @apilevel high-level
   */
  public Parafactor getParafactor(int i) {
    return (Parafactor) getParafactorList().getChild(i);
  }
  /**
   * Check whether the Parafactor list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasParafactor() {
    return getParafactorList().getNumChild() != 0;
  }
  /**
   * Append an element to the Parafactor list.
   * @param node The element to append to the Parafactor list.
   * @apilevel high-level
   */
  public void addParafactor(Parafactor node) {
    List<Parafactor> list = (parent == null) ? getParafactorListNoTransform() : getParafactorList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addParafactorNoTransform(Parafactor node) {
    List<Parafactor> list = getParafactorListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Parafactor list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setParafactor(Parafactor node, int i) {
    List<Parafactor> list = getParafactorList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Parafactor list.
   * @return The node representing the Parafactor list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Parafactor")
  public List<Parafactor> getParafactorList() {
    List<Parafactor> list = (List<Parafactor>) getChild(1);
    return list;
  }
  /**
   * Retrieves the Parafactor list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Parafactor list.
   * @apilevel low-level
   */
  public List<Parafactor> getParafactorListNoTransform() {
    return (List<Parafactor>) getChildNoTransform(1);
  }
  /**
   * @return the element at index {@code i} in the Parafactor list without
   * triggering rewrites.
   */
  public Parafactor getParafactorNoTransform(int i) {
    return (Parafactor) getParafactorListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Parafactor list.
   * @return The node representing the Parafactor list.
   * @apilevel high-level
   */
  public List<Parafactor> getParafactors() {
    return getParafactorList();
  }
  /**
   * Retrieves the Parafactor list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Parafactor list.
   * @apilevel low-level
   */
  public List<Parafactor> getParafactorsNoTransform() {
    return getParafactorListNoTransform();
  }
  /**
   * Replaces the Stmt list.
   * @param list The new list node to be used as the Stmt list.
   * @apilevel high-level
   */
  public void setStmtList(List<Stmt> list) {
    setChild(list, 2);
  }
  /**
   * Retrieves the number of children in the Stmt list.
   * @return Number of children in the Stmt list.
   * @apilevel high-level
   */
  public int getNumStmt() {
    return getStmtList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Stmt list.
   * Calling this method will not trigger rewrites.
   * @return Number of children in the Stmt list.
   * @apilevel low-level
   */
  public int getNumStmtNoTransform() {
    return getStmtListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Stmt list.
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Stmt list.
   * @apilevel high-level
   */
  public Stmt getStmt(int i) {
    return (Stmt) getStmtList().getChild(i);
  }
  /**
   * Check whether the Stmt list has any children.
   * @return {@code true} if it has at least one child, {@code false} otherwise.
   * @apilevel high-level
   */
  public boolean hasStmt() {
    return getStmtList().getNumChild() != 0;
  }
  /**
   * Append an element to the Stmt list.
   * @param node The element to append to the Stmt list.
   * @apilevel high-level
   */
  public void addStmt(Stmt node) {
    List<Stmt> list = (parent == null) ? getStmtListNoTransform() : getStmtList();
    list.addChild(node);
  }
  /** @apilevel low-level 
   */
  public void addStmtNoTransform(Stmt node) {
    List<Stmt> list = getStmtListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Stmt list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   */
  public void setStmt(Stmt node, int i) {
    List<Stmt> list = getStmtList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Stmt list.
   * @return The node representing the Stmt list.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.ListChild(name="Stmt")
  public List<Stmt> getStmtList() {
    List<Stmt> list = (List<Stmt>) getChild(2);
    return list;
  }
  /**
   * Retrieves the Stmt list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Stmt list.
   * @apilevel low-level
   */
  public List<Stmt> getStmtListNoTransform() {
    return (List<Stmt>) getChildNoTransform(2);
  }
  /**
   * @return the element at index {@code i} in the Stmt list without
   * triggering rewrites.
   */
  public Stmt getStmtNoTransform(int i) {
    return (Stmt) getStmtListNoTransform().getChildNoTransform(i);
  }
  /**
   * Retrieves the Stmt list.
   * @return The node representing the Stmt list.
   * @apilevel high-level
   */
  public List<Stmt> getStmts() {
    return getStmtList();
  }
  /**
   * Retrieves the Stmt list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Stmt list.
   * @apilevel low-level
   */
  public List<Stmt> getStmtsNoTransform() {
    return getStmtListNoTransform();
  }
  /**
   * @aspect <NoAspect>
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\FunctionCalls.jrag:6
   */
  /** @apilevel internal */
protected java.util.Map<ASTNode, java.util.Set<ASTNode>> contributorMap_Func_del_functionCalls = null;

  /** @apilevel internal */
  protected void survey_Func_del_functionCalls() {
    if (contributorMap_Func_del_functionCalls == null) {
      contributorMap_Func_del_functionCalls = new java.util.IdentityHashMap<ASTNode, java.util.Set<ASTNode>>();
      collect_contributors_Func_del_functionCalls(this, contributorMap_Func_del_functionCalls);
    }
  }

/** @apilevel internal */
protected ASTState.Cycle reachable_cycle = null;
  /** @apilevel internal */
  private void reachable_reset() {
    reachable_computed = false;
    reachable_initialized = false;
    reachable_value = null;
    reachable_cycle = null;
  }
  /** @apilevel internal */
  protected boolean reachable_computed = false;

  /** @apilevel internal */
  protected Set<Func_del> reachable_value;
  /** @apilevel internal */
  protected boolean reachable_initialized = false;
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN, isCircular=true)
  @ASTNodeAnnotation.Source(aspect="FunctionCalls", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\FunctionCalls.jrag:12")
  public Set<Func_del> reachable() {
    if (reachable_computed) {
      return reachable_value;
    }
    ASTState state = state();
    if (!reachable_initialized) {
      reachable_initialized = true;
      reachable_value = new TreeSet<Func_del>();
    }
    if (!state.inCircle() || state.calledByLazyAttribute()) {
      state.enterCircle();
      do {
        reachable_cycle = state.nextCycle();
        Set<Func_del> new_reachable_value = reachable_compute();
        if (!AttributeValue.equals(reachable_value, new_reachable_value)) {
          state.setChangeInCycle();
        }
        reachable_value = new_reachable_value;
      } while (state.testAndClearChangeInCycle());
      reachable_computed = true;
      state.startLastCycle();
      Set<Func_del> $tmp = reachable_compute();

      state.leaveCircle();
    } else if (reachable_cycle != state.cycle()) {
      reachable_cycle = state.cycle();
      if (state.lastCycle()) {
        reachable_computed = true;
        Set<Func_del> new_reachable_value = reachable_compute();
        return new_reachable_value;
      }
      Set<Func_del> new_reachable_value = reachable_compute();
      if (!AttributeValue.equals(reachable_value, new_reachable_value)) {
        state.setChangeInCycle();
      }
      reachable_value = new_reachable_value;
    } else {
    }
    return reachable_value;
  }
  /** @apilevel internal */
  private Set<Func_del> reachable_compute() {
  		Set<Func_del> funcs = new TreeSet<Func_del>();
  		for(Func_del fun : functionCalls()){
  			funcs.add(fun);
  			for(Func_del ff : fun.reachable()){
  				funcs.add(ff);
  			}
  		}
  		return funcs;
  	}
/** @apilevel internal */
protected java.util.Set localLookup_String_int_visited;
  /** @apilevel internal */
  private void localLookup_String_int_reset() {
    localLookup_String_int_values = null;
    localLookup_String_int_visited = null;
  }
  /** @apilevel internal */
  protected java.util.Map localLookup_String_int_values;

  /**
   * @attribute syn
   * @aspect NameAnalysis
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:74
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:74")
  public IdVar localLookup(String name, int index) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(name);
    _parameters.add(index);
    if (localLookup_String_int_visited == null) localLookup_String_int_visited = new java.util.HashSet(4);
    if (localLookup_String_int_values == null) localLookup_String_int_values = new java.util.HashMap(4);
    ASTState state = state();
    if (localLookup_String_int_values.containsKey(_parameters)) {
      return (IdVar) localLookup_String_int_values.get(_parameters);
    }
    if (localLookup_String_int_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Func_del.localLookup(String,int).");
    }
    localLookup_String_int_visited.add(_parameters);
    state().enterLazyAttribute();
    IdVar localLookup_String_int_value = localLookup_compute(name, index);
    localLookup_String_int_values.put(_parameters, localLookup_String_int_value);
    state().leaveLazyAttribute();
    localLookup_String_int_visited.remove(_parameters);
    return localLookup_String_int_value;
  }
  /** @apilevel internal */
  private IdVar localLookup_compute(String name, int index) {
  	
  		if(getParafactors()!=null){
  			for (int i = 0; i <= getNumParafactor()-1; i++) {
  				if (getParafactor(i).getIdVar().getID().equals(name)) {
  					return getParafactor(i).getIdVar();
  				}
  			} 
  		}
  		for(int i = 0; i <= index; i++) {
  			if (getStmt(i).lookupHere().getID().equals(name)) {
  				return getStmt(i).lookupHere();
  			}
  		}
  		return unknownVar();
  	}
/** @apilevel internal */
protected boolean type_visited = false;
  /** @apilevel internal */
  private void type_reset() {
    type_computed = false;
    
    type_value = null;
    type_visited = false;
  }
  /** @apilevel internal */
  protected boolean type_computed = false;

  /** @apilevel internal */
  protected Type type_value;

  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\TypeAnalysis.jrag:43
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="TypeAnalysis", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\TypeAnalysis.jrag:43")
  public Type type() {
    ASTState state = state();
    if (type_computed) {
      return type_value;
    }
    if (type_visited) {
      throw new RuntimeException("Circular definition of attribute Func_del.type().");
    }
    type_visited = true;
    state().enterLazyAttribute();
    type_value = intType();
    type_computed = true;
    state().leaveLazyAttribute();
    type_visited = false;
    return type_value;
  }
  /**
   * @attribute inh
   * @aspect NameAnalysis
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:57
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:57")
  public IdVar lookup(String name) {
    Object _parameters = name;
    if (lookup_String_visited == null) lookup_String_visited = new java.util.HashSet(4);
    if (lookup_String_values == null) lookup_String_values = new java.util.HashMap(4);
    ASTState state = state();
    if (lookup_String_values.containsKey(_parameters)) {
      return (IdVar) lookup_String_values.get(_parameters);
    }
    if (lookup_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Func_del.lookup(String).");
    }
    lookup_String_visited.add(_parameters);
    state().enterLazyAttribute();
    IdVar lookup_String_value = getParent().Define_lookup(this, null, name);
    lookup_String_values.put(_parameters, lookup_String_value);
    state().leaveLazyAttribute();
    lookup_String_visited.remove(_parameters);
    return lookup_String_value;
  }
/** @apilevel internal */
protected java.util.Set lookup_String_visited;
  /** @apilevel internal */
  private void lookup_String_reset() {
    lookup_String_values = null;
    lookup_String_visited = null;
  }
  /** @apilevel internal */
  protected java.util.Map lookup_String_values;

  /**
   * @attribute inh
   * @aspect NameAnalysis
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:58
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="NameAnalysis", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:58")
  public IdFun lookupf(String name) {
    Object _parameters = name;
    if (lookupf_String_visited == null) lookupf_String_visited = new java.util.HashSet(4);
    if (lookupf_String_values == null) lookupf_String_values = new java.util.HashMap(4);
    ASTState state = state();
    if (lookupf_String_values.containsKey(_parameters)) {
      return (IdFun) lookupf_String_values.get(_parameters);
    }
    if (lookupf_String_visited.contains(_parameters)) {
      throw new RuntimeException("Circular definition of attribute Func_del.lookupf(String).");
    }
    lookupf_String_visited.add(_parameters);
    state().enterLazyAttribute();
    IdFun lookupf_String_value = getParent().Define_lookupf(this, null, name);
    lookupf_String_values.put(_parameters, lookupf_String_value);
    state().leaveLazyAttribute();
    lookupf_String_visited.remove(_parameters);
    return lookupf_String_value;
  }
/** @apilevel internal */
protected java.util.Set lookupf_String_visited;
  /** @apilevel internal */
  private void lookupf_String_reset() {
    lookupf_String_values = null;
    lookupf_String_visited = null;
  }
  /** @apilevel internal */
  protected java.util.Map lookupf_String_values;

  /**
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\FunctionCalls.jrag:8
   * @apilevel internal
   */
  public Func_del Define_func_del(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getIdFunNoTransform()) {
      // @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\FunctionCalls.jrag:7
      return this;
    }
    else {
      return getParent().Define_func_del(this, _callerNode);
    }
  }
  /**
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\FunctionCalls.jrag:8
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute func_del
   */
  protected boolean canDefine_func_del(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\FunctionCalls.jrag:10
   * @apilevel internal
   */
  public Func_del Define_in_func(ASTNode _callerNode, ASTNode _childNode) {
    int childIndex = this.getIndexOfChild(_callerNode);
    return this;
  }
  /**
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\FunctionCalls.jrag:10
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute in_func
   */
  protected boolean canDefine_in_func(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:24
   * @apilevel internal
   */
  public int Define_paraNum(ASTNode _callerNode, ASTNode _childNode) {
    if (_callerNode == getIdFunNoTransform()) {
      // @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:21
      {
      		return getNumParafactor();
      	}
    }
    else {
      return getParent().Define_paraNum(this, _callerNode);
    }
  }
  /**
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:24
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute paraNum
   */
  protected boolean canDefine_paraNum(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
  /**
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:6
   * @apilevel internal
   */
  public IdVar Define_lookup(ASTNode _callerNode, ASTNode _childNode, String name) {
    if (_callerNode == getParafactorListNoTransform()) {
      // @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:43
      int index = _callerNode.getIndexOfChild(_childNode);
      {
      		if(getParafactors()!=null){
      			for (int i = 0; i <= index; i++) {
      				if (getParafactor(i).getIdVar().getID().equals(name)) {
      					return getParafactor(i).getIdVar();
      				}
      			} 
      		}
      		return unknownVar();
      	}
    }
    else if (_callerNode == getStmtListNoTransform()) {
      // @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:38
      int index = _callerNode.getIndexOfChild(_childNode);
      {
      		IdVar decl = localLookup(name, index);
      		return !decl.isUnknown() ? decl : lookup(name);
      	}
    }
    else {
      return getParent().Define_lookup(this, _callerNode, name);
    }
  }
  /**
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\NameAnalysis.jrag:6
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute lookup
   */
  protected boolean canDefine_lookup(ASTNode _callerNode, ASTNode _childNode, String name) {
    return true;
  }
  /**
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\TypeAnalysis.jrag:37
   * @apilevel internal
   */
  public Type Define_type(ASTNode _callerNode, ASTNode _childNode) {
    int childIndex = this.getIndexOfChild(_callerNode);
    return type();
  }
  /**
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\TypeAnalysis.jrag:37
   * @apilevel internal
   * @return {@code true} if this node has an equation for the inherited attribute type
   */
  protected boolean canDefine_type(ASTNode _callerNode, ASTNode _childNode) {
    return true;
  }
/** @apilevel internal */
protected boolean Func_del_functionCalls_visited = false;
  /**
   * @attribute coll
   * @aspect FunctionCalls
   * @declaredat C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\FunctionCalls.jrag:6
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.COLL)
  @ASTNodeAnnotation.Source(aspect="FunctionCalls", declaredAt="C:\\a.SCHOOL\\yr3sem1\\Compilers\\lab4\\SimpliC_rx2\\src\\jastadd\\FunctionCalls.jrag:6")
  public Set<Func_del> functionCalls() {
    ASTState state = state();
    if (Func_del_functionCalls_computed) {
      return Func_del_functionCalls_value;
    }
    if (Func_del_functionCalls_visited) {
      throw new RuntimeException("Circular definition of attribute Func_del.functionCalls().");
    }
    Func_del_functionCalls_visited = true;
    state().enterLazyAttribute();
    Func_del_functionCalls_value = functionCalls_compute();
    Func_del_functionCalls_computed = true;
    state().leaveLazyAttribute();
    Func_del_functionCalls_visited = false;
    return Func_del_functionCalls_value;
  }
  /** @apilevel internal */
  private Set<Func_del> functionCalls_compute() {
    ASTNode node = this;
    while (node != null && !(node instanceof Func_del)) {
      node = node.getParent();
    }
    Func_del root = (Func_del) node;
    root.survey_Func_del_functionCalls();
    Set<Func_del> _computedValue = new TreeSet<Func_del>();
    if (root.contributorMap_Func_del_functionCalls.containsKey(this)) {
      for (ASTNode contributor : root.contributorMap_Func_del_functionCalls.get(this)) {
        contributor.contributeTo_Func_del_functionCalls(_computedValue);
      }
    }
    return _computedValue;
  }
  /** @apilevel internal */
  protected boolean Func_del_functionCalls_computed = false;

  /** @apilevel internal */
  protected Set<Func_del> Func_del_functionCalls_value;

}
