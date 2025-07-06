package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EyeRefresh: ImageVector
    get() {
        if (_EyeRefresh != null) {
            return _EyeRefresh!!
        }
        _EyeRefresh = ImageVector.Builder(
            name = "EyeRefresh",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 9f)
                curveTo(10.3f, 9f, 9f, 10.3f, 9f, 12f)
                reflectiveCurveTo(10.3f, 15f, 12f, 15f)
                reflectiveCurveTo(15f, 13.7f, 15f, 12f)
                reflectiveCurveTo(13.7f, 9f, 12f, 9f)
                moveTo(18f, 18.5f)
                lineTo(19.8f, 16.7f)
                curveTo(19.3f, 16.3f, 18.7f, 16f, 18f, 16f)
                curveTo(16.6f, 16f, 15.5f, 17.1f, 15.5f, 18.5f)
                reflectiveCurveTo(16.6f, 21f, 18f, 21f)
                curveTo(18.8f, 21f, 19.5f, 20.6f, 20f, 20f)
                horizontalLineTo(21.7f)
                curveTo(21.1f, 21.5f, 19.7f, 22.5f, 18f, 22.5f)
                curveTo(15.8f, 22.5f, 14f, 20.7f, 14f, 18.5f)
                reflectiveCurveTo(15.8f, 14.5f, 18f, 14.5f)
                curveTo(19.1f, 14.5f, 20.1f, 14.9f, 20.8f, 15.7f)
                lineTo(22f, 14.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(18f)
                moveTo(12.1f, 19.5f)
                curveTo(12.1f, 19.5f, 12f, 19.5f, 12.1f, 19.5f)
                curveTo(7f, 19.5f, 2.7f, 16.4f, 1f, 12f)
                curveTo(2.7f, 7.6f, 7f, 4.5f, 12f, 4.5f)
                reflectiveCurveTo(21.3f, 7.6f, 23f, 12f)
                curveTo(22.8f, 12.4f, 22.6f, 12.9f, 22.4f, 13.3f)
                curveTo(21.3f, 12.5f, 20f, 12f, 18.5f, 12f)
                curveTo(18f, 12f, 17.5f, 12.1f, 17f, 12.2f)
                verticalLineTo(12f)
                curveTo(17f, 9.2f, 14.8f, 7f, 12f, 7f)
                reflectiveCurveTo(7f, 9.2f, 7f, 12f)
                reflectiveCurveTo(9.2f, 17f, 12f, 17f)
                horizontalLineTo(12.2f)
                curveTo(12.1f, 17.5f, 12f, 18f, 12f, 18.5f)
                curveTo(12f, 18.8f, 12f, 19.2f, 12.1f, 19.5f)
                close()
            }
        }.build()

        return _EyeRefresh!!
    }

@Suppress("ObjectPropertyName")
private var _EyeRefresh: ImageVector? = null
