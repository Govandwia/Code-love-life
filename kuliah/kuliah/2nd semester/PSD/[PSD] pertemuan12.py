# minimum spanning tree algrotima kruskal

class Graph :
    def __init__(self, vertices) :
        self.V = vertices
        self.graph = []
    
    def addEdge(self, u, v, w) :
        self.graph.append([u, v, w]) # u and v --> vertices, w --> weight of the edge
    
    def find(self, parent, i) :
        if parent[i] != i :
            parent[i] = self.find(parent, parent[i])
        return parent[i]
    
    def union(self, parent, rank, x, y) :
        if rank[x] < rank[y]:
            parent[x] = y
        elif rank[x] > rank[y]:
            parent[y] = x
        else : 
            parent[y] = x
            rank[x] += 1

    def kruskal_algorithm(self) :
        res = []
        i = 0 # for sorted edges
        e = 0 # for res[]

        self.graph = sorted(self.graph,key=lambda item : item[2])

        parent = []
        rank = []

        for node in range(self.V) :
            parent.append(node)
            rank.append(0)

        while e < self.V - 1:
            u, v, w = self.graph[i]
            i += 1
            x = self.find(parent, u)
            y = self.find(parent, v)

            if x != y :
                e += 1
                res.append([u, v, w])
                self.union(parent, rank, x, y)

        min_cost = 0
        print("Edges in the constructed MST")
        for u, v, weight in res :
            min_cost += weight
            print(f"{u} -- {v} == {weight}")
        print("Minimum Spanning tree ", min_cost)

if __name__ == '__main__' :
    g = Graph(8)
    g.addEdge(0,1,11)
    g.addEdge(1,2,8)
    g.addEdge(0,2,15)
    g.addEdge(2,3,7)
    g.addEdge(3,0,9)
    g.addEdge(2,4,14)
    g.addEdge(3,4,5)
    g.addEdge(2,5,10)
    g.addEdge(2,6,17)
    g.addEdge(4,6,4)   
    g.addEdge(5,6,6)   
    g.addEdge(6,7,12)   
    g.addEdge(7,3,16)   

    g.kruskal_algorithm()