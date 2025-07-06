package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldAccountVariant: ImageVector
    get() {
        if (_ShieldAccountVariant != null) {
            return _ShieldAccountVariant!!
        }
        _ShieldAccountVariant = ImageVector.Builder(
            name = "ShieldAccountVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 11f)
                curveTo(17.3f, 11f, 17.7f, 11f, 18f, 11.1f)
                verticalLineTo(6.3f)
                lineTo(10.5f, 3f)
                lineTo(3f, 6.3f)
                verticalLineTo(11.2f)
                curveTo(3f, 15.7f, 6.2f, 20f, 10.5f, 21f)
                curveTo(11.1f, 20.9f, 11.6f, 20.7f, 12.1f, 20.5f)
                curveTo(11.4f, 19.5f, 11f, 18.3f, 11f, 17f)
                curveTo(11f, 13.7f, 13.7f, 11f, 17f, 11f)
                moveTo(17f, 13f)
                curveTo(14.8f, 13f, 13f, 14.8f, 13f, 17f)
                reflectiveCurveTo(14.8f, 21f, 17f, 21f)
                reflectiveCurveTo(21f, 19.2f, 21f, 17f)
                reflectiveCurveTo(19.2f, 13f, 17f, 13f)
                moveTo(17f, 14.4f)
                curveTo(17.6f, 14.4f, 18.1f, 14.9f, 18.1f, 15.5f)
                curveTo(18.1f, 16.1f, 17.6f, 16.6f, 17f, 16.6f)
                reflectiveCurveTo(15.9f, 16.1f, 15.9f, 15.5f)
                reflectiveCurveTo(16.4f, 14.4f, 17f, 14.4f)
                moveTo(17f, 19.8f)
                curveTo(16.1f, 19.8f, 15.3f, 19.3f, 14.8f, 18.6f)
                curveTo(14.9f, 17.9f, 16.3f, 17.5f, 17f, 17.5f)
                reflectiveCurveTo(19.2f, 17.9f, 19.2f, 18.6f)
                curveTo(18.7f, 19.3f, 17.9f, 19.8f, 17f, 19.8f)
                close()
            }
        }.build()

        return _ShieldAccountVariant!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldAccountVariant: ImageVector? = null
