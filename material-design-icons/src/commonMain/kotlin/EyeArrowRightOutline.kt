package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EyeArrowRightOutline: ImageVector
    get() {
        if (_EyeArrowRightOutline != null) {
            return _EyeArrowRightOutline!!
        }
        _EyeArrowRightOutline = ImageVector.Builder(
            name = "EyeArrowRightOutline",
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
                curveTo(13f, 18.1f, 13f, 17.8f, 13.1f, 17.4f)
                curveTo(12.7f, 17.4f, 12.4f, 17.5f, 12f, 17.5f)
                curveTo(8.2f, 17.5f, 4.8f, 15.4f, 3.2f, 12f)
                curveTo(4.8f, 8.6f, 8.2f, 6.5f, 12f, 6.5f)
                reflectiveCurveTo(19.2f, 8.6f, 20.8f, 12f)
                curveTo(20.7f, 12.2f, 20.5f, 12.4f, 20.4f, 12.7f)
                curveTo(21.1f, 12.9f, 21.7f, 13.1f, 22.3f, 13.5f)
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

        return _EyeArrowRightOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EyeArrowRightOutline: ImageVector? = null
