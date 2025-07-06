package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PackageVariantRemove: ImageVector
    get() {
        if (_PackageVariantRemove != null) {
            return _PackageVariantRemove!!
        }
        _PackageVariantRemove = ImageVector.Builder(
            name = "PackageVariantRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 15.6f)
                curveTo(13.3f, 15.8f, 13.7f, 15.8f, 14f, 15.6f)
                lineTo(19f, 12.7f)
                verticalLineTo(13f)
                curveTo(19.7f, 13f, 20.4f, 13.1f, 21f, 13.4f)
                verticalLineTo(11.6f)
                lineTo(22f, 11f)
                curveTo(22.5f, 10.7f, 22.6f, 10.1f, 22.4f, 9.6f)
                lineTo(20.9f, 7.1f)
                curveTo(20.8f, 6.9f, 20.7f, 6.7f, 20.5f, 6.6f)
                lineTo(12.6f, 2.2f)
                curveTo(12.4f, 2.1f, 12.2f, 2f, 12f, 2f)
                reflectiveCurveTo(11.6f, 2.1f, 11.4f, 2.2f)
                lineTo(3.6f, 6.6f)
                curveTo(3.4f, 6.7f, 3.2f, 6.8f, 3.1f, 7f)
                lineTo(1.6f, 9.6f)
                curveTo(1.3f, 10.1f, 1.5f, 10.7f, 2f, 11f)
                curveTo(2.3f, 11.2f, 2.7f, 11.2f, 3f, 11f)
                verticalLineTo(16.5f)
                curveTo(3f, 16.9f, 3.2f, 17.2f, 3.5f, 17.4f)
                lineTo(11.4f, 21.8f)
                curveTo(11.6f, 21.9f, 11.8f, 22f, 12f, 22f)
                reflectiveCurveTo(12.4f, 21.9f, 12.6f, 21.8f)
                lineTo(13.5f, 21.3f)
                curveTo(13.2f, 20.7f, 13.1f, 20f, 13f, 19.3f)
                moveTo(11f, 19.3f)
                lineTo(5f, 15.9f)
                verticalLineTo(9.2f)
                lineTo(11f, 12.6f)
                verticalLineTo(19.3f)
                moveTo(20.1f, 9.7f)
                lineTo(13.8f, 13.3f)
                lineTo(13.2f, 12.3f)
                lineTo(19.5f, 8.7f)
                lineTo(20.1f, 9.7f)
                moveTo(12f, 10.8f)
                verticalLineTo(4.2f)
                lineTo(18f, 7.5f)
                lineTo(12f, 10.8f)
                moveTo(22.5f, 16.9f)
                lineTo(20.4f, 19f)
                lineTo(22.5f, 21.1f)
                lineTo(21.1f, 22.5f)
                lineTo(19f, 20.4f)
                lineTo(16.9f, 22.5f)
                lineTo(15.5f, 21.1f)
                lineTo(17.6f, 19f)
                lineTo(15.5f, 16.9f)
                lineTo(16.9f, 15.5f)
                lineTo(19f, 17.6f)
                lineTo(21.1f, 15.5f)
                lineTo(22.5f, 16.9f)
                close()
            }
        }.build()

        return _PackageVariantRemove!!
    }

@Suppress("ObjectPropertyName")
private var _PackageVariantRemove: ImageVector? = null
