package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraAccount: ImageVector
    get() {
        if (_CameraAccount != null) {
            return _CameraAccount!!
        }
        _CameraAccount = ImageVector.Builder(
            name = "CameraAccount",
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
                moveTo(16f, 17f)
                verticalLineTo(16f)
                curveTo(16f, 14.67f, 13.33f, 14f, 12f, 14f)
                curveTo(10.67f, 14f, 8f, 14.67f, 8f, 16f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                moveTo(12f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                close()
            }
        }.build()

        return _CameraAccount!!
    }

@Suppress("ObjectPropertyName")
private var _CameraAccount: ImageVector? = null
