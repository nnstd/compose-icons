package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Reload: ImageVector
    get() {
        if (_Reload != null) {
            return _Reload!!
        }
        _Reload = ImageVector.Builder(
            name = "Reload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 12f)
                curveTo(2f, 16.97f, 6.03f, 21f, 11f, 21f)
                curveTo(13.39f, 21f, 15.68f, 20.06f, 17.4f, 18.4f)
                lineTo(15.9f, 16.9f)
                curveTo(14.63f, 18.25f, 12.86f, 19f, 11f, 19f)
                curveTo(4.76f, 19f, 1.64f, 11.46f, 6.05f, 7.05f)
                curveTo(10.46f, 2.64f, 18f, 5.77f, 18f, 12f)
                horizontalLineTo(15f)
                lineTo(19f, 16f)
                horizontalLineTo(19.1f)
                lineTo(23f, 12f)
                horizontalLineTo(20f)
                curveTo(20f, 7.03f, 15.97f, 3f, 11f, 3f)
                curveTo(6.03f, 3f, 2f, 7.03f, 2f, 12f)
                close()
            }
        }.build()

        return _Reload!!
    }

@Suppress("ObjectPropertyName")
private var _Reload: ImageVector? = null
