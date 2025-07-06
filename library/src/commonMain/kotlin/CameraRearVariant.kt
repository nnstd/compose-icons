package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraRearVariant: ImageVector
    get() {
        if (_CameraRearVariant != null) {
            return _CameraRearVariant!!
        }
        _CameraRearVariant = ImageVector.Builder(
            name = "CameraRearVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 0f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 2f)
                verticalLineTo(22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 24f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 22f)
                verticalLineTo(2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                moveTo(12f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                moveTo(13f, 18f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                lineTo(16f, 19f)
                lineTo(13f, 16f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _CameraRearVariant!!
    }

@Suppress("ObjectPropertyName")
private var _CameraRearVariant: ImageVector? = null
