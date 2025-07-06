package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Directions: ImageVector
    get() {
        if (_Directions != null) {
            return _Directions!!
        }
        _Directions = ImageVector.Builder(
            name = "Directions",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 14.5f)
                verticalLineTo(12f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 10f)
                horizontalLineTo(14f)
                verticalLineTo(7.5f)
                lineTo(17.5f, 11f)
                moveTo(21.71f, 11.29f)
                lineTo(12.71f, 2.29f)
                horizontalLineTo(12.7f)
                curveTo(12.31f, 1.9f, 11.68f, 1.9f, 11.29f, 2.29f)
                lineTo(2.29f, 11.29f)
                curveTo(1.9f, 11.68f, 1.9f, 12.32f, 2.29f, 12.71f)
                lineTo(11.29f, 21.71f)
                curveTo(11.68f, 22.09f, 12.31f, 22.1f, 12.71f, 21.71f)
                lineTo(21.71f, 12.71f)
                curveTo(22.1f, 12.32f, 22.1f, 11.68f, 21.71f, 11.29f)
                close()
            }
        }.build()

        return _Directions!!
    }

@Suppress("ObjectPropertyName")
private var _Directions: ImageVector? = null
