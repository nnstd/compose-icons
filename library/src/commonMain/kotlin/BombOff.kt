package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BombOff: ImageVector
    get() {
        if (_BombOff != null) {
            return _BombOff!!
        }
        _BombOff = ImageVector.Builder(
            name = "BombOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.5f, 2.75f)
                curveTo(12.7f, 2.75f, 11.25f, 4.2f, 11.25f, 6f)
                horizontalLineTo(10f)
                verticalLineTo(7.29f)
                curveTo(9.31f, 7.5f, 8.67f, 7.81f, 8.08f, 8.2f)
                lineTo(17.79f, 17.91f)
                curveTo(18.58f, 16.76f, 19f, 15.39f, 19f, 14f)
                curveTo(19f, 10.83f, 16.89f, 8.15f, 14f, 7.29f)
                verticalLineTo(6f)
                horizontalLineTo(12.75f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 4.25f)
                arcTo(1.75f, 1.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.25f, 6f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 8.25f)
                curveTo(19.74f, 8.25f, 20.74f, 7.24f, 20.74f, 6f)
                verticalLineTo(5.25f)
                horizontalLineTo(19.25f)
                verticalLineTo(6f)
                curveTo(19.25f, 6.42f, 18.91f, 6.75f, 18.5f, 6.75f)
                curveTo(18.08f, 6.75f, 17.75f, 6.42f, 17.75f, 6f)
                curveTo(17.75f, 4.2f, 16.29f, 2.75f, 14.5f, 2.75f)
                moveTo(3.41f, 6.36f)
                lineTo(2f, 7.77f)
                lineTo(5.55f, 11.32f)
                curveTo(5.2f, 12.14f, 5f, 13.04f, 5f, 14f)
                curveTo(5f, 17.86f, 8.13f, 21f, 12f, 21f)
                curveTo(12.92f, 21f, 13.83f, 20.81f, 14.68f, 20.45f)
                lineTo(18.23f, 24f)
                lineTo(19.64f, 22.59f)
                lineTo(3.41f, 6.36f)
                close()
            }
        }.build()

        return _BombOff!!
    }

@Suppress("ObjectPropertyName")
private var _BombOff: ImageVector? = null
