package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ReloadAlert: ImageVector
    get() {
        if (_ReloadAlert != null) {
            return _ReloadAlert!!
        }
        _ReloadAlert = ImageVector.Builder(
            name = "ReloadAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 12f)
                curveTo(2f, 17f, 6f, 21f, 11f, 21f)
                curveTo(13.4f, 21f, 15.7f, 20.1f, 17.4f, 18.4f)
                lineTo(15.9f, 16.9f)
                curveTo(14.6f, 18.3f, 12.9f, 19f, 11f, 19f)
                curveTo(4.8f, 19f, 1.6f, 11.5f, 6.1f, 7.1f)
                reflectiveCurveTo(18f, 5.8f, 18f, 12f)
                horizontalLineTo(15f)
                lineTo(19f, 16f)
                horizontalLineTo(19.1f)
                lineTo(23f, 12f)
                horizontalLineTo(20f)
                curveTo(20f, 7f, 16f, 3f, 11f, 3f)
                reflectiveCurveTo(2f, 7f, 2f, 12f)
                moveTo(10f, 15f)
                horizontalLineTo(12f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                moveTo(10f, 7f)
                horizontalLineTo(12f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
            }
        }.build()

        return _ReloadAlert!!
    }

@Suppress("ObjectPropertyName")
private var _ReloadAlert: ImageVector? = null
