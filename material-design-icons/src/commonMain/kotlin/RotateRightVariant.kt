package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RotateRightVariant: ImageVector
    get() {
        if (_RotateRightVariant != null) {
            return _RotateRightVariant!!
        }
        _RotateRightVariant = ImageVector.Builder(
            name = "RotateRightVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 4f)
                verticalLineTo(1f)
                lineTo(14f, 5f)
                lineTo(10f, 9f)
                verticalLineTo(6f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 12f)
                lineTo(4.08f, 13f)
                horizontalLineTo(2.06f)
                lineTo(2f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 4f)
                moveTo(17f, 2f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 22f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 2f)
                moveTo(4f, 15f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 20f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 15f)
                close()
            }
        }.build()

        return _RotateRightVariant!!
    }

@Suppress("ObjectPropertyName")
private var _RotateRightVariant: ImageVector? = null
