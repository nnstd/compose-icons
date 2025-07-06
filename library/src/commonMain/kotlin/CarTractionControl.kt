package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarTractionControl: ImageVector
    get() {
        if (_CarTractionControl != null) {
            return _CarTractionControl!!
        }
        _CarTractionControl = ImageVector.Builder(
            name = "CarTractionControl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 11f)
                horizontalLineTo(10.5f)
                curveTo(10.8f, 11f, 11f, 10.8f, 11f, 10.5f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(10.5f)
                curveTo(19f, 10.8f, 19.2f, 11f, 19.5f, 11f)
                horizontalLineTo(20.5f)
                curveTo(20.8f, 11f, 21f, 10.8f, 21f, 10.5f)
                verticalLineTo(9f)
                lineTo(21f, 8.5f)
                verticalLineTo(6f)
                lineTo(19.6f, 1.7f)
                curveTo(19.5f, 1.3f, 19.1f, 1f, 18.7f, 1f)
                horizontalLineTo(11.4f)
                curveTo(11f, 1f, 10.6f, 1.3f, 10.5f, 1.7f)
                lineTo(9f, 6f)
                verticalLineTo(8.5f)
                lineTo(9f, 9f)
                verticalLineTo(10.5f)
                curveTo(9f, 10.8f, 9.2f, 11f, 9.5f, 11f)
                moveTo(11.3f, 2f)
                horizontalLineTo(18.6f)
                lineTo(19.5f, 5f)
                horizontalLineTo(10.4f)
                lineTo(11.3f, 2f)
                moveTo(12f, 23f)
                horizontalLineTo(10f)
                curveTo(10f, 22.2f, 8.1f, 21.5f, 6.6f, 20.9f)
                curveTo(4.5f, 20.1f, 2f, 19.2f, 2f, 17f)
                curveTo(2f, 14.7f, 4.3f, 14.1f, 6.2f, 13.5f)
                curveTo(7.9f, 13.1f, 9f, 12.7f, 9f, 12f)
                horizontalLineTo(11f)
                curveTo(11f, 14.3f, 8.7f, 14.9f, 6.8f, 15.5f)
                curveTo(5.1f, 15.9f, 4f, 16.3f, 4f, 17f)
                curveTo(4f, 17.8f, 5.9f, 18.5f, 7.4f, 19.1f)
                curveTo(9.5f, 19.9f, 12f, 20.8f, 12f, 23f)
                moveTo(22f, 23f)
                horizontalLineTo(20f)
                curveTo(20f, 22.2f, 18.1f, 21.5f, 16.6f, 20.9f)
                curveTo(14.5f, 20.1f, 12f, 19.2f, 12f, 17f)
                curveTo(12f, 14.7f, 14.3f, 14.1f, 16.2f, 13.5f)
                curveTo(17.8f, 13f, 19f, 12.7f, 19f, 12f)
                horizontalLineTo(21f)
                curveTo(21f, 14.3f, 18.7f, 14.9f, 16.8f, 15.5f)
                curveTo(15.2f, 15.9f, 14f, 16.3f, 14f, 17f)
                curveTo(14f, 17.8f, 15.9f, 18.5f, 17.4f, 19.1f)
                curveTo(19.5f, 19.9f, 22f, 20.8f, 22f, 23f)
                close()
            }
        }.build()

        return _CarTractionControl!!
    }

@Suppress("ObjectPropertyName")
private var _CarTractionControl: ImageVector? = null
