package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraRear: ImageVector
    get() {
        if (_CameraRear != null) {
            return _CameraRear!!
        }
        _CameraRear = ImageVector.Builder(
            name = "CameraRear",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6f)
                curveTo(10.89f, 6f, 10f, 5.1f, 10f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                curveTo(13.09f, 2f, 14f, 2.9f, 14f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6f)
                moveTo(17f, 0f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 2f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 18f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 16f)
                verticalLineTo(2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 0f)
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

        return _CameraRear!!
    }

@Suppress("ObjectPropertyName")
private var _CameraRear: ImageVector? = null
