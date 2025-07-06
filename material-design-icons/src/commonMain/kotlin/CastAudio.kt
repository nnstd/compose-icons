package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CastAudio: ImageVector
    get() {
        if (_CastAudio != null) {
            return _CastAudio!!
        }
        _CastAudio = ImageVector.Builder(
            name = "CastAudio",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 11f)
                verticalLineTo(13f)
                curveTo(7f, 13f, 11f, 17f, 11f, 22f)
                horizontalLineTo(13f)
                curveTo(13f, 15.9f, 8.1f, 11f, 2f, 11f)
                moveTo(20f, 2f)
                horizontalLineTo(10f)
                curveTo(8.9f, 2f, 8f, 2.9f, 8f, 4f)
                verticalLineTo(10.5f)
                curveTo(9f, 11f, 9.9f, 11.7f, 10.7f, 12.4f)
                curveTo(11.6f, 11f, 13.2f, 10f, 15f, 10f)
                curveTo(17.8f, 10f, 20f, 12.2f, 20f, 15f)
                reflectiveCurveTo(17.8f, 20f, 15f, 20f)
                horizontalLineTo(14.8f)
                curveTo(14.9f, 20.7f, 15f, 21.3f, 15f, 22f)
                horizontalLineTo(20f)
                curveTo(21.1f, 22f, 22f, 21.1f, 22f, 20f)
                verticalLineTo(4f)
                curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                moveTo(15f, 8f)
                curveTo(13.9f, 8f, 13f, 7.1f, 13f, 6f)
                curveTo(13f, 4.9f, 13.9f, 4f, 15f, 4f)
                curveTo(16.1f, 4f, 17f, 4.9f, 17f, 6f)
                reflectiveCurveTo(16.1f, 8f, 15f, 8f)
                moveTo(15f, 18f)
                curveTo(14.8f, 18f, 14.5f, 18f, 14.3f, 17.9f)
                curveTo(13.8f, 16.4f, 13.1f, 15.1f, 12.2f, 13.9f)
                curveTo(12.6f, 12.8f, 13.7f, 11.9f, 15f, 11.9f)
                curveTo(16.7f, 11.9f, 18f, 13.2f, 18f, 14.9f)
                reflectiveCurveTo(16.7f, 18f, 15f, 18f)
                moveTo(2f, 15f)
                verticalLineTo(17f)
                curveTo(4.8f, 17f, 7f, 19.2f, 7f, 22f)
                horizontalLineTo(9f)
                curveTo(9f, 18.1f, 5.9f, 15f, 2f, 15f)
                moveTo(2f, 19f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                curveTo(5f, 20.3f, 3.7f, 19f, 2f, 19f)
            }
        }.build()

        return _CastAudio!!
    }

@Suppress("ObjectPropertyName")
private var _CastAudio: ImageVector? = null
