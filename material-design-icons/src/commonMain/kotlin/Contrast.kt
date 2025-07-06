package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Contrast: ImageVector
    get() {
        if (_Contrast != null) {
            return _Contrast!!
        }
        _Contrast = ImageVector.Builder(
            name = "Contrast",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.38f, 20.9f)
                curveTo(3.78f, 20.71f, 3.3f, 20.23f, 3.1f, 19.63f)
                lineTo(19.63f, 3.1f)
                curveTo(20.23f, 3.3f, 20.71f, 3.78f, 20.9f, 4.38f)
                lineTo(4.38f, 20.9f)
                moveTo(20f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(20f)
                moveTo(3f, 6f)
                horizontalLineTo(6f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _Contrast!!
    }

@Suppress("ObjectPropertyName")
private var _Contrast: ImageVector? = null
