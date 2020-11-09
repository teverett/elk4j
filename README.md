![CI](https://github.com/teverett/dot4j/workflows/CI/badge.svg)

# ELK4J

A Java library for reading and writing [ELK](https://www.eclipse.org/elk/) [JSON](https://www.eclipse.org/elk/documentation/tooldevelopers/graphdatastructure/jsonformat.html)


# License

ELK4J is licensed under the 3-Clause BSD license.

# Maven Coordinates

```
<groupId>com.khubla.elk4j</groupId>
<artifactId>elk4j</artifactId>
<version>1.0.0</version>
<packaging>jar</packaging>
```

# Usage

Reading and writing of DOT files is done via [ELKMarshaller](https://github.com/teverett/dot4j/blob/master/src/main/java/com/khubla/dot4j/DOTMarshaller.java)

## Reading DOT

`Graph g = DOTMarshaller.importGraph(inputStream);`

## Writing DOT

```
Graph g = new Graph(false, GraphType.digraph, "mygraph");
Node n1 = new Node("n1");
g.addNode(n1);
Node n2 = new Node("node2");
g.addNode(n2);
Edge theEdge = new Edge("n1", "node2");
g.addEdge(theEdge);
DOTMarshaller.exportGraph(g, baos);
```

Creates:
```
digraph mygraph {
   node2;
   n1;
   n1 -> node2;
}

```