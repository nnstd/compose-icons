package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PoolThermometer: ImageVector
    get() {
        if (_PoolThermometer != null) {
            return _PoolThermometer!!
        }
        _PoolThermometer = ImageVector.Builder(
            name = "PoolThermometer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 6f)
                curveTo(17.9f, 6f, 17f, 6.9f, 17f, 8f)
                verticalLineTo(14.8f)
                curveTo(16.4f, 15.4f, 16f, 16.2f, 16f, 17f)
                curveTo(16f, 18.7f, 17.3f, 20f, 19f, 20f)
                reflectiveCurveTo(22f, 18.7f, 22f, 17f)
                curveTo(22f, 16.1f, 21.6f, 15.3f, 21f, 14.8f)
                verticalLineTo(8f)
                curveTo(21f, 6.9f, 20.1f, 6f, 19f, 6f)
                moveTo(19f, 7f)
                curveTo(19.5f, 7f, 20f, 7.4f, 20f, 8f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                curveTo(18f, 7.4f, 18.5f, 7f, 19f, 7f)
                moveTo(15f, 20.3f)
                curveTo(14.1f, 20.7f, 13.2f, 21f, 12.3f, 21f)
                curveTo(10.1f, 21f, 7.9f, 19f, 5.6f, 19f)
                curveTo(4.4f, 19f, 3.2f, 19.3f, 1.9f, 19.7f)
                verticalLineTo(17.7f)
                curveTo(3.2f, 17.3f, 4.4f, 17f, 5.7f, 17f)
                curveTo(7.9f, 17f, 10.1f, 19f, 12.4f, 19f)
                curveTo(13.3f, 19f, 14.2f, 18.7f, 15.1f, 18.3f)
                verticalLineTo(20.3f)
                moveTo(12.3f, 17f)
                curveTo(13.2f, 17f, 14.1f, 16.7f, 15f, 16.3f)
                verticalLineTo(14.3f)
                curveTo(14.3f, 14.6f, 13.7f, 14.8f, 13f, 15f)
                verticalLineTo(5f)
                curveTo(13f, 4.4f, 13.4f, 4f, 14f, 4f)
                horizontalLineTo(16.8f)
                curveTo(16.4f, 2.8f, 15.3f, 2f, 14f, 2f)
                curveTo(12.3f, 2f, 11f, 3.3f, 11f, 5f)
                verticalLineTo(6f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                curveTo(6f, 4.4f, 6.4f, 4f, 7f, 4f)
                horizontalLineTo(9.8f)
                curveTo(9.4f, 2.8f, 8.3f, 2f, 7f, 2f)
                curveTo(5.3f, 2f, 4f, 3.3f, 4f, 5f)
                verticalLineTo(13.2f)
                curveTo(3.3f, 13.3f, 2.7f, 13.5f, 2f, 13.8f)
                verticalLineTo(15.8f)
                curveTo(3.2f, 15.3f, 4.4f, 15f, 5.7f, 15f)
                curveTo(7.9f, 15f, 10.1f, 17f, 12.3f, 17f)
                moveTo(6f, 8f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                verticalLineTo(8f)
                moveTo(6f, 12f)
                horizontalLineTo(11f)
                verticalLineTo(14.8f)
                curveTo(9.3f, 14.3f, 7.7f, 13.2f, 6f, 13f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _PoolThermometer!!
    }

@Suppress("ObjectPropertyName")
private var _PoolThermometer: ImageVector? = null
