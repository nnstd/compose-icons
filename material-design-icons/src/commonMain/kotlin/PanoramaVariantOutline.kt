package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PanoramaVariantOutline: ImageVector
    get() {
        if (_PanoramaVariantOutline != null) {
            return _PanoramaVariantOutline!!
        }
        _PanoramaVariantOutline = ImageVector.Builder(
            name = "PanoramaVariantOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 4f)
                curveTo(20.4f, 4f, 17.4f, 5.5f, 12f, 5.5f)
                curveTo(6.7f, 5.5f, 3.5f, 4f, 3f, 4f)
                curveTo(2.5f, 4f, 2f, 4.4f, 2f, 5f)
                verticalLineTo(19f)
                curveTo(2f, 19.6f, 2.5f, 20f, 3f, 20f)
                curveTo(3.6f, 20f, 6.5f, 18.5f, 12f, 18.5f)
                curveTo(17.4f, 18.5f, 20.4f, 20f, 21f, 20f)
                curveTo(21.5f, 20f, 22f, 19.6f, 22f, 19f)
                verticalLineTo(5f)
                curveTo(22f, 4.4f, 21.5f, 4f, 21f, 4f)
                moveTo(20f, 17.6f)
                curveTo(18f, 17f, 15.4f, 16.5f, 12f, 16.5f)
                curveTo(8.6f, 16.5f, 6f, 17f, 4f, 17.6f)
                verticalLineTo(6.4f)
                curveTo(6.6f, 7.1f, 9.3f, 7.5f, 12f, 7.5f)
                curveTo(15.4f, 7.5f, 18f, 7f, 20f, 6.4f)
                verticalLineTo(17.6f)
                moveTo(9.2f, 11f)
                lineTo(5.5f, 15.4f)
                curveTo(7.5f, 15.1f, 9.7f, 15f, 12f, 15f)
                curveTo(14.3f, 15f, 16.5f, 15.1f, 18.5f, 15.4f)
                lineTo(14f, 10f)
                lineTo(11.2f, 13.4f)
                lineTo(9.2f, 11f)
                close()
            }
        }.build()

        return _PanoramaVariantOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PanoramaVariantOutline: ImageVector? = null
