# implementasi Algortiman Edmonds Karp (python)

# print path
def printPath (path) :
    for i in range (len(path)) :
        print(path[i][0], end="->")
    print(path[-1][1])

# BFS
def bfs(C, F, s, t) :
    queue = [s]
    paths = {s: []}
    if s == t:
        printPath(paths[s])
        return paths[s]
    while queue :
        u = queue.pop(0)
        for v in range(len(C)):
            if (C[u][v]-F[u][v] > 0) and v not in paths :
                paths[v] = paths[u] + [(u, v)]
                if v == t:
                    printPath(paths[v])
                    return paths[v]
                queue.append(v)
    return None

# Edmons-Karp
def max_flow(C, s, t) :
    n = len(C) # C --> capacity of matrix
    F = [[0] * n for i in range(n)]
    print("-"*10)
    print("\nAvaible route (BFS)")
    path = bfs(C, F, s, t)
    while path != None :
        flow = min(C[u][v] - F[u][v] for u, v in path)
        for u, v in path :
            F[u][v] += flow
            F[v][u] -= flow
        path = bfs(C, F, s, t)
    return sum(F[s][i] for i in range(n))


# # run (kasus 1)
# # Matriks kapasitas (6x6)
C = [
    [0, 6, 0, 8, 0, 0],
    [0, 0, 10, 0, 2, 0],
    [0, 0, 0, 0, 4, 0],
    [0, 3, 0, 0, 4, 0],
    [0, 0, 0, 0, 0, 15],
    [0, 0, 0, 0, 0, 0]
]

# Sumber (s) dan Tujuan (t)
s = 0  # sumber (source)
t = 5  # tujuan (sink)

# Menjalankan fungsi max_flow
print('\n kasus 1')
print("Maximum Flow:", max_flow(C, s, t))


# run (kasus 2)
# Matriks kapasitas (6x6)
C = [
    [0, 9, 0, 7, 0, 0],
    [0, 0, 8, 1, 0, 0],
    [0, 0, 0, 0, 0, 9],
    [0, 2, 0, 0, 6, 0],
    [0, 0, 3, 0, 0, 11],
    [0, 0, 0, 0, 0, 0]
]

s = 0  # sumber (source)
t = 5  # tujuan (sink)

print('\n kasus 2')
print("Maximum Flow:", max_flow(C, s, t))


# run (kasus 3)
# Matriks kapasitas (6x6)
C = [
    [0, 12, 0, 11, 0, 0],
    [0, 0, 9, 3, 0, 0],
    [0, 8, 0, 0, 4, 11],
    [0, 5, 0, 0, 15, 0],
    [0, 3, 7, 9, 0, 12],
    [0, 0, 0, 0, 0, 0]
]

s = 0  # sumber (source)
t = 5  # tujuan (sink)
print('\n kasus 3')
print("Maximum Flow:", max_flow(C, s, t))