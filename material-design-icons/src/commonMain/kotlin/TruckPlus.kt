package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TruckPlus: ImageVector
    get() {
        if (_TruckPlus != null) {
            return _TruckPlus!!
        }
        _TruckPlus = ImageVector.Builder(
            name = "TruckPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 18.5f)
                curveTo(18.83f, 18.5f, 19.5f, 17.83f, 19.5f, 17f)
                reflectiveCurveTo(18.83f, 15.5f, 18f, 15.5f)
                reflectiveCurveTo(16.5f, 16.17f, 16.5f, 17f)
                reflectiveCurveTo(17.17f, 18.5f, 18f, 18.5f)
                moveTo(19.5f, 9.5f)
                horizontalLineTo(17f)
                verticalLineTo(12f)
                horizontalLineTo(21.46f)
                lineTo(19.5f, 9.5f)
                moveTo(6f, 18.5f)
                curveTo(6.83f, 18.5f, 7.5f, 17.83f, 7.5f, 17f)
                reflectiveCurveTo(6.83f, 15.5f, 6f, 15.5f)
                reflectiveCurveTo(4.5f, 16.17f, 4.5f, 17f)
                reflectiveCurveTo(5.17f, 18.5f, 6f, 18.5f)
                moveTo(20f, 8f)
                lineTo(23f, 12f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                curveTo(21f, 18.66f, 19.66f, 20f, 18f, 20f)
                reflectiveCurveTo(15f, 18.66f, 15f, 17f)
                horizontalLineTo(9f)
                curveTo(9f, 18.66f, 7.66f, 20f, 6f, 20f)
                reflectiveCurveTo(3f, 18.66f, 3f, 17f)
                horizontalLineTo(1f)
                verticalLineTo(6f)
                curveTo(1f, 4.89f, 1.89f, 4f, 3f, 4f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                moveTo(8f, 6f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _TruckPlus!!
    }

@Suppress("ObjectPropertyName")
private var _TruckPlus: ImageVector? = null
