package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GuitarPickOutline: ImageVector
    get() {
        if (_GuitarPickOutline != null) {
            return _GuitarPickOutline!!
        }
        _GuitarPickOutline = ImageVector.Builder(
            name = "GuitarPickOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 4.1f)
                curveTo(18.1f, 3.3f, 17f, 2.8f, 15.8f, 2.5f)
                curveTo(15.5f, 2.4f, 13.6f, 2f, 12.2f, 2f)
                curveTo(12.2f, 2f, 12.1f, 2f, 12f, 2f)
                curveTo(12f, 2f, 11.9f, 2f, 11.8f, 2f)
                curveTo(10.4f, 2f, 8.4f, 2.4f, 8.1f, 2.5f)
                curveTo(7f, 2.8f, 5.9f, 3.3f, 5f, 4.1f)
                curveTo(3f, 5.9f, 3f, 8.7f, 4f, 11f)
                curveTo(5f, 13.5f, 6.1f, 15.7f, 7.6f, 17.9f)
                curveTo(8.8f, 19.6f, 10.1f, 22f, 12f, 22f)
                curveTo(13.9f, 22f, 15.2f, 19.6f, 16.5f, 17.9f)
                curveTo(18f, 15.8f, 19.1f, 13.5f, 20.1f, 11f)
                curveTo(21f, 8.7f, 21f, 5.9f, 19f, 4.1f)
                moveTo(18.2f, 10.2f)
                curveTo(17.1f, 12.9f, 16.1f, 14.9f, 14.8f, 16.7f)
                curveTo(14.6f, 16.9f, 14.5f, 17.2f, 14.3f, 17.4f)
                curveTo(13.8f, 18.2f, 12.6f, 20f, 12f, 20f)
                curveTo(12f, 20f, 12f, 20f, 12f, 20f)
                curveTo(11.3f, 20f, 10.2f, 18.3f, 9.6f, 17.4f)
                curveTo(9.4f, 17.2f, 9.3f, 16.9f, 9.1f, 16.7f)
                curveTo(7.9f, 14.9f, 6.8f, 12.9f, 5.7f, 10.2f)
                curveTo(5.5f, 9.5f, 4.7f, 7f, 6.3f, 5.5f)
                curveTo(6.8f, 5f, 7.6f, 4.7f, 8.6f, 4.4f)
                curveTo(9f, 4.4f, 10.7f, 4f, 11.8f, 4f)
                curveTo(11.8f, 4f, 12.1f, 4f, 12.1f, 4f)
                curveTo(13.2f, 4f, 14.9f, 4.3f, 15.3f, 4.4f)
                curveTo(16.3f, 4.7f, 17.1f, 5f, 17.6f, 5.5f)
                curveTo(19.3f, 7f, 18.5f, 9.5f, 18.2f, 10.2f)
                close()
            }
        }.build()

        return _GuitarPickOutline!!
    }

@Suppress("ObjectPropertyName")
private var _GuitarPickOutline: ImageVector? = null
