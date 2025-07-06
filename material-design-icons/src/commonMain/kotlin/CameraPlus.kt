package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraPlus: ImageVector
    get() {
        if (_CameraPlus != null) {
            return _CameraPlus!!
        }
        _CameraPlus = ImageVector.Builder(
            name = "CameraPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 4f)
                verticalLineTo(1f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                horizontalLineTo(0f)
                verticalLineTo(4f)
                moveTo(6f, 10f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                lineTo(17.8f, 6f)
                horizontalLineTo(21f)
                curveTo(22.1f, 6f, 23f, 6.9f, 23f, 8f)
                verticalLineTo(20f)
                curveTo(23f, 21.1f, 22.1f, 22f, 21f, 22f)
                horizontalLineTo(5f)
                curveTo(3.9f, 22f, 3f, 21.1f, 3f, 20f)
                verticalLineTo(10f)
                moveTo(13f, 19f)
                curveTo(17.45f, 19f, 19.69f, 13.62f, 16.54f, 10.46f)
                curveTo(13.39f, 7.31f, 8f, 9.55f, 8f, 14f)
                curveTo(8f, 16.76f, 10.24f, 19f, 13f, 19f)
                moveTo(9.8f, 14f)
                curveTo(9.8f, 16.85f, 13.25f, 18.28f, 15.26f, 16.26f)
                curveTo(17.28f, 14.25f, 15.85f, 10.8f, 13f, 10.8f)
                curveTo(11.24f, 10.8f, 9.8f, 12.24f, 9.8f, 14f)
                close()
            }
        }.build()

        return _CameraPlus!!
    }

@Suppress("ObjectPropertyName")
private var _CameraPlus: ImageVector? = null
