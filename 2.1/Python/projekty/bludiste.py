from astar.search import AStar
grid = [
    ['.', '.', '.','.','.'],
    ['S', '#', '.','#','.'],
    ['.', '.', '.','.','.'],
    ['.', '#', '.','#','.'],
    ['3', '2', '#','1','0']
]
list = ['1','0','3','2']

def hledejBod(grid, bod):
    for i in range(0, len(grid)):
        for j in range(0, len(grid[i])):
            if(bod == grid[i][j]):
                return [i,j]
    return [-1, -1]




start = tuple(hledejBod(grid, 'S'))



def listKoncu(grid, list):
    listKonec = []
    for i in range(0, len(list)):
        listKonec.append(hledejBod(grid, list[i]))
    return listKonec

listKon = tuple(listKoncu(grid, list))
pocetKroku = 0

for i in range(0, len(grid)):
    for j in range(0, len(grid[i])):
        if(grid[i][j] != '#'):
            grid[i][j] = 0
        elif(grid[i][j] == '#'):
            grid[i][j] = 1


for i in range(0, len(listKon)):
    goal =  tuple(listKon[i])
    cesta = AStar(grid).search(start, goal)
    print(cesta)
    for i in range(0, len(cesta)):
        pocetKroku+=1
    print(pocetKroku)
    pocetKroku = 0
