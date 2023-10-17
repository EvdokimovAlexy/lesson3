from abc import ABC, abstractmethod


class IModelChangersender:
    pass


class IModelChanger(ABC):
    @abstractmethod
    def notify_change(data: IModelChangersender) -> None:
        pass