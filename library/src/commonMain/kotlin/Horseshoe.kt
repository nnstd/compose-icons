package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Horseshoe: ImageVector
    get() {
        if (_Horseshoe != null) {
            return _Horseshoe!!
        }
        _Horseshoe = ImageVector.Builder(
            name = "Horseshoe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 4f)
                horizontalLineTo(20f)
                verticalLineTo(1f)
                horizontalLineTo(16f)
                verticalLineTo(4f)
                curveTo(16f, 4f, 18f, 8f, 18f, 12f)
                curveTo(18f, 16f, 16f, 19f, 12f, 19f)
                curveTo(8f, 19f, 6f, 16f, 6f, 12f)
                curveTo(6f, 8f, 8f, 4f, 8f, 4f)
                verticalLineTo(1f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(5f)
                curveTo(5f, 4f, 2f, 8f, 2f, 14f)
                curveTo(2f, 19f, 7f, 23f, 12f, 23f)
                curveTo(17f, 23f, 22f, 19f, 22f, 14f)
                curveTo(22f, 8f, 19f, 4f, 19f, 4f)
                moveTo(4f, 13f)
                curveTo(3.4f, 13f, 3f, 12.6f, 3f, 12f)
                curveTo(3f, 11.4f, 3.4f, 11f, 4f, 11f)
                curveTo(4.6f, 11f, 5f, 11.4f, 5f, 12f)
                curveTo(5f, 12.6f, 4.6f, 13f, 4f, 13f)
                moveTo(6f, 19f)
                curveTo(5.4f, 19f, 5f, 18.6f, 5f, 18f)
                curveTo(5f, 17.4f, 5.4f, 17f, 6f, 17f)
                curveTo(6.6f, 17f, 7f, 17.4f, 7f, 18f)
                curveTo(7f, 18.6f, 6.6f, 19f, 6f, 19f)
                moveTo(12f, 22f)
                curveTo(11.4f, 22f, 11f, 21.6f, 11f, 21f)
                curveTo(11f, 20.4f, 11.4f, 20f, 12f, 20f)
                curveTo(12.6f, 20f, 13f, 20.4f, 13f, 21f)
                curveTo(13f, 21.6f, 12.6f, 22f, 12f, 22f)
                moveTo(18f, 19f)
                curveTo(17.4f, 19f, 17f, 18.6f, 17f, 18f)
                curveTo(17f, 17.4f, 17.4f, 17f, 18f, 17f)
                curveTo(18.6f, 17f, 19f, 17.4f, 19f, 18f)
                curveTo(19f, 18.6f, 18.6f, 19f, 18f, 19f)
                moveTo(20f, 13f)
                curveTo(19.4f, 13f, 19f, 12.6f, 19f, 12f)
                curveTo(19f, 11.4f, 19.4f, 11f, 20f, 11f)
                curveTo(20.6f, 11f, 21f, 11.4f, 21f, 12f)
                curveTo(21f, 12.6f, 20.6f, 13f, 20f, 13f)
                close()
            }
        }.build()

        return _Horseshoe!!
    }

@Suppress("ObjectPropertyName")
private var _Horseshoe: ImageVector? = null
