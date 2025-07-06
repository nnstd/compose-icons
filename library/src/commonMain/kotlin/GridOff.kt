package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GridOff: ImageVector
    get() {
        if (_GridOff != null) {
            return _GridOff!!
        }
        _GridOff = ImageVector.Builder(
            name = "GridOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 2.77f)
                lineTo(1.28f, 1.5f)
                lineTo(22.5f, 22.72f)
                lineTo(21.23f, 24f)
                lineTo(19.23f, 22f)
                horizontalLineTo(4f)
                curveTo(2.92f, 22f, 2f, 21.1f, 2f, 20f)
                verticalLineTo(4.77f)
                lineTo(0f, 2.77f)
                moveTo(10f, 4f)
                verticalLineTo(7.68f)
                lineTo(8f, 5.68f)
                verticalLineTo(4f)
                horizontalLineTo(6.32f)
                lineTo(4.32f, 2f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 4f)
                verticalLineTo(19.7f)
                lineTo(20f, 17.7f)
                verticalLineTo(16f)
                horizontalLineTo(18.32f)
                lineTo(16.32f, 14f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                verticalLineTo(13.68f)
                lineTo(14f, 11.68f)
                verticalLineTo(10f)
                horizontalLineTo(12.32f)
                lineTo(10.32f, 8f)
                horizontalLineTo(14f)
                verticalLineTo(4f)
                horizontalLineTo(10f)
                moveTo(16f, 4f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                moveTo(16f, 20f)
                horizontalLineTo(17.23f)
                lineTo(16f, 18.77f)
                verticalLineTo(20f)
                moveTo(4f, 8f)
                horizontalLineTo(5.23f)
                lineTo(4f, 6.77f)
                verticalLineTo(8f)
                moveTo(10f, 14f)
                horizontalLineTo(11.23f)
                lineTo(10f, 12.77f)
                verticalLineTo(14f)
                moveTo(14f, 20f)
                verticalLineTo(16.77f)
                lineTo(13.23f, 16f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                moveTo(8f, 20f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(8f)
                moveTo(8f, 14f)
                verticalLineTo(10.77f)
                lineTo(7.23f, 10f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _GridOff!!
    }

@Suppress("ObjectPropertyName")
private var _GridOff: ImageVector? = null
