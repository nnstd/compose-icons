package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightSwitch: ImageVector
    get() {
        if (_LightSwitch != null) {
            return _LightSwitch!!
        }
        _LightSwitch = ImageVector.Builder(
            name = "LightSwitch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 6f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                moveTo(14f, 10f)
                horizontalLineTo(10f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                moveTo(19.4f, 1.6f)
                curveTo(19f, 1.2f, 18.5f, 1f, 18f, 1f)
                horizontalLineTo(6f)
                curveTo(5.5f, 1f, 5f, 1.2f, 4.6f, 1.6f)
                curveTo(4.2f, 2f, 4f, 2.5f, 4f, 3f)
                verticalLineTo(21f)
                curveTo(4f, 21.5f, 4.2f, 22f, 4.6f, 22.4f)
                curveTo(5f, 22.8f, 5.5f, 23f, 6f, 23f)
                horizontalLineTo(18f)
                curveTo(18.5f, 23f, 19f, 22.8f, 19.4f, 22.4f)
                curveTo(19.8f, 22f, 20f, 21.5f, 20f, 21f)
                verticalLineTo(3f)
                curveTo(20f, 2.5f, 19.8f, 2f, 19.4f, 1.6f)
                moveTo(18f, 21f)
                horizontalLineTo(6f)
                verticalLineTo(3f)
                horizontalLineTo(18f)
                verticalLineTo(21f)
                close()
            }
        }.build()

        return _LightSwitch!!
    }

@Suppress("ObjectPropertyName")
private var _LightSwitch: ImageVector? = null
