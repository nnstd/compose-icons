package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DiceD6Outline: ImageVector
    get() {
        if (_DiceD6Outline != null) {
            return _DiceD6Outline!!
        }
        _DiceD6Outline = ImageVector.Builder(
            name = "DiceD6Outline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                moveTo(5f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                moveTo(13.39f, 9.53f)
                curveTo(10.89f, 9.5f, 10.86f, 11.53f, 10.86f, 11.53f)
                curveTo(10.86f, 11.53f, 11.41f, 10.87f, 12.53f, 10.87f)
                curveTo(13.19f, 10.87f, 14.5f, 11.45f, 14.55f, 13.41f)
                curveTo(14.61f, 15.47f, 12.77f, 16f, 12.77f, 16f)
                curveTo(12.77f, 16f, 9.27f, 16.86f, 9.3f, 12.66f)
                curveTo(9.33f, 7.94f, 13.39f, 8.33f, 13.39f, 8.33f)
                verticalLineTo(9.53f)
                moveTo(11.95f, 12.1f)
                curveTo(11.21f, 12f, 10.83f, 12.78f, 10.83f, 12.78f)
                lineTo(10.85f, 13.5f)
                curveTo(10.85f, 14.27f, 11.39f, 14.83f, 12f, 14.83f)
                curveTo(12.61f, 14.83f, 13.05f, 14.27f, 13.05f, 13.5f)
                curveTo(13.05f, 12.73f, 12.56f, 12.1f, 11.95f, 12.1f)
                close()
            }
        }.build()

        return _DiceD6Outline!!
    }

@Suppress("ObjectPropertyName")
private var _DiceD6Outline: ImageVector? = null
