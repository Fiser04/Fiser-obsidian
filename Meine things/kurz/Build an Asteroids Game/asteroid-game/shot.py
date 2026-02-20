import math

import pygame

from circleshape import CircleShape
from constants import SHOT_RADIUS


class Shot(CircleShape):
    def __init__(self, x, y):
        super().__init__(x, y, SHOT_RADIUS)
        self.active = True

    def update(self, dt):
        self.position.x -= self.velocity.x * dt
        self.position.y -= self.velocity.y * dt

    def draw(self, screen):
        pygame.draw.circle(
            screen,
            (255, 255, 255),
            (int(self.position.x), int(self.position.y)),
            self.radius,
        )
