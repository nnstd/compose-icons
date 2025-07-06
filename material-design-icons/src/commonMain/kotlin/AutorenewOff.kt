package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AutorenewOff: ImageVector
    get() {
        if (_AutorenewOff != null) {
            return _AutorenewOff!!
        }
        _AutorenewOff = ImageVector.Builder(
            name = "AutorenewOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 12f)
                curveTo(18f, 11f, 17.74f, 10.04f, 17.3f, 9.2f)
                lineTo(18.76f, 7.74f)
                curveTo(19.54f, 8.97f, 20f, 10.43f, 20f, 12f)
                curveTo(20f, 13.39f, 19.64f, 14.68f, 19f, 15.82f)
                lineTo(17.5f, 14.32f)
                curveTo(17.82f, 13.6f, 18f, 12.83f, 18f, 12f)
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(5.5f, 7.37f)
                curveTo(4.55f, 8.68f, 4f, 10.27f, 4f, 12f)
                curveTo(4f, 13.57f, 4.46f, 15.03f, 5.24f, 16.26f)
                lineTo(6.7f, 14.8f)
                curveTo(6.25f, 13.97f, 6f, 13f, 6f, 12f)
                curveTo(6f, 10.83f, 6.34f, 9.74f, 6.92f, 8.81f)
                lineTo(15.19f, 17.08f)
                curveTo(14.26f, 17.66f, 13.17f, 18f, 12f, 18f)
                verticalLineTo(15f)
                lineTo(8f, 19f)
                lineTo(12f, 23f)
                verticalLineTo(20f)
                curveTo(13.73f, 20f, 15.32f, 19.45f, 16.63f, 18.5f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(12f, 6f)
                verticalLineTo(8.8f)
                lineTo(12.1f, 8.9f)
                lineTo(16f, 5f)
                lineTo(12f, 1f)
                verticalLineTo(4f)
                curveTo(10.62f, 4f, 9.32f, 4.36f, 8.18f, 5f)
                lineTo(9.68f, 6.5f)
                curveTo(10.4f, 6.18f, 11.18f, 6f, 12f, 6f)
                close()
            }
        }.build()

        return _AutorenewOff!!
    }

@Suppress("ObjectPropertyName")
private var _AutorenewOff: ImageVector? = null
