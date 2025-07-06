package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EyeArrowRight: ImageVector
    get() {
        if (_EyeArrowRight != null) {
            return _EyeArrowRight!!
        }
        _EyeArrowRight = ImageVector.Builder(
            name = "EyeArrowRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4.5f)
                curveTo(7f, 4.5f, 2.7f, 7.6f, 1f, 12f)
                curveTo(2.7f, 16.4f, 7f, 19.5f, 12f, 19.5f)
                horizontalLineTo(13.1f)
                curveTo(13f, 19.2f, 13f, 18.9f, 13f, 18.5f)
                curveTo(13f, 17.9f, 13.1f, 17.4f, 13.2f, 16.8f)
                curveTo(12.8f, 16.9f, 12.4f, 17f, 12f, 17f)
                curveTo(9.2f, 17f, 7f, 14.8f, 7f, 12f)
                reflectiveCurveTo(9.2f, 7f, 12f, 7f)
                reflectiveCurveTo(17f, 9.2f, 17f, 12f)
                curveTo(17f, 12.3f, 17f, 12.6f, 16.9f, 12.9f)
                curveTo(17.6f, 12.7f, 18.3f, 12.5f, 19f, 12.5f)
                curveTo(20.2f, 12.5f, 21.3f, 12.8f, 22.3f, 13.5f)
                curveTo(22.6f, 13f, 22.8f, 12.5f, 23f, 12f)
                curveTo(21.3f, 7.6f, 17f, 4.5f, 12f, 4.5f)
                moveTo(12f, 9f)
                curveTo(10.3f, 9f, 9f, 10.3f, 9f, 12f)
                reflectiveCurveTo(10.3f, 15f, 12f, 15f)
                reflectiveCurveTo(15f, 13.7f, 15f, 12f)
                reflectiveCurveTo(13.7f, 9f, 12f, 9f)
                moveTo(19f, 21f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                lineTo(22f, 18f)
                lineTo(19f, 21f)
            }
        }.build()

        return _EyeArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _EyeArrowRight: ImageVector? = null
