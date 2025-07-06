package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldAccountVariantOutline: ImageVector
    get() {
        if (_ShieldAccountVariantOutline != null) {
            return _ShieldAccountVariantOutline!!
        }
        _ShieldAccountVariantOutline = ImageVector.Builder(
            name = "ShieldAccountVariantOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 14.4f)
                curveTo(17.6f, 14.4f, 18.1f, 14.9f, 18.1f, 15.5f)
                reflectiveCurveTo(17.6f, 16.6f, 17f, 16.6f)
                reflectiveCurveTo(15.9f, 16.1f, 15.9f, 15.5f)
                reflectiveCurveTo(16.4f, 14.4f, 17f, 14.4f)
                moveTo(17f, 17.5f)
                curveTo(16.3f, 17.5f, 14.8f, 17.9f, 14.8f, 18.6f)
                curveTo(15.3f, 19.3f, 16.1f, 19.8f, 17f, 19.8f)
                reflectiveCurveTo(18.7f, 19.3f, 19.2f, 18.6f)
                curveTo(19.2f, 17.9f, 17.7f, 17.5f, 17f, 17.5f)
                moveTo(18f, 11.1f)
                verticalLineTo(6.3f)
                lineTo(10.5f, 3f)
                lineTo(3f, 6.3f)
                verticalLineTo(11.2f)
                curveTo(3f, 15.7f, 6.2f, 20f, 10.5f, 21f)
                curveTo(11.1f, 20.9f, 11.6f, 20.7f, 12.1f, 20.5f)
                curveTo(13.2f, 22f, 15f, 23f, 17f, 23f)
                curveTo(20.3f, 23f, 23f, 20.3f, 23f, 17f)
                curveTo(23f, 14f, 20.8f, 11.6f, 18f, 11.1f)
                moveTo(11f, 17f)
                curveTo(11f, 17.6f, 11.1f, 18.1f, 11.2f, 18.6f)
                curveTo(11f, 18.7f, 10.7f, 18.8f, 10.5f, 18.9f)
                curveTo(7.3f, 17.9f, 5f, 14.7f, 5f, 11.2f)
                verticalLineTo(7.6f)
                lineTo(10.5f, 5.2f)
                lineTo(16f, 7.6f)
                verticalLineTo(11.1f)
                curveTo(13.2f, 11.6f, 11f, 14f, 11f, 17f)
                moveTo(17f, 21f)
                curveTo(14.8f, 21f, 13f, 19.2f, 13f, 17f)
                reflectiveCurveTo(14.8f, 13f, 17f, 13f)
                reflectiveCurveTo(21f, 14.8f, 21f, 17f)
                reflectiveCurveTo(19.2f, 21f, 17f, 21f)
                close()
            }
        }.build()

        return _ShieldAccountVariantOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldAccountVariantOutline: ImageVector? = null
