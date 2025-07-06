package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ToggleSwitchVariantOff: ImageVector
    get() {
        if (_ToggleSwitchVariantOff != null) {
            return _ToggleSwitchVariantOff!!
        }
        _ToggleSwitchVariantOff = ImageVector.Builder(
            name = "ToggleSwitchVariantOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.6f, 1.6f)
                curveTo(6f, 1.2f, 6.5f, 1f, 7f, 1f)
                horizontalLineTo(17f)
                curveTo(17.5f, 1f, 18f, 1.2f, 18.4f, 1.6f)
                curveTo(18.8f, 2f, 19f, 2.5f, 19f, 3f)
                verticalLineTo(21f)
                curveTo(19f, 21.5f, 18.8f, 22f, 18.4f, 22.4f)
                curveTo(18f, 22.8f, 17.5f, 23f, 17f, 23f)
                horizontalLineTo(7f)
                curveTo(6.5f, 23f, 6f, 22.8f, 5.6f, 22.4f)
                curveTo(5.2f, 22f, 5f, 21.5f, 5f, 21f)
                verticalLineTo(3f)
                curveTo(5f, 2.5f, 5.2f, 2f, 5.6f, 1.6f)
                moveTo(8f, 3f)
                curveTo(7.4f, 3f, 7f, 3.4f, 7f, 4f)
                verticalLineTo(20f)
                curveTo(7f, 20.6f, 7.4f, 21f, 8f, 21f)
                horizontalLineTo(16f)
                curveTo(16.6f, 21f, 17f, 20.6f, 17f, 20f)
                verticalLineTo(4f)
                curveTo(17f, 3.4f, 16.6f, 3f, 16f, 3f)
                horizontalLineTo(8f)
                moveTo(8f, 17f)
                curveTo(8f, 16.4f, 8.4f, 16f, 9f, 16f)
                horizontalLineTo(15f)
                curveTo(15.6f, 16f, 16f, 16.4f, 16f, 17f)
                verticalLineTo(19f)
                curveTo(16f, 19.6f, 15.6f, 20f, 15f, 20f)
                horizontalLineTo(9f)
                curveTo(8.4f, 20f, 8f, 19.6f, 8f, 19f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _ToggleSwitchVariantOff!!
    }

@Suppress("ObjectPropertyName")
private var _ToggleSwitchVariantOff: ImageVector? = null
