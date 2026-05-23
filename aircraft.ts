export class Aircraft {
  id: string

  hp = 100
  fuel = 100
  altitude = 5
  speed = 4

  x = 0
  y = 0

  facing = 0

  weapons = []

  statusEffects: string[] = []

  constructor(id: string) {
    this.id = id
  }

  applyDamage(amount: number) {
    this.hp -= amount
  }

  isDestroyed() {
    return this.hp <= 0
  }
}
