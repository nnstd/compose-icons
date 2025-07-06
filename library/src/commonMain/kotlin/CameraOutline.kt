package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraOutline: ImageVector
    get() {
        if (_CameraOutline != null) {
            return _CameraOutline!!
        }
        _CameraOutline = ImageVector.Builder(
            name = "CameraOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 4f)
                horizontalLineTo(16.83f)
                lineTo(15f, 2f)
                horizontalLineTo(9f)
                lineTo(7.17f, 4f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 20f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 18f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 4f)
                moveTo(20f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineTo(8.05f)
                lineTo(9.88f, 4f)
                horizontalLineTo(14.12f)
                lineTo(15.95f, 6f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                moveTo(12f, 7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 7f)
                moveTo(12f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                close()
            }
        }.build()

        return _CameraOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CameraOutline: ImageVector? = null
