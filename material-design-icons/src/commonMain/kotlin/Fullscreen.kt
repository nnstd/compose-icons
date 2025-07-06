package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Fullscreen: ImageVector
    get() {
        if (_Fullscreen != null) {
            return _Fullscreen!!
        }
        _Fullscreen = ImageVector.Builder(
            name = "Fullscreen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 5f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                moveTo(14f, 5f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                moveTo(17f, 14f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(14f)
                moveTo(10f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _Fullscreen!!
    }

@Suppress("ObjectPropertyName")
private var _Fullscreen: ImageVector? = null
