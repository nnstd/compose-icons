package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BarrelOutline: ImageVector
    get() {
        if (_BarrelOutline != null) {
            return _BarrelOutline!!
        }
        _BarrelOutline = ImageVector.Builder(
            name = "BarrelOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 13.05f)
                curveTo(9f, 14.68f, 10.34f, 16f, 12f, 16f)
                reflectiveCurveTo(15f, 14.68f, 15f, 13.05f)
                curveTo(15f, 11.74f, 14.47f, 11.36f, 12f, 8.5f)
                curveTo(9.5f, 11.38f, 9f, 11.75f, 9f, 13.05f)
                moveTo(20f, 13f)
                curveTo(20.55f, 13f, 21f, 12.55f, 21f, 12f)
                reflectiveCurveTo(20.55f, 11f, 20f, 11f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                curveTo(20.55f, 5f, 21f, 4.55f, 21f, 4f)
                reflectiveCurveTo(20.55f, 3f, 20f, 3f)
                horizontalLineTo(4f)
                curveTo(3.45f, 3f, 3f, 3.45f, 3f, 4f)
                reflectiveCurveTo(3.45f, 5f, 4f, 5f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                curveTo(3.45f, 11f, 3f, 11.45f, 3f, 12f)
                reflectiveCurveTo(3.45f, 13f, 4f, 13f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(4f)
                curveTo(3.45f, 19f, 3f, 19.45f, 3f, 20f)
                reflectiveCurveTo(3.45f, 21f, 4f, 21f)
                horizontalLineTo(20f)
                curveTo(20.55f, 21f, 21f, 20.55f, 21f, 20f)
                reflectiveCurveTo(20.55f, 19f, 20f, 19f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                moveTo(17f, 19f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                curveTo(7.55f, 13f, 8f, 12.55f, 8f, 12f)
                reflectiveCurveTo(7.55f, 11f, 7f, 11f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                curveTo(16.45f, 11f, 16f, 11.45f, 16f, 12f)
                reflectiveCurveTo(16.45f, 13f, 17f, 13f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _BarrelOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BarrelOutline: ImageVector? = null
