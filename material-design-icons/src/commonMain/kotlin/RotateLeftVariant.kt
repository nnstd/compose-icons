package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RotateLeftVariant: ImageVector
    get() {
        if (_RotateLeftVariant != null) {
            return _RotateLeftVariant!!
        }
        _RotateLeftVariant = ImageVector.Builder(
            name = "RotateLeftVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 2f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 22f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 2f)
                moveTo(20f, 15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 17f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 22f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                moveTo(14f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                lineTo(21.94f, 13f)
                horizontalLineTo(19.92f)
                lineTo(20f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 6f)
                verticalLineTo(9f)
                lineTo(10f, 5f)
                lineTo(14f, 1f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _RotateLeftVariant!!
    }

@Suppress("ObjectPropertyName")
private var _RotateLeftVariant: ImageVector? = null
