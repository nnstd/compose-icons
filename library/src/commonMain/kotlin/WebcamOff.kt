package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WebcamOff: ImageVector
    get() {
        if (_WebcamOff != null) {
            return _WebcamOff!!
        }
        _WebcamOff = ImageVector.Builder(
            name = "WebcamOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6f)
                curveTo(13.66f, 6f, 15f, 7.34f, 15f, 9f)
                curveTo(15f, 9.78f, 14.7f, 10.5f, 14.21f, 11f)
                lineTo(10f, 6.79f)
                curveTo(10.5f, 6.3f, 11.22f, 6f, 12f, 6f)
                moveTo(12f, 4f)
                curveTo(14.76f, 4f, 17f, 6.24f, 17f, 9f)
                curveTo(17f, 10.33f, 16.47f, 11.53f, 15.62f, 12.42f)
                lineTo(17.04f, 13.84f)
                curveTo(18.25f, 12.59f, 19f, 10.88f, 19f, 9f)
                curveTo(19f, 5.13f, 15.87f, 2f, 12f, 2f)
                curveTo(10.12f, 2f, 8.41f, 2.75f, 7.16f, 3.96f)
                lineTo(8.58f, 5.38f)
                curveTo(9.47f, 4.53f, 10.67f, 4f, 12f, 4f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(19.46f, 21.35f)
                curveTo(19.1f, 21.75f, 18.58f, 22f, 18f, 22f)
                horizontalLineTo(6f)
                curveTo(4.89f, 22f, 4f, 21.11f, 4f, 20f)
                curveTo(4f, 19.62f, 4.1f, 19.27f, 4.29f, 18.97f)
                lineTo(6.11f, 15.81f)
                curveTo(7.69f, 17.17f, 9.75f, 18f, 12f, 18f)
                curveTo(13.21f, 18f, 14.37f, 17.75f, 15.43f, 17.32f)
                lineTo(13.85f, 15.74f)
                curveTo(13.26f, 15.91f, 12.64f, 16f, 12f, 16f)
                curveTo(8.13f, 16f, 5f, 12.87f, 5f, 9f)
                curveTo(5f, 8.36f, 5.09f, 7.74f, 5.26f, 7.15f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(12.1f, 14f)
                lineTo(7f, 8.9f)
                curveTo(7f, 8.93f, 7f, 8.97f, 7f, 9f)
                curveTo(7f, 11.76f, 9.24f, 14f, 12f, 14f)
                curveTo(12.03f, 14f, 12.07f, 14f, 12.1f, 14f)
                close()
            }
        }.build()

        return _WebcamOff!!
    }

@Suppress("ObjectPropertyName")
private var _WebcamOff: ImageVector? = null
