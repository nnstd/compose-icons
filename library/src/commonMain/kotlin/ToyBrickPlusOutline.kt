package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ToyBrickPlusOutline: ImageVector
    get() {
        if (_ToyBrickPlusOutline != null) {
            return _ToyBrickPlusOutline!!
        }
        _ToyBrickPlusOutline = ImageVector.Builder(
            name = "ToyBrickPlusOutline",
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
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                moveTo(21f, 15f)
                verticalLineTo(18f)
                horizontalLineTo(24f)
                verticalLineTo(20f)
                horizontalLineTo(21f)
                verticalLineTo(23f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _ToyBrickPlusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ToyBrickPlusOutline: ImageVector? = null
