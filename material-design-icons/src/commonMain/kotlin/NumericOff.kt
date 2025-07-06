package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NumericOff: ImageVector
    get() {
        if (_NumericOff != null) {
            return _NumericOff!!
        }
        _NumericOff = ImageVector.Builder(
            name = "NumericOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3f)
                lineTo(5.1f, 7f)
                horizontalLineTo(2f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                verticalLineTo(7.9f)
                lineTo(9.3f, 11.2f)
                curveTo(8.5f, 11.4f, 8f, 12.2f, 8f, 13f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                verticalLineTo(15.9f)
                lineTo(20.8f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(10f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(11.1f)
                lineTo(13.1f, 15f)
                horizontalLineTo(10f)
                moveTo(14f, 10.8f)
                lineTo(10.2f, 7f)
                horizontalLineTo(12f)
                curveTo(13.1f, 7f, 14f, 7.9f, 14f, 9f)
                verticalLineTo(10.8f)
                moveTo(20f, 9f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                curveTo(21.1f, 7f, 22f, 7.9f, 22f, 9f)
                verticalLineTo(10.5f)
                curveTo(22f, 11.3f, 21.3f, 12f, 20.5f, 12f)
                curveTo(21.3f, 12f, 22f, 12.7f, 22f, 13.5f)
                verticalLineTo(15f)
                curveTo(22f, 16f, 21.2f, 16.9f, 20.2f, 17f)
                lineTo(18.2f, 15f)
                horizontalLineTo(20f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _NumericOff!!
    }

@Suppress("ObjectPropertyName")
private var _NumericOff: ImageVector? = null
