package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldRefresh: ImageVector
    get() {
        if (_ShieldRefresh != null) {
            return _ShieldRefresh!!
        }
        _ShieldRefresh = ImageVector.Builder(
            name = "ShieldRefresh",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 12f)
                curveTo(19f, 12f, 20f, 12.2f, 20.9f, 12.7f)
                curveTo(21f, 12.1f, 21f, 11.6f, 21f, 11f)
                verticalLineTo(5f)
                lineTo(12f, 1f)
                lineTo(3f, 5f)
                verticalLineTo(11f)
                curveTo(3f, 16.5f, 6.8f, 21.7f, 12f, 23f)
                curveTo(12.4f, 22.9f, 12.7f, 22.8f, 13f, 22.7f)
                curveTo(12f, 21.5f, 11.5f, 20f, 11.5f, 18.5f)
                curveTo(11.5f, 14.9f, 14.4f, 12f, 18f, 12f)
                moveTo(18f, 14.5f)
                curveTo(19.1f, 14.5f, 20.1f, 14.9f, 20.8f, 15.7f)
                lineTo(22f, 14.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(18f)
                lineTo(19.8f, 16.7f)
                curveTo(19.3f, 16.3f, 18.7f, 16f, 18f, 16f)
                curveTo(16.6f, 16f, 15.5f, 17.1f, 15.5f, 18.5f)
                reflectiveCurveTo(16.6f, 21f, 18f, 21f)
                curveTo(18.8f, 21f, 19.5f, 20.6f, 20f, 20f)
                horizontalLineTo(21.7f)
                curveTo(21.1f, 21.5f, 19.7f, 22.5f, 18f, 22.5f)
                curveTo(15.8f, 22.5f, 14f, 20.7f, 14f, 18.5f)
                reflectiveCurveTo(15.8f, 14.5f, 18f, 14.5f)
                close()
            }
        }.build()

        return _ShieldRefresh!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldRefresh: ImageVector? = null
