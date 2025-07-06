package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraIris: ImageVector
    get() {
        if (_CameraIris != null) {
            return _CameraIris!!
        }
        _CameraIris = ImageVector.Builder(
            name = "CameraIris",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.73f, 15f)
                lineTo(9.83f, 21.76f)
                curveTo(10.53f, 21.91f, 11.25f, 22f, 12f, 22f)
                curveTo(14.4f, 22f, 16.6f, 21.15f, 18.32f, 19.75f)
                lineTo(14.66f, 13.4f)
                moveTo(2.46f, 15f)
                curveTo(3.38f, 17.92f, 5.61f, 20.26f, 8.45f, 21.34f)
                lineTo(12.12f, 15f)
                moveTo(8.54f, 12f)
                lineTo(4.64f, 5.25f)
                curveTo(3f, 7f, 2f, 9.39f, 2f, 12f)
                curveTo(2f, 12.68f, 2.07f, 13.35f, 2.2f, 14f)
                horizontalLineTo(9.69f)
                moveTo(21.8f, 10f)
                horizontalLineTo(14.31f)
                lineTo(14.6f, 10.5f)
                lineTo(19.36f, 18.75f)
                curveTo(21f, 16.97f, 22f, 14.6f, 22f, 12f)
                curveTo(22f, 11.31f, 21.93f, 10.64f, 21.8f, 10f)
                moveTo(21.54f, 9f)
                curveTo(20.62f, 6.07f, 18.39f, 3.74f, 15.55f, 2.66f)
                lineTo(11.88f, 9f)
                moveTo(9.4f, 10.5f)
                lineTo(14.17f, 2.24f)
                curveTo(13.47f, 2.09f, 12.75f, 2f, 12f, 2f)
                curveTo(9.6f, 2f, 7.4f, 2.84f, 5.68f, 4.25f)
                lineTo(9.34f, 10.6f)
                lineTo(9.4f, 10.5f)
                close()
            }
        }.build()

        return _CameraIris!!
    }

@Suppress("ObjectPropertyName")
private var _CameraIris: ImageVector? = null
