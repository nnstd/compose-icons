package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TruckAlert: ImageVector
    get() {
        if (_TruckAlert != null) {
            return _TruckAlert!!
        }
        _TruckAlert = ImageVector.Builder(
            name = "TruckAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 4f)
                curveTo(1.9f, 4f, 1f, 4.9f, 1f, 6f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                curveTo(3f, 18.7f, 4.3f, 20f, 6f, 20f)
                reflectiveCurveTo(9f, 18.7f, 9f, 17f)
                horizontalLineTo(15f)
                curveTo(15f, 18.7f, 16.3f, 20f, 18f, 20f)
                reflectiveCurveTo(21f, 18.7f, 21f, 17f)
                horizontalLineTo(23f)
                verticalLineTo(12f)
                lineTo(20f, 8f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                moveTo(8f, 6f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                moveTo(17f, 9.5f)
                horizontalLineTo(19.5f)
                lineTo(21.5f, 12f)
                horizontalLineTo(17f)
                verticalLineTo(9.5f)
                moveTo(8f, 12f)
                horizontalLineTo(10f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                moveTo(6f, 15.5f)
                curveTo(6.8f, 15.5f, 7.5f, 16.2f, 7.5f, 17f)
                reflectiveCurveTo(6.8f, 18.5f, 6f, 18.5f)
                reflectiveCurveTo(4.5f, 17.8f, 4.5f, 17f)
                reflectiveCurveTo(5.2f, 15.5f, 6f, 15.5f)
                moveTo(18f, 15.5f)
                curveTo(18.8f, 15.5f, 19.5f, 16.2f, 19.5f, 17f)
                reflectiveCurveTo(18.8f, 18.5f, 18f, 18.5f)
                reflectiveCurveTo(16.5f, 17.8f, 16.5f, 17f)
                reflectiveCurveTo(17.2f, 15.5f, 18f, 15.5f)
                close()
            }
        }.build()

        return _TruckAlert!!
    }

@Suppress("ObjectPropertyName")
private var _TruckAlert: ImageVector? = null
