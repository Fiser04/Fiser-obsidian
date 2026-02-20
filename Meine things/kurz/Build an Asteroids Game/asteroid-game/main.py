import pygame

import player
from constants import SCREEN_HEIGHT, SCREEN_WIDTH
from logger import log_state


def main():
    # print(f"Starting Asteroids with pygame version: {pygame.version.ver}")
    # print(f"Screen width: {SCREEN_WIDTH}")
    # print(f"Screen height: {SCREEN_HEIGHT}")
    pygame.init()
    clock = pygame.time.Clock()
    dt = 0
    updatable = pygame.sprite.Group()
    drawable = pygame.sprite.Group()
    screen = pygame.display.set_mode((SCREEN_WIDTH, SCREEN_HEIGHT))
    player.Player.containers = (updatable, drawable)
    player1 = player.Player(SCREEN_WIDTH // 2, SCREEN_HEIGHT // 2)
    while True:
        log_state()
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                return
        screen.fill("black")
        updatable.update(dt)
        for drawabl in drawable:
            drawabl.draw(screen)
        # player1.update(dt)
        # player1.draw(screen)
        pygame.display.flip()
        dt = clock.tick(60) / 1000


if __name__ == "__main__":
    main()
