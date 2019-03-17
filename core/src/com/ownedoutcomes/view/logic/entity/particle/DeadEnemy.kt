package com.ownedoutcomes.view.logic.entity.particle

import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.math.Interpolation
import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.physics.box2d.Body
import com.badlogic.gdx.scenes.scene2d.actions.Actions
import com.badlogic.gdx.scenes.scene2d.ui.Image
import com.ownedoutcomes.view.logic.EntityType
import com.ownedoutcomes.view.logic.EntityType.PARTICLE
import com.ownedoutcomes.view.logic.entity.Entity
import ktx.actors.alpha
import ktx.actors.then
import ktx.scene2d.Scene2DSkin

class DeadEnemy(override val body: Body, override val position: Vector2, sprite: String, originalSprite: Sprite) : Entity {

    override var destination: Vector2? = null
    override val entityType: EntityType = PARTICLE
    override var dead = false
    val skin = Scene2DSkin.defaultSkin

    val image: Image = Image(skin, sprite).apply {
        setSize(originalSprite.width, originalSprite.height)
        setOrigin(originalSprite.originX, originalSprite.originY)
        rotation = originalSprite.rotation
        addAction(Actions.rotateTo(90f, 1f, Interpolation.exp10Out)
                then Actions.fadeOut(0.2f)
                then Actions.run { dead = true }
        )
    }

    val sprite = skin.atlas.createSprite(sprite).apply {
        // Image has no flip X. :C
        setFlip(originalSprite.isFlipX, false)
        setSize(originalSprite.width, originalSprite.height)
        setOrigin(originalSprite.originX, originalSprite.originY)
        setPosition(position.x - width / 2f, position.y - width / 2f)
    }

    override fun update(delta: Float) {
        image.act(delta)
        sprite.rotation = image.rotation
    }

    override fun render(batch: Batch) {
        sprite.draw(batch, image.alpha)
    }

    override fun destroy() {
    }
}
