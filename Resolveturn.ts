export interface FlightCommand {
  throttleDelta: number
  turn: -1 | 0 | 1
  altitudeDelta: -1 | 0 | 1
  weaponFire?: string
  targetId?: string
}
