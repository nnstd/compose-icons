package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BoomGateAlert: ImageVector
    get() {
        if (_BoomGateAlert != null) {
            return _BoomGateAlert!!
        }
        _BoomGateAlert = ImageVector.Builder(
            name = "BoomGateAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.9f, 3f)
                curveTo(19.3f, 2f, 18.1f, 1.7f, 17.2f, 2.3f)
                lineTo(6.9f, 8.2f)
                curveTo(6.6f, 8.1f, 6.3f, 8f, 6f, 8f)
                curveTo(4.3f, 8f, 3f, 9.3f, 3f, 11f)
                verticalLineTo(20f)
                curveTo(2.4f, 20f, 2f, 20.4f, 2f, 21f)
                verticalLineTo(22f)
                horizontalLineTo(10f)
                verticalLineTo(21f)
                curveTo(10f, 20.4f, 9.6f, 20f, 9f, 20f)
                verticalLineTo(11.6f)
                lineTo(19.1f, 5.8f)
                curveTo(20.1f, 5.2f, 20.4f, 4f, 19.9f, 3f)
                moveTo(6f, 12.5f)
                curveTo(5.2f, 12.5f, 4.5f, 11.8f, 4.5f, 11f)
                reflectiveCurveTo(5.2f, 9.5f, 6f, 9.5f)
                reflectiveCurveTo(7.5f, 10.2f, 7.5f, 11f)
                reflectiveCurveTo(6.8f, 12.5f, 6f, 12.5f)
                moveTo(10.4f, 9.6f)
                lineTo(8.1f, 8.6f)
                lineTo(9.4f, 7.8f)
                lineTo(11.7f, 8.8f)
                lineTo(10.4f, 9.6f)
                moveTo(13.9f, 7.6f)
                lineTo(11.6f, 6.6f)
                lineTo(12.9f, 5.8f)
                lineTo(15.2f, 6.8f)
                lineTo(13.9f, 7.6f)
                moveTo(17.3f, 5.6f)
                lineTo(15f, 4.6f)
                lineTo(16.3f, 3.8f)
                lineTo(18.6f, 4.8f)
                lineTo(17.3f, 5.6f)
                moveTo(20f, 18f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                moveTo(20f, 10f)
                horizontalLineTo(18f)
                verticalLineTo(16f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _BoomGateAlert!!
    }

@Suppress("ObjectPropertyName")
private var _BoomGateAlert: ImageVector? = null
