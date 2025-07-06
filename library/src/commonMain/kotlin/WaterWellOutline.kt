package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WaterWellOutline: ImageVector
    get() {
        if (_WaterWellOutline != null) {
            return _WaterWellOutline!!
        }
        _WaterWellOutline = ImageVector.Builder(
            name = "WaterWellOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.62f, 8f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(8f)
                horizontalLineTo(20.61f)
                curveTo(21.16f, 8f, 21.61f, 7.56f, 21.61f, 7f)
                curveTo(21.61f, 6.89f, 21.6f, 6.78f, 21.56f, 6.68f)
                lineTo(19f, 2f)
                horizontalLineTo(5f)
                lineTo(2.72f, 6.55f)
                curveTo(2.47f, 7.04f, 2.67f, 7.64f, 3.16f, 7.89f)
                curveTo(3.31f, 7.96f, 3.46f, 8f, 3.62f, 8f)
                moveTo(6.24f, 4f)
                horizontalLineTo(17.76f)
                lineTo(18.76f, 6f)
                horizontalLineTo(5.24f)
                lineTo(6.24f, 4f)
                moveTo(2f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                verticalLineTo(22f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                horizontalLineTo(22f)
                verticalLineTo(16f)
                horizontalLineTo(2f)
                moveTo(18f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                moveTo(13.93f, 11f)
                curveTo(14.21f, 11f, 14.43f, 11.22f, 14.43f, 11.5f)
                curveTo(14.43f, 11.5f, 14.43f, 11.54f, 14.43f, 11.56f)
                lineTo(14.05f, 14.56f)
                curveTo(14f, 14.81f, 13.81f, 15f, 13.56f, 15f)
                horizontalLineTo(10.44f)
                curveTo(10.19f, 15f, 10f, 14.81f, 9.95f, 14.56f)
                lineTo(9.57f, 11.56f)
                curveTo(9.54f, 11.29f, 9.73f, 11.04f, 10f, 11f)
                curveTo(10.03f, 11f, 10.05f, 11f, 10.07f, 11f)
                horizontalLineTo(13.93f)
                close()
            }
        }.build()

        return _WaterWellOutline!!
    }

@Suppress("ObjectPropertyName")
private var _WaterWellOutline: ImageVector? = null
