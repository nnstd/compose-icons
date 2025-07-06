package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HydrogenStation: ImageVector
    get() {
        if (_HydrogenStation != null) {
            return _HydrogenStation!!
        }
        _HydrogenStation = ImageVector.Builder(
            name = "HydrogenStation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 3f)
                curveTo(4.89f, 3f, 4f, 3.9f, 4f, 5f)
                verticalLineTo(21f)
                horizontalLineTo(14f)
                verticalLineTo(13.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(18.5f)
                curveTo(15.5f, 19.88f, 16.62f, 21f, 18f, 21f)
                reflectiveCurveTo(20.5f, 19.88f, 20.5f, 18.5f)
                verticalLineTo(9f)
                curveTo(20.5f, 8.31f, 20.22f, 7.68f, 19.77f, 7.23f)
                lineTo(19.78f, 7.22f)
                lineTo(16.06f, 3.5f)
                lineTo(15f, 4.56f)
                lineTo(17.11f, 6.67f)
                curveTo(16.17f, 7.03f, 15.5f, 7.93f, 15.5f, 9f)
                curveTo(15.5f, 10.38f, 16.62f, 11.5f, 18f, 11.5f)
                curveTo(18.36f, 11.5f, 18.69f, 11.42f, 19f, 11.29f)
                verticalLineTo(18.5f)
                curveTo(19f, 19.05f, 18.55f, 19.5f, 18f, 19.5f)
                reflectiveCurveTo(17f, 19.05f, 17f, 18.5f)
                verticalLineTo(14f)
                curveTo(17f, 12.9f, 16.11f, 12f, 15f, 12f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                curveTo(14f, 3.9f, 13.11f, 3f, 12f, 3f)
                horizontalLineTo(6f)
                moveTo(6f, 7f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                moveTo(18f, 8f)
                curveTo(18.55f, 8f, 19f, 8.45f, 19f, 9f)
                reflectiveCurveTo(18.55f, 10f, 18f, 10f)
                reflectiveCurveTo(17f, 9.55f, 17f, 9f)
                reflectiveCurveTo(17.45f, 8f, 18f, 8f)
                close()
            }
        }.build()

        return _HydrogenStation!!
    }

@Suppress("ObjectPropertyName")
private var _HydrogenStation: ImageVector? = null
