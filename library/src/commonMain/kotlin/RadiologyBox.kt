package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RadiologyBox: ImageVector
    get() {
        if (_RadiologyBox != null) {
            return _RadiologyBox!!
        }
        _RadiologyBox = ImageVector.Builder(
            name = "RadiologyBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.89f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.11f, 21f, 21f, 20.11f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.89f, 20.11f, 3f, 19f, 3f)
                moveTo(17.1f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                horizontalLineTo(17f)
                curveTo(17f, 14f, 16.94f, 17f, 15.5f, 17f)
                curveTo(14.15f, 17f, 14.5f, 15.47f, 13f, 15f)
                verticalLineTo(17f)
                curveTo(13f, 17.55f, 12.55f, 18f, 12f, 18f)
                reflectiveCurveTo(11f, 17.55f, 11f, 17f)
                verticalLineTo(15f)
                curveTo(9.5f, 15.47f, 9.85f, 17f, 8.5f, 17f)
                curveTo(7.06f, 17f, 7f, 14f, 7f, 14f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(6.9f)
                curveTo(6.85f, 12.69f, 6.84f, 12.35f, 6.8f, 12f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(6.81f)
                curveTo(6.83f, 10.67f, 6.91f, 10.33f, 7f, 10f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(7.34f)
                curveTo(7.5f, 8.65f, 7.65f, 8.31f, 7.83f, 8f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                curveTo(11f, 6.45f, 11.45f, 6f, 12f, 6f)
                reflectiveCurveTo(13f, 6.45f, 13f, 7f)
                verticalLineTo(8f)
                horizontalLineTo(16.17f)
                curveTo(16.35f, 8.31f, 16.5f, 8.65f, 16.66f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(10f)
                horizontalLineTo(17f)
                curveTo(17.1f, 10.33f, 17.17f, 10.67f, 17.19f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                horizontalLineTo(17.2f)
                curveTo(17.16f, 12.35f, 17.15f, 12.69f, 17.1f, 13f)
                close()
            }
        }.build()

        return _RadiologyBox!!
    }

@Suppress("ObjectPropertyName")
private var _RadiologyBox: ImageVector? = null
