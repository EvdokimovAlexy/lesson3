from shutil import move

import self as self

from model_elements.Camera import Point3D


class Flash:
    def __init__(self, location: Point3D, angle: move,  power: float) -> None:
        self.location = location
        self.angle = angle
        self.power = power

    def rotate(data: move) -> None:
        pass

    def move(data: Point3D) -> None:
        pass