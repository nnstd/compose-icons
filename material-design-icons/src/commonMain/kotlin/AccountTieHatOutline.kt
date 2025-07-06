package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountTieHatOutline: ImageVector
    get() {
        if (_AccountTieHatOutline != null) {
            return _AccountTieHatOutline!!
        }
        _AccountTieHatOutline = ImageVector.Builder(
            name = "AccountTieHatOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 4.5f)
                curveTo(6f, 3.1f, 8.7f, 2f, 12f, 2f)
                reflectiveCurveTo(18f, 3.1f, 18f, 4.5f)
                curveTo(18f, 4.9f, 17.8f, 5.2f, 17.5f, 5.5f)
                curveTo(16.6f, 4.6f, 14.5f, 4f, 12f, 4f)
                reflectiveCurveTo(7.4f, 4.6f, 6.5f, 5.5f)
                curveTo(6.2f, 5.2f, 6f, 4.9f, 6f, 4.5f)
                moveTo(12f, 5f)
                curveTo(9.8f, 5f, 8.1f, 5.5f, 7.4f, 6.1f)
                curveTo(8.5f, 6.6f, 10.1f, 7f, 12f, 7f)
                reflectiveCurveTo(15.5f, 6.6f, 16.6f, 6.1f)
                curveTo(15.9f, 5.5f, 14.2f, 5f, 12f, 5f)
                moveTo(14f, 8f)
                curveTo(14f, 9.1f, 13.1f, 10f, 12f, 10f)
                reflectiveCurveTo(10f, 9.1f, 10f, 8f)
                verticalLineTo(7.9f)
                curveTo(9.3f, 7.8f, 8.6f, 7.7f, 8f, 7.5f)
                verticalLineTo(8f)
                curveTo(8f, 10.2f, 9.8f, 12f, 12f, 12f)
                reflectiveCurveTo(16f, 10.2f, 16f, 8f)
                curveTo(16f, 7.8f, 16f, 7.6f, 15.9f, 7.4f)
                curveTo(15.3f, 7.6f, 14.6f, 7.7f, 13.9f, 7.8f)
                curveTo(14f, 7.9f, 14f, 7.9f, 14f, 8f)
                moveTo(16.4f, 13.8f)
                lineTo(15.7f, 15f)
                lineTo(15.5f, 15.5f)
                curveTo(17f, 16f, 18.1f, 16.6f, 18.1f, 17f)
                verticalLineTo(20.1f)
                horizontalLineTo(13.9f)
                lineTo(13f, 15f)
                lineTo(13.9f, 13.1f)
                curveTo(13.3f, 13.1f, 12.7f, 13f, 12f, 13f)
                reflectiveCurveTo(10.7f, 13f, 10.1f, 13.1f)
                lineTo(11f, 15f)
                lineTo(10.1f, 20.1f)
                horizontalLineTo(5.9f)
                verticalLineTo(17f)
                curveTo(5.9f, 16.6f, 7f, 16f, 8.5f, 15.5f)
                lineTo(8.3f, 15f)
                lineTo(7.7f, 13.8f)
                curveTo(5.7f, 14.4f, 4f, 15.5f, 4f, 17f)
                verticalLineTo(22f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                curveTo(20f, 15.5f, 18.3f, 14.4f, 16.4f, 13.8f)
                close()
            }
        }.build()

        return _AccountTieHatOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountTieHatOutline: ImageVector? = null
