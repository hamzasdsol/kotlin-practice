package ooop

fun main() {
    val component: Component = ConcreteComponent()
    val boldDecorator: Component = BoldDecorator(component)
    val italicDecorator: Component = ItalicDecorator(component)

    println("Original: ${component.render()}")
    println("Bold: ${boldDecorator.render()}")
    println("Italic: ${italicDecorator.render()}")
}

interface Component {
    fun render(): String
}

class ConcreteComponent : Component {
    override fun render(): String {
        return "Original component: Kotlin oop"
    }
}

abstract class TextDecorator(private val component: Component) : Component {
    override fun render(): String {
        return component.render()
    }
}

class BoldDecorator(private val component: Component) : TextDecorator(component) {
    override fun render(): String {
        val renderedText = super.render()
        return "<b>$renderedText</b>"
    }
}

class ItalicDecorator(private val component: Component) : TextDecorator(component) {
    override fun render(): String {
        val renderedText = super.render()
        return "<i>$renderedText</i>"
    }
}