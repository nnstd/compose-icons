package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PanoramaVariant: ImageVector
    get() {
        if (_PanoramaVariant != null) {
            return _PanoramaVariant!!
        }
        _PanoramaVariant = ImageVector.Builder(
            name = "PanoramaVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.7f, 4.1f)
                curveTo(18.7f, 4.8f, 15.9f, 5.5f, 12f, 5.5f)
                curveTo(8.1f, 5.5f, 5.1f, 4.7f, 3.3f, 4.1f)
                curveTo(2.7f, 3.8f, 2f, 4.3f, 2f, 5f)
                verticalLineTo(19f)
                curveTo(2f, 19.7f, 2.7f, 20.2f, 3.3f, 20f)
                curveTo(5.4f, 19.3f, 8.1f, 18.5f, 12f, 18.5f)
                curveTo(15.9f, 18.5f, 18.7f, 19.3f, 20.7f, 20f)
                curveTo(21.4f, 20.2f, 22f, 19.7f, 22f, 19f)
                verticalLineTo(5f)
                curveTo(22f, 4.3f, 21.3f, 3.8f, 20.7f, 4.1f)
                moveTo(12f, 15f)
                curveTo(9.7f, 15f, 7.5f, 15.1f, 5.5f, 15.4f)
                lineTo(9.2f, 11f)
                lineTo(11.2f, 13.4f)
                lineTo(14f, 10f)
                lineTo(18.5f, 15.4f)
                curveTo(16.5f, 15.1f, 14.3f, 15f, 12f, 15f)
                close()
            }
        }.build()

        return _PanoramaVariant!!
    }

@Suppress("ObjectPropertyName")
private var _PanoramaVariant: ImageVector? = null
