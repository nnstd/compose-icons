package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KeyboardOff: ImageVector
    get() {
        if (_KeyboardOff != null) {
            return _KeyboardOff!!
        }
        _KeyboardOff = ImageVector.Builder(
            name = "KeyboardOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 4.27f)
                lineTo(2.28f, 3f)
                lineTo(20f, 20.72f)
                lineTo(18.73f, 22f)
                lineTo(15.73f, 19f)
                horizontalLineTo(4f)
                curveTo(2.89f, 19f, 2f, 18.1f, 2f, 17f)
                verticalLineTo(7f)
                curveTo(2f, 6.5f, 2.18f, 6.07f, 2.46f, 5.73f)
                lineTo(1f, 4.27f)
                moveTo(19f, 10f)
                verticalLineTo(8f)
                horizontalLineTo(17f)
                verticalLineTo(10f)
                horizontalLineTo(19f)
                moveTo(19f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                moveTo(16f, 10f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                moveTo(16f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(14f)
                verticalLineTo(12.18f)
                lineTo(11.82f, 10f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                verticalLineTo(9.18f)
                lineTo(9.82f, 8f)
                lineTo(6.82f, 5f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 7f)
                verticalLineTo(17f)
                curveTo(22f, 17.86f, 21.46f, 18.59f, 20.7f, 18.87f)
                lineTo(14.82f, 13f)
                horizontalLineTo(16f)
                moveTo(8f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(13.73f)
                lineTo(11.73f, 15f)
                horizontalLineTo(8f)
                moveTo(5f, 10f)
                horizontalLineTo(6.73f)
                lineTo(5f, 8.27f)
                verticalLineTo(10f)
                moveTo(7f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                moveTo(8f, 13f)
                horizontalLineTo(9.73f)
                lineTo(8f, 11.27f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _KeyboardOff!!
    }

@Suppress("ObjectPropertyName")
private var _KeyboardOff: ImageVector? = null
