package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WaterWell: ImageVector
    get() {
        if (_WaterWell != null) {
            return _WaterWell!!
        }
        _WaterWell = ImageVector.Builder(
            name = "WaterWell",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 16f)
                horizontalLineTo(2f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                verticalLineTo(22f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                horizontalLineTo(22f)
                verticalLineTo(16f)
                moveTo(10.44f, 15f)
                curveTo(10.19f, 15f, 10f, 14.81f, 9.95f, 14.56f)
                lineTo(9.57f, 11.56f)
                curveTo(9.57f, 11.54f, 9.57f, 11.5f, 9.57f, 11.5f)
                curveTo(9.57f, 11.22f, 9.79f, 11f, 10.07f, 11f)
                horizontalLineTo(13.93f)
                curveTo(13.95f, 11f, 13.97f, 11f, 14f, 11f)
                curveTo(14.27f, 11.04f, 14.46f, 11.29f, 14.43f, 11.56f)
                lineTo(14.05f, 14.56f)
                curveTo(14f, 14.81f, 13.81f, 15f, 13.56f, 15f)
                horizontalLineTo(10.44f)
                moveTo(19f, 2f)
                lineTo(21.56f, 6.68f)
                curveTo(21.6f, 6.78f, 21.61f, 6.89f, 21.61f, 7f)
                curveTo(21.61f, 7.56f, 21.16f, 8f, 20.61f, 8f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                verticalLineTo(10f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(3.62f)
                curveTo(3.46f, 8f, 3.31f, 7.96f, 3.16f, 7.89f)
                curveTo(2.67f, 7.64f, 2.47f, 7.04f, 2.72f, 6.55f)
                lineTo(5f, 2f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _WaterWell!!
    }

@Suppress("ObjectPropertyName")
private var _WaterWell: ImageVector? = null
