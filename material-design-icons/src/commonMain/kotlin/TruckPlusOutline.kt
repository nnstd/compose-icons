package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TruckPlusOutline: ImageVector
    get() {
        if (_TruckPlusOutline != null) {
            return _TruckPlusOutline!!
        }
        _TruckPlusOutline = ImageVector.Builder(
            name = "TruckPlusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 8f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
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
                moveTo(6f, 18.5f)
                curveTo(5.2f, 18.5f, 4.5f, 17.8f, 4.5f, 17f)
                reflectiveCurveTo(5.2f, 15.5f, 6f, 15.5f)
                reflectiveCurveTo(7.5f, 16.2f, 7.5f, 17f)
                reflectiveCurveTo(6.8f, 18.5f, 6f, 18.5f)
                moveTo(15f, 15f)
                horizontalLineTo(8.2f)
                curveTo(7.7f, 14.4f, 6.9f, 14f, 6f, 14f)
                reflectiveCurveTo(4.3f, 14.4f, 3.8f, 15f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                moveTo(18f, 18.5f)
                curveTo(17.2f, 18.5f, 16.5f, 17.8f, 16.5f, 17f)
                reflectiveCurveTo(17.2f, 15.5f, 18f, 15.5f)
                reflectiveCurveTo(19.5f, 16.2f, 19.5f, 17f)
                reflectiveCurveTo(18.8f, 18.5f, 18f, 18.5f)
                moveTo(17f, 12f)
                verticalLineTo(9.5f)
                horizontalLineTo(19.5f)
                lineTo(21.5f, 12f)
                horizontalLineTo(17f)
                moveTo(8f, 11f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                horizontalLineTo(12f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _TruckPlusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TruckPlusOutline: ImageVector? = null
