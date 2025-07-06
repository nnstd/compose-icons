package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MouseOff: ImageVector
    get() {
        if (_MouseOff != null) {
            return _MouseOff!!
        }
        _MouseOff = ImageVector.Builder(
            name = "MouseOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 5.27f)
                lineTo(3.28f, 4f)
                lineTo(20f, 20.72f)
                lineTo(18.73f, 22f)
                lineTo(17.5f, 20.79f)
                curveTo(16.08f, 22.16f, 14.14f, 23f, 12f, 23f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 15f)
                verticalLineTo(11f)
                horizontalLineTo(7.73f)
                lineTo(5.73f, 9f)
                horizontalLineTo(4f)
                curveTo(4f, 8.46f, 4.05f, 7.93f, 4.15f, 7.42f)
                lineTo(2f, 5.27f)
                moveTo(11f, 1.07f)
                verticalLineTo(9f)
                horizontalLineTo(10.82f)
                lineTo(5.79f, 3.96f)
                curveTo(7.05f, 2.4f, 8.9f, 1.33f, 11f, 1.07f)
                moveTo(20f, 11f)
                verticalLineTo(15f)
                curveTo(20f, 15.95f, 19.83f, 16.86f, 19.53f, 17.71f)
                lineTo(12.82f, 11f)
                horizontalLineTo(20f)
                moveTo(13f, 1.07f)
                curveTo(16.94f, 1.56f, 20f, 4.92f, 20f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(1.07f)
                close()
            }
        }.build()

        return _MouseOff!!
    }

@Suppress("ObjectPropertyName")
private var _MouseOff: ImageVector? = null
