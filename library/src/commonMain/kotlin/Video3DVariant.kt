package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Video3DVariant: ImageVector
    get() {
        if (_Video3DVariant != null) {
            return _Video3DVariant!!
        }
        _Video3DVariant = ImageVector.Builder(
            name = "Video3DVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 10f)
                verticalLineTo(14f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 14.5f)
                horizontalLineTo(12.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(13.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 10f)
                moveTo(21f, 6.5f)
                verticalLineTo(17.5f)
                lineTo(17f, 13.5f)
                verticalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 18f)
                horizontalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 17f)
                verticalLineTo(7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 6f)
                horizontalLineTo(16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 7f)
                verticalLineTo(10.5f)
                moveTo(9.5f, 9.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineTo(4.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(8f)
                verticalLineTo(11.25f)
                horizontalLineTo(5.5f)
                verticalLineTo(12.75f)
                horizontalLineTo(8f)
                verticalLineTo(14.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 14.5f)
                moveTo(15.5f, 9.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 8f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 14.5f)
            }
        }.build()

        return _Video3DVariant!!
    }

@Suppress("ObjectPropertyName")
private var _Video3DVariant: ImageVector? = null
