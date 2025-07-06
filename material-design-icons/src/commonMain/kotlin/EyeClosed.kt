package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EyeClosed: ImageVector
    get() {
        if (_EyeClosed != null) {
            return _EyeClosed!!
        }
        _EyeClosed = ImageVector.Builder(
            name = "EyeClosed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 17.5f)
                curveTo(8.2f, 17.5f, 4.8f, 15.4f, 3.2f, 12f)
                horizontalLineTo(1f)
                curveTo(2.7f, 16.4f, 7f, 19.5f, 12f, 19.5f)
                reflectiveCurveTo(21.3f, 16.4f, 23f, 12f)
                horizontalLineTo(20.8f)
                curveTo(19.2f, 15.4f, 15.8f, 17.5f, 12f, 17.5f)
                close()
            }
        }.build()

        return _EyeClosed!!
    }

@Suppress("ObjectPropertyName")
private var _EyeClosed: ImageVector? = null
