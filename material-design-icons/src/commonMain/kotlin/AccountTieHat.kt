package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountTieHat: ImageVector
    get() {
        if (_AccountTieHat != null) {
            return _AccountTieHat!!
        }
        _AccountTieHat = ImageVector.Builder(
            name = "AccountTieHat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 14.5f)
                curveTo(16f, 15.6f, 15.7f, 18f, 13.8f, 20.8f)
                lineTo(13f, 16f)
                lineTo(13.9f, 14.1f)
                curveTo(13.3f, 14.1f, 12.7f, 14f, 12f, 14f)
                reflectiveCurveTo(10.7f, 14.1f, 10.1f, 14.1f)
                lineTo(11f, 16f)
                lineTo(10.2f, 20.8f)
                curveTo(8.3f, 18.1f, 8f, 15.6f, 8f, 14.5f)
                curveTo(5.6f, 15.2f, 4f, 16.5f, 4f, 18f)
                verticalLineTo(22f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                curveTo(20f, 16.5f, 18.4f, 15.2f, 16f, 14.5f)
                moveTo(6f, 4.5f)
                curveTo(6f, 3.1f, 8.7f, 2f, 12f, 2f)
                reflectiveCurveTo(18f, 3.1f, 18f, 4.5f)
                curveTo(18f, 4.9f, 17.8f, 5.2f, 17.5f, 5.5f)
                curveTo(16.6f, 4.6f, 14.5f, 4f, 12f, 4f)
                reflectiveCurveTo(7.4f, 4.6f, 6.5f, 5.5f)
                curveTo(6.2f, 5.2f, 6f, 4.9f, 6f, 4.5f)
                moveTo(15.9f, 7.4f)
                curveTo(16f, 7.6f, 16f, 7.8f, 16f, 8f)
                curveTo(16f, 10.2f, 14.2f, 12f, 12f, 12f)
                reflectiveCurveTo(8f, 10.2f, 8f, 8f)
                curveTo(8f, 7.8f, 8f, 7.6f, 8.1f, 7.4f)
                curveTo(9.1f, 7.8f, 10.5f, 8f, 12f, 8f)
                reflectiveCurveTo(14.9f, 7.8f, 15.9f, 7.4f)
                moveTo(16.6f, 6.1f)
                curveTo(15.5f, 6.6f, 13.9f, 7f, 12f, 7f)
                reflectiveCurveTo(8.5f, 6.6f, 7.4f, 6.1f)
                curveTo(8.1f, 5.5f, 9.8f, 5f, 12f, 5f)
                reflectiveCurveTo(15.9f, 5.5f, 16.6f, 6.1f)
                close()
            }
        }.build()

        return _AccountTieHat!!
    }

@Suppress("ObjectPropertyName")
private var _AccountTieHat: ImageVector? = null
