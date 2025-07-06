package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraFlip: ImageVector
    get() {
        if (_CameraFlip != null) {
            return _CameraFlip!!
        }
        _CameraFlip = ImageVector.Builder(
            name = "CameraFlip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 5f)
                horizontalLineTo(17f)
                lineTo(15f, 3f)
                horizontalLineTo(9f)
                lineTo(7f, 5f)
                horizontalLineTo(4f)
                curveTo(2.9f, 5f, 2f, 5.9f, 2f, 7f)
                verticalLineTo(19f)
                curveTo(2f, 20.11f, 2.9f, 21f, 4f, 21f)
                horizontalLineTo(20f)
                curveTo(21.11f, 21f, 22f, 20.11f, 22f, 19f)
                verticalLineTo(7f)
                curveTo(22f, 5.9f, 21.11f, 5f, 20f, 5f)
                moveTo(5f, 12f)
                horizontalLineTo(7.1f)
                curveTo(7.65f, 9.29f, 10.29f, 7.55f, 13f, 8.1f)
                curveTo(13.76f, 8.25f, 14.43f, 8.59f, 15f, 9f)
                lineTo(13.56f, 10.45f)
                curveTo(13.11f, 10.17f, 12.58f, 10f, 12f, 10f)
                curveTo(10.74f, 10f, 9.6f, 10.8f, 9.18f, 12f)
                horizontalLineTo(11f)
                lineTo(8f, 15f)
                lineTo(5f, 12f)
                moveTo(16.91f, 14f)
                curveTo(16.36f, 16.71f, 13.72f, 18.45f, 11f, 17.9f)
                curveTo(10.25f, 17.74f, 9.58f, 17.41f, 9f, 17f)
                lineTo(10.44f, 15.55f)
                curveTo(10.9f, 15.83f, 11.43f, 16f, 12f, 16f)
                curveTo(13.27f, 16f, 14.41f, 15.2f, 14.83f, 14f)
                horizontalLineTo(13f)
                lineTo(16f, 11f)
                lineTo(19f, 14f)
                horizontalLineTo(16.91f)
                close()
            }
        }.build()

        return _CameraFlip!!
    }

@Suppress("ObjectPropertyName")
private var _CameraFlip: ImageVector? = null
