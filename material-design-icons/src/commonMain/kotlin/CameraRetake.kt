package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraRetake: ImageVector
    get() {
        if (_CameraRetake != null) {
            return _CameraRetake!!
        }
        _CameraRetake = ImageVector.Builder(
            name = "CameraRetake",
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
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 7f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 21f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 19f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 5f)
                moveTo(12f, 18f)
                curveTo(10.92f, 18f, 9.86f, 17.65f, 9f, 17f)
                lineTo(10.44f, 15.56f)
                curveTo(10.91f, 15.85f, 11.45f, 16f, 12f, 16f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 13f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10f)
                curveTo(10.74f, 10f, 9.6f, 10.8f, 9.18f, 12f)
                horizontalLineTo(11f)
                lineTo(8f, 15f)
                lineTo(5f, 12f)
                horizontalLineTo(7.1f)
                curveTo(7.65f, 9.29f, 10.29f, 7.55f, 13f, 8.1f)
                curveTo(15.7f, 8.65f, 17.45f, 11.29f, 16.9f, 14f)
                curveTo(16.42f, 16.33f, 14.38f, 18f, 12f, 18f)
                close()
            }
        }.build()

        return _CameraRetake!!
    }

@Suppress("ObjectPropertyName")
private var _CameraRetake: ImageVector? = null
