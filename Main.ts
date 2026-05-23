import { Application } from 'pixi.js'
import { CombatScene } from './combat/CombatScene'

const app = new Application()

await app.init({
  width: 1280,
  height: 720,
  background: '#0a0f1f',
  antialias: false,
})

document.body.appendChild(app.canvas)

const combatScene = new CombatScene(app)

app.ticker.add((ticker) => {
  combatScene.update(ticker.deltaTime)
})
