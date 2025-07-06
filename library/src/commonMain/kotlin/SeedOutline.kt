package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SeedOutline: ImageVector
    get() {
        if (_SeedOutline != null) {
            return _SeedOutline!!
        }
        _SeedOutline = ImageVector.Builder(
            name = "SeedOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.2f, 5f)
                verticalLineTo(5f)
                curveTo(17.8f, 5f, 18.4f, 5f, 18.9f, 5.1f)
                curveTo(19.1f, 7.4f, 19.1f, 12f, 16.4f, 15.2f)
                curveTo(14.4f, 17.7f, 11f, 19f, 6.4f, 19f)
                curveTo(6f, 19f, 5.5f, 19f, 5.1f, 19f)
                curveTo(4.9f, 14.4f, 5.8f, 10.8f, 7.9f, 8.5f)
                curveTo(10.4f, 5.6f, 14.4f, 5f, 17.2f, 5f)
                moveTo(17.2f, 3f)
                curveTo(11.7f, 3f, 1.6f, 5.1f, 3.2f, 20.8f)
                curveTo(4.3f, 20.9f, 5.4f, 21f, 6.4f, 21f)
                curveTo(24.3f, 21f, 20.7f, 3.3f, 20.7f, 3.3f)
                curveTo(20.7f, 3.3f, 19.3f, 3f, 17.2f, 3f)
                moveTo(17f, 7f)
                curveTo(7f, 7f, 7f, 17f, 7f, 17f)
                curveTo(11f, 9f, 17f, 7f, 17f, 7f)
                close()
            }
        }.build()

        return _SeedOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SeedOutline: ImageVector? = null
