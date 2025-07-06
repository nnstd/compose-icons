package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TruckAlertOutline: ImageVector
    get() {
        if (_TruckAlertOutline != null) {
            return _TruckAlertOutline!!
        }
        _TruckAlertOutline = ImageVector.Builder(
            name = "TruckAlertOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 12f)
                horizontalLineTo(10f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                moveTo(8f, 7f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                moveTo(18f, 18.5f)
                curveTo(18.8f, 18.5f, 19.5f, 17.8f, 19.5f, 17f)
                reflectiveCurveTo(18.8f, 15.5f, 18f, 15.5f)
                reflectiveCurveTo(16.5f, 16.2f, 16.5f, 17f)
                reflectiveCurveTo(17.2f, 18.5f, 18f, 18.5f)
                moveTo(19.5f, 9.5f)
                horizontalLineTo(17f)
                verticalLineTo(12f)
                horizontalLineTo(21.5f)
                lineTo(19.5f, 9.5f)
                moveTo(6f, 18.5f)
                curveTo(6.8f, 18.5f, 7.5f, 17.8f, 7.5f, 17f)
                reflectiveCurveTo(6.8f, 15.5f, 6f, 15.5f)
                reflectiveCurveTo(4.5f, 16.2f, 4.5f, 17f)
                reflectiveCurveTo(5.2f, 18.5f, 6f, 18.5f)
                moveTo(20f, 8f)
                lineTo(23f, 12f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                curveTo(21f, 18.7f, 19.7f, 20f, 18f, 20f)
                reflectiveCurveTo(15f, 18.7f, 15f, 17f)
                horizontalLineTo(9f)
                curveTo(9f, 18.7f, 7.7f, 20f, 6f, 20f)
                reflectiveCurveTo(3f, 18.7f, 3f, 17f)
                horizontalLineTo(1f)
                verticalLineTo(6f)
                curveTo(1f, 4.9f, 1.9f, 4f, 3f, 4f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                moveTo(3f, 6f)
                verticalLineTo(15f)
                horizontalLineTo(3.8f)
                curveTo(4.3f, 14.4f, 5.2f, 14f, 6f, 14f)
                reflectiveCurveTo(7.7f, 14.4f, 8.2f, 15f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _TruckAlertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TruckAlertOutline: ImageVector? = null
