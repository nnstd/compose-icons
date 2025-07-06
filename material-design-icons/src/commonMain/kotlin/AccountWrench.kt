package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountWrench: ImageVector
    get() {
        if (_AccountWrench != null) {
            return _AccountWrench!!
        }
        _AccountWrench = ImageVector.Builder(
            name = "AccountWrench",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.9f, 21.2f)
                lineTo(18.8f, 17.1f)
                curveTo(19.2f, 16.1f, 19f, 14.8f, 18.1f, 14f)
                curveTo(17.2f, 13.1f, 15.9f, 12.9f, 14.8f, 13.4f)
                lineTo(16.7f, 15.3f)
                lineTo(15.3f, 16.7f)
                lineTo(13.3f, 14.7f)
                curveTo(12.8f, 15.8f, 13f, 17.1f, 13.9f, 18.1f)
                curveTo(14.8f, 19f, 16f, 19.2f, 17f, 18.8f)
                lineTo(21.1f, 22.9f)
                curveTo(21.3f, 23.1f, 21.6f, 23.1f, 21.7f, 22.9f)
                lineTo(22.7f, 21.9f)
                curveTo(23f, 21.6f, 23f, 21.3f, 22.9f, 21.2f)
                moveTo(13f, 20f)
                horizontalLineTo(2f)
                verticalLineTo(18f)
                curveTo(2f, 15.8f, 5.6f, 14f, 10f, 14f)
                curveTo(10.5f, 14f, 11f, 14f, 11.4f, 14.1f)
                curveTo(11.1f, 14.7f, 11f, 15.3f, 11f, 16f)
                curveTo(11f, 17.6f, 11.8f, 19.1f, 13f, 20f)
                moveTo(10f, 4f)
                curveTo(7.8f, 4f, 6f, 5.8f, 6f, 8f)
                reflectiveCurveTo(7.8f, 12f, 10f, 12f)
                reflectiveCurveTo(14f, 10.2f, 14f, 8f)
                reflectiveCurveTo(12.2f, 4f, 10f, 4f)
            }
        }.build()

        return _AccountWrench!!
    }

@Suppress("ObjectPropertyName")
private var _AccountWrench: ImageVector? = null
