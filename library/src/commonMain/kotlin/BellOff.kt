package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BellOff: ImageVector
    get() {
        if (_BellOff != null) {
            return _BellOff!!
        }
        _BellOff = ImageVector.Builder(
            name = "BellOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.84f, 22.73f)
                lineTo(18.11f, 20f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                lineTo(5f, 17f)
                verticalLineTo(11f)
                curveTo(5f, 9.86f, 5.29f, 8.73f, 5.83f, 7.72f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(19f, 15.8f)
                verticalLineTo(11f)
                curveTo(19f, 7.9f, 16.97f, 5.17f, 14f, 4.29f)
                curveTo(14f, 4.19f, 14f, 4.1f, 14f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 4f)
                curveTo(10f, 4.1f, 10f, 4.19f, 10f, 4.29f)
                curveTo(9.39f, 4.47f, 8.8f, 4.74f, 8.26f, 5.09f)
                lineTo(19f, 15.8f)
                moveTo(12f, 23f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 21f)
                horizontalLineTo(10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 23f)
                close()
            }
        }.build()

        return _BellOff!!
    }

@Suppress("ObjectPropertyName")
private var _BellOff: ImageVector? = null
