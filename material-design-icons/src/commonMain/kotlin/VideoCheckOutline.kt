package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VideoCheckOutline: ImageVector
    get() {
        if (_VideoCheckOutline != null) {
            return _VideoCheckOutline!!
        }
        _VideoCheckOutline = ImageVector.Builder(
            name = "VideoCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 8f)
                verticalLineTo(16f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                moveTo(16f, 6f)
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
                verticalLineTo(7f)
                curveTo(17f, 6.45f, 16.55f, 6f, 16f, 6f)
                moveTo(6.35f, 12.08f)
                lineTo(7.5f, 10.95f)
                lineTo(9f, 12.5f)
                lineTo(12.5f, 9f)
                lineTo(13.65f, 10.37f)
                lineTo(9f, 15f)
                lineTo(6.35f, 12.08f)
                close()
            }
        }.build()

        return _VideoCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _VideoCheckOutline: ImageVector? = null
