package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraFront: ImageVector
    get() {
        if (_CameraFront != null) {
            return _CameraFront!!
        }
        _CameraFront = ImageVector.Builder(
            name = "CameraFront",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 2f)
                horizontalLineTo(17f)
                verticalLineTo(12.5f)
                curveTo(17f, 10.83f, 13.67f, 10f, 12f, 10f)
                curveTo(10.33f, 10f, 7f, 10.83f, 7f, 12.5f)
                moveTo(17f, 0f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 2f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 18f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 16f)
                verticalLineTo(2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 0f)
                moveTo(12f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 8f)
                moveTo(14f, 20f)
                verticalLineTo(22f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                moveTo(10f, 20f)
                horizontalLineTo(5f)
                verticalLineTo(22f)
                horizontalLineTo(10f)
                verticalLineTo(24f)
                lineTo(13f, 21f)
                lineTo(10f, 18f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _CameraFront!!
    }

@Suppress("ObjectPropertyName")
private var _CameraFront: ImageVector? = null
