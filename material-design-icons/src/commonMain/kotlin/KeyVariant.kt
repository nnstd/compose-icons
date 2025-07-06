package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KeyVariant: ImageVector
    get() {
        if (_KeyVariant != null) {
            return _KeyVariant!!
        }
        _KeyVariant = ImageVector.Builder(
            name = "KeyVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 18f)
                verticalLineTo(22f)
                horizontalLineTo(18f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                horizontalLineTo(12f)
                lineTo(9.74f, 13.74f)
                curveTo(9.19f, 13.91f, 8.61f, 14f, 8f, 14f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 8f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 2f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 8f)
                curveTo(14f, 8.61f, 13.91f, 9.19f, 13.74f, 9.74f)
                lineTo(22f, 18f)
                moveTo(7f, 5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 5f)
                close()
            }
        }.build()

        return _KeyVariant!!
    }

@Suppress("ObjectPropertyName")
private var _KeyVariant: ImageVector? = null
