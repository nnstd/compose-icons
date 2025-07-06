package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ToyBrickOutline: ImageVector
    get() {
        if (_ToyBrickOutline != null) {
            return _ToyBrickOutline!!
        }
        _ToyBrickOutline = ImageVector.Builder(
            name = "ToyBrickOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 6f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 3f)
                horizontalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 5f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 3f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                moveTo(19f, 18f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _ToyBrickOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ToyBrickOutline: ImageVector? = null
