package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraFrontVariant: ImageVector
    get() {
        if (_CameraFrontVariant != null) {
            return _CameraFrontVariant!!
        }
        _CameraFrontVariant = ImageVector.Builder(
            name = "CameraFrontVariant",
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
                moveTo(12f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6f)
                moveTo(11f, 1f)
                verticalLineTo(3f)
                horizontalLineTo(13f)
                verticalLineTo(1f)
                horizontalLineTo(11f)
                moveTo(6f, 4f)
                verticalLineTo(16.5f)
                curveTo(6f, 15.12f, 8.69f, 14f, 12f, 14f)
                curveTo(15.31f, 14f, 18f, 15.12f, 18f, 16.5f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
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

        return _CameraFrontVariant!!
    }

@Suppress("ObjectPropertyName")
private var _CameraFrontVariant: ImageVector? = null
