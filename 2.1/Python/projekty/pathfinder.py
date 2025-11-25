grid = [
    [".", ".", "#", ".", "R", ".", "#", ".", "."],
    [".", "#", ".", ".", ".", ".", ".", "#", "."],
    [".", ".", ".", "#", ".", "#", ".", ".", "."],
    ["#", ".", "#", "P1", ".", "P2", "#", ".", "#"],
    [".", ".", ".", ".", "#", ".", ".", ".", "."],
    ["#", ".", "#", "P3", ".", "P4", "#", ".", "#"],
    [".", ".", ".", "#", ".", "#", ".", ".", "."],
    [".", "#", ".", ".", ".", ".", ".", "#", "."],
    [".", ".", "#", ".", "E", ".", "#", ".", "."],
]

from astar.search import AStar

list = ["P1", "P2", "P3", "P4", "E"]

priority_packages = [
    ("P1", "HIGH", 2),  # (package, priority, max_wait_time)
    ("P2", "LOW", 5),
    ("P3", "HIGH", 3),
    ("P4", "MEDIUM", 4),
]

targets = []


def calculate_value_of_package(priority, maxWait):
    priority_values = {"HIGH": 100, "MEDIUM": 50, "LOW": 20}
    base_value = priority_values.get(priority, 0)
    value = base_value - (maxWait * 10)
    targets.append(value)


for i in range(0, len(priority_packages)):
    calculate_value_of_package(priority_packages[i][1], priority_packages[i][2])
print(targets)


def hledejBod(grid, bod):
    for i in range(0, len(grid)):
        for j in range(0, len(grid[i])):
            if bod == grid[i][j]:
                return [i, j]
    return [-1, -1]


start = tuple(hledejBod(grid, "R"))


def listKoncu(grid, list):
    listKonec = []
    for i in range(0, len(list)):
        listKonec.append(hledejBod(grid, list[i]))
    return listKonec


listKon = tuple(listKoncu(grid, list))
pocetKroku = 0

for i in range(0, len(grid)):
    for j in range(0, len(grid[i])):
        if grid[i][j] != "#":
            grid[i][j] = 0
        elif grid[i][j] == "#":
            grid[i][j] = 1


for i in range(0, len(listKon)):
    goal = tuple(listKon[i])
    cesta = AStar(grid).search(start, goal)
    # print(start)
    # print(goal)
    # print(cesta)
    for i in range(0, len(cesta)):
        pocetKroku += 1
    print(pocetKroku - 1)
    start = goal
    pocetKroku = 0
