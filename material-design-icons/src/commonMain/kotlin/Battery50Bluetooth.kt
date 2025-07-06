package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Battery50Bluetooth: ImageVector
    get() {
        if (_Battery50Bluetooth != null) {
            return _Battery50Bluetooth!!
        }
        _Battery50Bluetooth = ImageVector.Builder(
            name = "Battery50Bluetooth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 2f)
                verticalLineTo(4f)
                horizontalLineTo(3.33f)
                arcTo(1.33f, 1.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5.33f)
                verticalLineTo(20.67f)
                curveTo(2f, 21.4f, 2.6f, 22f, 3.33f, 22f)
                horizontalLineTo(12.67f)
                curveTo(13.4f, 22f, 14f, 21.4f, 14f, 20.67f)
                verticalLineTo(5.33f)
                arcTo(1.33f, 1.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.67f, 4f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                horizontalLineTo(5f)
                moveTo(4f, 6f)
                horizontalLineTo(12f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                moveTo(19f, 8f)
                verticalLineTo(11.79f)
                lineTo(16.71f, 9.5f)
                lineTo(16f, 10.21f)
                lineTo(18.79f, 13f)
                lineTo(16f, 15.79f)
                lineTo(16.71f, 16.5f)
                lineTo(19f, 14.21f)
                verticalLineTo(18f)
                horizontalLineTo(19.5f)
                lineTo(22.35f, 15.14f)
                lineTo(20.21f, 13f)
                lineTo(22.35f, 10.85f)
                lineTo(19.5f, 8f)
                horizontalLineTo(19f)
                moveTo(20f, 9.91f)
                lineTo(20.94f, 10.85f)
                lineTo(20f, 11.79f)
                verticalLineTo(9.91f)
                moveTo(20f, 14.21f)
                lineTo(20.94f, 15.14f)
                lineTo(20f, 16.08f)
                verticalLineTo(14.21f)
                close()
            }
        }.build()

        return _Battery50Bluetooth!!
    }

@Suppress("ObjectPropertyName")
private var _Battery50Bluetooth: ImageVector? = null
