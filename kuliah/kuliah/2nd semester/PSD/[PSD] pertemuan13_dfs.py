# DFS python
from collections import defaultdict

class Graph :
    def __init__(self) :
        self.graph = defaultdict(list)
    def addEdge(self, u, v) :
        self.graph[u].append(v)
    def DFSUtil(self, v, visited) :
        visited.add(v)
        print(v, end=' -> ')

        for neighbour in self.graph[v]:
            if neighbour not in visited :
                self.DFSUtil(neighbour, visited)
    def DFS(self,v) :
        visited = set()
        self.DFSUtil(v, visited) 

# start
g = Graph()
# g.addEdge(0,1)
# g.addEdge(0,2)
# g.addEdge(1,2)
# g.addEdge(2,0)
# g.addEdge(2,3)
# g.addEdge(3,3)
edges = [
    (0, 1), (0, 2), (1, 2), (1, 3), (2, 0), (2, 3), (2, 4), 
    (3, 3), (3, 4), (4, 5), (4, 6), (5, 6), (5, 7), (6, 7),
    (7, 8), (8, 6), (8, 9), (9, 10), (10, 11), (11, 8)
]

for u, v in edges:
    g.addEdge(u, v)

print("Depth First Traversal (starting from starter '2')")
     
g.DFS(2)