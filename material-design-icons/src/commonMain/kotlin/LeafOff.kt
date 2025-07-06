package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LeafOff: ImageVector
    get() {
        if (_LeafOff != null) {
            return _LeafOff!!
        }
        _LeafOff = ImageVector.Builder(
            name = "LeafOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.84f, 22.73f)
                lineTo(15.14f, 17.03f)
                curveTo(13.26f, 18.79f, 10.92f, 20f, 8f, 20f)
                curveTo(7.64f, 20f, 7.14f, 19.87f, 6.66f, 19.7f)
                lineTo(5.71f, 22f)
                lineTo(3.82f, 21.34f)
                curveTo(5.15f, 18.03f, 6.5f, 14.32f, 9.66f, 11.55f)
                lineTo(8.77f, 10.66f)
                curveTo(6.76f, 12.03f, 4.86f, 14.1f, 3.75f, 17.25f)
                curveTo(3.75f, 17.25f, 2f, 15.5f, 2f, 13.5f)
                curveTo(2f, 12f, 3.12f, 9.32f, 5.72f, 7.61f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                curveTo(2.39f, 1.73f, 16.39f, 15.74f, 16.39f, 15.74f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(17f, 8f)
                curveTo(15.35f, 8.37f, 13.93f, 8.88f, 12.7f, 9.5f)
                lineTo(17.5f, 14.29f)
                curveTo(20.87f, 9.35f, 22f, 3f, 22f, 3f)
                curveTo(21.03f, 4.95f, 14.35f, 5.24f, 9.38f, 6.18f)
                lineTo(12.15f, 8.95f)
                curveTo(14.81f, 8f, 17f, 8f, 17f, 8f)
                close()
            }
        }.build()

        return _LeafOff!!
    }

@Suppress("ObjectPropertyName")
private var _LeafOff: ImageVector? = null
