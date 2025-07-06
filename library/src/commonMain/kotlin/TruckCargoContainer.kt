package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TruckCargoContainer: ImageVector
    get() {
        if (_TruckCargoContainer != null) {
            return _TruckCargoContainer!!
        }
        _TruckCargoContainer = ImageVector.Builder(
            name = "TruckCargoContainer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 8f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                horizontalLineTo(1f)
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
                moveTo(15f, 7f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
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
                close()
            }
        }.build()

        return _TruckCargoContainer!!
    }

@Suppress("ObjectPropertyName")
private var _TruckCargoContainer: ImageVector? = null
