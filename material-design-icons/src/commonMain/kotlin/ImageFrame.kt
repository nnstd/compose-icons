package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ImageFrame: ImageVector
    get() {
        if (_ImageFrame != null) {
            return _ImageFrame!!
        }
        _ImageFrame = ImageVector.Builder(
            name = "ImageFrame",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 14.29f)
                lineTo(6.5f, 19f)
                horizontalLineTo(17.46f)
                lineTo(14.75f, 15.46f)
                lineTo(12.78f, 17.8f)
                lineTo(10f, 14.29f)
                moveTo(5f, 21f)
                verticalLineTo(7f)
                horizontalLineTo(18.96f)
                verticalLineTo(21f)
                horizontalLineTo(5f)
                moveTo(12f, 2.4f)
                lineTo(14.61f, 5.03f)
                horizontalLineTo(9.37f)
                lineTo(12f, 2.4f)
                moveTo(5f, 5.03f)
                curveTo(4.5f, 5.03f, 4f, 5.22f, 3.61f, 5.61f)
                curveTo(3.2f, 6f, 3f, 6.46f, 3f, 7f)
                verticalLineTo(21f)
                curveTo(3f, 21.5f, 3.2f, 22f, 3.61f, 22.39f)
                curveTo(4f, 22.8f, 4.5f, 23f, 5f, 23f)
                horizontalLineTo(18.96f)
                curveTo(19.5f, 23f, 19.96f, 22.8f, 20.37f, 22.39f)
                curveTo(20.77f, 22f, 21f, 21.5f, 21f, 21f)
                verticalLineTo(7f)
                curveTo(21f, 6.46f, 20.77f, 6f, 20.37f, 5.61f)
                curveTo(19.96f, 5.22f, 19.5f, 5.03f, 18.96f, 5.03f)
                horizontalLineTo(16f)
                lineTo(12f, 1f)
                lineTo(7.96f, 5.03f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _ImageFrame!!
    }

@Suppress("ObjectPropertyName")
private var _ImageFrame: ImageVector? = null
