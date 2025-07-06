package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VideoCheck: ImageVector
    get() {
        if (_VideoCheck != null) {
            return _VideoCheck!!
        }
        _VideoCheck = ImageVector.Builder(
            name = "VideoCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 10.5f)
                verticalLineTo(7f)
                curveTo(17f, 6.45f, 16.55f, 6f, 16f, 6f)
                horizontalLineTo(4f)
                curveTo(3.45f, 6f, 3f, 6.45f, 3f, 7f)
                verticalLineTo(17f)
                curveTo(3f, 17.55f, 3.45f, 18f, 4f, 18f)
                horizontalLineTo(16f)
                curveTo(16.55f, 18f, 17f, 17.55f, 17f, 17f)
                verticalLineTo(13.5f)
                lineTo(21f, 17.5f)
                verticalLineTo(6.5f)
                lineTo(17f, 10.5f)
                moveTo(8.93f, 15f)
                lineTo(6f, 11.8f)
                lineTo(7.24f, 10.56f)
                lineTo(8.93f, 12.26f)
                lineTo(12.76f, 8.43f)
                lineTo(14f, 9.93f)
                lineTo(8.93f, 15f)
                close()
            }
        }.build()

        return _VideoCheck!!
    }

@Suppress("ObjectPropertyName")
private var _VideoCheck: ImageVector? = null
