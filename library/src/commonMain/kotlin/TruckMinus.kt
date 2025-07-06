package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TruckMinus: ImageVector
    get() {
        if (_TruckMinus != null) {
            return _TruckMinus!!
        }
        _TruckMinus = ImageVector.Builder(
            name = "TruckMinus",
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
                curveTo(1.89f, 4f, 1f, 4.89f, 1f, 6f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                curveTo(3f, 18.66f, 4.34f, 20f, 6f, 20f)
                reflectiveCurveTo(9f, 18.66f, 9f, 17f)
                horizontalLineTo(15f)
                curveTo(15f, 18.66f, 16.34f, 20f, 18f, 20f)
                reflectiveCurveTo(21f, 18.66f, 21f, 17f)
                horizontalLineTo(23f)
                verticalLineTo(12f)
                lineTo(20f, 8f)
                moveTo(6f, 18.5f)
                curveTo(5.17f, 18.5f, 4.5f, 17.83f, 4.5f, 17f)
                reflectiveCurveTo(5.17f, 15.5f, 6f, 15.5f)
                reflectiveCurveTo(7.5f, 16.17f, 7.5f, 17f)
                reflectiveCurveTo(6.83f, 18.5f, 6f, 18.5f)
                moveTo(13f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                moveTo(18f, 18.5f)
                curveTo(17.17f, 18.5f, 16.5f, 17.83f, 16.5f, 17f)
                reflectiveCurveTo(17.17f, 15.5f, 18f, 15.5f)
                reflectiveCurveTo(19.5f, 16.17f, 19.5f, 17f)
                reflectiveCurveTo(18.83f, 18.5f, 18f, 18.5f)
                moveTo(17f, 12f)
                verticalLineTo(9.5f)
                horizontalLineTo(19.5f)
                lineTo(21.46f, 12f)
                horizontalLineTo(17f)
            }
        }.build()

        return _TruckMinus!!
    }

@Suppress("ObjectPropertyName")
private var _TruckMinus: ImageVector? = null
