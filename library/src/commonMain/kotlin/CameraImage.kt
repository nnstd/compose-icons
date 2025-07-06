package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraImage: ImageVector
    get() {
        if (_CameraImage != null) {
            return _CameraImage!!
        }
        _CameraImage = ImageVector.Builder(
            name = "CameraImage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 5f)
                horizontalLineTo(7f)
                lineTo(9f, 3f)
                horizontalLineTo(15f)
                lineTo(17f, 5f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 7f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 21f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 19f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 5f)
                moveTo(13.09f, 9.45f)
                lineTo(11.05f, 12.18f)
                lineTo(12.6f, 14.25f)
                lineTo(11.73f, 14.91f)
                lineTo(9.27f, 11.64f)
                lineTo(6f, 16f)
                horizontalLineTo(18f)
                lineTo(13.09f, 9.45f)
                close()
            }
        }.build()

        return _CameraImage!!
    }

@Suppress("ObjectPropertyName")
private var _CameraImage: ImageVector? = null
