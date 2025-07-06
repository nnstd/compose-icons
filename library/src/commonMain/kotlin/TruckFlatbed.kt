package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TruckFlatbed: ImageVector
    get() {
        if (_TruckFlatbed != null) {
            return _TruckFlatbed!!
        }
        _TruckFlatbed = ImageVector.Builder(
            name = "TruckFlatbed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 4f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(1f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                curveTo(3f, 17.83f, 3.3f, 18.53f, 3.89f, 19.13f)
                curveTo(4.5f, 19.72f, 5.19f, 20f, 6f, 20f)
                reflectiveCurveTo(7.5f, 19.72f, 8.11f, 19.13f)
                curveTo(8.7f, 18.53f, 9f, 17.83f, 9f, 17f)
                horizontalLineTo(14.5f)
                curveTo(14.5f, 17.83f, 14.78f, 18.53f, 15.38f, 19.13f)
                curveTo(15.97f, 19.72f, 16.67f, 20f, 17.5f, 20f)
                curveTo(18.3f, 20f, 19f, 19.72f, 19.59f, 19.13f)
                curveTo(20.19f, 18.53f, 20.5f, 17.83f, 20.5f, 17f)
                horizontalLineTo(23f)
                verticalLineTo(10f)
                lineTo(18f, 4f)
                moveTo(7.08f, 18.07f)
                curveTo(6.8f, 18.37f, 6.44f, 18.5f, 6f, 18.5f)
                reflectiveCurveTo(5.2f, 18.37f, 4.92f, 18.07f)
                curveTo(4.64f, 17.77f, 4.5f, 17.42f, 4.5f, 17f)
                curveTo(4.5f, 16.61f, 4.64f, 16.26f, 4.92f, 15.96f)
                curveTo(5.2f, 15.66f, 5.56f, 15.5f, 6f, 15.5f)
                reflectiveCurveTo(6.8f, 15.66f, 7.08f, 15.96f)
                curveTo(7.36f, 16.26f, 7.5f, 16.61f, 7.5f, 17f)
                curveTo(7.5f, 17.42f, 7.36f, 17.77f, 7.08f, 18.07f)
                moveTo(18.54f, 18.07f)
                curveTo(18.24f, 18.37f, 17.89f, 18.5f, 17.5f, 18.5f)
                curveTo(17.08f, 18.5f, 16.73f, 18.37f, 16.43f, 18.07f)
                reflectiveCurveTo(16f, 17.42f, 16f, 17f)
                curveTo(16f, 16.61f, 16.13f, 16.26f, 16.43f, 15.96f)
                curveTo(16.73f, 15.66f, 17.08f, 15.5f, 17.5f, 15.5f)
                curveTo(17.89f, 15.5f, 18.24f, 15.66f, 18.54f, 15.96f)
                curveTo(18.84f, 16.26f, 19f, 16.61f, 19f, 17f)
                curveTo(19f, 17.42f, 18.84f, 17.77f, 18.54f, 18.07f)
                moveTo(15f, 10f)
                verticalLineTo(6f)
                horizontalLineTo(17.06f)
                lineTo(20.39f, 10f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _TruckFlatbed!!
    }

@Suppress("ObjectPropertyName")
private var _TruckFlatbed: ImageVector? = null
