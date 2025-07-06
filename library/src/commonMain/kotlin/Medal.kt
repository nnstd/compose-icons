package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Medal: ImageVector
    get() {
        if (_Medal != null) {
            return _Medal!!
        }
        _Medal = ImageVector.Builder(
            name = "Medal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                lineTo(9.81f, 8.36f)
                curveTo(6.14f, 9.57f, 4.14f, 13.53f, 5.35f, 17.2f)
                curveTo(6.56f, 20.87f, 10.5f, 22.87f, 14.19f, 21.66f)
                curveTo(17.86f, 20.45f, 19.86f, 16.5f, 18.65f, 12.82f)
                curveTo(17.95f, 10.71f, 16.3f, 9.05f, 14.19f, 8.36f)
                lineTo(20f, 4f)
                verticalLineTo(2f)
                moveTo(14.94f, 19.5f)
                lineTo(12f, 17.78f)
                lineTo(9.06f, 19.5f)
                lineTo(9.84f, 16.17f)
                lineTo(7.25f, 13.93f)
                lineTo(10.66f, 13.64f)
                lineTo(12f, 10.5f)
                lineTo(13.34f, 13.64f)
                lineTo(16.75f, 13.93f)
                lineTo(14.16f, 16.17f)
                lineTo(14.94f, 19.5f)
                close()
            }
        }.build()

        return _Medal!!
    }

@Suppress("ObjectPropertyName")
private var _Medal: ImageVector? = null
