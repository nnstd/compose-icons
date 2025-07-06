package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TankerTruck: ImageVector
    get() {
        if (_TankerTruck != null) {
            return _TankerTruck!!
        }
        _TankerTruck = ImageVector.Builder(
            name = "TankerTruck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 8f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                horizontalLineTo(2f)
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
                moveTo(14f, 9.5f)
                curveTo(14f, 11.4f, 12.4f, 13f, 10.5f, 13f)
                horizontalLineTo(4.5f)
                curveTo(2.6f, 13f, 1f, 11.4f, 1f, 9.5f)
                reflectiveCurveTo(2.6f, 6f, 4.5f, 6f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineTo(6f)
                horizontalLineTo(10.5f)
                curveTo(12.4f, 6f, 14f, 7.6f, 14f, 9.5f)
                close()
            }
        }.build()

        return _TankerTruck!!
    }

@Suppress("ObjectPropertyName")
private var _TankerTruck: ImageVector? = null
