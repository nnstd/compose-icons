package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ToggleSwitchVariant: ImageVector
    get() {
        if (_ToggleSwitchVariant != null) {
            return _ToggleSwitchVariant!!
        }
        _ToggleSwitchVariant = ImageVector.Builder(
            name = "ToggleSwitchVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.4f, 1.6f)
                curveTo(18f, 1.2f, 17.5f, 1f, 17f, 1f)
                horizontalLineTo(7f)
                curveTo(6.5f, 1f, 6f, 1.2f, 5.6f, 1.6f)
                curveTo(5.2f, 2f, 5f, 2.5f, 5f, 3f)
                verticalLineTo(21f)
                curveTo(5f, 21.5f, 5.2f, 22f, 5.6f, 22.4f)
                curveTo(6f, 22.8f, 6.5f, 23f, 7f, 23f)
                horizontalLineTo(17f)
                curveTo(17.5f, 23f, 18f, 22.8f, 18.4f, 22.4f)
                curveTo(18.8f, 22f, 19f, 21.5f, 19f, 21f)
                verticalLineTo(3f)
                curveTo(19f, 2.5f, 18.8f, 2f, 18.4f, 1.6f)
                moveTo(16f, 7f)
                curveTo(16f, 7.6f, 15.6f, 8f, 15f, 8f)
                horizontalLineTo(9f)
                curveTo(8.4f, 8f, 8f, 7.6f, 8f, 7f)
                verticalLineTo(5f)
                curveTo(8f, 4.4f, 8.4f, 4f, 9f, 4f)
                horizontalLineTo(15f)
                curveTo(15.6f, 4f, 16f, 4.4f, 16f, 5f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _ToggleSwitchVariant!!
    }

@Suppress("ObjectPropertyName")
private var _ToggleSwitchVariant: ImageVector? = null
