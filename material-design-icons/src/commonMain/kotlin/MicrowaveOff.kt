package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MicrowaveOff: ImageVector
    get() {
        if (_MicrowaveOff != null) {
            return _MicrowaveOff!!
        }
        _MicrowaveOff = ImageVector.Builder(
            name = "MicrowaveOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(3.26f, 5.15f)
                curveTo(2.5f, 5.44f, 2f, 6.16f, 2f, 7f)
                verticalLineTo(17f)
                curveTo(2f, 18.11f, 2.9f, 19f, 4f, 19f)
                horizontalLineTo(17.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(4f, 17f)
                verticalLineTo(7f)
                horizontalLineTo(5.11f)
                lineTo(15.11f, 17f)
                horizontalLineTo(4f)
                moveTo(16f, 7f)
                verticalLineTo(12.8f)
                lineTo(21.5f, 18.31f)
                curveTo(21.81f, 17.95f, 22f, 17.5f, 22f, 17f)
                verticalLineTo(7f)
                curveTo(22f, 5.9f, 21.11f, 5f, 20f, 5f)
                horizontalLineTo(8.2f)
                lineTo(10.2f, 7f)
                horizontalLineTo(16f)
                moveTo(19f, 7f)
                curveTo(19.55f, 7f, 20f, 7.45f, 20f, 8f)
                reflectiveCurveTo(19.55f, 9f, 19f, 9f)
                reflectiveCurveTo(18f, 8.55f, 18f, 8f)
                reflectiveCurveTo(18.45f, 7f, 19f, 7f)
                moveTo(19f, 11f)
                curveTo(19.55f, 11f, 20f, 11.45f, 20f, 12f)
                reflectiveCurveTo(19.55f, 13f, 19f, 13f)
                reflectiveCurveTo(18f, 12.55f, 18f, 12f)
                reflectiveCurveTo(18.45f, 11f, 19f, 11f)
                moveTo(13f, 9.8f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(11.8f)
                lineTo(13f, 9.8f)
                close()
            }
        }.build()

        return _MicrowaveOff!!
    }

@Suppress("ObjectPropertyName")
private var _MicrowaveOff: ImageVector? = null
