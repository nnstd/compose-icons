package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AmplifierOff: ImageVector
    get() {
        if (_AmplifierOff != null) {
            return _AmplifierOff!!
        }
        _AmplifierOff = ImageVector.Builder(
            name = "AmplifierOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3f)
                lineTo(3f, 4.9f)
                verticalLineTo(21f)
                horizontalLineTo(5f)
                curveTo(5f, 21.6f, 5.4f, 22f, 6f, 22f)
                reflectiveCurveTo(7f, 21.6f, 7f, 21f)
                horizontalLineTo(17f)
                curveTo(17f, 21.6f, 17.4f, 22f, 18f, 22f)
                reflectiveCurveTo(19f, 21.6f, 19f, 21f)
                horizontalLineTo(19.1f)
                lineTo(20.8f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(5f, 9f)
                verticalLineTo(6.9f)
                lineTo(7.1f, 9f)
                horizontalLineTo(5f)
                moveTo(12f, 19f)
                curveTo(9.8f, 19f, 8f, 17.2f, 8f, 15f)
                curveTo(8f, 13.6f, 8.7f, 12.4f, 9.8f, 11.7f)
                lineTo(15.3f, 17.2f)
                curveTo(14.6f, 18.3f, 13.4f, 19f, 12f, 19f)
                moveTo(14f, 6f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                moveTo(10f, 6f)
                curveTo(10.6f, 6f, 11f, 6.4f, 11f, 7f)
                curveTo(11f, 7.2f, 10.9f, 7.4f, 10.8f, 7.6f)
                lineTo(9.4f, 6.2f)
                curveTo(9.6f, 6.1f, 9.8f, 6f, 10f, 6f)
                moveTo(8.2f, 5f)
                lineTo(6.2f, 3f)
                horizontalLineTo(9f)
                curveTo(9f, 2.4f, 9.4f, 2f, 10f, 2f)
                horizontalLineTo(14f)
                curveTo(14.6f, 2f, 15f, 2.4f, 15f, 3f)
                horizontalLineTo(21f)
                verticalLineTo(17.8f)
                lineTo(12.2f, 9f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(8.2f)
                moveTo(16f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                moveTo(18f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(17f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _AmplifierOff!!
    }

@Suppress("ObjectPropertyName")
private var _AmplifierOff: ImageVector? = null
