package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EyeRefreshOutline: ImageVector
    get() {
        if (_EyeRefreshOutline != null) {
            return _EyeRefreshOutline!!
        }
        _EyeRefreshOutline = ImageVector.Builder(
            name = "EyeRefreshOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 9f)
                curveTo(13.7f, 9f, 15f, 10.3f, 15f, 12f)
                reflectiveCurveTo(13.7f, 15f, 12f, 15f)
                reflectiveCurveTo(9f, 13.7f, 9f, 12f)
                reflectiveCurveTo(10.3f, 9f, 12f, 9f)
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
                moveTo(12f, 18.5f)
                curveTo(12f, 18.2f, 12f, 17.8f, 12.1f, 17.5f)
                horizontalLineTo(12f)
                curveTo(8.2f, 17.5f, 4.8f, 15.4f, 3.2f, 12f)
                curveTo(4.8f, 8.6f, 8.2f, 6.5f, 12f, 6.5f)
                reflectiveCurveTo(19.2f, 8.6f, 20.8f, 12f)
                curveTo(20.7f, 12.1f, 20.7f, 12.2f, 20.6f, 12.4f)
                curveTo(21.2f, 12.6f, 21.8f, 12.9f, 22.4f, 13.3f)
                curveTo(22.6f, 12.9f, 22.8f, 12.4f, 23f, 12f)
                curveTo(21.3f, 7.6f, 17f, 4.5f, 12f, 4.5f)
                reflectiveCurveTo(2.7f, 7.6f, 1f, 12f)
                curveTo(2.7f, 16.4f, 7f, 19.5f, 12f, 19.5f)
                horizontalLineTo(12.1f)
                curveTo(12f, 19.2f, 12f, 18.8f, 12f, 18.5f)
                close()
            }
        }.build()

        return _EyeRefreshOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EyeRefreshOutline: ImageVector? = null
