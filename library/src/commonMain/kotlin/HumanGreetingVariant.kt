package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HumanGreetingVariant: ImageVector
    get() {
        if (_HumanGreetingVariant != null) {
            return _HumanGreetingVariant!!
        }
        _HumanGreetingVariant = ImageVector.Builder(
            name = "HumanGreetingVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.5f, 4f)
                verticalLineTo(5.5f)
                curveTo(1.5f, 9.65f, 3.71f, 13.28f, 7f, 15.3f)
                verticalLineTo(20f)
                horizontalLineTo(22f)
                verticalLineTo(18f)
                curveTo(22f, 15.34f, 16.67f, 14f, 14f, 14f)
                curveTo(14f, 14f, 13.83f, 14f, 13.75f, 14f)
                curveTo(9f, 14f, 5f, 10f, 5f, 5.5f)
                verticalLineTo(4f)
                moveTo(14f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 4f)
                close()
            }
        }.build()

        return _HumanGreetingVariant!!
    }

@Suppress("ObjectPropertyName")
private var _HumanGreetingVariant: ImageVector? = null
