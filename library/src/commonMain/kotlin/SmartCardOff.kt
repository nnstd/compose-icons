package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SmartCardOff: ImageVector
    get() {
        if (_SmartCardOff != null) {
            return _SmartCardOff!!
        }
        _SmartCardOff = ImageVector.Builder(
            name = "SmartCardOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(1.27f, 3.16f)
                curveTo(0.545f, 3.47f, 0.028f, 4.17f, 0f, 5f)
                verticalLineTo(19f)
                curveTo(0.036f, 20.09f, 0.911f, 20.96f, 2f, 21f)
                horizontalLineTo(19.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(14f, 18f)
                horizontalLineTo(2f)
                verticalLineTo(17f)
                curveTo(2f, 15f, 6f, 13.91f, 8f, 13.91f)
                reflectiveCurveTo(14f, 15f, 14f, 17f)
                verticalLineTo(18f)
                moveTo(8f, 12f)
                curveTo(6.34f, 12f, 5f, 10.66f, 5f, 9f)
                curveTo(5f, 8.4f, 5.18f, 7.84f, 5.5f, 7.38f)
                lineTo(9.62f, 11.5f)
                curveTo(9.16f, 11.82f, 8.6f, 12f, 8f, 12f)
                moveTo(22f, 3f)
                horizontalLineTo(6.2f)
                lineTo(9.88f, 6.68f)
                curveTo(10.04f, 6.81f, 10.19f, 6.96f, 10.32f, 7.12f)
                lineTo(23.5f, 20.29f)
                curveTo(23.79f, 19.94f, 24f, 19.5f, 24f, 19f)
                verticalLineTo(5f)
                curveTo(23.96f, 3.91f, 23.09f, 3.04f, 22f, 3f)
                moveTo(21f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(10f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _SmartCardOff!!
    }

@Suppress("ObjectPropertyName")
private var _SmartCardOff: ImageVector? = null
