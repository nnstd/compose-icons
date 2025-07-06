package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PackageVariantClosedCheck: ImageVector
    get() {
        if (_PackageVariantClosedCheck != null) {
            return _PackageVariantClosedCheck!!
        }
        _PackageVariantClosedCheck = ImageVector.Builder(
            name = "PackageVariantClosedCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(11.8f, 2f, 11.6f, 2.1f, 11.4f, 2.2f)
                lineTo(3.5f, 6.6f)
                curveTo(3.2f, 6.8f, 3f, 7.1f, 3f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(3f, 16.9f, 3.2f, 17.2f, 3.5f, 17.4f)
                lineTo(11.4f, 21.8f)
                curveTo(11.6f, 21.9f, 11.8f, 22f, 12f, 22f)
                reflectiveCurveTo(12.4f, 21.9f, 12.6f, 21.8f)
                lineTo(13.5f, 21.3f)
                curveTo(13.2f, 20.7f, 13.1f, 20f, 13f, 19.3f)
                verticalLineTo(12.6f)
                lineTo(19f, 9.2f)
                verticalLineTo(13f)
                curveTo(19.7f, 13f, 20.4f, 13.1f, 21f, 13.3f)
                verticalLineTo(7.5f)
                curveTo(21f, 7.1f, 20.8f, 6.8f, 20.5f, 6.6f)
                lineTo(12.6f, 2.2f)
                curveTo(12.4f, 2.1f, 12.2f, 2f, 12f, 2f)
                moveTo(12f, 4.2f)
                lineTo(18f, 7.5f)
                lineTo(16f, 8.6f)
                lineTo(10.1f, 5.2f)
                lineTo(12f, 4.2f)
                moveTo(8.1f, 6.3f)
                lineTo(14f, 9.8f)
                lineTo(12f, 10.9f)
                lineTo(6f, 7.5f)
                lineTo(8.1f, 6.3f)
                moveTo(5f, 9.2f)
                lineTo(11f, 12.6f)
                verticalLineTo(19.3f)
                lineTo(5f, 15.9f)
                verticalLineTo(9.2f)
                moveTo(21.3f, 15.8f)
                lineTo(17.7f, 19.4f)
                lineTo(16.1f, 17.8f)
                lineTo(15f, 19f)
                lineTo(17.8f, 22f)
                lineTo(22.6f, 17.2f)
                lineTo(21.3f, 15.8f)
                close()
            }
        }.build()

        return _PackageVariantClosedCheck!!
    }

@Suppress("ObjectPropertyName")
private var _PackageVariantClosedCheck: ImageVector? = null
