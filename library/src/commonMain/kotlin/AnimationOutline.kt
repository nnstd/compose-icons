package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AnimationOutline: ImageVector
    get() {
        if (_AnimationOutline != null) {
            return _AnimationOutline!!
        }
        _AnimationOutline = ImageVector.Builder(
            name = "AnimationOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(14f)
                verticalLineTo(2f)
                horizontalLineTo(4f)
                moveTo(8f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 8f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                moveTo(20f, 12f)
                verticalLineTo(20f)
                horizontalLineTo(12f)
                verticalLineTo(12f)
                horizontalLineTo(20f)
                moveTo(20f, 10f)
                horizontalLineTo(12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 12f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 20f)
                verticalLineTo(12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 10f)
                close()
            }
        }.build()

        return _AnimationOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AnimationOutline: ImageVector? = null
