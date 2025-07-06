package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightbulbOff: ImageVector
    get() {
        if (_LightbulbOff != null) {
            return _LightbulbOff!!
        }
        _LightbulbOff = ImageVector.Builder(
            name = "LightbulbOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(9.76f, 2f, 7.78f, 3.05f, 6.5f, 4.68f)
                lineTo(16.31f, 14.5f)
                curveTo(17.94f, 13.21f, 19f, 11.24f, 19f, 9f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                moveTo(3.28f, 4f)
                lineTo(2f, 5.27f)
                lineTo(5.04f, 8.3f)
                curveTo(5f, 8.53f, 5f, 8.76f, 5f, 9f)
                curveTo(5f, 11.38f, 6.19f, 13.47f, 8f, 14.74f)
                verticalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 18f)
                horizontalLineTo(14.73f)
                lineTo(18.73f, 22f)
                lineTo(20f, 20.72f)
                lineTo(3.28f, 4f)
                moveTo(9f, 20f)
                verticalLineTo(21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 22f)
                horizontalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 21f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _LightbulbOff!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbOff: ImageVector? = null
